package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity=500;
    private int defaultPassowrdLength =10;
    private String alternareEmail;
    private String compnySuffix ="compny.com";

//Constructor for the first and the last name
    public Email(String firstName , String lastName ){
        this.firstName=firstName;
        this.lastName=lastName;


        //Call a methode asking for the department - return the department
        this.department=setDepartment();

        //Call a methode that returns a randome password
        this.password=randomPassword(defaultPassowrdLength);

        //Combine elements to genrate email
        email=firstName.toLowerCase()+"." +lastName.toLowerCase() +"@" +department +"."+compnySuffix;

    }
    //Ask for department
    private String setDepartment(){
        System.out.println("New worker: " +firstName + ". DEPARTMENT CODES: \n1 for Sales \n2 for Development \n3 for Accounting \n4 for none \n ENTER THE DEPARTMENT CODE:  ");
        Scanner in=new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice == 1){
            return "sales";
        } else if (depChoice == 2) {
            return "development";
        } else if (depChoice ==3) {
            return "accounting";
        }else{
            return "";
        }
    }
    //Generate a randome password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ0123456789@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    //Set the alternate email
    public void setAlternareEmail(String altEmail){
        this.alternareEmail=altEmail;
    }
    public String getAlternareEmail(){
        return alternareEmail;
    }
    //Change the password
    public void changePassword(String password){
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME : " +firstName + " " +lastName +
                "\nCOMPANY EMAIL : " + email +
                "\nMAILBOX CAPACITY : " +mailboxCapacity + "mb";
    }
}

