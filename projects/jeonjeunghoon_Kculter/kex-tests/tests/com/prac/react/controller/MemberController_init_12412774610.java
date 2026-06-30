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

public class MemberController_init_12412774610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1459;
     Object term1460;

    public MemberController_init_12412774610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1459 = newInstance(Class.forName("com.prac.react.service.MemberService"));
        setField(term1459, term1459.getClass(), "md", null);
        setField(term1459, term1459.getClass(), "logger", null);
        term1460 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term1461 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term1492 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1530 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1557 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1560 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1563 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1565 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term1573 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1574 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1575 = (Object[]) newArray("java.lang.Object", 1);
        setField(term1461, term1461.getClass(), "secretKey", "NRdvgJlhkX");
        setField(term1460, term1460.getClass(), "sk", term1461);
        setField(term1460, term1460.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term1492, term1492.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term1492, term1492.getClass(), "level", null);
        setIntField(term1492, term1492.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1530, term1530.getClass(), "name", "com.prac.react.security");
        setField(term1530, term1530.getClass(), "level", null);
        setIntField(term1530, term1530.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1557, term1557.getClass(), "name", "");
        setField(term1557, term1557.getClass(), "level", null);
        setIntField(term1557, term1557.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1560, term1560.getClass(), "name", null);
        setField(term1560, term1560.getClass(), "level", null);
        setIntField(term1560, term1560.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1560, term1560.getClass(), "parent", null);
        setField(term1560, term1560.getClass(), "childrenList", null);
        setField(term1560, term1560.getClass(), "aai", null);
        setBooleanField(term1560, term1560.getClass(), "additive", true);
        setField(term1560, term1560.getClass(), "loggerContext", null);
        setField(term1557, term1557.getClass(), "parent", term1560);
        setField(term1563, term1563.getClass(), "lock", null);
        setField(term1563, term1563.getClass(), "array", null);
        setField(term1557, term1557.getClass(), "childrenList", term1563);
        setField(term1557, term1557.getClass(), "aai", null);
        setBooleanField(term1557, term1557.getClass(), "additive", true);
        setField(term1565, term1565.getClass(), "root", null);
        setIntField(term1565, term1565.getClass(), "size", 33);
        setIntField(term1565, term1565.getClass(), "noAppenderWarning", 0);
        setField(term1565, term1565.getClass(), "loggerContextListenerList", null);
        setField(term1565, term1565.getClass(), "loggerCache", null);
        setField(term1565, term1565.getClass(), "loggerContextRemoteView", null);
        setField(term1565, term1565.getClass(), "turboFilterList", null);
        setBooleanField(term1565, term1565.getClass(), "packagingDataEnabled", false);
        setIntField(term1565, term1565.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1565, term1565.getClass(), "resetCount", 0);
        setField(term1565, term1565.getClass(), "frameworkPackages", null);
        setLongField(term1565, term1565.getClass(), "birthTime", 1782677609604L);
        setField(term1565, term1565.getClass(), "name", null);
        setField(term1565, term1565.getClass(), "sm", null);
        setField(term1565, term1565.getClass(), "propertyMap", null);
        setField(term1565, term1565.getClass(), "objectMap", null);
        setField(term1565, term1565.getClass(), "configurationLock", null);
        setField(term1565, term1565.getClass(), "scheduledExecutorService", null);
        setField(term1565, term1565.getClass(), "scheduledFutures", null);
        setField(term1565, term1565.getClass(), "lifeCycleManager", null);
        setBooleanField(term1565, term1565.getClass(), "started", false);
        setField(term1557, term1557.getClass(), "loggerContext", term1565);
        setField(term1530, term1530.getClass(), "parent", term1557);
        setField(term1573, term1573.getClass(), "lock", term1574);
        setElement(term1575, 0, term1492);
        setField(term1573, term1573.getClass(), "array", term1575);
        setField(term1530, term1530.getClass(), "childrenList", term1573);
        setField(term1530, term1530.getClass(), "aai", null);
        setBooleanField(term1530, term1530.getClass(), "additive", true);
        setField(term1530, term1530.getClass(), "loggerContext", term1565);
        setField(term1492, term1492.getClass(), "parent", term1530);
        setField(term1492, term1492.getClass(), "childrenList", null);
        setField(term1492, term1492.getClass(), "aai", null);
        setBooleanField(term1492, term1492.getClass(), "additive", true);
        setField(term1492, term1492.getClass(), "loggerContext", term1565);
        setField(term1460, term1460.getClass(), "logger", term1492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.MemberController");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.prac.react.service.MemberService");
        argTypes[1] = Class.forName("com.prac.react.security.Encryption");
        argTypes[2] = Class.forName("com.prac.react.service.S3FileUploadService");
        Object[] args = new Object[3];
        args[0] = term1459;
        args[1] = term1460;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


