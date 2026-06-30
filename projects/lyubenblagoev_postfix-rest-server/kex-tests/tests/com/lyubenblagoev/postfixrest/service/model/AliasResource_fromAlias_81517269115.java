package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AliasResource_fromAlias_81517269115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1467;

    public AliasResource_fromAlias_81517269115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1467 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        setField(term1467, term1467.getClass(), "id", null);
        setField(term1467, term1467.getClass(), "name", null);
        setField(term1467, term1467.getClass(), "email", null);
        setField(term1467, term1467.getClass(), "created", null);
        setField(term1467, term1467.getClass(), "updated", null);
        setBooleanField(term1467, term1467.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Alias");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fromAlias", argTypes, term1467, args);
    }

};


