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

public class Account_setProjects_89372223142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56970;

    public Account_setProjects_89372223142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56970 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term56970, term56970.getClass(), "email", null);
        setField(term56970, term56970.getClass(), "password", null);
        setField(term56970, term56970.getClass(), "role", null);
        setField(term56970, term56970.getClass(), "projects", null);
        setField(term56970, term56970.getClass(), "id", null);
        setField(term56970, term56970.getClass(), "name", null);
        setField(term56970, term56970.getClass(), "relations", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setProjects", argTypes, term56970, args);
    }

};


