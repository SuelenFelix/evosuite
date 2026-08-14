package com.bslota.optimisticapi.holding.infrastructure.rest;

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
import static com.bslota.optimisticapi.holding.infrastructure.rest.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ETag_getTrimmedValue_15791792814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1240;

    public ETag_getTrimmedValue_15791792814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1240 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.ETag"));
        setField(term1240, term1240.getClass(), "value", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.ETag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrimmedValue", argTypes, term1240, args);
    }

};


