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
import java.lang.String;
import java.lang.Object;

public class UpdateBookStatus_version_1836889123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882;

    public UpdateBookStatus_version_1836889123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term903 = Class.forName((String) "com.bslota.optimisticapi.holding.domain.Status");
        Field term902 = ((Class) term903).getDeclaredField((String) "AVAILABLE");
        ((Field) term902).setAccessible(true);
        Object enum3 = ((Field) term902).get((Object) null);
        term882 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.UpdateBookStatus"));
        Object term896 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term897 = newInstance(Class.forName("java.util.UUID"));
        Object term900 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setField(term882, term882.getClass(), "status", enum3);
        setLongField(term897, term897.getClass(), "mostSigBits", 4872422362414183754L);
        setLongField(term897, term897.getClass(), "leastSigBits", 6811161968424632369L);
        setField(term896, term896.getClass(), "value", term897);
        setField(term882, term882.getClass(), "patronId", term896);
        setLongField(term900, term900.getClass(), "value", -8400487765614892086L);
        setField(term882, term882.getClass(), "version", term900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.UpdateBookStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "version", argTypes, term882, args);
    }

};


