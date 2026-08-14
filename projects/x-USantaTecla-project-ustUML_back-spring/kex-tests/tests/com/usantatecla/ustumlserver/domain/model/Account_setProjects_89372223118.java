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
import java.util.LinkedList;

public class Account_setProjects_89372223118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54659;
     Object term54733;

    public Account_setProjects_89372223118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54757 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term54756 = ((Class) term54757).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term54756).setAccessible(true);
        Object enum129 = ((Field) term54756).get((Object) null);
        ArrayList term54701 = new ArrayList();
        ArrayList term54729 = new ArrayList();
        ((ArrayList) term54729).add((Object)null);
        ((ArrayList) term54729).add((Object)null);
        ((ArrayList) term54729).add((Object)null);
        ((ArrayList) term54729).add((Object)null);
        term54659 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term54659, term54659.getClass(), "email", "gCRUlTuVMX");
        setField(term54659, term54659.getClass(), "password", "tYBgGQtkhi");
        setField(term54659, term54659.getClass(), "role", enum129);
        setField(term54659, term54659.getClass(), "projects", term54701);
        setField(term54659, term54659.getClass(), "id", "PhGPFLIMKH");
        setField(term54659, term54659.getClass(), "name", "pWCYcLhoms");
        setField(term54659, term54659.getClass(), "relations", term54729);
        term54733 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term54733;
        callMethod(klass, "setProjects", argTypes, term54659, args);
    }

};


