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

public class CourseController_deleteCourse_2988909813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2321;

    public CourseController_deleteCourse_2988909813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2321 = newInstance(Class.forName("com.prac.react.controller.CourseController"));
        Object term2322 = newInstance(Class.forName("com.prac.react.service.CourseService"));
        Object term2323 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term2324 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term2355 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2393 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2396 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2399 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2401 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setField(term2321, term2321.getClass(), "logger", null);
        setField(term2322, term2322.getClass(), "logger", null);
        setField(term2322, term2322.getClass(), "cd", null);
        setField(term2321, term2321.getClass(), "cs", term2322);
        setField(term2324, term2324.getClass(), "secretKey", "JDswTTCZHV");
        setField(term2323, term2323.getClass(), "sk", term2324);
        setField(term2323, term2323.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term2355, term2355.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term2355, term2355.getClass(), "level", null);
        setIntField(term2355, term2355.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2393, term2393.getClass(), "name", "");
        setField(term2393, term2393.getClass(), "level", null);
        setIntField(term2393, term2393.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2396, term2396.getClass(), "name", null);
        setField(term2396, term2396.getClass(), "level", null);
        setIntField(term2396, term2396.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2396, term2396.getClass(), "parent", null);
        setField(term2396, term2396.getClass(), "childrenList", null);
        setField(term2396, term2396.getClass(), "aai", null);
        setBooleanField(term2396, term2396.getClass(), "additive", true);
        setField(term2396, term2396.getClass(), "loggerContext", null);
        setField(term2393, term2393.getClass(), "parent", term2396);
        setField(term2399, term2399.getClass(), "lock", null);
        setField(term2399, term2399.getClass(), "array", null);
        setField(term2393, term2393.getClass(), "childrenList", term2399);
        setField(term2393, term2393.getClass(), "aai", null);
        setBooleanField(term2393, term2393.getClass(), "additive", true);
        setField(term2401, term2401.getClass(), "root", null);
        setIntField(term2401, term2401.getClass(), "size", 33);
        setIntField(term2401, term2401.getClass(), "noAppenderWarning", 0);
        setField(term2401, term2401.getClass(), "loggerContextListenerList", null);
        setField(term2401, term2401.getClass(), "loggerCache", null);
        setField(term2401, term2401.getClass(), "loggerContextRemoteView", null);
        setField(term2401, term2401.getClass(), "turboFilterList", null);
        setBooleanField(term2401, term2401.getClass(), "packagingDataEnabled", false);
        setIntField(term2401, term2401.getClass(), "maxCallerDataDepth", 8);
        setIntField(term2401, term2401.getClass(), "resetCount", 0);
        setField(term2401, term2401.getClass(), "frameworkPackages", null);
        setLongField(term2401, term2401.getClass(), "birthTime", 1786432600198L);
        setField(term2401, term2401.getClass(), "name", null);
        setField(term2401, term2401.getClass(), "sm", null);
        setField(term2401, term2401.getClass(), "propertyMap", null);
        setField(term2401, term2401.getClass(), "objectMap", null);
        setField(term2401, term2401.getClass(), "configurationLock", null);
        setField(term2401, term2401.getClass(), "scheduledExecutorService", null);
        setField(term2401, term2401.getClass(), "scheduledFutures", null);
        setField(term2401, term2401.getClass(), "lifeCycleManager", null);
        setBooleanField(term2401, term2401.getClass(), "started", false);
        setField(term2393, term2393.getClass(), "loggerContext", term2401);
        setField(term2355, term2355.getClass(), "parent", term2393);
        setField(term2355, term2355.getClass(), "childrenList", null);
        setField(term2355, term2355.getClass(), "aai", null);
        setBooleanField(term2355, term2355.getClass(), "additive", true);
        setField(term2355, term2355.getClass(), "loggerContext", term2401);
        setField(term2323, term2323.getClass(), "logger", term2355);
        setField(term2321, term2321.getClass(), "encryption", term2323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.CourseController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onpbIeEKoi";
        callMethod(klass, "deleteCourse", argTypes, term2321, args);
    }

};


