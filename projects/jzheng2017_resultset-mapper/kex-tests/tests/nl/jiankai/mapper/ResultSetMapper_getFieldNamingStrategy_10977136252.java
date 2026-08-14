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

public class ResultSetMapper_getFieldNamingStrategy_10977136252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314;

    public ResultSetMapper_getFieldNamingStrategy_10977136252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term404 = new HashMap();
        HashMap term409 = new HashMap();
        HashMap term414 = new HashMap();
        HashMap term419 = new HashMap();
        HashMap term425 = new HashMap();
        HashMap term441 = new HashMap();
        term314 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        Object term315 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term352 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term373 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term376 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term379 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term381 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term389 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term390 = newInstance(Class.forName("java.lang.Object"));
        Object[] term391 = (Object[]) newArray("java.lang.Object", 2);
        Object term393 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term394 = newInstance(Class.forName("java.lang.Object"));
        Object[] term395 = (Object[]) newArray("java.lang.Object", 2);
        Object term396 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term399 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term403 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        Object term424 = newInstance(Class.forName("nl.jiankai.mapper.strategies.IdentityFieldNamingStrategy"));
        setField(term315, term315.getClass(), "name", "nl.jiankai.mapper.ResultSetMapper");
        setField(term315, term315.getClass(), "level", null);
        setIntField(term315, term315.getClass(), "effectiveLevelInt", -2147483648);
        setField(term352, term352.getClass(), "name", "nl.jiankai.mapper");
        setField(term352, term352.getClass(), "level", null);
        setIntField(term352, term352.getClass(), "effectiveLevelInt", -2147483648);
        setField(term373, term373.getClass(), "name", "");
        setField(term373, term373.getClass(), "level", null);
        setIntField(term373, term373.getClass(), "effectiveLevelInt", -2147483648);
        setField(term376, term376.getClass(), "name", null);
        setField(term376, term376.getClass(), "level", null);
        setIntField(term376, term376.getClass(), "effectiveLevelInt", -2147483648);
        setField(term376, term376.getClass(), "parent", null);
        setField(term376, term376.getClass(), "childrenList", null);
        setField(term376, term376.getClass(), "aai", null);
        setBooleanField(term376, term376.getClass(), "additive", true);
        setField(term376, term376.getClass(), "loggerContext", null);
        setField(term373, term373.getClass(), "parent", term376);
        setField(term379, term379.getClass(), "lock", null);
        setField(term379, term379.getClass(), "array", null);
        setField(term373, term373.getClass(), "childrenList", term379);
        setField(term373, term373.getClass(), "aai", null);
        setBooleanField(term373, term373.getClass(), "additive", true);
        setField(term381, term381.getClass(), "root", null);
        setIntField(term381, term381.getClass(), "size", 35);
        setIntField(term381, term381.getClass(), "noAppenderWarning", 0);
        setField(term381, term381.getClass(), "loggerContextListenerList", null);
        setField(term381, term381.getClass(), "loggerCache", null);
        setField(term381, term381.getClass(), "loggerContextRemoteView", null);
        setField(term381, term381.getClass(), "turboFilterList", null);
        setBooleanField(term381, term381.getClass(), "packagingDataEnabled", false);
        setIntField(term381, term381.getClass(), "maxCallerDataDepth", 8);
        setIntField(term381, term381.getClass(), "resetCount", 0);
        setField(term381, term381.getClass(), "frameworkPackages", null);
        setLongField(term381, term381.getClass(), "birthTime", 1786403842639L);
        setField(term381, term381.getClass(), "name", null);
        setField(term381, term381.getClass(), "sm", null);
        setField(term381, term381.getClass(), "propertyMap", null);
        setField(term381, term381.getClass(), "objectMap", null);
        setField(term381, term381.getClass(), "configurationLock", null);
        setField(term381, term381.getClass(), "scheduledExecutorService", null);
        setField(term381, term381.getClass(), "scheduledFutures", null);
        setField(term381, term381.getClass(), "lifeCycleManager", null);
        setBooleanField(term381, term381.getClass(), "started", false);
        setField(term373, term373.getClass(), "loggerContext", term381);
        setField(term352, term352.getClass(), "parent", term373);
        setField(term389, term389.getClass(), "lock", term390);
        setElement(term391, 0, term315);
        setField(term389, term389.getClass(), "array", term391);
        setField(term352, term352.getClass(), "childrenList", term389);
        setField(term352, term352.getClass(), "aai", null);
        setBooleanField(term352, term352.getClass(), "additive", true);
        setField(term352, term352.getClass(), "loggerContext", term381);
        setField(term315, term315.getClass(), "parent", term352);
        setField(term393, term393.getClass(), "lock", term394);
        setField(term396, term396.getClass(), "name", null);
        setField(term396, term396.getClass(), "level", null);
        setIntField(term396, term396.getClass(), "effectiveLevelInt", -2147483648);
        setField(term396, term396.getClass(), "parent", term315);
        setField(term396, term396.getClass(), "childrenList", null);
        setField(term396, term396.getClass(), "aai", null);
        setBooleanField(term396, term396.getClass(), "additive", true);
        setField(term396, term396.getClass(), "loggerContext", term381);
        setElement(term395, 0, term396);
        setField(term399, term399.getClass(), "name", null);
        setField(term399, term399.getClass(), "level", null);
        setIntField(term399, term399.getClass(), "effectiveLevelInt", -2147483648);
        setField(term399, term399.getClass(), "parent", term315);
        setField(term399, term399.getClass(), "childrenList", null);
        setField(term399, term399.getClass(), "aai", null);
        setBooleanField(term399, term399.getClass(), "additive", true);
        setField(term399, term399.getClass(), "loggerContext", term381);
        setElement(term395, 1, term399);
        setField(term393, term393.getClass(), "array", term395);
        setField(term315, term315.getClass(), "childrenList", term393);
        setField(term315, term315.getClass(), "aai", null);
        setBooleanField(term315, term315.getClass(), "additive", true);
        setField(term315, term315.getClass(), "loggerContext", term381);
        setField(term314, term314.getClass(), "logger", term315);
        setField(term403, term403.getClass(), "logger", term399);
        setField(term403, term403.getClass(), "cachedClassFields", term404);
        setField(term403, term403.getClass(), "cachedClassAnnotations", term409);
        setField(term403, term403.getClass(), "cachedFieldAnnotations", term414);
        setField(term403, term403.getClass(), "cachedPrimitiveFields", term419);
        setField(term403, term403.getClass(), "this$0", term314);
        setField(term314, term314.getClass(), "classCache", term403);
        setField(term314, term314.getClass(), "fieldNamingStrategy", term424);
        setField(term314, term314.getClass(), "attributeConvertersBySourceAndTarget", term425);
        setField(term314, term314.getClass(), "attributeConvertersByClass", term441);
        setBooleanField(term314, term314.getClass(), "hasClassLevelWarningSuppression", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFieldNamingStrategy", argTypes, term314, args);
    }

};


