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

public class User_getRoles_15343997306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2009;

    public User_getRoles_15343997306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2071 = new HashMap();
        Set<Object> term2126 =  ((Map) term2071).keySet();
        HashSet term2070 = new HashSet((Collection<? extends Object>) term2126);
        term2009 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term2009, term2009.getClass(), "userName", "LvJFtLBaxj");
        setField(term2009, term2009.getClass(), "userFirstName", "PHvxnGHptP");
        setField(term2009, term2009.getClass(), "userLastName", "TimdotUuNC");
        setField(term2009, term2009.getClass(), "userPassword", "PkWMRdJcBb");
        setField(term2009, term2009.getClass(), "confirmPassword", "jSpAteRute");
        setField(term2009, term2009.getClass(), "roles", term2070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term2009, args);
    }

};


