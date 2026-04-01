package org.openapijsonschematools.codegen.common;

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
import static org.openapijsonschematools.codegen.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonCacheImpl_FactoryImpl_create_20349490054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3335;

    public JsonCacheImpl_FactoryImpl_create_20349490054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3335 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.JsonCacheImpl$FactoryImpl"));
        setField(term3335, term3335.getClass(), "instances", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.JsonCacheImpl$FactoryImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term3335, args);
    }

};


