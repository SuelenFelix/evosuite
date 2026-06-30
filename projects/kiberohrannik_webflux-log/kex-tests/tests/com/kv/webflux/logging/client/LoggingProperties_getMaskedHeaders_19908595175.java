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

public class LoggingProperties_getMaskedHeaders_19908595175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3633;

    public LoggingProperties_getMaskedHeaders_19908595175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3633 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term3648 = (Object[]) newArray("java.lang.String", 5);
        Object[] term3710 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term3633, term3633.getClass(), "logRequestId", true);
        setField(term3633, term3633.getClass(), "requestIdPrefix", "HHmNoYxIGj");
        setBooleanField(term3633, term3633.getClass(), "logHeaders", false);
        setElement(term3648, 0, "PtirvZmsGt");
        setElement(term3648, 1, "HWkpTmtlrc");
        setElement(term3648, 2, "hMmaoREuCK");
        setElement(term3648, 3, "VeDtgDzGAN");
        setElement(term3648, 4, "aWYOWZFyaX");
        setField(term3633, term3633.getClass(), "maskedHeaders", term3648);
        setBooleanField(term3633, term3633.getClass(), "logCookies", false);
        setElement(term3710, 0, "BRIVNtfUWU");
        setField(term3633, term3633.getClass(), "maskedCookies", term3710);
        setBooleanField(term3633, term3633.getClass(), "logBody", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaskedHeaders", argTypes, term3633, args);
    }

};


