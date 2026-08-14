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

public class Account_getPassword_102286626512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52275;

    public Account_getPassword_102286626512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52370 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term52369 = ((Class) term52370).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term52369).setAccessible(true);
        Object enum123 = ((Field) term52369).get((Object) null);
        ArrayList term52317 = new ArrayList();
        ArrayList term52345 = new ArrayList();
        ((ArrayList) term52345).add((Object)null);
        ((ArrayList) term52345).add((Object)null);
        ((ArrayList) term52345).add((Object)null);
        ((ArrayList) term52345).add((Object)null);
        term52275 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term52275, term52275.getClass(), "email", "rLldJrTAay");
        setField(term52275, term52275.getClass(), "password", "HvSKssbEES");
        setField(term52275, term52275.getClass(), "role", enum123);
        setField(term52275, term52275.getClass(), "projects", term52317);
        setField(term52275, term52275.getClass(), "id", "UjIAQAHhul");
        setField(term52275, term52275.getClass(), "name", "oWBXOvjPUT");
        setField(term52275, term52275.getClass(), "relations", term52345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term52275, args);
    }

};


