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

public class User_getUserName_13618171141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1419;

    public User_getUserName_13618171141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1481 = new HashMap();
        Set<Object> term1536 =  ((Map) term1481).keySet();
        HashSet term1480 = new HashSet((Collection<? extends Object>) term1536);
        term1419 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term1419, term1419.getClass(), "userName", "ieCtQFdkii");
        setField(term1419, term1419.getClass(), "userFirstName", "dEnhdmILtU");
        setField(term1419, term1419.getClass(), "userLastName", "hoicvmsovO");
        setField(term1419, term1419.getClass(), "userPassword", "eqJfYWRaEL");
        setField(term1419, term1419.getClass(), "confirmPassword", "fhkbdRViHi");
        setField(term1419, term1419.getClass(), "roles", term1480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term1419, args);
    }

};


