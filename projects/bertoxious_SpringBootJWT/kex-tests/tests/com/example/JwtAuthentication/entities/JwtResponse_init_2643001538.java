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

public class JwtResponse_init_2643001538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1271;

    public JwtResponse_init_2643001538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1333 = new HashMap();
        Set<Object> term1400 =  ((Map) term1333).keySet();
        HashSet term1332 = new HashSet((Collection<? extends Object>) term1400);
        term1271 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term1271, term1271.getClass(), "userName", "onpbIeEKoi");
        setField(term1271, term1271.getClass(), "userFirstName", "YRHGsAkhxb");
        setField(term1271, term1271.getClass(), "userLastName", "ffYhPOzlUs");
        setField(term1271, term1271.getClass(), "userPassword", "MLqYREekMl");
        setField(term1271, term1271.getClass(), "confirmPassword", "ytSBIKXogI");
        setField(term1271, term1271.getClass(), "roles", term1332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.JwtResponse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.example.JwtAuthentication.entities.User");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1271;
        args[1] = "nHXjMycHlU";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


