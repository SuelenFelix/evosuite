package com.prac.react.security;

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
import static com.prac.react.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Encryption_aesDecrypt_5623899264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470;

    public Encryption_aesDecrypt_5623899264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term471 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term502 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term540 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term567 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term570 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term573 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term575 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term583 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term584 = newInstance(Class.forName("java.lang.Object"));
        Object[] term585 = (Object[]) newArray("java.lang.Object", 1);
        setField(term471, term471.getClass(), "secretKey", "EGtDIRbSSb");
        setField(term470, term470.getClass(), "sk", term471);
        setField(term470, term470.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term502, term502.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term502, term502.getClass(), "level", null);
        setIntField(term502, term502.getClass(), "effectiveLevelInt", -2147483648);
        setField(term540, term540.getClass(), "name", "com.prac.react.security");
        setField(term540, term540.getClass(), "level", null);
        setIntField(term540, term540.getClass(), "effectiveLevelInt", -2147483648);
        setField(term567, term567.getClass(), "name", "");
        setField(term567, term567.getClass(), "level", null);
        setIntField(term567, term567.getClass(), "effectiveLevelInt", -2147483648);
        setField(term570, term570.getClass(), "name", null);
        setField(term570, term570.getClass(), "level", null);
        setIntField(term570, term570.getClass(), "effectiveLevelInt", -2147483648);
        setField(term570, term570.getClass(), "parent", null);
        setField(term570, term570.getClass(), "childrenList", null);
        setField(term570, term570.getClass(), "aai", null);
        setBooleanField(term570, term570.getClass(), "additive", true);
        setField(term570, term570.getClass(), "loggerContext", null);
        setField(term567, term567.getClass(), "parent", term570);
        setField(term573, term573.getClass(), "lock", null);
        setField(term573, term573.getClass(), "array", null);
        setField(term567, term567.getClass(), "childrenList", term573);
        setField(term567, term567.getClass(), "aai", null);
        setBooleanField(term567, term567.getClass(), "additive", true);
        setField(term575, term575.getClass(), "root", null);
        setIntField(term575, term575.getClass(), "size", 31);
        setIntField(term575, term575.getClass(), "noAppenderWarning", 0);
        setField(term575, term575.getClass(), "loggerContextListenerList", null);
        setField(term575, term575.getClass(), "loggerCache", null);
        setField(term575, term575.getClass(), "loggerContextRemoteView", null);
        setField(term575, term575.getClass(), "turboFilterList", null);
        setBooleanField(term575, term575.getClass(), "packagingDataEnabled", false);
        setIntField(term575, term575.getClass(), "maxCallerDataDepth", 8);
        setIntField(term575, term575.getClass(), "resetCount", 0);
        setField(term575, term575.getClass(), "frameworkPackages", null);
        setLongField(term575, term575.getClass(), "birthTime", 1775069550157L);
        setField(term575, term575.getClass(), "name", null);
        setField(term575, term575.getClass(), "sm", null);
        setField(term575, term575.getClass(), "propertyMap", null);
        setField(term575, term575.getClass(), "objectMap", null);
        setField(term575, term575.getClass(), "configurationLock", null);
        setField(term575, term575.getClass(), "scheduledExecutorService", null);
        setField(term575, term575.getClass(), "scheduledFutures", null);
        setField(term575, term575.getClass(), "lifeCycleManager", null);
        setBooleanField(term575, term575.getClass(), "started", false);
        setField(term567, term567.getClass(), "loggerContext", term575);
        setField(term540, term540.getClass(), "parent", term567);
        setField(term583, term583.getClass(), "lock", term584);
        setElement(term585, 0, term502);
        setField(term583, term583.getClass(), "array", term585);
        setField(term540, term540.getClass(), "childrenList", term583);
        setField(term540, term540.getClass(), "aai", null);
        setBooleanField(term540, term540.getClass(), "additive", true);
        setField(term540, term540.getClass(), "loggerContext", term575);
        setField(term502, term502.getClass(), "parent", term540);
        setField(term502, term502.getClass(), "childrenList", null);
        setField(term502, term502.getClass(), "aai", null);
        setBooleanField(term502, term502.getClass(), "additive", true);
        setField(term502, term502.getClass(), "loggerContext", term575);
        setField(term470, term470.getClass(), "logger", term502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.security.Encryption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "aesDecrypt", argTypes, term470, args);
    }

};


