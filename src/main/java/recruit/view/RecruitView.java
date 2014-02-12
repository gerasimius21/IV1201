/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.view;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.ConversationScoped;

import javax.ejb.Stateless;
import javax.enterprise.context.Conversation;
import javax.inject.Inject;
import javax.inject.Named;
import recruit.DTOs.NewRecruit;
import recruit.controller.RecruitController;

/**
 *
 * @author Dan
 */
@Named("recruitView")
@ConversationScoped
public class RecruitView implements Serializable{

    @EJB
    private RecruitController rCont;
    
    private String newPName;
    private String newPSurname;
    private String newPSsn;
    private String newPEmail;
    private String newPUsername;
    private String newPPassword;
    
    @Inject
    private Conversation conversation;
    private Exception recruitFailure;
    
    private void startConversation() {
        if (conversation.isTransient()) {
            conversation.begin();
        }
    }

    private void stopConversation() {
        if (!conversation.isTransient()) {
            conversation.end();
        }
    }

    private void handleException(Exception e) {
        stopConversation();
        e.printStackTrace(System.err);
        recruitFailure = e;
    }
    
    /**
     * @return <code>true</code> if the latest transaction succeeded, otherwise
     * <code>false</code>.
     */
    public boolean getSuccess() {
        return recruitFailure == null;
    }
    
    public Exception getException() {
        return recruitFailure;
    }
    
    /* This return value is needed because of a JSF 2.2 bug. Note 3 on page 7-10
     * of the JSF 2.2 specification states that action handling methods may be
     * void. In JSF 2.2, however, a void action handling method plus an
     * if-element that evaluates to true in the faces-config navigation case
     * causes an exception.
     *
     * @return an empty string.
     */
    private String jsf22Bugfix() {
        return "";
    }
    
    public String createRecruit(){
        
        NewRecruit recruit = new NewRecruit(newPName, newPSurname, newPSsn, 
                newPEmail, newPUsername, newPPassword);
        return jsf22Bugfix();
    }
}
