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

public class User_setRoles_205389930412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2827;
     Object term2894;

    public User_setRoles_205389930412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2889 = new HashMap();
        Set<Object> term2967 =  ((Map) term2889).keySet();
        HashSet term2888 = new HashSet((Collection<? extends Object>) term2967);
        term2827 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term2827, term2827.getClass(), "userName", "dpNsDgfPso");
        setField(term2827, term2827.getClass(), "userFirstName", "hCWPJQKpdc");
        setField(term2827, term2827.getClass(), "userLastName", "WzMEhMXkKx");
        setField(term2827, term2827.getClass(), "userPassword", "XOiDvlDhdc");
        setField(term2827, term2827.getClass(), "confirmPassword", "AdxvLJhNLe");
        setField(term2827, term2827.getClass(), "roles", term2888);
        HashMap term2895 = new HashMap();
        Set<Object> term2968 =  ((Map) term2895).keySet();
        term2894 = new HashSet((Collection<? extends Object>) term2968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2894;
        callMethod(klass, "setRoles", argTypes, term2827, args);
    }

};


