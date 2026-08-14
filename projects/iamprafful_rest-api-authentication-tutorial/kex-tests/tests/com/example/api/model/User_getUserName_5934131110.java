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

public class User_getUserName_5934131110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public User_getUserName_5934131110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.example.api.model.User"));
        setField(term1, term1.getClass(), "userName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "firstName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "lastName", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "email", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "password", "jJCZpVmanW");
        setField(term1, term1.getClass(), "role", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.api.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term1, args);
    }

};


