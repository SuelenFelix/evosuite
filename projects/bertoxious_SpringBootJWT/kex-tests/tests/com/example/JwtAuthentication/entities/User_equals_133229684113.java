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

public class User_equals_133229684113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2969;
     Object term3036;

    public User_equals_133229684113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3031 = new HashMap();
        Set<Object> term3087 =  ((Map) term3031).keySet();
        HashSet term3030 = new HashSet((Collection<? extends Object>) term3087);
        term2969 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term2969, term2969.getClass(), "userName", "fWKJoSoCwE");
        setField(term2969, term2969.getClass(), "userFirstName", "wfaXBpWAUH");
        setField(term2969, term2969.getClass(), "userLastName", "VMeAzAHwZj");
        setField(term2969, term2969.getClass(), "userPassword", "PznxWXsZME");
        setField(term2969, term2969.getClass(), "confirmPassword", "ZzIujlwVsw");
        setField(term2969, term2969.getClass(), "roles", term3030);
        term3036 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3036;
        callMethod(klass, "equals", argTypes, term2969, args);
    }

};


