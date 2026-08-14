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

public class User_setUserName_2245253267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2127;

    public User_setUserName_2245253267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2189 = new HashMap();
        Set<Object> term2256 =  ((Map) term2189).keySet();
        HashSet term2188 = new HashSet((Collection<? extends Object>) term2256);
        term2127 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term2127, term2127.getClass(), "userName", "swZVeJAxjt");
        setField(term2127, term2127.getClass(), "userFirstName", "xOcJIiQQDu");
        setField(term2127, term2127.getClass(), "userLastName", "GVizqqzXpy");
        setField(term2127, term2127.getClass(), "userPassword", "JqXGgAhZPl");
        setField(term2127, term2127.getClass(), "confirmPassword", "jiKYgYHqIS");
        setField(term2127, term2127.getClass(), "roles", term2188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DfISiziTgG";
        callMethod(klass, "setUserName", argTypes, term2127, args);
    }

};


