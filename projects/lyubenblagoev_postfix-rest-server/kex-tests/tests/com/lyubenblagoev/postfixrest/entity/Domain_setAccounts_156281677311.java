package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Domain_setAccounts_156281677311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6546;

    public Domain_setAccounts_156281677311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6546 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        setField(term6546, term6546.getClass(), "name", null);
        setField(term6546, term6546.getClass(), "accounts", null);
        setField(term6546, term6546.getClass(), "aliases", null);
        setField(term6546, term6546.getClass(), "id", null);
        setBooleanField(term6546, term6546.getClass(), "enabled", false);
        setField(term6546, term6546.getClass(), "created", null);
        setField(term6546, term6546.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAccounts", argTypes, term6546, args);
    }

};


