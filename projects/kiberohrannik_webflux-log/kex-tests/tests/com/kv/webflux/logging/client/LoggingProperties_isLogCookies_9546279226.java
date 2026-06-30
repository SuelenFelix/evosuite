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

public class LoggingProperties_isLogCookies_9546279226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3794;

    public LoggingProperties_isLogCookies_9546279226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3794 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term3809 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3811 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term3794, term3794.getClass(), "logRequestId", false);
        setField(term3794, term3794.getClass(), "requestIdPrefix", "DbiCVtPPCT");
        setBooleanField(term3794, term3794.getClass(), "logHeaders", false);
        setField(term3794, term3794.getClass(), "maskedHeaders", term3809);
        setBooleanField(term3794, term3794.getClass(), "logCookies", false);
        setElement(term3811, 0, "WzFopsaDuG");
        setElement(term3811, 1, "PapWxkhEWe");
        setElement(term3811, 2, "smnHEqRFRx");
        setElement(term3811, 3, "XYtryyobou");
        setElement(term3811, 4, "OYbzXylRWW");
        setElement(term3811, 5, "DSNsTGYXDF");
        setElement(term3811, 6, "sQvGcVjdEx");
        setElement(term3811, 7, "rLHAoqXgPh");
        setElement(term3811, 8, "zUlRdimJtU");
        setField(term3794, term3794.getClass(), "maskedCookies", term3811);
        setBooleanField(term3794, term3794.getClass(), "logBody", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogCookies", argTypes, term3794, args);
    }

};


