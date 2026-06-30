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

public class ManagerController_init_20235181460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term3;
     Object term4;

    public ManagerController_init_20235181460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.prac.react.service.ManagerService"));
        setField(term1, term1.getClass(), "md", null);
        setField(term1, term1.getClass(), "logger", null);
        term2 = newInstance(Class.forName("com.prac.react.service.CelebService"));
        setField(term2, term2.getClass(), "cd", null);
        term3 = newInstance(Class.forName("com.prac.react.service.ConcertService"));
        setField(term3, term3.getClass(), "logger", null);
        setField(term3, term3.getClass(), "cd", null);
        term4 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term5 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term36 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term74 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term101 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term104 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term107 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term109 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term117 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term118 = newInstance(Class.forName("java.lang.Object"));
        Object[] term119 = (Object[]) newArray("java.lang.Object", 1);
        setField(term5, term5.getClass(), "secretKey", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "sk", term5);
        setField(term4, term4.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term36, term36.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term36, term36.getClass(), "level", null);
        setIntField(term36, term36.getClass(), "effectiveLevelInt", -2147483648);
        setField(term74, term74.getClass(), "name", "com.prac.react.security");
        setField(term74, term74.getClass(), "level", null);
        setIntField(term74, term74.getClass(), "effectiveLevelInt", -2147483648);
        setField(term101, term101.getClass(), "name", "");
        setField(term101, term101.getClass(), "level", null);
        setIntField(term101, term101.getClass(), "effectiveLevelInt", -2147483648);
        setField(term104, term104.getClass(), "name", null);
        setField(term104, term104.getClass(), "level", null);
        setIntField(term104, term104.getClass(), "effectiveLevelInt", -2147483648);
        setField(term104, term104.getClass(), "parent", null);
        setField(term104, term104.getClass(), "childrenList", null);
        setField(term104, term104.getClass(), "aai", null);
        setBooleanField(term104, term104.getClass(), "additive", true);
        setField(term104, term104.getClass(), "loggerContext", null);
        setField(term101, term101.getClass(), "parent", term104);
        setField(term107, term107.getClass(), "lock", null);
        setField(term107, term107.getClass(), "array", null);
        setField(term101, term101.getClass(), "childrenList", term107);
        setField(term101, term101.getClass(), "aai", null);
        setBooleanField(term101, term101.getClass(), "additive", true);
        setField(term109, term109.getClass(), "root", null);
        setIntField(term109, term109.getClass(), "size", 30);
        setIntField(term109, term109.getClass(), "noAppenderWarning", 0);
        setField(term109, term109.getClass(), "loggerContextListenerList", null);
        setField(term109, term109.getClass(), "loggerCache", null);
        setField(term109, term109.getClass(), "loggerContextRemoteView", null);
        setField(term109, term109.getClass(), "turboFilterList", null);
        setBooleanField(term109, term109.getClass(), "packagingDataEnabled", false);
        setIntField(term109, term109.getClass(), "maxCallerDataDepth", 8);
        setIntField(term109, term109.getClass(), "resetCount", 0);
        setField(term109, term109.getClass(), "frameworkPackages", null);
        setLongField(term109, term109.getClass(), "birthTime", 1782677609604L);
        setField(term109, term109.getClass(), "name", null);
        setField(term109, term109.getClass(), "sm", null);
        setField(term109, term109.getClass(), "propertyMap", null);
        setField(term109, term109.getClass(), "objectMap", null);
        setField(term109, term109.getClass(), "configurationLock", null);
        setField(term109, term109.getClass(), "scheduledExecutorService", null);
        setField(term109, term109.getClass(), "scheduledFutures", null);
        setField(term109, term109.getClass(), "lifeCycleManager", null);
        setBooleanField(term109, term109.getClass(), "started", false);
        setField(term101, term101.getClass(), "loggerContext", term109);
        setField(term74, term74.getClass(), "parent", term101);
        setField(term117, term117.getClass(), "lock", term118);
        setElement(term119, 0, term36);
        setField(term117, term117.getClass(), "array", term119);
        setField(term74, term74.getClass(), "childrenList", term117);
        setField(term74, term74.getClass(), "aai", null);
        setBooleanField(term74, term74.getClass(), "additive", true);
        setField(term74, term74.getClass(), "loggerContext", term109);
        setField(term36, term36.getClass(), "parent", term74);
        setField(term36, term36.getClass(), "childrenList", null);
        setField(term36, term36.getClass(), "aai", null);
        setBooleanField(term36, term36.getClass(), "additive", true);
        setField(term36, term36.getClass(), "loggerContext", term109);
        setField(term4, term4.getClass(), "logger", term36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.ManagerController");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.prac.react.service.S3FileUploadService");
        argTypes[1] = Class.forName("com.prac.react.service.ManagerService");
        argTypes[2] = Class.forName("com.prac.react.service.CelebService");
        argTypes[3] = Class.forName("com.prac.react.service.ConcertService");
        argTypes[4] = Class.forName("com.prac.react.security.Encryption");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term1;
        args[2] = term2;
        args[3] = term3;
        args[4] = term4;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


