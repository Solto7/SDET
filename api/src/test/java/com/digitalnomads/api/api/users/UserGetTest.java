package com.digitalnomads.api.api.users;

import com.digitalnomads.api.api.BaseApiTest;
import com.digitalnomads.api.entities.User;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UserGetTest extends BaseApiTest {
    @Test
    public void getEmail() {
        String expectedEmail = "example23@Example.com";
        String expectedEmailNegative = "example23@Example.com1";
        userController.getUserBYEmail(expectedEmail);
        User user = userController.extractObjectFromResponse(User.class);
        assertEquals(user.getEmail(),expectedEmail,"User email is not correct");
    }

//    @Test
//    public  void getUsers {
//        User user = userController.getAllUser().as((Class<User>) User[].class);
//        System.out.println(Arrays.toString(user));
//
//    }
}
