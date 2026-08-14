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

public class Account_findRoute_3142864913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49523;

    public Account_findRoute_3142864913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49630 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term49629 = ((Class) term49630).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term49629).setAccessible(true);
        Object enum116 = ((Field) term49629).get((Object) null);
        ArrayList term49565 = new ArrayList();
        ArrayList term49593 = new ArrayList();
        ((ArrayList) term49593).add((Object)null);
        ((ArrayList) term49593).add((Object)null);
        term49523 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term49523, term49523.getClass(), "email", "NUUjAyqOva");
        setField(term49523, term49523.getClass(), "password", "EoAMIIUdDX");
        setField(term49523, term49523.getClass(), "role", enum116);
        setField(term49523, term49523.getClass(), "projects", term49565);
        setField(term49523, term49523.getClass(), "id", "OATNwRncsv");
        setField(term49523, term49523.getClass(), "name", "rACmzcmIPm");
        setField(term49523, term49523.getClass(), "relations", term49593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OCtePrLDhe";
        callMethod(klass, "findRoute", argTypes, term49523, args);
    }

};


