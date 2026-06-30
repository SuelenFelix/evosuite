package org.zerhusen.security.model;

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
import static org.zerhusen.security.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_getEmail_66801609011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1444;

    public User_getEmail_66801609011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1445 = new Long(-8885298608300233488L);
        HashMap term1509 = new HashMap();
        Set<Object> term1564 =  ((Map) term1509).keySet();
        HashSet term1508 = new HashSet((Collection<? extends Object>) term1564);
        term1444 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term1444, term1444.getClass(), "id", term1445);
        setField(term1444, term1444.getClass(), "username", "ieCtQFdkii");
        setField(term1444, term1444.getClass(), "password", "dEnhdmILtU");
        setField(term1444, term1444.getClass(), "firstname", "hoicvmsovO");
        setField(term1444, term1444.getClass(), "lastname", "eqJfYWRaEL");
        setField(term1444, term1444.getClass(), "email", "fhkbdRViHi");
        setBooleanField(term1444, term1444.getClass(), "activated", false);
        setField(term1444, term1444.getClass(), "authorities", term1508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1444, args);
    }

};


