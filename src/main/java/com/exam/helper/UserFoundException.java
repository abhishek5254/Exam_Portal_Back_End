package com.exam.helper;

import com.exam.model.User;

public class UserFoundException extends Exception{

    public UserFoundException()
    {
        super("User with this Username exists !! try with another one");
    }
    public UserFoundException(String msg)
    {
        super(msg);
    }
}
