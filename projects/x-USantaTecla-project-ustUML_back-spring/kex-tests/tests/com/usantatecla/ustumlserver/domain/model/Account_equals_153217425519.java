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

public class Account_equals_153217425519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55052;
     Object term55126;

    public Account_equals_153217425519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55148 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term55147 = ((Class) term55148).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term55147).setAccessible(true);
        Object enum130 = ((Field) term55147).get((Object) null);
        ArrayList term55094 = new ArrayList();
        ArrayList term55122 = new ArrayList();
        ((ArrayList) term55122).add((Object)null);
        ((ArrayList) term55122).add((Object)null);
        ((ArrayList) term55122).add((Object)null);
        ((ArrayList) term55122).add((Object)null);
        ((ArrayList) term55122).add((Object)null);
        ((ArrayList) term55122).add((Object)null);
        term55052 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term55052, term55052.getClass(), "email", "IWNJVfvTuw");
        setField(term55052, term55052.getClass(), "password", "DLpKfwPpvr");
        setField(term55052, term55052.getClass(), "role", enum130);
        setField(term55052, term55052.getClass(), "projects", term55094);
        setField(term55052, term55052.getClass(), "id", "DLFXidLbuT");
        setField(term55052, term55052.getClass(), "name", "FjkxfTXGIH");
        setField(term55052, term55052.getClass(), "relations", term55122);
        term55126 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term55126;
        callMethod(klass, "equals", argTypes, term55052, args);
    }

};


