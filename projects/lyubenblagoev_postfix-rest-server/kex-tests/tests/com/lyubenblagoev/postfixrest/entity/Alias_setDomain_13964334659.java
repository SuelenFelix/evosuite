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

public class Alias_setDomain_13964334659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581;

    public Alias_setDomain_13964334659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Alias"));
        setField(term581, term581.getClass(), "domain", null);
        setField(term581, term581.getClass(), "alias", null);
        setField(term581, term581.getClass(), "email", null);
        setField(term581, term581.getClass(), "id", null);
        setBooleanField(term581, term581.getClass(), "enabled", false);
        setField(term581, term581.getClass(), "created", null);
        setField(term581, term581.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Alias");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDomain", argTypes, term581, args);
    }

};


