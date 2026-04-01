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

public class CourseController_getCourses_2482635212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2150;

    public CourseController_getCourses_2482635212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2150 = newInstance(Class.forName("com.prac.react.controller.CourseController"));
        Object term2151 = newInstance(Class.forName("com.prac.react.service.CourseService"));
        Object term2152 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term2153 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term2184 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2222 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2225 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2228 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2230 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setField(term2150, term2150.getClass(), "logger", null);
        setField(term2151, term2151.getClass(), "logger", null);
        setField(term2151, term2151.getClass(), "cd", null);
        setField(term2150, term2150.getClass(), "cs", term2151);
        setField(term2153, term2153.getClass(), "secretKey", "UiUYnPrcCi");
        setField(term2152, term2152.getClass(), "sk", term2153);
        setField(term2152, term2152.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term2184, term2184.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term2184, term2184.getClass(), "level", null);
        setIntField(term2184, term2184.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2222, term2222.getClass(), "name", "");
        setField(term2222, term2222.getClass(), "level", null);
        setIntField(term2222, term2222.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2225, term2225.getClass(), "name", null);
        setField(term2225, term2225.getClass(), "level", null);
        setIntField(term2225, term2225.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2225, term2225.getClass(), "parent", null);
        setField(term2225, term2225.getClass(), "childrenList", null);
        setField(term2225, term2225.getClass(), "aai", null);
        setBooleanField(term2225, term2225.getClass(), "additive", true);
        setField(term2225, term2225.getClass(), "loggerContext", null);
        setField(term2222, term2222.getClass(), "parent", term2225);
        setField(term2228, term2228.getClass(), "lock", null);
        setField(term2228, term2228.getClass(), "array", null);
        setField(term2222, term2222.getClass(), "childrenList", term2228);
        setField(term2222, term2222.getClass(), "aai", null);
        setBooleanField(term2222, term2222.getClass(), "additive", true);
        setField(term2230, term2230.getClass(), "root", null);
        setIntField(term2230, term2230.getClass(), "size", 33);
        setIntField(term2230, term2230.getClass(), "noAppenderWarning", 0);
        setField(term2230, term2230.getClass(), "loggerContextListenerList", null);
        setField(term2230, term2230.getClass(), "loggerCache", null);
        setField(term2230, term2230.getClass(), "loggerContextRemoteView", null);
        setField(term2230, term2230.getClass(), "turboFilterList", null);
        setBooleanField(term2230, term2230.getClass(), "packagingDataEnabled", false);
        setIntField(term2230, term2230.getClass(), "maxCallerDataDepth", 8);
        setIntField(term2230, term2230.getClass(), "resetCount", 0);
        setField(term2230, term2230.getClass(), "frameworkPackages", null);
        setLongField(term2230, term2230.getClass(), "birthTime", 1775069216969L);
        setField(term2230, term2230.getClass(), "name", null);
        setField(term2230, term2230.getClass(), "sm", null);
        setField(term2230, term2230.getClass(), "propertyMap", null);
        setField(term2230, term2230.getClass(), "objectMap", null);
        setField(term2230, term2230.getClass(), "configurationLock", null);
        setField(term2230, term2230.getClass(), "scheduledExecutorService", null);
        setField(term2230, term2230.getClass(), "scheduledFutures", null);
        setField(term2230, term2230.getClass(), "lifeCycleManager", null);
        setBooleanField(term2230, term2230.getClass(), "started", false);
        setField(term2222, term2222.getClass(), "loggerContext", term2230);
        setField(term2184, term2184.getClass(), "parent", term2222);
        setField(term2184, term2184.getClass(), "childrenList", null);
        setField(term2184, term2184.getClass(), "aai", null);
        setBooleanField(term2184, term2184.getClass(), "additive", true);
        setField(term2184, term2184.getClass(), "loggerContext", term2230);
        setField(term2152, term2152.getClass(), "logger", term2184);
        setField(term2150, term2150.getClass(), "encryption", term2152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.CourseController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "getCourses", argTypes, term2150, args);
    }

};


