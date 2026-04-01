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

public class SearchStayService_getAllStay_5941078921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065;

    public SearchStayService_getAllStay_5941078921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1065 = newInstance(Class.forName("com.prac.react.service.SearchStayService"));
        Object term1066 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1107 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1133 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1136 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1139 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1141 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term1149 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1150 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1151 = (Object[]) newArray("java.lang.Object", 1);
        setField(term1066, term1066.getClass(), "name", "com.prac.react.service.SigunguService");
        setField(term1066, term1066.getClass(), "level", null);
        setIntField(term1066, term1066.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1107, term1107.getClass(), "name", "com.prac.react.service");
        setField(term1107, term1107.getClass(), "level", null);
        setIntField(term1107, term1107.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1133, term1133.getClass(), "name", "");
        setField(term1133, term1133.getClass(), "level", null);
        setIntField(term1133, term1133.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1136, term1136.getClass(), "name", null);
        setField(term1136, term1136.getClass(), "level", null);
        setIntField(term1136, term1136.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1136, term1136.getClass(), "parent", null);
        setField(term1136, term1136.getClass(), "childrenList", null);
        setField(term1136, term1136.getClass(), "aai", null);
        setBooleanField(term1136, term1136.getClass(), "additive", true);
        setField(term1136, term1136.getClass(), "loggerContext", null);
        setField(term1133, term1133.getClass(), "parent", term1136);
        setField(term1139, term1139.getClass(), "lock", null);
        setField(term1139, term1139.getClass(), "array", null);
        setField(term1133, term1133.getClass(), "childrenList", term1139);
        setField(term1133, term1133.getClass(), "aai", null);
        setBooleanField(term1133, term1133.getClass(), "additive", true);
        setField(term1141, term1141.getClass(), "root", null);
        setIntField(term1141, term1141.getClass(), "size", 33);
        setIntField(term1141, term1141.getClass(), "noAppenderWarning", 0);
        setField(term1141, term1141.getClass(), "loggerContextListenerList", null);
        setField(term1141, term1141.getClass(), "loggerCache", null);
        setField(term1141, term1141.getClass(), "loggerContextRemoteView", null);
        setField(term1141, term1141.getClass(), "turboFilterList", null);
        setBooleanField(term1141, term1141.getClass(), "packagingDataEnabled", false);
        setIntField(term1141, term1141.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1141, term1141.getClass(), "resetCount", 0);
        setField(term1141, term1141.getClass(), "frameworkPackages", null);
        setLongField(term1141, term1141.getClass(), "birthTime", 1775069654127L);
        setField(term1141, term1141.getClass(), "name", null);
        setField(term1141, term1141.getClass(), "sm", null);
        setField(term1141, term1141.getClass(), "propertyMap", null);
        setField(term1141, term1141.getClass(), "objectMap", null);
        setField(term1141, term1141.getClass(), "configurationLock", null);
        setField(term1141, term1141.getClass(), "scheduledExecutorService", null);
        setField(term1141, term1141.getClass(), "scheduledFutures", null);
        setField(term1141, term1141.getClass(), "lifeCycleManager", null);
        setBooleanField(term1141, term1141.getClass(), "started", false);
        setField(term1133, term1133.getClass(), "loggerContext", term1141);
        setField(term1107, term1107.getClass(), "parent", term1133);
        setField(term1149, term1149.getClass(), "lock", term1150);
        setElement(term1151, 0, term1066);
        setField(term1149, term1149.getClass(), "array", term1151);
        setField(term1107, term1107.getClass(), "childrenList", term1149);
        setField(term1107, term1107.getClass(), "aai", null);
        setBooleanField(term1107, term1107.getClass(), "additive", true);
        setField(term1107, term1107.getClass(), "loggerContext", term1141);
        setField(term1066, term1066.getClass(), "parent", term1107);
        setField(term1066, term1066.getClass(), "childrenList", null);
        setField(term1066, term1066.getClass(), "aai", null);
        setBooleanField(term1066, term1066.getClass(), "additive", true);
        setField(term1066, term1066.getClass(), "loggerContext", term1141);
        setField(term1065, term1065.getClass(), "logger", term1066);
        setField(term1065, term1065.getClass(), "serviceKey", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.SearchStayService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllStay", argTypes, term1065, args);
    }

};


