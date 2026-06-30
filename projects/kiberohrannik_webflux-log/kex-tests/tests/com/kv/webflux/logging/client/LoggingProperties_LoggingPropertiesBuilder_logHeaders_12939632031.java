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

public class LoggingProperties_LoggingPropertiesBuilder_logHeaders_12939632031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;
     Object term580;

    public LoggingProperties_LoggingPropertiesBuilder_logHeaders_12939632031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        Object[] term480 = (Object[]) newArray("java.lang.String", 6);
        Object[] term554 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term465, term465.getClass(), "logRequestId", false);
        setField(term465, term465.getClass(), "requestIdPrefix", "hNxWaHcfhY");
        setBooleanField(term465, term465.getClass(), "logHeaders", true);
        setElement(term480, 0, "RkybSrpybU");
        setElement(term480, 1, "xOEqzGAmDU");
        setElement(term480, 2, "eZFUvlxvGV");
        setElement(term480, 3, "BYqFIqCKAV");
        setElement(term480, 4, "vrQLuWIDJX");
        setElement(term480, 5, "flxyYxBRtu");
        setField(term465, term465.getClass(), "maskedHeaders", term480);
        setBooleanField(term465, term465.getClass(), "logCookies", false);
        setElement(term554, 0, "OclPbYPkcH");
        setElement(term554, 1, "IoAlmYsBwc");
        setField(term465, term465.getClass(), "maskedCookies", term554);
        setBooleanField(term465, term465.getClass(), "logBody", true);
        term580 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term580;
        callMethod(klass, "logHeaders", argTypes, term465, args);
    }

};


