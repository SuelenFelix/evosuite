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
import java.util.ArrayList;

public class QuikSort_quikSort_5054824741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term88;

    public QuikSort_quikSort_5054824741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.prac.react.algorithm.QuikSort"));
        Object term2 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term39 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term67 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term70 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term73 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term75 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term83 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term84 = newInstance(Class.forName("java.lang.Object"));
        Object[] term85 = (Object[]) newArray("java.lang.Object", 1);
        setField(term2, term2.getClass(), "name", "com.prac.react.algorithm.QuikSort");
        setField(term2, term2.getClass(), "level", null);
        setIntField(term2, term2.getClass(), "effectiveLevelInt", -2147483648);
        setField(term39, term39.getClass(), "name", "com.prac.react.algorithm");
        setField(term39, term39.getClass(), "level", null);
        setIntField(term39, term39.getClass(), "effectiveLevelInt", -2147483648);
        setField(term67, term67.getClass(), "name", "");
        setField(term67, term67.getClass(), "level", null);
        setIntField(term67, term67.getClass(), "effectiveLevelInt", -2147483648);
        setField(term70, term70.getClass(), "name", null);
        setField(term70, term70.getClass(), "level", null);
        setIntField(term70, term70.getClass(), "effectiveLevelInt", -2147483648);
        setField(term70, term70.getClass(), "parent", null);
        setField(term70, term70.getClass(), "childrenList", null);
        setField(term70, term70.getClass(), "aai", null);
        setBooleanField(term70, term70.getClass(), "additive", true);
        setField(term70, term70.getClass(), "loggerContext", null);
        setField(term67, term67.getClass(), "parent", term70);
        setField(term73, term73.getClass(), "lock", null);
        setField(term73, term73.getClass(), "array", null);
        setField(term67, term67.getClass(), "childrenList", term73);
        setField(term67, term67.getClass(), "aai", null);
        setBooleanField(term67, term67.getClass(), "additive", true);
        setField(term75, term75.getClass(), "root", null);
        setIntField(term75, term75.getClass(), "size", 31);
        setIntField(term75, term75.getClass(), "noAppenderWarning", 0);
        setField(term75, term75.getClass(), "loggerContextListenerList", null);
        setField(term75, term75.getClass(), "loggerCache", null);
        setField(term75, term75.getClass(), "loggerContextRemoteView", null);
        setField(term75, term75.getClass(), "turboFilterList", null);
        setBooleanField(term75, term75.getClass(), "packagingDataEnabled", false);
        setIntField(term75, term75.getClass(), "maxCallerDataDepth", 8);
        setIntField(term75, term75.getClass(), "resetCount", 0);
        setField(term75, term75.getClass(), "frameworkPackages", null);
        setLongField(term75, term75.getClass(), "birthTime", 1782677505830L);
        setField(term75, term75.getClass(), "name", null);
        setField(term75, term75.getClass(), "sm", null);
        setField(term75, term75.getClass(), "propertyMap", null);
        setField(term75, term75.getClass(), "objectMap", null);
        setField(term75, term75.getClass(), "configurationLock", null);
        setField(term75, term75.getClass(), "scheduledExecutorService", null);
        setField(term75, term75.getClass(), "scheduledFutures", null);
        setField(term75, term75.getClass(), "lifeCycleManager", null);
        setBooleanField(term75, term75.getClass(), "started", false);
        setField(term67, term67.getClass(), "loggerContext", term75);
        setField(term39, term39.getClass(), "parent", term67);
        setField(term83, term83.getClass(), "lock", term84);
        setElement(term85, 0, term2);
        setField(term83, term83.getClass(), "array", term85);
        setField(term39, term39.getClass(), "childrenList", term83);
        setField(term39, term39.getClass(), "aai", null);
        setBooleanField(term39, term39.getClass(), "additive", true);
        setField(term39, term39.getClass(), "loggerContext", term75);
        setField(term2, term2.getClass(), "parent", term39);
        setField(term2, term2.getClass(), "childrenList", null);
        setField(term2, term2.getClass(), "aai", null);
        setBooleanField(term2, term2.getClass(), "additive", true);
        setField(term2, term2.getClass(), "loggerContext", term75);
        setField(term1, term1.getClass(), "logger", term2);
        ArrayList term92 = new ArrayList();
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        Object term91 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term91, term91.getClass(), "course", term92);
        setField(term91, term91.getClass(), "courseName", "eqJfYWRaEL");
        setIntField(term91, term91.getClass(), "memberNum", 865208305);
        setField(term91, term91.getClass(), "memberHash", "fhkbdRViHi");
        setIntField(term91, term91.getClass(), "courseNum", -1275173084);
        setField(term91, term91.getClass(), "courseHash", "uWHnvSvaPl");
        ArrayList term136 = new ArrayList();
        Object term135 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term135, term135.getClass(), "course", term136);
        setField(term135, term135.getClass(), "courseName", "");
        setIntField(term135, term135.getClass(), "memberNum", -244121226);
        setField(term135, term135.getClass(), "memberHash", "");
        setIntField(term135, term135.getClass(), "courseNum", -203030934);
        setField(term135, term135.getClass(), "courseHash", "");
        Object term145 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term145, term145.getClass(), "course", null);
        setField(term145, term145.getClass(), "courseName", null);
        setIntField(term145, term145.getClass(), "memberNum", -157887805);
        setField(term145, term145.getClass(), "memberHash", null);
        setIntField(term145, term145.getClass(), "courseNum", 1876565163);
        setField(term145, term145.getClass(), "courseHash", null);
        term88 = new LinkedList();
        ((LinkedList) term88).add(term91);
        ((LinkedList) term88).add(term135);
        ((LinkedList) term88).add(term145);
        ((LinkedList) term88).add((Object)null);
        ((LinkedList) term88).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.algorithm.QuikSort");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term88;
        callMethod(klass, "quikSort", argTypes, term1, args);
    }

};


