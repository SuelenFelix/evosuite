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

public class LoggingProperties_getMaskedCookies_15514271247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4021;

    public LoggingProperties_getMaskedCookies_15514271247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4021 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term4036 = (Object[]) newArray("java.lang.String", 4);
        Object[] term4086 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term4021, term4021.getClass(), "logRequestId", true);
        setField(term4021, term4021.getClass(), "requestIdPrefix", "vwbEQQNQrx");
        setBooleanField(term4021, term4021.getClass(), "logHeaders", false);
        setElement(term4036, 0, "xtftXXMbem");
        setElement(term4036, 1, "cudZvLMQon");
        setElement(term4036, 2, "lihXWlGDxk");
        setElement(term4036, 3, "JmcmxoGhIK");
        setField(term4021, term4021.getClass(), "maskedHeaders", term4036);
        setBooleanField(term4021, term4021.getClass(), "logCookies", false);
        setElement(term4086, 0, "jXzmYyrnnT");
        setElement(term4086, 1, "igCAtimmYB");
        setElement(term4086, 2, "DyiXbeYIaN");
        setElement(term4086, 3, "VGizxZnyHX");
        setElement(term4086, 4, "kVEZMHmRtR");
        setElement(term4086, 5, "ekxGuOYIwi");
        setElement(term4086, 6, "RbVQXSpxXy");
        setElement(term4086, 7, "YpJbIgJWWv");
        setField(term4021, term4021.getClass(), "maskedCookies", term4086);
        setBooleanField(term4021, term4021.getClass(), "logBody", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaskedCookies", argTypes, term4021, args);
    }

};


