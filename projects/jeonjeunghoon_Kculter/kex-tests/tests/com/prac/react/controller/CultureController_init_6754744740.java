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

public class CultureController_init_6754744740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3135;
     Object term3136;

    public CultureController_init_6754744740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3135 = newInstance(Class.forName("com.prac.react.service.CultureService"));
        setField(term3135, term3135.getClass(), "cd", null);
        term3136 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term3137 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term3168 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term3206 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term3233 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term3236 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term3239 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term3241 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term3249 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term3250 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3251 = (Object[]) newArray("java.lang.Object", 1);
        setField(term3137, term3137.getClass(), "secretKey", "fhkbdRViHi");
        setField(term3136, term3136.getClass(), "sk", term3137);
        setField(term3136, term3136.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term3168, term3168.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term3168, term3168.getClass(), "level", null);
        setIntField(term3168, term3168.getClass(), "effectiveLevelInt", -2147483648);
        setField(term3206, term3206.getClass(), "name", "com.prac.react.security");
        setField(term3206, term3206.getClass(), "level", null);
        setIntField(term3206, term3206.getClass(), "effectiveLevelInt", -2147483648);
        setField(term3233, term3233.getClass(), "name", "");
        setField(term3233, term3233.getClass(), "level", null);
        setIntField(term3233, term3233.getClass(), "effectiveLevelInt", -2147483648);
        setField(term3236, term3236.getClass(), "name", null);
        setField(term3236, term3236.getClass(), "level", null);
        setIntField(term3236, term3236.getClass(), "effectiveLevelInt", -2147483648);
        setField(term3236, term3236.getClass(), "parent", null);
        setField(term3236, term3236.getClass(), "childrenList", null);
        setField(term3236, term3236.getClass(), "aai", null);
        setBooleanField(term3236, term3236.getClass(), "additive", true);
        setField(term3236, term3236.getClass(), "loggerContext", null);
        setField(term3233, term3233.getClass(), "parent", term3236);
        setField(term3239, term3239.getClass(), "lock", null);
        setField(term3239, term3239.getClass(), "array", null);
        setField(term3233, term3233.getClass(), "childrenList", term3239);
        setField(term3233, term3233.getClass(), "aai", null);
        setBooleanField(term3233, term3233.getClass(), "additive", true);
        setField(term3241, term3241.getClass(), "root", null);
        setIntField(term3241, term3241.getClass(), "size", 33);
        setIntField(term3241, term3241.getClass(), "noAppenderWarning", 0);
        setField(term3241, term3241.getClass(), "loggerContextListenerList", null);
        setField(term3241, term3241.getClass(), "loggerCache", null);
        setField(term3241, term3241.getClass(), "loggerContextRemoteView", null);
        setField(term3241, term3241.getClass(), "turboFilterList", null);
        setBooleanField(term3241, term3241.getClass(), "packagingDataEnabled", false);
        setIntField(term3241, term3241.getClass(), "maxCallerDataDepth", 8);
        setIntField(term3241, term3241.getClass(), "resetCount", 0);
        setField(term3241, term3241.getClass(), "frameworkPackages", null);
        setLongField(term3241, term3241.getClass(), "birthTime", 1782677609604L);
        setField(term3241, term3241.getClass(), "name", null);
        setField(term3241, term3241.getClass(), "sm", null);
        setField(term3241, term3241.getClass(), "propertyMap", null);
        setField(term3241, term3241.getClass(), "objectMap", null);
        setField(term3241, term3241.getClass(), "configurationLock", null);
        setField(term3241, term3241.getClass(), "scheduledExecutorService", null);
        setField(term3241, term3241.getClass(), "scheduledFutures", null);
        setField(term3241, term3241.getClass(), "lifeCycleManager", null);
        setBooleanField(term3241, term3241.getClass(), "started", false);
        setField(term3233, term3233.getClass(), "loggerContext", term3241);
        setField(term3206, term3206.getClass(), "parent", term3233);
        setField(term3249, term3249.getClass(), "lock", term3250);
        setElement(term3251, 0, term3168);
        setField(term3249, term3249.getClass(), "array", term3251);
        setField(term3206, term3206.getClass(), "childrenList", term3249);
        setField(term3206, term3206.getClass(), "aai", null);
        setBooleanField(term3206, term3206.getClass(), "additive", true);
        setField(term3206, term3206.getClass(), "loggerContext", term3241);
        setField(term3168, term3168.getClass(), "parent", term3206);
        setField(term3168, term3168.getClass(), "childrenList", null);
        setField(term3168, term3168.getClass(), "aai", null);
        setBooleanField(term3168, term3168.getClass(), "additive", true);
        setField(term3168, term3168.getClass(), "loggerContext", term3241);
        setField(term3136, term3136.getClass(), "logger", term3168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.CultureController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.prac.react.service.CultureService");
        argTypes[1] = Class.forName("com.prac.react.security.Encryption");
        Object[] args = new Object[2];
        args[0] = term3135;
        args[1] = term3136;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


