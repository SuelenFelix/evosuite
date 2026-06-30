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

public class LoggingProperties_isLogRequestId_19354843932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2952;

    public LoggingProperties_isLogRequestId_19354843932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2952 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term2967 = (Object[]) newArray("java.lang.String", 6);
        Object[] term3041 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term2952, term2952.getClass(), "logRequestId", false);
        setField(term2952, term2952.getClass(), "requestIdPrefix", "JDaAnsVTGV");
        setBooleanField(term2952, term2952.getClass(), "logHeaders", true);
        setElement(term2967, 0, "mLUZFTfjle");
        setElement(term2967, 1, "xIeFjkHkOe");
        setElement(term2967, 2, "SdCKLMIYnX");
        setElement(term2967, 3, "OJJtVNPyKZ");
        setElement(term2967, 4, "AKNapTAfmD");
        setElement(term2967, 5, "xJgPlLxpgC");
        setField(term2952, term2952.getClass(), "maskedHeaders", term2967);
        setBooleanField(term2952, term2952.getClass(), "logCookies", false);
        setElement(term3041, 0, "EYtfuJaxiM");
        setElement(term3041, 1, "gCWtLVKVVe");
        setElement(term3041, 2, "fWKJoSoCwE");
        setElement(term3041, 3, "wfaXBpWAUH");
        setElement(term3041, 4, "VMeAzAHwZj");
        setElement(term3041, 5, "PznxWXsZME");
        setField(term2952, term2952.getClass(), "maskedCookies", term3041);
        setBooleanField(term2952, term2952.getClass(), "logBody", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogRequestId", argTypes, term2952, args);
    }

};


