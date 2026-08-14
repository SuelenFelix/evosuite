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

public class ResultSetMapper_putAttributeConverterInMap_19006663398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2059;

    public ResultSetMapper_putAttributeConverterInMap_19006663398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2149 = new HashMap();
        HashMap term2154 = new HashMap();
        HashMap term2159 = new HashMap();
        HashMap term2164 = new HashMap();
        HashMap term2170 = new HashMap();
        HashMap term2186 = new HashMap();
        term2059 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        Object term2060 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2097 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2118 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2121 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2124 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2126 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term2134 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2135 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2136 = (Object[]) newArray("java.lang.Object", 2);
        Object term2138 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2139 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2140 = (Object[]) newArray("java.lang.Object", 2);
        Object term2141 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2144 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2148 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        Object term2169 = newInstance(Class.forName("nl.jiankai.mapper.strategies.IdentityFieldNamingStrategy"));
        setField(term2060, term2060.getClass(), "name", "nl.jiankai.mapper.ResultSetMapper");
        setField(term2060, term2060.getClass(), "level", null);
        setIntField(term2060, term2060.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2097, term2097.getClass(), "name", "nl.jiankai.mapper");
        setField(term2097, term2097.getClass(), "level", null);
        setIntField(term2097, term2097.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2118, term2118.getClass(), "name", "");
        setField(term2118, term2118.getClass(), "level", null);
        setIntField(term2118, term2118.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2121, term2121.getClass(), "name", null);
        setField(term2121, term2121.getClass(), "level", null);
        setIntField(term2121, term2121.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2121, term2121.getClass(), "parent", null);
        setField(term2121, term2121.getClass(), "childrenList", null);
        setField(term2121, term2121.getClass(), "aai", null);
        setBooleanField(term2121, term2121.getClass(), "additive", true);
        setField(term2121, term2121.getClass(), "loggerContext", null);
        setField(term2118, term2118.getClass(), "parent", term2121);
        setField(term2124, term2124.getClass(), "lock", null);
        setField(term2124, term2124.getClass(), "array", null);
        setField(term2118, term2118.getClass(), "childrenList", term2124);
        setField(term2118, term2118.getClass(), "aai", null);
        setBooleanField(term2118, term2118.getClass(), "additive", true);
        setField(term2126, term2126.getClass(), "root", null);
        setIntField(term2126, term2126.getClass(), "size", 35);
        setIntField(term2126, term2126.getClass(), "noAppenderWarning", 0);
        setField(term2126, term2126.getClass(), "loggerContextListenerList", null);
        setField(term2126, term2126.getClass(), "loggerCache", null);
        setField(term2126, term2126.getClass(), "loggerContextRemoteView", null);
        setField(term2126, term2126.getClass(), "turboFilterList", null);
        setBooleanField(term2126, term2126.getClass(), "packagingDataEnabled", false);
        setIntField(term2126, term2126.getClass(), "maxCallerDataDepth", 8);
        setIntField(term2126, term2126.getClass(), "resetCount", 0);
        setField(term2126, term2126.getClass(), "frameworkPackages", null);
        setLongField(term2126, term2126.getClass(), "birthTime", 1786403842639L);
        setField(term2126, term2126.getClass(), "name", null);
        setField(term2126, term2126.getClass(), "sm", null);
        setField(term2126, term2126.getClass(), "propertyMap", null);
        setField(term2126, term2126.getClass(), "objectMap", null);
        setField(term2126, term2126.getClass(), "configurationLock", null);
        setField(term2126, term2126.getClass(), "scheduledExecutorService", null);
        setField(term2126, term2126.getClass(), "scheduledFutures", null);
        setField(term2126, term2126.getClass(), "lifeCycleManager", null);
        setBooleanField(term2126, term2126.getClass(), "started", false);
        setField(term2118, term2118.getClass(), "loggerContext", term2126);
        setField(term2097, term2097.getClass(), "parent", term2118);
        setField(term2134, term2134.getClass(), "lock", term2135);
        setElement(term2136, 0, term2060);
        setField(term2134, term2134.getClass(), "array", term2136);
        setField(term2097, term2097.getClass(), "childrenList", term2134);
        setField(term2097, term2097.getClass(), "aai", null);
        setBooleanField(term2097, term2097.getClass(), "additive", true);
        setField(term2097, term2097.getClass(), "loggerContext", term2126);
        setField(term2060, term2060.getClass(), "parent", term2097);
        setField(term2138, term2138.getClass(), "lock", term2139);
        setField(term2141, term2141.getClass(), "name", null);
        setField(term2141, term2141.getClass(), "level", null);
        setIntField(term2141, term2141.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2141, term2141.getClass(), "parent", term2060);
        setField(term2141, term2141.getClass(), "childrenList", null);
        setField(term2141, term2141.getClass(), "aai", null);
        setBooleanField(term2141, term2141.getClass(), "additive", true);
        setField(term2141, term2141.getClass(), "loggerContext", term2126);
        setElement(term2140, 0, term2141);
        setField(term2144, term2144.getClass(), "name", null);
        setField(term2144, term2144.getClass(), "level", null);
        setIntField(term2144, term2144.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2144, term2144.getClass(), "parent", term2060);
        setField(term2144, term2144.getClass(), "childrenList", null);
        setField(term2144, term2144.getClass(), "aai", null);
        setBooleanField(term2144, term2144.getClass(), "additive", true);
        setField(term2144, term2144.getClass(), "loggerContext", term2126);
        setElement(term2140, 1, term2144);
        setField(term2138, term2138.getClass(), "array", term2140);
        setField(term2060, term2060.getClass(), "childrenList", term2138);
        setField(term2060, term2060.getClass(), "aai", null);
        setBooleanField(term2060, term2060.getClass(), "additive", true);
        setField(term2060, term2060.getClass(), "loggerContext", term2126);
        setField(term2059, term2059.getClass(), "logger", term2060);
        setField(term2148, term2148.getClass(), "logger", term2144);
        setField(term2148, term2148.getClass(), "cachedClassFields", term2149);
        setField(term2148, term2148.getClass(), "cachedClassAnnotations", term2154);
        setField(term2148, term2148.getClass(), "cachedFieldAnnotations", term2159);
        setField(term2148, term2148.getClass(), "cachedPrimitiveFields", term2164);
        setField(term2148, term2148.getClass(), "this$0", term2059);
        setField(term2059, term2059.getClass(), "classCache", term2148);
        setField(term2059, term2059.getClass(), "fieldNamingStrategy", term2169);
        setField(term2059, term2059.getClass(), "attributeConvertersBySourceAndTarget", term2170);
        setField(term2059, term2059.getClass(), "attributeConvertersByClass", term2186);
        setBooleanField(term2059, term2059.getClass(), "hasClassLevelWarningSuppression", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nl.jiankai.mapper.converters.AttributeConverter");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "putAttributeConverterInMap", argTypes, term2059, args);
    }

};


