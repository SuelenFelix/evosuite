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

public class User_getRoles_6316318796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679;

    public User_getRoles_6316318796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term729 = new HashMap();
        Set<Object> term774 =  ((Map) term729).keySet();
        HashSet term728 = new HashSet((Collection<? extends Object>) term774);
        term679 = newInstance(Class.forName("com.sigma.auth.models.User"));
        setField(term679, term679.getClass(), "id", "TEParAifyi");
        setField(term679, term679.getClass(), "username", "OWDIEULEFu");
        setField(term679, term679.getClass(), "email", "dWRymuLBtr");
        setField(term679, term679.getClass(), "password", "AijpHYOFuy");
        setField(term679, term679.getClass(), "roles", term728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term679, args);
    }

};


