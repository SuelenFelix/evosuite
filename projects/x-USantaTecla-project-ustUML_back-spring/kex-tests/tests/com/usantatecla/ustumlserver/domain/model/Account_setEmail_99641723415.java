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

public class Account_setEmail_99641723415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53445;

    public Account_setEmail_99641723415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53552 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term53551 = ((Class) term53552).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term53551).setAccessible(true);
        Object enum126 = ((Field) term53551).get((Object) null);
        ArrayList term53487 = new ArrayList();
        ArrayList term53515 = new ArrayList();
        ((ArrayList) term53515).add((Object)null);
        ((ArrayList) term53515).add((Object)null);
        ((ArrayList) term53515).add((Object)null);
        ((ArrayList) term53515).add((Object)null);
        ((ArrayList) term53515).add((Object)null);
        ((ArrayList) term53515).add((Object)null);
        ((ArrayList) term53515).add((Object)null);
        ((ArrayList) term53515).add((Object)null);
        ((ArrayList) term53515).add((Object)null);
        term53445 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term53445, term53445.getClass(), "email", "xQuVexkiVz");
        setField(term53445, term53445.getClass(), "password", "LqNgPziYtv");
        setField(term53445, term53445.getClass(), "role", enum126);
        setField(term53445, term53445.getClass(), "projects", term53487);
        setField(term53445, term53445.getClass(), "id", "wiDfuaXnrP");
        setField(term53445, term53445.getClass(), "name", "btdGZUcaZl");
        setField(term53445, term53445.getClass(), "relations", term53515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WnEAVdCxna";
        callMethod(klass, "setEmail", argTypes, term53445, args);
    }

};


