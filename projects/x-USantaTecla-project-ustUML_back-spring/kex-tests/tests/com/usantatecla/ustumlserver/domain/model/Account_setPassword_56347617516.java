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

public class Account_setPassword_56347617516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53857;

    public Account_setPassword_56347617516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53964 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term53963 = ((Class) term53964).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term53963).setAccessible(true);
        Object enum127 = ((Field) term53963).get((Object) null);
        ArrayList term53899 = new ArrayList();
        ArrayList term53927 = new ArrayList();
        ((ArrayList) term53927).add((Object)null);
        ((ArrayList) term53927).add((Object)null);
        term53857 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term53857, term53857.getClass(), "email", "lnPIxHHyEK");
        setField(term53857, term53857.getClass(), "password", "unvQfYuBUz");
        setField(term53857, term53857.getClass(), "role", enum127);
        setField(term53857, term53857.getClass(), "projects", term53899);
        setField(term53857, term53857.getClass(), "id", "RqnYUpQBbG");
        setField(term53857, term53857.getClass(), "name", "sKnuhmcjCC");
        setField(term53857, term53857.getClass(), "relations", term53927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oCBbVNwMnb";
        callMethod(klass, "setPassword", argTypes, term53857, args);
    }

};


