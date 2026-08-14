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

public class User_getPassword_4543396764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533;

    public User_getPassword_4543396764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533 = newInstance(Class.forName("com.example.api.model.User"));
        setField(term533, term533.getClass(), "userName", "BYqFIqCKAV");
        setField(term533, term533.getClass(), "firstName", "vrQLuWIDJX");
        setField(term533, term533.getClass(), "lastName", "flxyYxBRtu");
        setField(term533, term533.getClass(), "email", "OclPbYPkcH");
        setField(term533, term533.getClass(), "password", "IoAlmYsBwc");
        setField(term533, term533.getClass(), "role", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.api.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term533, args);
    }

};


