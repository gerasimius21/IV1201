/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.controller;

import javax.ejb.Stateless;
import recruit.DTOs.RecruitFormDTO;

/**
 *
 * @author Dan
 */
@Stateless
public class RecruitController {
    
    private RecruitFormDTO form;
    
    public RecruitFormDTO createForm(){
        
        return form;
    }
}
