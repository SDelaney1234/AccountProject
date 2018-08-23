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
        accountService.addAccount("Bob", "Bobson", 1234);
        
        System.out.println(accountService.getAccount(1).toString());
    }
}
