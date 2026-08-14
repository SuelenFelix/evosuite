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

public class Account_AccountBuilderImpl_self_20624832431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73127;

    public Account_AccountBuilderImpl_self_20624832431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73222 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term73221 = ((Class) term73222).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term73221).setAccessible(true);
        Object enum175 = ((Field) term73221).get((Object) null);
        ArrayList term73169 = new ArrayList();
        ArrayList term73197 = new ArrayList();
        ((ArrayList) term73197).add((Object)null);
        ((ArrayList) term73197).add((Object)null);
        ((ArrayList) term73197).add((Object)null);
        ((ArrayList) term73197).add((Object)null);
        ((ArrayList) term73197).add((Object)null);
        term73127 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account$AccountBuilderImpl"));
        setField(term73127, term73127.getClass(), "email", "mQsaqUltLU");
        setField(term73127, term73127.getClass(), "password", "jwENwZiGlR");
        setField(term73127, term73127.getClass(), "role", enum175);
        setField(term73127, term73127.getClass(), "projects", term73169);
        setField(term73127, term73127.getClass(), "id", "rfFHGPcfpz");
        setField(term73127, term73127.getClass(), "name", "fViQeyMrrL");
        setField(term73127, term73127.getClass(), "relations", term73197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account$AccountBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term73127, args);
    }

};


