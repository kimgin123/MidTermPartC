/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;


/**
 *
 * @author kimjeongrok
 */
public class TestUserprofile {
    public static void main (String [] args) {
        UserProfile userprofile = new UserProfile("hello","Comedy");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type your ID.");
        String id = input.nextLine();
        userprofile.setUserID(id);
        
        System.out.println("Type your genre");
        String genre = input.nextLine();
        userprofile.setGenre(genre);
       
      
        System.out.println("Your user profile has been created. username: " + userprofile.getUserID() + "genre:"+ userprofile.getGenre());
                
    }        
    }
    

