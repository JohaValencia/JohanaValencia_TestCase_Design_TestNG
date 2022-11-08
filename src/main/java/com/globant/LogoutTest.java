package com.globant;

import org.testng.annotations.Test;

public class LogoutTest extends DataBase {
@Test(dataProvider = "validData", priority = 3)
    public void logOut(String email, String password){
    System.out.println("");
}
}
