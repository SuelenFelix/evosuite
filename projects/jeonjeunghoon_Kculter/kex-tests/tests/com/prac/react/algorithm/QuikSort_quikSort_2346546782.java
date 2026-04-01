package com.prac.react.algorithm;

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
import static com.prac.react.algorithm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Integer;

public class QuikSort_quikSort_2346546782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;
     Object term368;
     Object term371;
     Object term373;

    public QuikSort_quikSort_2346546782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281 = newInstance(Class.forName("com.prac.react.algorithm.QuikSort"));
        Object term282 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term319 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term347 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term350 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term353 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term355 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term363 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term364 = newInstance(Class.forName("java.lang.Object"));
        Object[] term365 = (Object[]) newArray("java.lang.Object", 1);
        setField(term282, term282.getClass(), "name", "com.prac.react.algorithm.QuikSort");
        setField(term282, term282.getClass(), "level", null);
        setIntField(term282, term282.getClass(), "effectiveLevelInt", -2147483648);
        setField(term319, term319.getClass(), "name", "com.prac.react.algorithm");
        setField(term319, term319.getClass(), "level", null);
        setIntField(term319, term319.getClass(), "effectiveLevelInt", -2147483648);
        setField(term347, term347.getClass(), "name", "");
        setField(term347, term347.getClass(), "level", null);
        setIntField(term347, term347.getClass(), "effectiveLevelInt", -2147483648);
        setField(term350, term350.getClass(), "name", null);
        setField(term350, term350.getClass(), "level", null);
        setIntField(term350, term350.getClass(), "effectiveLevelInt", -2147483648);
        setField(term350, term350.getClass(), "parent", null);
        setField(term350, term350.getClass(), "childrenList", null);
        setField(term350, term350.getClass(), "aai", null);
        setBooleanField(term350, term350.getClass(), "additive", true);
        setField(term350, term350.getClass(), "loggerContext", null);
        setField(term347, term347.getClass(), "parent", term350);
        setField(term353, term353.getClass(), "lock", null);
        setField(term353, term353.getClass(), "array", null);
        setField(term347, term347.getClass(), "childrenList", term353);
        setField(term347, term347.getClass(), "aai", null);
        setBooleanField(term347, term347.getClass(), "additive", true);
        setField(term355, term355.getClass(), "root", null);
        setIntField(term355, term355.getClass(), "size", 31);
        setIntField(term355, term355.getClass(), "noAppenderWarning", 0);
        setField(term355, term355.getClass(), "loggerContextListenerList", null);
        setField(term355, term355.getClass(), "loggerCache", null);
        setField(term355, term355.getClass(), "loggerContextRemoteView", null);
        setField(term355, term355.getClass(), "turboFilterList", null);
        setBooleanField(term355, term355.getClass(), "packagingDataEnabled", false);
        setIntField(term355, term355.getClass(), "maxCallerDataDepth", 8);
        setIntField(term355, term355.getClass(), "resetCount", 0);
        setField(term355, term355.getClass(), "frameworkPackages", null);
        setLongField(term355, term355.getClass(), "birthTime", 1775069113155L);
        setField(term355, term355.getClass(), "name", null);
        setField(term355, term355.getClass(), "sm", null);
        setField(term355, term355.getClass(), "propertyMap", null);
        setField(term355, term355.getClass(), "objectMap", null);
        setField(term355, term355.getClass(), "configurationLock", null);
        setField(term355, term355.getClass(), "scheduledExecutorService", null);
        setField(term355, term355.getClass(), "scheduledFutures", null);
        setField(term355, term355.getClass(), "lifeCycleManager", null);
        setBooleanField(term355, term355.getClass(), "started", false);
        setField(term347, term347.getClass(), "loggerContext", term355);
        setField(term319, term319.getClass(), "parent", term347);
        setField(term363, term363.getClass(), "lock", term364);
        setElement(term365, 0, term282);
        setField(term363, term363.getClass(), "array", term365);
        setField(term319, term319.getClass(), "childrenList", term363);
        setField(term319, term319.getClass(), "aai", null);
        setBooleanField(term319, term319.getClass(), "additive", true);
        setField(term319, term319.getClass(), "loggerContext", term355);
        setField(term282, term282.getClass(), "parent", term319);
        setField(term282, term282.getClass(), "childrenList", null);
        setField(term282, term282.getClass(), "aai", null);
        setBooleanField(term282, term282.getClass(), "additive", true);
        setField(term282, term282.getClass(), "loggerContext", term355);
        setField(term281, term281.getClass(), "logger", term282);
        term368 = new LinkedList();
        term371 = new Integer(1225272962);
        term373 = new Integer(1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.algorithm.QuikSort");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term368;
        args[1] = term371;
        args[2] = term373;
        callMethod(klass, "quikSort", argTypes, term281, args);
    }

};


