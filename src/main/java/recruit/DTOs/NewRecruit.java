/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.DTOs;

/**
 *
 * @author Dan
 */
public class NewRecruit {
    
    private String newPName;
    private String newPSurname;
    private String newPSsn;
    private String newPEmail;
    private String newPUsername;
    private String newPPassword;
    
    public NewRecruit(){}
    
    public NewRecruit(String name, String surname, String ssn, String email, 
            String username, String password){
    
        newPName = name;
        newPSurname = surname;
        newPSsn = ssn;
        newPEmail = email;
        newPUsername = username;
        newPPassword = password;
    }

    public void setNewPName(String newPName) {
        this.newPName = newPName;
    }

    public void setNewPSurname(String newPSurname) {
        this.newPSurname = newPSurname;
    }

    public void setNewPSsn(String newPSsn) {
        this.newPSsn = newPSsn;
    }

    public void setNewPEmail(String newPEmail) {
        this.newPEmail = newPEmail;
    }

    public void setNewPUsername(String newPUsername) {
        this.newPUsername = newPUsername;
    }

    public void setNewPPassword(String newPPassword) {
        this.newPPassword = newPPassword;
    }

    public String getNewPName() {
        return newPName;
    }

    public String getNewPSurname() {
        return newPSurname;
    }

    public String getNewPSsn() {
        return newPSsn;
    }

    public String getNewPEmail() {
        return newPEmail;
    }

    public String getNewPUsername() {
        return newPUsername;
    }

    public String getNewPPassword() {
        return newPPassword;
    }
    
    
    
}
