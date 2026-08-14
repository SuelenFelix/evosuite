package com.prac.react.controller;

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
import static com.prac.react.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CelebController_getCelebrities_18427546031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1309;

    public CelebController_getCelebrities_18427546031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1309 = newInstance(Class.forName("com.prac.react.controller.CelebController"));
        Object term1310 = newInstance(Class.forName("com.prac.react.service.CelebService"));
        Object term1311 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term1312 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term1343 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1381 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1384 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1387 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1389 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setField(term1309, term1309.getClass(), "logger", null);
        setField(term1310, term1310.getClass(), "cd", null);
        setField(term1309, term1309.getClass(), "cs", term1310);
        setField(term1312, term1312.getClass(), "secretKey", "RMFIsYGgne");
        setField(term1311, term1311.getClass(), "sk", term1312);
        setField(term1311, term1311.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term1343, term1343.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term1343, term1343.getClass(), "level", null);
        setIntField(term1343, term1343.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1381, term1381.getClass(), "name", "");
        setField(term1381, term1381.getClass(), "level", null);
        setIntField(term1381, term1381.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1384, term1384.getClass(), "name", null);
        setField(term1384, term1384.getClass(), "level", null);
        setIntField(term1384, term1384.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1384, term1384.getClass(), "parent", null);
        setField(term1384, term1384.getClass(), "childrenList", null);
        setField(term1384, term1384.getClass(), "aai", null);
        setBooleanField(term1384, term1384.getClass(), "additive", true);
        setField(term1384, term1384.getClass(), "loggerContext", null);
        setField(term1381, term1381.getClass(), "parent", term1384);
        setField(term1387, term1387.getClass(), "lock", null);
        setField(term1387, term1387.getClass(), "array", null);
        setField(term1381, term1381.getClass(), "childrenList", term1387);
        setField(term1381, term1381.getClass(), "aai", null);
        setBooleanField(term1381, term1381.getClass(), "additive", true);
        setField(term1389, term1389.getClass(), "root", null);
        setIntField(term1389, term1389.getClass(), "size", 33);
        setIntField(term1389, term1389.getClass(), "noAppenderWarning", 0);
        setField(term1389, term1389.getClass(), "loggerContextListenerList", null);
        setField(term1389, term1389.getClass(), "loggerCache", null);
        setField(term1389, term1389.getClass(), "loggerContextRemoteView", null);
        setField(term1389, term1389.getClass(), "turboFilterList", null);
        setBooleanField(term1389, term1389.getClass(), "packagingDataEnabled", false);
        setIntField(term1389, term1389.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1389, term1389.getClass(), "resetCount", 0);
        setField(term1389, term1389.getClass(), "frameworkPackages", null);
        setLongField(term1389, term1389.getClass(), "birthTime", 1786432600198L);
        setField(term1389, term1389.getClass(), "name", null);
        setField(term1389, term1389.getClass(), "sm", null);
        setField(term1389, term1389.getClass(), "propertyMap", null);
        setField(term1389, term1389.getClass(), "objectMap", null);
        setField(term1389, term1389.getClass(), "configurationLock", null);
        setField(term1389, term1389.getClass(), "scheduledExecutorService", null);
        setField(term1389, term1389.getClass(), "scheduledFutures", null);
        setField(term1389, term1389.getClass(), "lifeCycleManager", null);
        setBooleanField(term1389, term1389.getClass(), "started", false);
        setField(term1381, term1381.getClass(), "loggerContext", term1389);
        setField(term1343, term1343.getClass(), "parent", term1381);
        setField(term1343, term1343.getClass(), "childrenList", null);
        setField(term1343, term1343.getClass(), "aai", null);
        setBooleanField(term1343, term1343.getClass(), "additive", true);
        setField(term1343, term1343.getClass(), "loggerContext", term1389);
        setField(term1311, term1311.getClass(), "logger", term1343);
        setField(term1309, term1309.getClass(), "encryption", term1311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.CelebController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCelebrities", argTypes, term1309, args);
    }

};


