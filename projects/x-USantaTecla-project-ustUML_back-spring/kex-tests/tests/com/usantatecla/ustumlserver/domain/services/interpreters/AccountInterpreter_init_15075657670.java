package com.usantatecla.ustumlserver.domain.services.interpreters;

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
import static com.usantatecla.ustumlserver.domain.services.interpreters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class AccountInterpreter_init_15075657670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21166;

    public AccountInterpreter_init_15075657670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21261 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term21260 = ((Class) term21261).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term21260).setAccessible(true);
        Object enum50 = ((Field) term21260).get((Object) null);
        ArrayList term21208 = new ArrayList();
        ArrayList term21236 = new ArrayList();
        ((ArrayList) term21236).add((Object)null);
        ((ArrayList) term21236).add((Object)null);
        ((ArrayList) term21236).add((Object)null);
        term21166 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term21166, term21166.getClass(), "email", "lZIgPZPgTu");
        setField(term21166, term21166.getClass(), "password", "iuCxnHGMoW");
        setField(term21166, term21166.getClass(), "role", enum50);
        setField(term21166, term21166.getClass(), "projects", term21208);
        setField(term21166, term21166.getClass(), "id", "GPSEWEDSTo");
        setField(term21166, term21166.getClass(), "name", "RCOqfVsRHt");
        setField(term21166, term21166.getClass(), "relations", term21236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.AccountInterpreter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        Object[] args = new Object[2];
        args[0] = term21166;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


