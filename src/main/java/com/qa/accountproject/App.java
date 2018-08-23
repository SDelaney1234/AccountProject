package com.qa.accountproject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AccountService accountService= new AccountService();
        Account bob= new Account("Bob","Bobsob",1234);
        Account jim= new Account("Jim","Jimson",1235);
        
        accountService.addAccount(bob);
        accountService.addAccount(jim);
        
        System.out.println(accountService.getAccount(1).toString());
        System.out.println(accountService.convertMapToJson());
    }
}
