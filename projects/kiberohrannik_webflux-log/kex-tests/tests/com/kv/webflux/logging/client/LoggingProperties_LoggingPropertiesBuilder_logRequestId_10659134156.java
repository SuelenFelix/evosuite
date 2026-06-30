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
import java.lang.Boolean;

public class LoggingProperties_LoggingPropertiesBuilder_logRequestId_10659134156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1586;
     Object term1725;

    public LoggingProperties_LoggingPropertiesBuilder_logRequestId_10659134156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1586 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        Object[] term1601 = (Object[]) newArray("java.lang.String", 2);
        Object[] term1627 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term1586, term1586.getClass(), "logRequestId", true);
        setField(term1586, term1586.getClass(), "requestIdPrefix", "bLPjGVBhlX");
        setBooleanField(term1586, term1586.getClass(), "logHeaders", true);
        setElement(term1601, 0, "whBvTVIIlC");
        setElement(term1601, 1, "IgRJUzaCwW");
        setField(term1586, term1586.getClass(), "maskedHeaders", term1601);
        setBooleanField(term1586, term1586.getClass(), "logCookies", true);
        setElement(term1627, 0, "JUmudUmaaV");
        setElement(term1627, 1, "KoyGrUJeJW");
        setElement(term1627, 2, "HqBOwkVqjD");
        setElement(term1627, 3, "MAcUBcBckh");
        setElement(term1627, 4, "oVgzLbrsFr");
        setElement(term1627, 5, "vQVyKLdtaz");
        setElement(term1627, 6, "OWKQODBLzb");
        setElement(term1627, 7, "wGmYcqUkgE");
        setField(term1586, term1586.getClass(), "maskedCookies", term1627);
        setBooleanField(term1586, term1586.getClass(), "logBody", false);
        term1725 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1725;
        callMethod(klass, "logRequestId", argTypes, term1586, args);
    }

};


