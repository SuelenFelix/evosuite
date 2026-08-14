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

public class Account_setRole_132800546217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54269;
     Object enum128;

    public Account_setRole_132800546217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54364 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term54363 = ((Class) term54364).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term54363).setAccessible(true);
        enum128 = ((Field) term54363).get((Object) null);
        ArrayList term54311 = new ArrayList();
        ArrayList term54339 = new ArrayList();
        ((ArrayList) term54339).add((Object)null);
        ((ArrayList) term54339).add((Object)null);
        ((ArrayList) term54339).add((Object)null);
        ((ArrayList) term54339).add((Object)null);
        ((ArrayList) term54339).add((Object)null);
        term54269 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term54269, term54269.getClass(), "email", "miJxAzOVJy");
        setField(term54269, term54269.getClass(), "password", "kjqlBVaviD");
        setField(term54269, term54269.getClass(), "role", enum128);
        setField(term54269, term54269.getClass(), "projects", term54311);
        setField(term54269, term54269.getClass(), "id", "iVRXRDCrcM");
        setField(term54269, term54269.getClass(), "name", "WAZFhrxcSM");
        setField(term54269, term54269.getClass(), "relations", term54339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Role");
        Object[] args = new Object[1];
        args[0] = enum128;
        callMethod(klass, "setRole", argTypes, term54269, args);
    }

};


