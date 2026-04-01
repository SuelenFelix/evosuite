package com.prac.react.service;

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
import static com.prac.react.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SigunguService_getSigungu_3487930891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term872;

    public SigunguService_getSigungu_3487930891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term872 = newInstance(Class.forName("com.prac.react.service.SigunguService"));
        Object term885 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term926 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term952 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term955 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term958 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term960 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term968 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term969 = newInstance(Class.forName("java.lang.Object"));
        Object[] term970 = (Object[]) newArray("java.lang.Object", 1);
        setField(term872, term872.getClass(), "serviceKey", "IDCWpPLRkE");
        setField(term885, term885.getClass(), "name", "com.prac.react.service.SigunguService");
        setField(term885, term885.getClass(), "level", null);
        setIntField(term885, term885.getClass(), "effectiveLevelInt", -2147483648);
        setField(term926, term926.getClass(), "name", "com.prac.react.service");
        setField(term926, term926.getClass(), "level", null);
        setIntField(term926, term926.getClass(), "effectiveLevelInt", -2147483648);
        setField(term952, term952.getClass(), "name", "");
        setField(term952, term952.getClass(), "level", null);
        setIntField(term952, term952.getClass(), "effectiveLevelInt", -2147483648);
        setField(term955, term955.getClass(), "name", null);
        setField(term955, term955.getClass(), "level", null);
        setIntField(term955, term955.getClass(), "effectiveLevelInt", -2147483648);
        setField(term955, term955.getClass(), "parent", null);
        setField(term955, term955.getClass(), "childrenList", null);
        setField(term955, term955.getClass(), "aai", null);
        setBooleanField(term955, term955.getClass(), "additive", true);
        setField(term955, term955.getClass(), "loggerContext", null);
        setField(term952, term952.getClass(), "parent", term955);
        setField(term958, term958.getClass(), "lock", null);
        setField(term958, term958.getClass(), "array", null);
        setField(term952, term952.getClass(), "childrenList", term958);
        setField(term952, term952.getClass(), "aai", null);
        setBooleanField(term952, term952.getClass(), "additive", true);
        setField(term960, term960.getClass(), "root", null);
        setIntField(term960, term960.getClass(), "size", 33);
        setIntField(term960, term960.getClass(), "noAppenderWarning", 0);
        setField(term960, term960.getClass(), "loggerContextListenerList", null);
        setField(term960, term960.getClass(), "loggerCache", null);
        setField(term960, term960.getClass(), "loggerContextRemoteView", null);
        setField(term960, term960.getClass(), "turboFilterList", null);
        setBooleanField(term960, term960.getClass(), "packagingDataEnabled", false);
        setIntField(term960, term960.getClass(), "maxCallerDataDepth", 8);
        setIntField(term960, term960.getClass(), "resetCount", 0);
        setField(term960, term960.getClass(), "frameworkPackages", null);
        setLongField(term960, term960.getClass(), "birthTime", 1775069654127L);
        setField(term960, term960.getClass(), "name", null);
        setField(term960, term960.getClass(), "sm", null);
        setField(term960, term960.getClass(), "propertyMap", null);
        setField(term960, term960.getClass(), "objectMap", null);
        setField(term960, term960.getClass(), "configurationLock", null);
        setField(term960, term960.getClass(), "scheduledExecutorService", null);
        setField(term960, term960.getClass(), "scheduledFutures", null);
        setField(term960, term960.getClass(), "lifeCycleManager", null);
        setBooleanField(term960, term960.getClass(), "started", false);
        setField(term952, term952.getClass(), "loggerContext", term960);
        setField(term926, term926.getClass(), "parent", term952);
        setField(term968, term968.getClass(), "lock", term969);
        setElement(term970, 0, term885);
        setField(term968, term968.getClass(), "array", term970);
        setField(term926, term926.getClass(), "childrenList", term968);
        setField(term926, term926.getClass(), "aai", null);
        setBooleanField(term926, term926.getClass(), "additive", true);
        setField(term926, term926.getClass(), "loggerContext", term960);
        setField(term885, term885.getClass(), "parent", term926);
        setField(term885, term885.getClass(), "childrenList", null);
        setField(term885, term885.getClass(), "aai", null);
        setBooleanField(term885, term885.getClass(), "additive", true);
        setField(term885, term885.getClass(), "loggerContext", term960);
        setField(term872, term872.getClass(), "logger", term885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.SigunguService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nyiiPDVjAc";
        callMethod(klass, "getSigungu", argTypes, term872, args);
    }

};


