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

public class User_getEmail_12756392554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487;

    public User_getEmail_12756392554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term537 = new HashMap();
        Set<Object> term582 =  ((Map) term537).keySet();
        HashSet term536 = new HashSet((Collection<? extends Object>) term582);
        term487 = newInstance(Class.forName("com.sigma.auth.models.User"));
        setField(term487, term487.getClass(), "id", "RkybSrpybU");
        setField(term487, term487.getClass(), "username", "xOEqzGAmDU");
        setField(term487, term487.getClass(), "email", "eZFUvlxvGV");
        setField(term487, term487.getClass(), "password", "BYqFIqCKAV");
        setField(term487, term487.getClass(), "roles", term536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term487, args);
    }

};


