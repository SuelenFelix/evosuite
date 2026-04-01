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

public class QuikSort_swap_6417518154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716;
     Object term803;
     Object term806;
     Object term808;

    public QuikSort_swap_6417518154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716 = newInstance(Class.forName("com.prac.react.algorithm.QuikSort"));
        Object term717 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term754 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term782 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term785 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term788 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term790 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term798 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term799 = newInstance(Class.forName("java.lang.Object"));
        Object[] term800 = (Object[]) newArray("java.lang.Object", 1);
        setField(term717, term717.getClass(), "name", "com.prac.react.algorithm.QuikSort");
        setField(term717, term717.getClass(), "level", null);
        setIntField(term717, term717.getClass(), "effectiveLevelInt", -2147483648);
        setField(term754, term754.getClass(), "name", "com.prac.react.algorithm");
        setField(term754, term754.getClass(), "level", null);
        setIntField(term754, term754.getClass(), "effectiveLevelInt", -2147483648);
        setField(term782, term782.getClass(), "name", "");
        setField(term782, term782.getClass(), "level", null);
        setIntField(term782, term782.getClass(), "effectiveLevelInt", -2147483648);
        setField(term785, term785.getClass(), "name", null);
        setField(term785, term785.getClass(), "level", null);
        setIntField(term785, term785.getClass(), "effectiveLevelInt", -2147483648);
        setField(term785, term785.getClass(), "parent", null);
        setField(term785, term785.getClass(), "childrenList", null);
        setField(term785, term785.getClass(), "aai", null);
        setBooleanField(term785, term785.getClass(), "additive", true);
        setField(term785, term785.getClass(), "loggerContext", null);
        setField(term782, term782.getClass(), "parent", term785);
        setField(term788, term788.getClass(), "lock", null);
        setField(term788, term788.getClass(), "array", null);
        setField(term782, term782.getClass(), "childrenList", term788);
        setField(term782, term782.getClass(), "aai", null);
        setBooleanField(term782, term782.getClass(), "additive", true);
        setField(term790, term790.getClass(), "root", null);
        setIntField(term790, term790.getClass(), "size", 31);
        setIntField(term790, term790.getClass(), "noAppenderWarning", 0);
        setField(term790, term790.getClass(), "loggerContextListenerList", null);
        setField(term790, term790.getClass(), "loggerCache", null);
        setField(term790, term790.getClass(), "loggerContextRemoteView", null);
        setField(term790, term790.getClass(), "turboFilterList", null);
        setBooleanField(term790, term790.getClass(), "packagingDataEnabled", false);
        setIntField(term790, term790.getClass(), "maxCallerDataDepth", 8);
        setIntField(term790, term790.getClass(), "resetCount", 0);
        setField(term790, term790.getClass(), "frameworkPackages", null);
        setLongField(term790, term790.getClass(), "birthTime", 1775069113155L);
        setField(term790, term790.getClass(), "name", null);
        setField(term790, term790.getClass(), "sm", null);
        setField(term790, term790.getClass(), "propertyMap", null);
        setField(term790, term790.getClass(), "objectMap", null);
        setField(term790, term790.getClass(), "configurationLock", null);
        setField(term790, term790.getClass(), "scheduledExecutorService", null);
        setField(term790, term790.getClass(), "scheduledFutures", null);
        setField(term790, term790.getClass(), "lifeCycleManager", null);
        setBooleanField(term790, term790.getClass(), "started", false);
        setField(term782, term782.getClass(), "loggerContext", term790);
        setField(term754, term754.getClass(), "parent", term782);
        setField(term798, term798.getClass(), "lock", term799);
        setElement(term800, 0, term717);
        setField(term798, term798.getClass(), "array", term800);
        setField(term754, term754.getClass(), "childrenList", term798);
        setField(term754, term754.getClass(), "aai", null);
        setBooleanField(term754, term754.getClass(), "additive", true);
        setField(term754, term754.getClass(), "loggerContext", term790);
        setField(term717, term717.getClass(), "parent", term754);
        setField(term717, term717.getClass(), "childrenList", null);
        setField(term717, term717.getClass(), "aai", null);
        setBooleanField(term717, term717.getClass(), "additive", true);
        setField(term717, term717.getClass(), "loggerContext", term790);
        setField(term716, term716.getClass(), "logger", term717);
        term803 = new LinkedList();
        term806 = new Integer(1398204340);
        term808 = new Integer(229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.algorithm.QuikSort");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term803;
        args[1] = term806;
        args[2] = term808;
        callMethod(klass, "swap", argTypes, term716, args);
    }

};


