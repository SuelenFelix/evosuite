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
import java.util.HashMap;

public class JsonCacheImpl_FactoryImpl_create_20349490051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3301;

    public JsonCacheImpl_FactoryImpl_create_20349490051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3302 = new HashMap();
        term3301 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.JsonCacheImpl$FactoryImpl"));
        setField(term3301, term3301.getClass(), "instances", term3302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.JsonCacheImpl$FactoryImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term3301, args);
    }

};


