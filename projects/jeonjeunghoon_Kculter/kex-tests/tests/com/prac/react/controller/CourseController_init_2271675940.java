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

public class CourseController_init_2271675940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1661;
     Object term1662;

    public CourseController_init_2271675940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1661 = newInstance(Class.forName("com.prac.react.service.CourseService"));
        setField(term1661, term1661.getClass(), "logger", null);
        setField(term1661, term1661.getClass(), "cd", null);
        term1662 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term1663 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term1694 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1732 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1759 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1762 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1765 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1767 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term1775 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1776 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1777 = (Object[]) newArray("java.lang.Object", 1);
        setField(term1663, term1663.getClass(), "secretKey", "uuaPigETmJ");
        setField(term1662, term1662.getClass(), "sk", term1663);
        setField(term1662, term1662.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term1694, term1694.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term1694, term1694.getClass(), "level", null);
        setIntField(term1694, term1694.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1732, term1732.getClass(), "name", "com.prac.react.security");
        setField(term1732, term1732.getClass(), "level", null);
        setIntField(term1732, term1732.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1759, term1759.getClass(), "name", "");
        setField(term1759, term1759.getClass(), "level", null);
        setIntField(term1759, term1759.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1762, term1762.getClass(), "name", null);
        setField(term1762, term1762.getClass(), "level", null);
        setIntField(term1762, term1762.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1762, term1762.getClass(), "parent", null);
        setField(term1762, term1762.getClass(), "childrenList", null);
        setField(term1762, term1762.getClass(), "aai", null);
        setBooleanField(term1762, term1762.getClass(), "additive", true);
        setField(term1762, term1762.getClass(), "loggerContext", null);
        setField(term1759, term1759.getClass(), "parent", term1762);
        setField(term1765, term1765.getClass(), "lock", null);
        setField(term1765, term1765.getClass(), "array", null);
        setField(term1759, term1759.getClass(), "childrenList", term1765);
        setField(term1759, term1759.getClass(), "aai", null);
        setBooleanField(term1759, term1759.getClass(), "additive", true);
        setField(term1767, term1767.getClass(), "root", null);
        setIntField(term1767, term1767.getClass(), "size", 33);
        setIntField(term1767, term1767.getClass(), "noAppenderWarning", 0);
        setField(term1767, term1767.getClass(), "loggerContextListenerList", null);
        setField(term1767, term1767.getClass(), "loggerCache", null);
        setField(term1767, term1767.getClass(), "loggerContextRemoteView", null);
        setField(term1767, term1767.getClass(), "turboFilterList", null);
        setBooleanField(term1767, term1767.getClass(), "packagingDataEnabled", false);
        setIntField(term1767, term1767.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1767, term1767.getClass(), "resetCount", 0);
        setField(term1767, term1767.getClass(), "frameworkPackages", null);
        setLongField(term1767, term1767.getClass(), "birthTime", 1786432600198L);
        setField(term1767, term1767.getClass(), "name", null);
        setField(term1767, term1767.getClass(), "sm", null);
        setField(term1767, term1767.getClass(), "propertyMap", null);
        setField(term1767, term1767.getClass(), "objectMap", null);
        setField(term1767, term1767.getClass(), "configurationLock", null);
        setField(term1767, term1767.getClass(), "scheduledExecutorService", null);
        setField(term1767, term1767.getClass(), "scheduledFutures", null);
        setField(term1767, term1767.getClass(), "lifeCycleManager", null);
        setBooleanField(term1767, term1767.getClass(), "started", false);
        setField(term1759, term1759.getClass(), "loggerContext", term1767);
        setField(term1732, term1732.getClass(), "parent", term1759);
        setField(term1775, term1775.getClass(), "lock", term1776);
        setElement(term1777, 0, term1694);
        setField(term1775, term1775.getClass(), "array", term1777);
        setField(term1732, term1732.getClass(), "childrenList", term1775);
        setField(term1732, term1732.getClass(), "aai", null);
        setBooleanField(term1732, term1732.getClass(), "additive", true);
        setField(term1732, term1732.getClass(), "loggerContext", term1767);
        setField(term1694, term1694.getClass(), "parent", term1732);
        setField(term1694, term1694.getClass(), "childrenList", null);
        setField(term1694, term1694.getClass(), "aai", null);
        setBooleanField(term1694, term1694.getClass(), "additive", true);
        setField(term1694, term1694.getClass(), "loggerContext", term1767);
        setField(term1662, term1662.getClass(), "logger", term1694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.CourseController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.prac.react.service.CourseService");
        argTypes[1] = Class.forName("com.prac.react.security.Encryption");
        Object[] args = new Object[2];
        args[0] = term1661;
        args[1] = term1662;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


