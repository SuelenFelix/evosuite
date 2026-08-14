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

public class User_setRoles_133830014111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1247;
     Object term1302;

    public User_setRoles_133830014111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1297 = new HashMap();
        Set<Object> term1365 =  ((Map) term1297).keySet();
        HashSet term1296 = new HashSet((Collection<? extends Object>) term1365);
        term1247 = newInstance(Class.forName("com.sigma.auth.models.User"));
        setField(term1247, term1247.getClass(), "id", "JDswTTCZHV");
        setField(term1247, term1247.getClass(), "username", "onpbIeEKoi");
        setField(term1247, term1247.getClass(), "email", "YRHGsAkhxb");
        setField(term1247, term1247.getClass(), "password", "ffYhPOzlUs");
        setField(term1247, term1247.getClass(), "roles", term1296);
        HashMap term1303 = new HashMap();
        Set<Object> term1366 =  ((Map) term1303).keySet();
        term1302 = new HashSet((Collection<? extends Object>) term1366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1302;
        callMethod(klass, "setRoles", argTypes, term1247, args);
    }

};


