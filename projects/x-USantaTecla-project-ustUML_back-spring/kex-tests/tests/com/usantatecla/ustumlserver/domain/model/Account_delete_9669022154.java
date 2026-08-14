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

public class Account_delete_9669022154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49935;

    public Account_delete_9669022154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50030 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term50029 = ((Class) term50030).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term50029).setAccessible(true);
        Object enum117 = ((Field) term50029).get((Object) null);
        ArrayList term49977 = new ArrayList();
        ArrayList term50005 = new ArrayList();
        ((ArrayList) term50005).add((Object)null);
        ((ArrayList) term50005).add((Object)null);
        ((ArrayList) term50005).add((Object)null);
        ((ArrayList) term50005).add((Object)null);
        ((ArrayList) term50005).add((Object)null);
        term49935 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term49935, term49935.getClass(), "email", "yqEphNxUPZ");
        setField(term49935, term49935.getClass(), "password", "mJJxTuZuKO");
        setField(term49935, term49935.getClass(), "role", enum117);
        setField(term49935, term49935.getClass(), "projects", term49977);
        setField(term49935, term49935.getClass(), "id", "anSZCikKpS");
        setField(term49935, term49935.getClass(), "name", "zvMQGbTtsV");
        setField(term49935, term49935.getClass(), "relations", term50005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "delete", argTypes, term49935, args);
    }

};


