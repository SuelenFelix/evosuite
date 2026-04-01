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

public class Encryption_shaEncryption_2361928532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;

    public Encryption_shaEncryption_2361928532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term25 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term56 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term94 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term121 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term124 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term127 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term129 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term137 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term138 = newInstance(Class.forName("java.lang.Object"));
        Object[] term139 = (Object[]) newArray("java.lang.Object", 1);
        setField(term25, term25.getClass(), "secretKey", "sjlJAEtRrb");
        setField(term24, term24.getClass(), "sk", term25);
        setField(term24, term24.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term56, term56.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term56, term56.getClass(), "level", null);
        setIntField(term56, term56.getClass(), "effectiveLevelInt", -2147483648);
        setField(term94, term94.getClass(), "name", "com.prac.react.security");
        setField(term94, term94.getClass(), "level", null);
        setIntField(term94, term94.getClass(), "effectiveLevelInt", -2147483648);
        setField(term121, term121.getClass(), "name", "");
        setField(term121, term121.getClass(), "level", null);
        setIntField(term121, term121.getClass(), "effectiveLevelInt", -2147483648);
        setField(term124, term124.getClass(), "name", null);
        setField(term124, term124.getClass(), "level", null);
        setIntField(term124, term124.getClass(), "effectiveLevelInt", -2147483648);
        setField(term124, term124.getClass(), "parent", null);
        setField(term124, term124.getClass(), "childrenList", null);
        setField(term124, term124.getClass(), "aai", null);
        setBooleanField(term124, term124.getClass(), "additive", true);
        setField(term124, term124.getClass(), "loggerContext", null);
        setField(term121, term121.getClass(), "parent", term124);
        setField(term127, term127.getClass(), "lock", null);
        setField(term127, term127.getClass(), "array", null);
        setField(term121, term121.getClass(), "childrenList", term127);
        setField(term121, term121.getClass(), "aai", null);
        setBooleanField(term121, term121.getClass(), "additive", true);
        setField(term129, term129.getClass(), "root", null);
        setIntField(term129, term129.getClass(), "size", 31);
        setIntField(term129, term129.getClass(), "noAppenderWarning", 0);
        setField(term129, term129.getClass(), "loggerContextListenerList", null);
        setField(term129, term129.getClass(), "loggerCache", null);
        setField(term129, term129.getClass(), "loggerContextRemoteView", null);
        setField(term129, term129.getClass(), "turboFilterList", null);
        setBooleanField(term129, term129.getClass(), "packagingDataEnabled", false);
        setIntField(term129, term129.getClass(), "maxCallerDataDepth", 8);
        setIntField(term129, term129.getClass(), "resetCount", 0);
        setField(term129, term129.getClass(), "frameworkPackages", null);
        setLongField(term129, term129.getClass(), "birthTime", 1775069550157L);
        setField(term129, term129.getClass(), "name", null);
        setField(term129, term129.getClass(), "sm", null);
        setField(term129, term129.getClass(), "propertyMap", null);
        setField(term129, term129.getClass(), "objectMap", null);
        setField(term129, term129.getClass(), "configurationLock", null);
        setField(term129, term129.getClass(), "scheduledExecutorService", null);
        setField(term129, term129.getClass(), "scheduledFutures", null);
        setField(term129, term129.getClass(), "lifeCycleManager", null);
        setBooleanField(term129, term129.getClass(), "started", false);
        setField(term121, term121.getClass(), "loggerContext", term129);
        setField(term94, term94.getClass(), "parent", term121);
        setField(term137, term137.getClass(), "lock", term138);
        setElement(term139, 0, term56);
        setField(term137, term137.getClass(), "array", term139);
        setField(term94, term94.getClass(), "childrenList", term137);
        setField(term94, term94.getClass(), "aai", null);
        setBooleanField(term94, term94.getClass(), "additive", true);
        setField(term94, term94.getClass(), "loggerContext", term129);
        setField(term56, term56.getClass(), "parent", term94);
        setField(term56, term56.getClass(), "childrenList", null);
        setField(term56, term56.getClass(), "aai", null);
        setBooleanField(term56, term56.getClass(), "additive", true);
        setField(term56, term56.getClass(), "loggerContext", term129);
        setField(term24, term24.getClass(), "logger", term56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.security.Encryption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "shaEncryption", argTypes, term24, args);
    }

};


