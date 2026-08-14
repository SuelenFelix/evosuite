package nl.jiankai.mapper;

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
import static nl.jiankai.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class ResultSetMapper_ClassCache_init_6241181370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2278;

    public ResultSetMapper_ClassCache_init_6241181370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2368 = new HashMap();
        HashMap term2373 = new HashMap();
        HashMap term2378 = new HashMap();
        HashMap term2383 = new HashMap();
        HashMap term2389 = new HashMap();
        HashMap term2405 = new HashMap();
        term2278 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        Object term2279 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2316 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2337 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2340 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2343 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2345 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term2353 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2354 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2355 = (Object[]) newArray("java.lang.Object", 2);
        Object term2357 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2358 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2359 = (Object[]) newArray("java.lang.Object", 2);
        Object term2360 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2363 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2367 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        Object term2388 = newInstance(Class.forName("nl.jiankai.mapper.strategies.IdentityFieldNamingStrategy"));
        setField(term2279, term2279.getClass(), "name", "nl.jiankai.mapper.ResultSetMapper");
        setField(term2279, term2279.getClass(), "level", null);
        setIntField(term2279, term2279.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2316, term2316.getClass(), "name", "nl.jiankai.mapper");
        setField(term2316, term2316.getClass(), "level", null);
        setIntField(term2316, term2316.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2337, term2337.getClass(), "name", "");
        setField(term2337, term2337.getClass(), "level", null);
        setIntField(term2337, term2337.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2340, term2340.getClass(), "name", null);
        setField(term2340, term2340.getClass(), "level", null);
        setIntField(term2340, term2340.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2340, term2340.getClass(), "parent", null);
        setField(term2340, term2340.getClass(), "childrenList", null);
        setField(term2340, term2340.getClass(), "aai", null);
        setBooleanField(term2340, term2340.getClass(), "additive", true);
        setField(term2340, term2340.getClass(), "loggerContext", null);
        setField(term2337, term2337.getClass(), "parent", term2340);
        setField(term2343, term2343.getClass(), "lock", null);
        setField(term2343, term2343.getClass(), "array", null);
        setField(term2337, term2337.getClass(), "childrenList", term2343);
        setField(term2337, term2337.getClass(), "aai", null);
        setBooleanField(term2337, term2337.getClass(), "additive", true);
        setField(term2345, term2345.getClass(), "root", null);
        setIntField(term2345, term2345.getClass(), "size", 35);
        setIntField(term2345, term2345.getClass(), "noAppenderWarning", 0);
        setField(term2345, term2345.getClass(), "loggerContextListenerList", null);
        setField(term2345, term2345.getClass(), "loggerCache", null);
        setField(term2345, term2345.getClass(), "loggerContextRemoteView", null);
        setField(term2345, term2345.getClass(), "turboFilterList", null);
        setBooleanField(term2345, term2345.getClass(), "packagingDataEnabled", false);
        setIntField(term2345, term2345.getClass(), "maxCallerDataDepth", 8);
        setIntField(term2345, term2345.getClass(), "resetCount", 0);
        setField(term2345, term2345.getClass(), "frameworkPackages", null);
        setLongField(term2345, term2345.getClass(), "birthTime", 1786403842639L);
        setField(term2345, term2345.getClass(), "name", null);
        setField(term2345, term2345.getClass(), "sm", null);
        setField(term2345, term2345.getClass(), "propertyMap", null);
        setField(term2345, term2345.getClass(), "objectMap", null);
        setField(term2345, term2345.getClass(), "configurationLock", null);
        setField(term2345, term2345.getClass(), "scheduledExecutorService", null);
        setField(term2345, term2345.getClass(), "scheduledFutures", null);
        setField(term2345, term2345.getClass(), "lifeCycleManager", null);
        setBooleanField(term2345, term2345.getClass(), "started", false);
        setField(term2337, term2337.getClass(), "loggerContext", term2345);
        setField(term2316, term2316.getClass(), "parent", term2337);
        setField(term2353, term2353.getClass(), "lock", term2354);
        setElement(term2355, 0, term2279);
        setField(term2353, term2353.getClass(), "array", term2355);
        setField(term2316, term2316.getClass(), "childrenList", term2353);
        setField(term2316, term2316.getClass(), "aai", null);
        setBooleanField(term2316, term2316.getClass(), "additive", true);
        setField(term2316, term2316.getClass(), "loggerContext", term2345);
        setField(term2279, term2279.getClass(), "parent", term2316);
        setField(term2357, term2357.getClass(), "lock", term2358);
        setField(term2360, term2360.getClass(), "name", null);
        setField(term2360, term2360.getClass(), "level", null);
        setIntField(term2360, term2360.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2360, term2360.getClass(), "parent", term2279);
        setField(term2360, term2360.getClass(), "childrenList", null);
        setField(term2360, term2360.getClass(), "aai", null);
        setBooleanField(term2360, term2360.getClass(), "additive", true);
        setField(term2360, term2360.getClass(), "loggerContext", term2345);
        setElement(term2359, 0, term2360);
        setField(term2363, term2363.getClass(), "name", null);
        setField(term2363, term2363.getClass(), "level", null);
        setIntField(term2363, term2363.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2363, term2363.getClass(), "parent", term2279);
        setField(term2363, term2363.getClass(), "childrenList", null);
        setField(term2363, term2363.getClass(), "aai", null);
        setBooleanField(term2363, term2363.getClass(), "additive", true);
        setField(term2363, term2363.getClass(), "loggerContext", term2345);
        setElement(term2359, 1, term2363);
        setField(term2357, term2357.getClass(), "array", term2359);
        setField(term2279, term2279.getClass(), "childrenList", term2357);
        setField(term2279, term2279.getClass(), "aai", null);
        setBooleanField(term2279, term2279.getClass(), "additive", true);
        setField(term2279, term2279.getClass(), "loggerContext", term2345);
        setField(term2278, term2278.getClass(), "logger", term2279);
        setField(term2367, term2367.getClass(), "logger", term2363);
        setField(term2367, term2367.getClass(), "cachedClassFields", term2368);
        setField(term2367, term2367.getClass(), "cachedClassAnnotations", term2373);
        setField(term2367, term2367.getClass(), "cachedFieldAnnotations", term2378);
        setField(term2367, term2367.getClass(), "cachedPrimitiveFields", term2383);
        setField(term2367, term2367.getClass(), "this$0", term2278);
        setField(term2278, term2278.getClass(), "classCache", term2367);
        setField(term2278, term2278.getClass(), "fieldNamingStrategy", term2388);
        setField(term2278, term2278.getClass(), "attributeConvertersBySourceAndTarget", term2389);
        setField(term2278, term2278.getClass(), "attributeConvertersByClass", term2405);
        setBooleanField(term2278, term2278.getClass(), "hasClassLevelWarningSuppression", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Object[] args = new Object[1];
        args[0] = term2278;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


