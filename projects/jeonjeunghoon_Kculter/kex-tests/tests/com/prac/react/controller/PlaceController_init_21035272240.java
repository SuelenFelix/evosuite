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

public class PlaceController_init_21035272240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2589;
     Object term2590;

    public PlaceController_init_21035272240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2589 = newInstance(Class.forName("com.prac.react.service.PlaceService"));
        setField(term2589, term2589.getClass(), "logger", null);
        setField(term2589, term2589.getClass(), "pd", null);
        term2590 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term2591 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term2622 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2660 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2687 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2690 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2693 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2695 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term2703 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2704 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2705 = (Object[]) newArray("java.lang.Object", 1);
        setField(term2591, term2591.getClass(), "secretKey", "nHXjMycHlU");
        setField(term2590, term2590.getClass(), "sk", term2591);
        setField(term2590, term2590.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term2622, term2622.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term2622, term2622.getClass(), "level", null);
        setIntField(term2622, term2622.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2660, term2660.getClass(), "name", "com.prac.react.security");
        setField(term2660, term2660.getClass(), "level", null);
        setIntField(term2660, term2660.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2687, term2687.getClass(), "name", "");
        setField(term2687, term2687.getClass(), "level", null);
        setIntField(term2687, term2687.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2690, term2690.getClass(), "name", null);
        setField(term2690, term2690.getClass(), "level", null);
        setIntField(term2690, term2690.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2690, term2690.getClass(), "parent", null);
        setField(term2690, term2690.getClass(), "childrenList", null);
        setField(term2690, term2690.getClass(), "aai", null);
        setBooleanField(term2690, term2690.getClass(), "additive", true);
        setField(term2690, term2690.getClass(), "loggerContext", null);
        setField(term2687, term2687.getClass(), "parent", term2690);
        setField(term2693, term2693.getClass(), "lock", null);
        setField(term2693, term2693.getClass(), "array", null);
        setField(term2687, term2687.getClass(), "childrenList", term2693);
        setField(term2687, term2687.getClass(), "aai", null);
        setBooleanField(term2687, term2687.getClass(), "additive", true);
        setField(term2695, term2695.getClass(), "root", null);
        setIntField(term2695, term2695.getClass(), "size", 33);
        setIntField(term2695, term2695.getClass(), "noAppenderWarning", 0);
        setField(term2695, term2695.getClass(), "loggerContextListenerList", null);
        setField(term2695, term2695.getClass(), "loggerCache", null);
        setField(term2695, term2695.getClass(), "loggerContextRemoteView", null);
        setField(term2695, term2695.getClass(), "turboFilterList", null);
        setBooleanField(term2695, term2695.getClass(), "packagingDataEnabled", false);
        setIntField(term2695, term2695.getClass(), "maxCallerDataDepth", 8);
        setIntField(term2695, term2695.getClass(), "resetCount", 0);
        setField(term2695, term2695.getClass(), "frameworkPackages", null);
        setLongField(term2695, term2695.getClass(), "birthTime", 1782677609604L);
        setField(term2695, term2695.getClass(), "name", null);
        setField(term2695, term2695.getClass(), "sm", null);
        setField(term2695, term2695.getClass(), "propertyMap", null);
        setField(term2695, term2695.getClass(), "objectMap", null);
        setField(term2695, term2695.getClass(), "configurationLock", null);
        setField(term2695, term2695.getClass(), "scheduledExecutorService", null);
        setField(term2695, term2695.getClass(), "scheduledFutures", null);
        setField(term2695, term2695.getClass(), "lifeCycleManager", null);
        setBooleanField(term2695, term2695.getClass(), "started", false);
        setField(term2687, term2687.getClass(), "loggerContext", term2695);
        setField(term2660, term2660.getClass(), "parent", term2687);
        setField(term2703, term2703.getClass(), "lock", term2704);
        setElement(term2705, 0, term2622);
        setField(term2703, term2703.getClass(), "array", term2705);
        setField(term2660, term2660.getClass(), "childrenList", term2703);
        setField(term2660, term2660.getClass(), "aai", null);
        setBooleanField(term2660, term2660.getClass(), "additive", true);
        setField(term2660, term2660.getClass(), "loggerContext", term2695);
        setField(term2622, term2622.getClass(), "parent", term2660);
        setField(term2622, term2622.getClass(), "childrenList", null);
        setField(term2622, term2622.getClass(), "aai", null);
        setBooleanField(term2622, term2622.getClass(), "additive", true);
        setField(term2622, term2622.getClass(), "loggerContext", term2695);
        setField(term2590, term2590.getClass(), "logger", term2622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.PlaceController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.prac.react.service.PlaceService");
        argTypes[1] = Class.forName("com.prac.react.security.Encryption");
        Object[] args = new Object[2];
        args[0] = term2589;
        args[1] = term2590;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


