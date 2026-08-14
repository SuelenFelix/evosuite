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

public class User_setUserPassword_131767462210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2547;

    public User_setUserPassword_131767462210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2609 = new HashMap();
        Set<Object> term2676 =  ((Map) term2609).keySet();
        HashSet term2608 = new HashSet((Collection<? extends Object>) term2676);
        term2547 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term2547, term2547.getClass(), "userName", "ZVecLZMLHF");
        setField(term2547, term2547.getClass(), "userFirstName", "fztQhjqwdP");
        setField(term2547, term2547.getClass(), "userLastName", "eVpkWxjuki");
        setField(term2547, term2547.getClass(), "userPassword", "SJiQaLvSKv");
        setField(term2547, term2547.getClass(), "confirmPassword", "OEXDRUKcFl");
        setField(term2547, term2547.getClass(), "roles", term2608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RYdKCNNMBR";
        callMethod(klass, "setUserPassword", argTypes, term2547, args);
    }

};


