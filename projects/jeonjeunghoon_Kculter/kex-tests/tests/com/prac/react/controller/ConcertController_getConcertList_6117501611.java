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

public class ConcertController_getConcertList_6117501611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term957;

    public ConcertController_getConcertList_6117501611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term957 = newInstance(Class.forName("com.prac.react.controller.ConcertController"));
        Object term958 = newInstance(Class.forName("com.prac.react.service.ConcertService"));
        Object term959 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term960 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term991 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1029 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1032 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1035 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1037 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setField(term957, term957.getClass(), "logger", null);
        setField(term958, term958.getClass(), "logger", null);
        setField(term958, term958.getClass(), "cd", null);
        setField(term957, term957.getClass(), "cs", term958);
        setField(term960, term960.getClass(), "secretKey", "MjGYSRKTNF");
        setField(term959, term959.getClass(), "sk", term960);
        setField(term959, term959.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term991, term991.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term991, term991.getClass(), "level", null);
        setIntField(term991, term991.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1029, term1029.getClass(), "name", "");
        setField(term1029, term1029.getClass(), "level", null);
        setIntField(term1029, term1029.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1032, term1032.getClass(), "name", null);
        setField(term1032, term1032.getClass(), "level", null);
        setIntField(term1032, term1032.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1032, term1032.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "childrenList", null);
        setField(term1032, term1032.getClass(), "aai", null);
        setBooleanField(term1032, term1032.getClass(), "additive", true);
        setField(term1032, term1032.getClass(), "loggerContext", null);
        setField(term1029, term1029.getClass(), "parent", term1032);
        setField(term1035, term1035.getClass(), "lock", null);
        setField(term1035, term1035.getClass(), "array", null);
        setField(term1029, term1029.getClass(), "childrenList", term1035);
        setField(term1029, term1029.getClass(), "aai", null);
        setBooleanField(term1029, term1029.getClass(), "additive", true);
        setField(term1037, term1037.getClass(), "root", null);
        setIntField(term1037, term1037.getClass(), "size", 33);
        setIntField(term1037, term1037.getClass(), "noAppenderWarning", 0);
        setField(term1037, term1037.getClass(), "loggerContextListenerList", null);
        setField(term1037, term1037.getClass(), "loggerCache", null);
        setField(term1037, term1037.getClass(), "loggerContextRemoteView", null);
        setField(term1037, term1037.getClass(), "turboFilterList", null);
        setBooleanField(term1037, term1037.getClass(), "packagingDataEnabled", false);
        setIntField(term1037, term1037.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1037, term1037.getClass(), "resetCount", 0);
        setField(term1037, term1037.getClass(), "frameworkPackages", null);
        setLongField(term1037, term1037.getClass(), "birthTime", 1782677609604L);
        setField(term1037, term1037.getClass(), "name", null);
        setField(term1037, term1037.getClass(), "sm", null);
        setField(term1037, term1037.getClass(), "propertyMap", null);
        setField(term1037, term1037.getClass(), "objectMap", null);
        setField(term1037, term1037.getClass(), "configurationLock", null);
        setField(term1037, term1037.getClass(), "scheduledExecutorService", null);
        setField(term1037, term1037.getClass(), "scheduledFutures", null);
        setField(term1037, term1037.getClass(), "lifeCycleManager", null);
        setBooleanField(term1037, term1037.getClass(), "started", false);
        setField(term1029, term1029.getClass(), "loggerContext", term1037);
        setField(term991, term991.getClass(), "parent", term1029);
        setField(term991, term991.getClass(), "childrenList", null);
        setField(term991, term991.getClass(), "aai", null);
        setBooleanField(term991, term991.getClass(), "additive", true);
        setField(term991, term991.getClass(), "loggerContext", term1037);
        setField(term959, term959.getClass(), "logger", term991);
        setField(term957, term957.getClass(), "encryption", term959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.ConcertController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConcertList", argTypes, term957, args);
    }

};


