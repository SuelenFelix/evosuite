package com.example.api.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.example.api.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_setUserName_9929293296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;

    public User_setUserName_9929293296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term799 = newInstance(Class.forName("com.example.api.model.User"));
        setField(term799, term799.getClass(), "userName", "xrwlQZdwCp");
        setField(term799, term799.getClass(), "firstName", "IDCWpPLRkE");
        setField(term799, term799.getClass(), "lastName", "nyiiPDVjAc");
        setField(term799, term799.getClass(), "email", "aKnKipADSo");
        setField(term799, term799.getClass(), "password", "wSQxaModmm");
        setField(term799, term799.getClass(), "role", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.api.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gGSMzuGICf";
        callMethod(klass, "setUserName", argTypes, term799, args);
    }

};


