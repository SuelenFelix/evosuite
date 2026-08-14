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

public class User_getConfirmPassword_17022793475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1891;

    public User_getConfirmPassword_17022793475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1953 = new HashMap();
        Set<Object> term2008 =  ((Map) term1953).keySet();
        HashSet term1952 = new HashSet((Collection<? extends Object>) term2008);
        term1891 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term1891, term1891.getClass(), "userName", "idgaQsnJpQ");
        setField(term1891, term1891.getClass(), "userFirstName", "VgZnGoIFwQ");
        setField(term1891, term1891.getClass(), "userLastName", "jUbSRrkrYZ");
        setField(term1891, term1891.getClass(), "userPassword", "bWWfajKbEX");
        setField(term1891, term1891.getClass(), "confirmPassword", "cAPeiZHKGJ");
        setField(term1891, term1891.getClass(), "roles", term1952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfirmPassword", argTypes, term1891, args);
    }

};


