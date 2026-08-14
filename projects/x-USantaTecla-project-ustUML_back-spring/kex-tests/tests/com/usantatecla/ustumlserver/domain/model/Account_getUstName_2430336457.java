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

public class Account_getUstName_2430336457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51105;

    public Account_getUstName_2430336457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51200 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term51199 = ((Class) term51200).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term51199).setAccessible(true);
        Object enum120 = ((Field) term51199).get((Object) null);
        ArrayList term51147 = new ArrayList();
        ArrayList term51175 = new ArrayList();
        ((ArrayList) term51175).add((Object)null);
        ((ArrayList) term51175).add((Object)null);
        ((ArrayList) term51175).add((Object)null);
        ((ArrayList) term51175).add((Object)null);
        ((ArrayList) term51175).add((Object)null);
        term51105 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term51105, term51105.getClass(), "email", "EDkfjuDpNv");
        setField(term51105, term51105.getClass(), "password", "LNHkTUfuHX");
        setField(term51105, term51105.getClass(), "role", enum120);
        setField(term51105, term51105.getClass(), "projects", term51147);
        setField(term51105, term51105.getClass(), "id", "SVWcOAHiTp");
        setField(term51105, term51105.getClass(), "name", "oShLCaneoQ");
        setField(term51105, term51105.getClass(), "relations", term51175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUstName", argTypes, term51105, args);
    }

};


