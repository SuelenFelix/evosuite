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

public class User_setUserLastName_8309894009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2407;

    public User_setUserLastName_8309894009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2469 = new HashMap();
        Set<Object> term2536 =  ((Map) term2469).keySet();
        HashSet term2468 = new HashSet((Collection<? extends Object>) term2536);
        term2407 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term2407, term2407.getClass(), "userName", "AWRooQKkdW");
        setField(term2407, term2407.getClass(), "userFirstName", "vjxIhXHxGR");
        setField(term2407, term2407.getClass(), "userLastName", "QXzGXbEXMu");
        setField(term2407, term2407.getClass(), "userPassword", "qxSDVejjiY");
        setField(term2407, term2407.getClass(), "confirmPassword", "xBsXSDjXYK");
        setField(term2407, term2407.getClass(), "roles", term2468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEnIVFtZuQ";
        callMethod(klass, "setUserLastName", argTypes, term2407, args);
    }

};


