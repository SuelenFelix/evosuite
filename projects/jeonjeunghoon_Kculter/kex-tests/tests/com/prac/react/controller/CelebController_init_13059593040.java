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

public class CelebController_init_13059593040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1107;
     Object term1108;

    public CelebController_init_13059593040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1107 = newInstance(Class.forName("com.prac.react.service.CelebService"));
        setField(term1107, term1107.getClass(), "cd", null);
        term1108 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term1109 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term1140 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1178 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1205 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1208 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1211 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1213 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term1221 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1222 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1223 = (Object[]) newArray("java.lang.Object", 1);
        setField(term1109, term1109.getClass(), "secretKey", "hRNSzYYIrc");
        setField(term1108, term1108.getClass(), "sk", term1109);
        setField(term1108, term1108.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term1140, term1140.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term1140, term1140.getClass(), "level", null);
        setIntField(term1140, term1140.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1178, term1178.getClass(), "name", "com.prac.react.security");
        setField(term1178, term1178.getClass(), "level", null);
        setIntField(term1178, term1178.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1205, term1205.getClass(), "name", "");
        setField(term1205, term1205.getClass(), "level", null);
        setIntField(term1205, term1205.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1208, term1208.getClass(), "name", null);
        setField(term1208, term1208.getClass(), "level", null);
        setIntField(term1208, term1208.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1208, term1208.getClass(), "parent", null);
        setField(term1208, term1208.getClass(), "childrenList", null);
        setField(term1208, term1208.getClass(), "aai", null);
        setBooleanField(term1208, term1208.getClass(), "additive", true);
        setField(term1208, term1208.getClass(), "loggerContext", null);
        setField(term1205, term1205.getClass(), "parent", term1208);
        setField(term1211, term1211.getClass(), "lock", null);
        setField(term1211, term1211.getClass(), "array", null);
        setField(term1205, term1205.getClass(), "childrenList", term1211);
        setField(term1205, term1205.getClass(), "aai", null);
        setBooleanField(term1205, term1205.getClass(), "additive", true);
        setField(term1213, term1213.getClass(), "root", null);
        setIntField(term1213, term1213.getClass(), "size", 33);
        setIntField(term1213, term1213.getClass(), "noAppenderWarning", 0);
        setField(term1213, term1213.getClass(), "loggerContextListenerList", null);
        setField(term1213, term1213.getClass(), "loggerCache", null);
        setField(term1213, term1213.getClass(), "loggerContextRemoteView", null);
        setField(term1213, term1213.getClass(), "turboFilterList", null);
        setBooleanField(term1213, term1213.getClass(), "packagingDataEnabled", false);
        setIntField(term1213, term1213.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1213, term1213.getClass(), "resetCount", 0);
        setField(term1213, term1213.getClass(), "frameworkPackages", null);
        setLongField(term1213, term1213.getClass(), "birthTime", 1775069216969L);
        setField(term1213, term1213.getClass(), "name", null);
        setField(term1213, term1213.getClass(), "sm", null);
        setField(term1213, term1213.getClass(), "propertyMap", null);
        setField(term1213, term1213.getClass(), "objectMap", null);
        setField(term1213, term1213.getClass(), "configurationLock", null);
        setField(term1213, term1213.getClass(), "scheduledExecutorService", null);
        setField(term1213, term1213.getClass(), "scheduledFutures", null);
        setField(term1213, term1213.getClass(), "lifeCycleManager", null);
        setBooleanField(term1213, term1213.getClass(), "started", false);
        setField(term1205, term1205.getClass(), "loggerContext", term1213);
        setField(term1178, term1178.getClass(), "parent", term1205);
        setField(term1221, term1221.getClass(), "lock", term1222);
        setElement(term1223, 0, term1140);
        setField(term1221, term1221.getClass(), "array", term1223);
        setField(term1178, term1178.getClass(), "childrenList", term1221);
        setField(term1178, term1178.getClass(), "aai", null);
        setBooleanField(term1178, term1178.getClass(), "additive", true);
        setField(term1178, term1178.getClass(), "loggerContext", term1213);
        setField(term1140, term1140.getClass(), "parent", term1178);
        setField(term1140, term1140.getClass(), "childrenList", null);
        setField(term1140, term1140.getClass(), "aai", null);
        setBooleanField(term1140, term1140.getClass(), "additive", true);
        setField(term1140, term1140.getClass(), "loggerContext", term1213);
        setField(term1108, term1108.getClass(), "logger", term1140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.CelebController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.prac.react.service.CelebService");
        argTypes[1] = Class.forName("com.prac.react.security.Encryption");
        Object[] args = new Object[2];
        args[0] = term1107;
        args[1] = term1108;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


