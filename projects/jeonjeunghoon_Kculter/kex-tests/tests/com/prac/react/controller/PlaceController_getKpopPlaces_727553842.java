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

public class PlaceController_getKpopPlaces_727553842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2940;

    public PlaceController_getKpopPlaces_727553842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2940 = newInstance(Class.forName("com.prac.react.controller.PlaceController"));
        Object term2941 = newInstance(Class.forName("com.prac.react.service.PlaceService"));
        Object term2942 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term2943 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term2974 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term3012 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term3015 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term3018 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term3020 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setField(term2940, term2940.getClass(), "logger", null);
        setField(term2941, term2941.getClass(), "logger", null);
        setField(term2941, term2941.getClass(), "pd", null);
        setField(term2940, term2940.getClass(), "ps", term2941);
        setField(term2943, term2943.getClass(), "secretKey", "dEnhdmILtU");
        setField(term2942, term2942.getClass(), "sk", term2943);
        setField(term2942, term2942.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term2974, term2974.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term2974, term2974.getClass(), "level", null);
        setIntField(term2974, term2974.getClass(), "effectiveLevelInt", -2147483648);
        setField(term3012, term3012.getClass(), "name", "");
        setField(term3012, term3012.getClass(), "level", null);
        setIntField(term3012, term3012.getClass(), "effectiveLevelInt", -2147483648);
        setField(term3015, term3015.getClass(), "name", null);
        setField(term3015, term3015.getClass(), "level", null);
        setIntField(term3015, term3015.getClass(), "effectiveLevelInt", -2147483648);
        setField(term3015, term3015.getClass(), "parent", null);
        setField(term3015, term3015.getClass(), "childrenList", null);
        setField(term3015, term3015.getClass(), "aai", null);
        setBooleanField(term3015, term3015.getClass(), "additive", true);
        setField(term3015, term3015.getClass(), "loggerContext", null);
        setField(term3012, term3012.getClass(), "parent", term3015);
        setField(term3018, term3018.getClass(), "lock", null);
        setField(term3018, term3018.getClass(), "array", null);
        setField(term3012, term3012.getClass(), "childrenList", term3018);
        setField(term3012, term3012.getClass(), "aai", null);
        setBooleanField(term3012, term3012.getClass(), "additive", true);
        setField(term3020, term3020.getClass(), "root", null);
        setIntField(term3020, term3020.getClass(), "size", 33);
        setIntField(term3020, term3020.getClass(), "noAppenderWarning", 0);
        setField(term3020, term3020.getClass(), "loggerContextListenerList", null);
        setField(term3020, term3020.getClass(), "loggerCache", null);
        setField(term3020, term3020.getClass(), "loggerContextRemoteView", null);
        setField(term3020, term3020.getClass(), "turboFilterList", null);
        setBooleanField(term3020, term3020.getClass(), "packagingDataEnabled", false);
        setIntField(term3020, term3020.getClass(), "maxCallerDataDepth", 8);
        setIntField(term3020, term3020.getClass(), "resetCount", 0);
        setField(term3020, term3020.getClass(), "frameworkPackages", null);
        setLongField(term3020, term3020.getClass(), "birthTime", 1786432600198L);
        setField(term3020, term3020.getClass(), "name", null);
        setField(term3020, term3020.getClass(), "sm", null);
        setField(term3020, term3020.getClass(), "propertyMap", null);
        setField(term3020, term3020.getClass(), "objectMap", null);
        setField(term3020, term3020.getClass(), "configurationLock", null);
        setField(term3020, term3020.getClass(), "scheduledExecutorService", null);
        setField(term3020, term3020.getClass(), "scheduledFutures", null);
        setField(term3020, term3020.getClass(), "lifeCycleManager", null);
        setBooleanField(term3020, term3020.getClass(), "started", false);
        setField(term3012, term3012.getClass(), "loggerContext", term3020);
        setField(term2974, term2974.getClass(), "parent", term3012);
        setField(term2974, term2974.getClass(), "childrenList", null);
        setField(term2974, term2974.getClass(), "aai", null);
        setBooleanField(term2974, term2974.getClass(), "additive", true);
        setField(term2974, term2974.getClass(), "loggerContext", term3020);
        setField(term2942, term2942.getClass(), "logger", term2974);
        setField(term2940, term2940.getClass(), "encryption", term2942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.PlaceController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "hoicvmsovO";
        args[1] = "eqJfYWRaEL";
        callMethod(klass, "getKpopPlaces", argTypes, term2940, args);
    }

};


