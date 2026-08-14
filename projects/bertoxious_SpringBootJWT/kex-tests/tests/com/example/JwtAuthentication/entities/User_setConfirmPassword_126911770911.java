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

public class User_setConfirmPassword_126911770911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2687;

    public User_setConfirmPassword_126911770911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2749 = new HashMap();
        Set<Object> term2816 =  ((Map) term2749).keySet();
        HashSet term2748 = new HashSet((Collection<? extends Object>) term2816);
        term2687 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term2687, term2687.getClass(), "userName", "yGtHPyvYiQ");
        setField(term2687, term2687.getClass(), "userFirstName", "MvRIxilFMJ");
        setField(term2687, term2687.getClass(), "userLastName", "iNwOJRBEjp");
        setField(term2687, term2687.getClass(), "userPassword", "XylxrMBraH");
        setField(term2687, term2687.getClass(), "confirmPassword", "pORebkoRdD");
        setField(term2687, term2687.getClass(), "roles", term2748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mXGCWJDOqA";
        callMethod(klass, "setConfirmPassword", argTypes, term2687, args);
    }

};


