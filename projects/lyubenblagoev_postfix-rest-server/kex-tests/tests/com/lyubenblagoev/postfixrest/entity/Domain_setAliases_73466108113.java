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

public class Domain_setAliases_73466108113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6550;

    public Domain_setAliases_73466108113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6550 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        setField(term6550, term6550.getClass(), "name", null);
        setField(term6550, term6550.getClass(), "accounts", null);
        setField(term6550, term6550.getClass(), "aliases", null);
        setField(term6550, term6550.getClass(), "id", null);
        setBooleanField(term6550, term6550.getClass(), "enabled", false);
        setField(term6550, term6550.getClass(), "created", null);
        setField(term6550, term6550.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAliases", argTypes, term6550, args);
    }

};


