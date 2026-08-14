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

public class Account_getEmail_57274881811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51885;

    public Account_getEmail_57274881811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51980 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term51979 = ((Class) term51980).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term51979).setAccessible(true);
        Object enum122 = ((Field) term51979).get((Object) null);
        ArrayList term51927 = new ArrayList();
        ArrayList term51955 = new ArrayList();
        ((ArrayList) term51955).add((Object)null);
        ((ArrayList) term51955).add((Object)null);
        ((ArrayList) term51955).add((Object)null);
        ((ArrayList) term51955).add((Object)null);
        term51885 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term51885, term51885.getClass(), "email", "kbjWxMAIhY");
        setField(term51885, term51885.getClass(), "password", "GmtlSgqKcI");
        setField(term51885, term51885.getClass(), "role", enum122);
        setField(term51885, term51885.getClass(), "projects", term51927);
        setField(term51885, term51885.getClass(), "id", "ssSbvPoMjB");
        setField(term51885, term51885.getClass(), "name", "mhRVADhaKm");
        setField(term51885, term51885.getClass(), "relations", term51955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term51885, args);
    }

};


