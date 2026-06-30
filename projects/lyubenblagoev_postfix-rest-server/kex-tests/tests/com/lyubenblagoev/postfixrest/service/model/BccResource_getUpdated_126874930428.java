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

public class BccResource_getUpdated_126874930428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2167;

    public BccResource_getUpdated_126874930428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2167 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        setField(term2167, term2167.getClass(), "id", null);
        setField(term2167, term2167.getClass(), "accountId", null);
        setField(term2167, term2167.getClass(), "email", null);
        setBooleanField(term2167, term2167.getClass(), "enabled", false);
        setField(term2167, term2167.getClass(), "created", null);
        setField(term2167, term2167.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdated", argTypes, term2167, args);
    }

};


