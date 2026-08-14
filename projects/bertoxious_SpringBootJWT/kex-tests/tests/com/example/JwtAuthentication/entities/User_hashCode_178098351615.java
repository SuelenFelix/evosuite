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

public class User_hashCode_178098351615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3207;

    public User_hashCode_178098351615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3269 = new HashMap();
        Set<Object> term3324 =  ((Map) term3269).keySet();
        HashSet term3268 = new HashSet((Collection<? extends Object>) term3324);
        term3207 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term3207, term3207.getClass(), "userName", "EeBVbzjcCI");
        setField(term3207, term3207.getClass(), "userFirstName", "UfQtPRyWRC");
        setField(term3207, term3207.getClass(), "userLastName", "FPvxVzzSvD");
        setField(term3207, term3207.getClass(), "userPassword", "WHcwFgsGFC");
        setField(term3207, term3207.getClass(), "confirmPassword", "HzqpegHiRq");
        setField(term3207, term3207.getClass(), "roles", term3268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3207, args);
    }

};


