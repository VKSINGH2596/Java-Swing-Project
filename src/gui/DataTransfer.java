/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

public class DataTransfer {
    private String loginEmail;
    private String loginPassword;
    
    public String getEmail() {
        return loginEmail;
    }
    
    public String getPassword() {
        return loginPassword;
    }
    
    public void setEmail(String email) {
        loginEmail=email;
        System.out.println("Stored Mail: "+loginEmail);
    }
    
    public void setPassword(String password) {
        loginPassword=password;
        System.out.println("Stored Pass: "+loginPassword);
    }
}
