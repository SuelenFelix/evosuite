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

public class Alias_getDomain_3795513038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579;

    public Alias_getDomain_3795513038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term579 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Alias"));
        setField(term579, term579.getClass(), "domain", null);
        setField(term579, term579.getClass(), "alias", null);
        setField(term579, term579.getClass(), "email", null);
        setField(term579, term579.getClass(), "id", null);
        setBooleanField(term579, term579.getClass(), "enabled", false);
        setField(term579, term579.getClass(), "created", null);
        setField(term579, term579.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Alias");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDomain", argTypes, term579, args);
    }

};


