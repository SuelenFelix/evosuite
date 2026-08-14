package com.sigma.auth.models;

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
import static com.sigma.auth.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_setUsername_2111603458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term893;

    public User_setUsername_2111603458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term943 = new HashMap();
        Set<Object> term1000 =  ((Map) term943).keySet();
        HashSet term942 = new HashSet((Collection<? extends Object>) term1000);
        term893 = newInstance(Class.forName("com.sigma.auth.models.User"));
        setField(term893, term893.getClass(), "id", "nyiiPDVjAc");
        setField(term893, term893.getClass(), "username", "aKnKipADSo");
        setField(term893, term893.getClass(), "email", "wSQxaModmm");
        setField(term893, term893.getClass(), "password", "UlajhuVLaP");
        setField(term893, term893.getClass(), "roles", term942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gGSMzuGICf";
        callMethod(klass, "setUsername", argTypes, term893, args);
    }

};


