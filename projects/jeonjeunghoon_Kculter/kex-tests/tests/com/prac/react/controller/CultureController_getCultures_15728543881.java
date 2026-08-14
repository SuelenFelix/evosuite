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

public class CultureController_getCultures_15728543881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3337;

    public CultureController_getCultures_15728543881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3337 = newInstance(Class.forName("com.prac.react.controller.CultureController"));
        Object term3338 = newInstance(Class.forName("com.prac.react.service.CultureService"));
        Object term3339 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term3340 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term3371 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term3409 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term3412 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term3415 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term3417 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setField(term3337, term3337.getClass(), "logger", null);
        setField(term3338, term3338.getClass(), "cd", null);
        setField(term3337, term3337.getClass(), "cs", term3338);
        setField(term3340, term3340.getClass(), "secretKey", "uWHnvSvaPl");
        setField(term3339, term3339.getClass(), "sk", term3340);
        setField(term3339, term3339.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term3371, term3371.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term3371, term3371.getClass(), "level", null);
        setIntField(term3371, term3371.getClass(), "effectiveLevelInt", -2147483648);
        setField(term3409, term3409.getClass(), "name", "");
        setField(term3409, term3409.getClass(), "level", null);
        setIntField(term3409, term3409.getClass(), "effectiveLevelInt", -2147483648);
        setField(term3412, term3412.getClass(), "name", null);
        setField(term3412, term3412.getClass(), "level", null);
        setIntField(term3412, term3412.getClass(), "effectiveLevelInt", -2147483648);
        setField(term3412, term3412.getClass(), "parent", null);
        setField(term3412, term3412.getClass(), "childrenList", null);
        setField(term3412, term3412.getClass(), "aai", null);
        setBooleanField(term3412, term3412.getClass(), "additive", true);
        setField(term3412, term3412.getClass(), "loggerContext", null);
        setField(term3409, term3409.getClass(), "parent", term3412);
        setField(term3415, term3415.getClass(), "lock", null);
        setField(term3415, term3415.getClass(), "array", null);
        setField(term3409, term3409.getClass(), "childrenList", term3415);
        setField(term3409, term3409.getClass(), "aai", null);
        setBooleanField(term3409, term3409.getClass(), "additive", true);
        setField(term3417, term3417.getClass(), "root", null);
        setIntField(term3417, term3417.getClass(), "size", 33);
        setIntField(term3417, term3417.getClass(), "noAppenderWarning", 0);
        setField(term3417, term3417.getClass(), "loggerContextListenerList", null);
        setField(term3417, term3417.getClass(), "loggerCache", null);
        setField(term3417, term3417.getClass(), "loggerContextRemoteView", null);
        setField(term3417, term3417.getClass(), "turboFilterList", null);
        setBooleanField(term3417, term3417.getClass(), "packagingDataEnabled", false);
        setIntField(term3417, term3417.getClass(), "maxCallerDataDepth", 8);
        setIntField(term3417, term3417.getClass(), "resetCount", 0);
        setField(term3417, term3417.getClass(), "frameworkPackages", null);
        setLongField(term3417, term3417.getClass(), "birthTime", 1786432600198L);
        setField(term3417, term3417.getClass(), "name", null);
        setField(term3417, term3417.getClass(), "sm", null);
        setField(term3417, term3417.getClass(), "propertyMap", null);
        setField(term3417, term3417.getClass(), "objectMap", null);
        setField(term3417, term3417.getClass(), "configurationLock", null);
        setField(term3417, term3417.getClass(), "scheduledExecutorService", null);
        setField(term3417, term3417.getClass(), "scheduledFutures", null);
        setField(term3417, term3417.getClass(), "lifeCycleManager", null);
        setBooleanField(term3417, term3417.getClass(), "started", false);
        setField(term3409, term3409.getClass(), "loggerContext", term3417);
        setField(term3371, term3371.getClass(), "parent", term3409);
        setField(term3371, term3371.getClass(), "childrenList", null);
        setField(term3371, term3371.getClass(), "aai", null);
        setBooleanField(term3371, term3371.getClass(), "additive", true);
        setField(term3371, term3371.getClass(), "loggerContext", term3417);
        setField(term3339, term3339.getClass(), "logger", term3371);
        setField(term3337, term3337.getClass(), "encryption", term3339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.CultureController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCultures", argTypes, term3337, args);
    }

};


