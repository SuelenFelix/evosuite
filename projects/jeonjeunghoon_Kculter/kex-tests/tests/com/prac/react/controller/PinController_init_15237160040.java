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

public class PinController_init_15237160040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;
     Object term206;

    public PinController_init_15237160040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205 = newInstance(Class.forName("com.prac.react.service.PinService"));
        setField(term205, term205.getClass(), "logger", null);
        setField(term205, term205.getClass(), "pd", null);
        term206 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term207 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term238 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term276 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term303 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term306 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term309 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term311 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term319 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term320 = newInstance(Class.forName("java.lang.Object"));
        Object[] term321 = (Object[]) newArray("java.lang.Object", 1);
        setField(term207, term207.getClass(), "secretKey", "sjlJAEtRrb");
        setField(term206, term206.getClass(), "sk", term207);
        setField(term206, term206.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term238, term238.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term238, term238.getClass(), "level", null);
        setIntField(term238, term238.getClass(), "effectiveLevelInt", -2147483648);
        setField(term276, term276.getClass(), "name", "com.prac.react.security");
        setField(term276, term276.getClass(), "level", null);
        setIntField(term276, term276.getClass(), "effectiveLevelInt", -2147483648);
        setField(term303, term303.getClass(), "name", "");
        setField(term303, term303.getClass(), "level", null);
        setIntField(term303, term303.getClass(), "effectiveLevelInt", -2147483648);
        setField(term306, term306.getClass(), "name", null);
        setField(term306, term306.getClass(), "level", null);
        setIntField(term306, term306.getClass(), "effectiveLevelInt", -2147483648);
        setField(term306, term306.getClass(), "parent", null);
        setField(term306, term306.getClass(), "childrenList", null);
        setField(term306, term306.getClass(), "aai", null);
        setBooleanField(term306, term306.getClass(), "additive", true);
        setField(term306, term306.getClass(), "loggerContext", null);
        setField(term303, term303.getClass(), "parent", term306);
        setField(term309, term309.getClass(), "lock", null);
        setField(term309, term309.getClass(), "array", null);
        setField(term303, term303.getClass(), "childrenList", term309);
        setField(term303, term303.getClass(), "aai", null);
        setBooleanField(term303, term303.getClass(), "additive", true);
        setField(term311, term311.getClass(), "root", null);
        setIntField(term311, term311.getClass(), "size", 33);
        setIntField(term311, term311.getClass(), "noAppenderWarning", 0);
        setField(term311, term311.getClass(), "loggerContextListenerList", null);
        setField(term311, term311.getClass(), "loggerCache", null);
        setField(term311, term311.getClass(), "loggerContextRemoteView", null);
        setField(term311, term311.getClass(), "turboFilterList", null);
        setBooleanField(term311, term311.getClass(), "packagingDataEnabled", false);
        setIntField(term311, term311.getClass(), "maxCallerDataDepth", 8);
        setIntField(term311, term311.getClass(), "resetCount", 0);
        setField(term311, term311.getClass(), "frameworkPackages", null);
        setLongField(term311, term311.getClass(), "birthTime", 1786432600198L);
        setField(term311, term311.getClass(), "name", null);
        setField(term311, term311.getClass(), "sm", null);
        setField(term311, term311.getClass(), "propertyMap", null);
        setField(term311, term311.getClass(), "objectMap", null);
        setField(term311, term311.getClass(), "configurationLock", null);
        setField(term311, term311.getClass(), "scheduledExecutorService", null);
        setField(term311, term311.getClass(), "scheduledFutures", null);
        setField(term311, term311.getClass(), "lifeCycleManager", null);
        setBooleanField(term311, term311.getClass(), "started", false);
        setField(term303, term303.getClass(), "loggerContext", term311);
        setField(term276, term276.getClass(), "parent", term303);
        setField(term319, term319.getClass(), "lock", term320);
        setElement(term321, 0, term238);
        setField(term319, term319.getClass(), "array", term321);
        setField(term276, term276.getClass(), "childrenList", term319);
        setField(term276, term276.getClass(), "aai", null);
        setBooleanField(term276, term276.getClass(), "additive", true);
        setField(term276, term276.getClass(), "loggerContext", term311);
        setField(term238, term238.getClass(), "parent", term276);
        setField(term238, term238.getClass(), "childrenList", null);
        setField(term238, term238.getClass(), "aai", null);
        setBooleanField(term238, term238.getClass(), "additive", true);
        setField(term238, term238.getClass(), "loggerContext", term311);
        setField(term206, term206.getClass(), "logger", term238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.PinController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.prac.react.service.PinService");
        argTypes[1] = Class.forName("com.prac.react.security.Encryption");
        Object[] args = new Object[2];
        args[0] = term205;
        args[1] = term206;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


