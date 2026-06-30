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

public class PinController_getCulturePin_6334473282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578;

    public PinController_getCulturePin_6334473282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578 = newInstance(Class.forName("com.prac.react.controller.PinController"));
        Object term579 = newInstance(Class.forName("com.prac.react.service.PinService"));
        Object term580 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term581 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term612 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term650 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term653 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term656 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term658 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setField(term578, term578.getClass(), "logger", null);
        setField(term579, term579.getClass(), "logger", null);
        setField(term579, term579.getClass(), "pd", null);
        setField(term578, term578.getClass(), "ps", term579);
        setField(term581, term581.getClass(), "secretKey", "jJCZpVmanW");
        setField(term580, term580.getClass(), "sk", term581);
        setField(term580, term580.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term612, term612.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term612, term612.getClass(), "level", null);
        setIntField(term612, term612.getClass(), "effectiveLevelInt", -2147483648);
        setField(term650, term650.getClass(), "name", "");
        setField(term650, term650.getClass(), "level", null);
        setIntField(term650, term650.getClass(), "effectiveLevelInt", -2147483648);
        setField(term653, term653.getClass(), "name", null);
        setField(term653, term653.getClass(), "level", null);
        setIntField(term653, term653.getClass(), "effectiveLevelInt", -2147483648);
        setField(term653, term653.getClass(), "parent", null);
        setField(term653, term653.getClass(), "childrenList", null);
        setField(term653, term653.getClass(), "aai", null);
        setBooleanField(term653, term653.getClass(), "additive", true);
        setField(term653, term653.getClass(), "loggerContext", null);
        setField(term650, term650.getClass(), "parent", term653);
        setField(term656, term656.getClass(), "lock", null);
        setField(term656, term656.getClass(), "array", null);
        setField(term650, term650.getClass(), "childrenList", term656);
        setField(term650, term650.getClass(), "aai", null);
        setBooleanField(term650, term650.getClass(), "additive", true);
        setField(term658, term658.getClass(), "root", null);
        setIntField(term658, term658.getClass(), "size", 33);
        setIntField(term658, term658.getClass(), "noAppenderWarning", 0);
        setField(term658, term658.getClass(), "loggerContextListenerList", null);
        setField(term658, term658.getClass(), "loggerCache", null);
        setField(term658, term658.getClass(), "loggerContextRemoteView", null);
        setField(term658, term658.getClass(), "turboFilterList", null);
        setBooleanField(term658, term658.getClass(), "packagingDataEnabled", false);
        setIntField(term658, term658.getClass(), "maxCallerDataDepth", 8);
        setIntField(term658, term658.getClass(), "resetCount", 0);
        setField(term658, term658.getClass(), "frameworkPackages", null);
        setLongField(term658, term658.getClass(), "birthTime", 1782677609604L);
        setField(term658, term658.getClass(), "name", null);
        setField(term658, term658.getClass(), "sm", null);
        setField(term658, term658.getClass(), "propertyMap", null);
        setField(term658, term658.getClass(), "objectMap", null);
        setField(term658, term658.getClass(), "configurationLock", null);
        setField(term658, term658.getClass(), "scheduledExecutorService", null);
        setField(term658, term658.getClass(), "scheduledFutures", null);
        setField(term658, term658.getClass(), "lifeCycleManager", null);
        setBooleanField(term658, term658.getClass(), "started", false);
        setField(term650, term650.getClass(), "loggerContext", term658);
        setField(term612, term612.getClass(), "parent", term650);
        setField(term612, term612.getClass(), "childrenList", null);
        setField(term612, term612.getClass(), "aai", null);
        setBooleanField(term612, term612.getClass(), "additive", true);
        setField(term612, term612.getClass(), "loggerContext", term658);
        setField(term580, term580.getClass(), "logger", term612);
        setField(term578, term578.getClass(), "encryption", term580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.PinController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "getCulturePin", argTypes, term578, args);
    }

};


