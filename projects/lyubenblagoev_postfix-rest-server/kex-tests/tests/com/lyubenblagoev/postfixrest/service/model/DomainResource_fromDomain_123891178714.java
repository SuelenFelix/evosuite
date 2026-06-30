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

public class DomainResource_fromDomain_123891178714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5898;

    public DomainResource_fromDomain_123891178714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5898 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        setField(term5898, term5898.getClass(), "id", null);
        setField(term5898, term5898.getClass(), "created", null);
        setField(term5898, term5898.getClass(), "updated", null);
        setField(term5898, term5898.getClass(), "enabled", null);
        setField(term5898, term5898.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fromDomain", argTypes, term5898, args);
    }

};


