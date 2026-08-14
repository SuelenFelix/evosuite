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

public class User_canEqual_52813421214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3088;
     Object term3155;

    public User_canEqual_52813421214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3150 = new HashMap();
        Set<Object> term3206 =  ((Map) term3150).keySet();
        HashSet term3149 = new HashSet((Collection<? extends Object>) term3206);
        term3088 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term3088, term3088.getClass(), "userName", "LWyEaeIyAo");
        setField(term3088, term3088.getClass(), "userFirstName", "yVMkkQhvmN");
        setField(term3088, term3088.getClass(), "userLastName", "mvrkADEgpp");
        setField(term3088, term3088.getClass(), "userPassword", "pXOkjyeIRb");
        setField(term3088, term3088.getClass(), "confirmPassword", "GgZWSjxjyE");
        setField(term3088, term3088.getClass(), "roles", term3149);
        term3155 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3155;
        callMethod(klass, "canEqual", argTypes, term3088, args);
    }

};


