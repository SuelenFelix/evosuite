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

public class User_getUsername_13751820953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391;

    public User_getUsername_13751820953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term441 = new HashMap();
        Set<Object> term486 =  ((Map) term441).keySet();
        HashSet term440 = new HashSet((Collection<? extends Object>) term486);
        term391 = newInstance(Class.forName("com.sigma.auth.models.User"));
        setField(term391, term391.getClass(), "id", "tbcdzjIfER");
        setField(term391, term391.getClass(), "username", "HyxfbSQYBe");
        setField(term391, term391.getClass(), "email", "pCTimMblYc");
        setField(term391, term391.getClass(), "password", "hNxWaHcfhY");
        setField(term391, term391.getClass(), "roles", term440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term391, args);
    }

};


