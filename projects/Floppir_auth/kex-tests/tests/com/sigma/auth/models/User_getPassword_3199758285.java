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

public class User_getPassword_3199758285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583;

    public User_getPassword_3199758285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term633 = new HashMap();
        Set<Object> term678 =  ((Map) term633).keySet();
        HashSet term632 = new HashSet((Collection<? extends Object>) term678);
        term583 = newInstance(Class.forName("com.sigma.auth.models.User"));
        setField(term583, term583.getClass(), "id", "vrQLuWIDJX");
        setField(term583, term583.getClass(), "username", "flxyYxBRtu");
        setField(term583, term583.getClass(), "email", "OclPbYPkcH");
        setField(term583, term583.getClass(), "password", "IoAlmYsBwc");
        setField(term583, term583.getClass(), "roles", term632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term583, args);
    }

};


