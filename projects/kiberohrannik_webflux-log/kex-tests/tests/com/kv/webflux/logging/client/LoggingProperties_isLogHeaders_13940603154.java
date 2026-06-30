package com.kv.webflux.logging.client;

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
import static com.kv.webflux.logging.client.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LoggingProperties_isLogHeaders_13940603154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3428;

    public LoggingProperties_isLogHeaders_13940603154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3428 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term3443 = (Object[]) newArray("java.lang.String", 3);
        Object[] term3481 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term3428, term3428.getClass(), "logRequestId", false);
        setField(term3428, term3428.getClass(), "requestIdPrefix", "FPvxVzzSvD");
        setBooleanField(term3428, term3428.getClass(), "logHeaders", false);
        setElement(term3443, 0, "WHcwFgsGFC");
        setElement(term3443, 1, "HzqpegHiRq");
        setElement(term3443, 2, "jwsfVjMoJT");
        setField(term3428, term3428.getClass(), "maskedHeaders", term3443);
        setBooleanField(term3428, term3428.getClass(), "logCookies", true);
        setElement(term3481, 0, "ZfdXfCCFDf");
        setElement(term3481, 1, "MwwjNtdOFT");
        setElement(term3481, 2, "VYkqXKVlAJ");
        setElement(term3481, 3, "XkIoWJRNwN");
        setElement(term3481, 4, "aNWLJdrZMq");
        setField(term3428, term3428.getClass(), "maskedCookies", term3481);
        setBooleanField(term3428, term3428.getClass(), "logBody", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogHeaders", argTypes, term3428, args);
    }

};


