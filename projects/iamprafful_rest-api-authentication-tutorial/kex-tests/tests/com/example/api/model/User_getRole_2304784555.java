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

public class User_getRole_2304784555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666;

    public User_getRole_2304784555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term666 = newInstance(Class.forName("com.example.api.model.User"));
        setField(term666, term666.getClass(), "userName", "OWDIEULEFu");
        setField(term666, term666.getClass(), "firstName", "dWRymuLBtr");
        setField(term666, term666.getClass(), "lastName", "AijpHYOFuy");
        setField(term666, term666.getClass(), "email", "SbAoxhfrkn");
        setField(term666, term666.getClass(), "password", "kuTXqwMtDB");
        setField(term666, term666.getClass(), "role", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.api.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term666, args);
    }

};


