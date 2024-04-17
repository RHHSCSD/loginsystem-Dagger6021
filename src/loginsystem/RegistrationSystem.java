/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;
import java.io.*;
/**
 *
 * @author eshi6
 */
public class RegistrationSystem{
    public User[] users = new User[10000000];
    int x = 0;
    // String userID = (String) x;
    private void register(String username, String password, String secQuestion1, String secQuestion2, String secQuestion3, String email) throws IOException{
       //First create a user
       
       //then write to the file
       User u = new User();
       u.email = email;
       u.userName = username;
       u.password = password;
       u.secQuestion1 = secQuestion1;
       u.secQuestion2 = secQuestion2;
       u.secQuestion3 = secQuestion3;
       u.userID = x;
       users[x] = u;
       FileWriter writer = new FileWriter("C:\\File.IO\\UserInfo.txt");
       writer.write("!" + email + ":" + username + ";" + password + "~" + secQuestion1 + "~" + secQuestion2 + "~" + secQuestion3 + "," + x + "\r\n");
       x++;
       writer.close();
    }
    public static void main(String[] args) throws IOException {
        RegistrationSystem r = new RegistrationSystem();
        r.register("Dagger6021", "EricEric/6021", "dog", "cat", "man", "eshi6021@gmail.com");
    }
}