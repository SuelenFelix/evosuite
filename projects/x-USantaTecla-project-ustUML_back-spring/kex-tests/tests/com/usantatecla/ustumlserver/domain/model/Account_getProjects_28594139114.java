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

public class Account_getProjects_28594139114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53055;

    public Account_getProjects_28594139114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53150 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term53149 = ((Class) term53150).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term53149).setAccessible(true);
        Object enum125 = ((Field) term53149).get((Object) null);
        ArrayList term53097 = new ArrayList();
        ArrayList term53125 = new ArrayList();
        term53055 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term53055, term53055.getClass(), "email", "LBPwnVMEpP");
        setField(term53055, term53055.getClass(), "password", "cwALzyQVjH");
        setField(term53055, term53055.getClass(), "role", enum125);
        setField(term53055, term53055.getClass(), "projects", term53097);
        setField(term53055, term53055.getClass(), "id", "jlYNjpdkoz");
        setField(term53055, term53055.getClass(), "name", "DZAGnhJkeU");
        setField(term53055, term53055.getClass(), "relations", term53125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjects", argTypes, term53055, args);
    }

};


