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

public class Account_getRole_209603473013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52665;

    public Account_getRole_209603473013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52760 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term52759 = ((Class) term52760).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term52759).setAccessible(true);
        Object enum124 = ((Field) term52759).get((Object) null);
        ArrayList term52707 = new ArrayList();
        ArrayList term52735 = new ArrayList();
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        term52665 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term52665, term52665.getClass(), "email", "DcKqrrTdId");
        setField(term52665, term52665.getClass(), "password", "fwtOJhjXbW");
        setField(term52665, term52665.getClass(), "role", enum124);
        setField(term52665, term52665.getClass(), "projects", term52707);
        setField(term52665, term52665.getClass(), "id", "ltWBKZaXwJ");
        setField(term52665, term52665.getClass(), "name", "FSQpgxQnsH");
        setField(term52665, term52665.getClass(), "relations", term52735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term52665, args);
    }

};


