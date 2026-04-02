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

public class Domain_getAliases_121986395712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6548;

    public Domain_getAliases_121986395712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6548 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        setField(term6548, term6548.getClass(), "name", null);
        setField(term6548, term6548.getClass(), "accounts", null);
        setField(term6548, term6548.getClass(), "aliases", null);
        setField(term6548, term6548.getClass(), "id", null);
        setBooleanField(term6548, term6548.getClass(), "enabled", false);
        setField(term6548, term6548.getClass(), "created", null);
        setField(term6548, term6548.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAliases", argTypes, term6548, args);
    }

};


