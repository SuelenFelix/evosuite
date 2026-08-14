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

public class User_setId_10503036367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775;

    public User_setId_10503036367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term825 = new HashMap();
        Set<Object> term882 =  ((Map) term825).keySet();
        HashSet term824 = new HashSet((Collection<? extends Object>) term882);
        term775 = newInstance(Class.forName("com.sigma.auth.models.User"));
        setField(term775, term775.getClass(), "id", "SbAoxhfrkn");
        setField(term775, term775.getClass(), "username", "kuTXqwMtDB");
        setField(term775, term775.getClass(), "email", "Ghbwtircqb");
        setField(term775, term775.getClass(), "password", "xrwlQZdwCp");
        setField(term775, term775.getClass(), "roles", term824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setId", argTypes, term775, args);
    }

};


