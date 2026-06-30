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

public class ConcertController_init_2094812740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term755;
     Object term756;

    public ConcertController_init_2094812740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term755 = newInstance(Class.forName("com.prac.react.service.ConcertService"));
        setField(term755, term755.getClass(), "logger", null);
        setField(term755, term755.getClass(), "cd", null);
        term756 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term757 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term788 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term826 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term853 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term856 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term859 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term861 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term869 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term870 = newInstance(Class.forName("java.lang.Object"));
        Object[] term871 = (Object[]) newArray("java.lang.Object", 1);
        setField(term757, term757.getClass(), "secretKey", "SzjVpOQTyS");
        setField(term756, term756.getClass(), "sk", term757);
        setField(term756, term756.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term788, term788.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term788, term788.getClass(), "level", null);
        setIntField(term788, term788.getClass(), "effectiveLevelInt", -2147483648);
        setField(term826, term826.getClass(), "name", "com.prac.react.security");
        setField(term826, term826.getClass(), "level", null);
        setIntField(term826, term826.getClass(), "effectiveLevelInt", -2147483648);
        setField(term853, term853.getClass(), "name", "");
        setField(term853, term853.getClass(), "level", null);
        setIntField(term853, term853.getClass(), "effectiveLevelInt", -2147483648);
        setField(term856, term856.getClass(), "name", null);
        setField(term856, term856.getClass(), "level", null);
        setIntField(term856, term856.getClass(), "effectiveLevelInt", -2147483648);
        setField(term856, term856.getClass(), "parent", null);
        setField(term856, term856.getClass(), "childrenList", null);
        setField(term856, term856.getClass(), "aai", null);
        setBooleanField(term856, term856.getClass(), "additive", true);
        setField(term856, term856.getClass(), "loggerContext", null);
        setField(term853, term853.getClass(), "parent", term856);
        setField(term859, term859.getClass(), "lock", null);
        setField(term859, term859.getClass(), "array", null);
        setField(term853, term853.getClass(), "childrenList", term859);
        setField(term853, term853.getClass(), "aai", null);
        setBooleanField(term853, term853.getClass(), "additive", true);
        setField(term861, term861.getClass(), "root", null);
        setIntField(term861, term861.getClass(), "size", 33);
        setIntField(term861, term861.getClass(), "noAppenderWarning", 0);
        setField(term861, term861.getClass(), "loggerContextListenerList", null);
        setField(term861, term861.getClass(), "loggerCache", null);
        setField(term861, term861.getClass(), "loggerContextRemoteView", null);
        setField(term861, term861.getClass(), "turboFilterList", null);
        setBooleanField(term861, term861.getClass(), "packagingDataEnabled", false);
        setIntField(term861, term861.getClass(), "maxCallerDataDepth", 8);
        setIntField(term861, term861.getClass(), "resetCount", 0);
        setField(term861, term861.getClass(), "frameworkPackages", null);
        setLongField(term861, term861.getClass(), "birthTime", 1782677609604L);
        setField(term861, term861.getClass(), "name", null);
        setField(term861, term861.getClass(), "sm", null);
        setField(term861, term861.getClass(), "propertyMap", null);
        setField(term861, term861.getClass(), "objectMap", null);
        setField(term861, term861.getClass(), "configurationLock", null);
        setField(term861, term861.getClass(), "scheduledExecutorService", null);
        setField(term861, term861.getClass(), "scheduledFutures", null);
        setField(term861, term861.getClass(), "lifeCycleManager", null);
        setBooleanField(term861, term861.getClass(), "started", false);
        setField(term853, term853.getClass(), "loggerContext", term861);
        setField(term826, term826.getClass(), "parent", term853);
        setField(term869, term869.getClass(), "lock", term870);
        setElement(term871, 0, term788);
        setField(term869, term869.getClass(), "array", term871);
        setField(term826, term826.getClass(), "childrenList", term869);
        setField(term826, term826.getClass(), "aai", null);
        setBooleanField(term826, term826.getClass(), "additive", true);
        setField(term826, term826.getClass(), "loggerContext", term861);
        setField(term788, term788.getClass(), "parent", term826);
        setField(term788, term788.getClass(), "childrenList", null);
        setField(term788, term788.getClass(), "aai", null);
        setBooleanField(term788, term788.getClass(), "additive", true);
        setField(term788, term788.getClass(), "loggerContext", term861);
        setField(term756, term756.getClass(), "logger", term788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.ConcertController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.prac.react.service.ConcertService");
        argTypes[1] = Class.forName("com.prac.react.security.Encryption");
        Object[] args = new Object[2];
        args[0] = term755;
        args[1] = term756;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


