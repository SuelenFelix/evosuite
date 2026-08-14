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

public class User_getUserFirstName_4856991442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1537;

    public User_getUserFirstName_4856991442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1599 = new HashMap();
        Set<Object> term1654 =  ((Map) term1599).keySet();
        HashSet term1598 = new HashSet((Collection<? extends Object>) term1654);
        term1537 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term1537, term1537.getClass(), "userName", "uWHnvSvaPl");
        setField(term1537, term1537.getClass(), "userFirstName", "kBdSllIBVz");
        setField(term1537, term1537.getClass(), "userLastName", "TJmVBGfTML");
        setField(term1537, term1537.getClass(), "userPassword", "tPlsykYBqO");
        setField(term1537, term1537.getClass(), "confirmPassword", "bLPjGVBhlX");
        setField(term1537, term1537.getClass(), "roles", term1598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserFirstName", argTypes, term1537, args);
    }

};


