package com.example.JwtAuthentication.entities;

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
import static com.example.JwtAuthentication.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_toString_200322409016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3325;

    public User_toString_200322409016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3387 = new HashMap();
        Set<Object> term3442 =  ((Map) term3387).keySet();
        HashSet term3386 = new HashSet((Collection<? extends Object>) term3442);
        term3325 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term3325, term3325.getClass(), "userName", "jwsfVjMoJT");
        setField(term3325, term3325.getClass(), "userFirstName", "ZfdXfCCFDf");
        setField(term3325, term3325.getClass(), "userLastName", "MwwjNtdOFT");
        setField(term3325, term3325.getClass(), "userPassword", "VYkqXKVlAJ");
        setField(term3325, term3325.getClass(), "confirmPassword", "XkIoWJRNwN");
        setField(term3325, term3325.getClass(), "roles", term3386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3325, args);
    }

};


