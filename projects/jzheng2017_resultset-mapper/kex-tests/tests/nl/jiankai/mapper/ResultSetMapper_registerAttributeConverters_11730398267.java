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

public class ResultSetMapper_registerAttributeConverters_11730398267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1862;

    public ResultSetMapper_registerAttributeConverters_11730398267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1952 = new HashMap();
        HashMap term1957 = new HashMap();
        HashMap term1962 = new HashMap();
        HashMap term1967 = new HashMap();
        HashMap term1973 = new HashMap();
        HashMap term1989 = new HashMap();
        term1862 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        Object term1863 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1900 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1921 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1924 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1927 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1929 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term1937 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1938 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1939 = (Object[]) newArray("java.lang.Object", 2);
        Object term1941 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1942 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1943 = (Object[]) newArray("java.lang.Object", 2);
        Object term1944 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1947 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1951 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        Object term1972 = newInstance(Class.forName("nl.jiankai.mapper.strategies.IdentityFieldNamingStrategy"));
        setField(term1863, term1863.getClass(), "name", "nl.jiankai.mapper.ResultSetMapper");
        setField(term1863, term1863.getClass(), "level", null);
        setIntField(term1863, term1863.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1900, term1900.getClass(), "name", "nl.jiankai.mapper");
        setField(term1900, term1900.getClass(), "level", null);
        setIntField(term1900, term1900.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1921, term1921.getClass(), "name", "");
        setField(term1921, term1921.getClass(), "level", null);
        setIntField(term1921, term1921.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1924, term1924.getClass(), "name", null);
        setField(term1924, term1924.getClass(), "level", null);
        setIntField(term1924, term1924.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1924, term1924.getClass(), "parent", null);
        setField(term1924, term1924.getClass(), "childrenList", null);
        setField(term1924, term1924.getClass(), "aai", null);
        setBooleanField(term1924, term1924.getClass(), "additive", true);
        setField(term1924, term1924.getClass(), "loggerContext", null);
        setField(term1921, term1921.getClass(), "parent", term1924);
        setField(term1927, term1927.getClass(), "lock", null);
        setField(term1927, term1927.getClass(), "array", null);
        setField(term1921, term1921.getClass(), "childrenList", term1927);
        setField(term1921, term1921.getClass(), "aai", null);
        setBooleanField(term1921, term1921.getClass(), "additive", true);
        setField(term1929, term1929.getClass(), "root", null);
        setIntField(term1929, term1929.getClass(), "size", 35);
        setIntField(term1929, term1929.getClass(), "noAppenderWarning", 0);
        setField(term1929, term1929.getClass(), "loggerContextListenerList", null);
        setField(term1929, term1929.getClass(), "loggerCache", null);
        setField(term1929, term1929.getClass(), "loggerContextRemoteView", null);
        setField(term1929, term1929.getClass(), "turboFilterList", null);
        setBooleanField(term1929, term1929.getClass(), "packagingDataEnabled", false);
        setIntField(term1929, term1929.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1929, term1929.getClass(), "resetCount", 0);
        setField(term1929, term1929.getClass(), "frameworkPackages", null);
        setLongField(term1929, term1929.getClass(), "birthTime", 1786403842639L);
        setField(term1929, term1929.getClass(), "name", null);
        setField(term1929, term1929.getClass(), "sm", null);
        setField(term1929, term1929.getClass(), "propertyMap", null);
        setField(term1929, term1929.getClass(), "objectMap", null);
        setField(term1929, term1929.getClass(), "configurationLock", null);
        setField(term1929, term1929.getClass(), "scheduledExecutorService", null);
        setField(term1929, term1929.getClass(), "scheduledFutures", null);
        setField(term1929, term1929.getClass(), "lifeCycleManager", null);
        setBooleanField(term1929, term1929.getClass(), "started", false);
        setField(term1921, term1921.getClass(), "loggerContext", term1929);
        setField(term1900, term1900.getClass(), "parent", term1921);
        setField(term1937, term1937.getClass(), "lock", term1938);
        setElement(term1939, 0, term1863);
        setField(term1937, term1937.getClass(), "array", term1939);
        setField(term1900, term1900.getClass(), "childrenList", term1937);
        setField(term1900, term1900.getClass(), "aai", null);
        setBooleanField(term1900, term1900.getClass(), "additive", true);
        setField(term1900, term1900.getClass(), "loggerContext", term1929);
        setField(term1863, term1863.getClass(), "parent", term1900);
        setField(term1941, term1941.getClass(), "lock", term1942);
        setField(term1944, term1944.getClass(), "name", null);
        setField(term1944, term1944.getClass(), "level", null);
        setIntField(term1944, term1944.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1944, term1944.getClass(), "parent", term1863);
        setField(term1944, term1944.getClass(), "childrenList", null);
        setField(term1944, term1944.getClass(), "aai", null);
        setBooleanField(term1944, term1944.getClass(), "additive", true);
        setField(term1944, term1944.getClass(), "loggerContext", term1929);
        setElement(term1943, 0, term1944);
        setField(term1947, term1947.getClass(), "name", null);
        setField(term1947, term1947.getClass(), "level", null);
        setIntField(term1947, term1947.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1947, term1947.getClass(), "parent", term1863);
        setField(term1947, term1947.getClass(), "childrenList", null);
        setField(term1947, term1947.getClass(), "aai", null);
        setBooleanField(term1947, term1947.getClass(), "additive", true);
        setField(term1947, term1947.getClass(), "loggerContext", term1929);
        setElement(term1943, 1, term1947);
        setField(term1941, term1941.getClass(), "array", term1943);
        setField(term1863, term1863.getClass(), "childrenList", term1941);
        setField(term1863, term1863.getClass(), "aai", null);
        setBooleanField(term1863, term1863.getClass(), "additive", true);
        setField(term1863, term1863.getClass(), "loggerContext", term1929);
        setField(term1862, term1862.getClass(), "logger", term1863);
        setField(term1951, term1951.getClass(), "logger", term1947);
        setField(term1951, term1951.getClass(), "cachedClassFields", term1952);
        setField(term1951, term1951.getClass(), "cachedClassAnnotations", term1957);
        setField(term1951, term1951.getClass(), "cachedFieldAnnotations", term1962);
        setField(term1951, term1951.getClass(), "cachedPrimitiveFields", term1967);
        setField(term1951, term1951.getClass(), "this$0", term1862);
        setField(term1862, term1862.getClass(), "classCache", term1951);
        setField(term1862, term1862.getClass(), "fieldNamingStrategy", term1972);
        setField(term1862, term1862.getClass(), "attributeConvertersBySourceAndTarget", term1973);
        setField(term1862, term1862.getClass(), "attributeConvertersByClass", term1989);
        setBooleanField(term1862, term1862.getClass(), "hasClassLevelWarningSuppression", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "registerAttributeConverters", argTypes, term1862, args);
    }

};


