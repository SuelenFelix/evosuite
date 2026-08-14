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

public class Account_getUstName_24303364531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56960;

    public Account_getUstName_24303364531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56960 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term56960, term56960.getClass(), "email", null);
        setField(term56960, term56960.getClass(), "password", null);
        setField(term56960, term56960.getClass(), "role", null);
        setField(term56960, term56960.getClass(), "projects", null);
        setField(term56960, term56960.getClass(), "id", null);
        setField(term56960, term56960.getClass(), "name", null);
        setField(term56960, term56960.getClass(), "relations", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUstName", argTypes, term56960, args);
    }

};


