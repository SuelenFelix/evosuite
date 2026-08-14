package com.usantatecla.ustumlserver.domain.model;

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
import static com.usantatecla.ustumlserver.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Account_find_1801673592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49111;

    public Account_find_1801673592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49218 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term49217 = ((Class) term49218).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term49217).setAccessible(true);
        Object enum115 = ((Field) term49217).get((Object) null);
        ArrayList term49153 = new ArrayList();
        ArrayList term49181 = new ArrayList();
        ((ArrayList) term49181).add((Object)null);
        ((ArrayList) term49181).add((Object)null);
        ((ArrayList) term49181).add((Object)null);
        ((ArrayList) term49181).add((Object)null);
        ((ArrayList) term49181).add((Object)null);
        ((ArrayList) term49181).add((Object)null);
        ((ArrayList) term49181).add((Object)null);
        term49111 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term49111, term49111.getClass(), "email", "ZyAecZGope");
        setField(term49111, term49111.getClass(), "password", "uYnmxkwLfB");
        setField(term49111, term49111.getClass(), "role", enum115);
        setField(term49111, term49111.getClass(), "projects", term49153);
        setField(term49111, term49111.getClass(), "id", "RVZTQxYOUO");
        setField(term49111, term49111.getClass(), "name", "tydPpKxAbv");
        setField(term49111, term49111.getClass(), "relations", term49181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CJxQpJUfLJ";
        callMethod(klass, "find", argTypes, term49111, args);
    }

};


