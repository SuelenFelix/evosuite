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
import java.lang.String;

public class ResultSetMapper_tryConvertValue_8659933176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1309;
     Object term1456;
     Object term1582;

    public ResultSetMapper_tryConvertValue_8659933176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1399 = new HashMap();
        HashMap term1404 = new HashMap();
        HashMap term1409 = new HashMap();
        HashMap term1414 = new HashMap();
        HashMap term1420 = new HashMap();
        HashMap term1436 = new HashMap();
        term1309 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        Object term1310 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1347 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1368 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1371 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1374 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1376 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term1384 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1385 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1386 = (Object[]) newArray("java.lang.Object", 2);
        Object term1388 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1389 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1390 = (Object[]) newArray("java.lang.Object", 2);
        Object term1391 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1394 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1398 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        Object term1419 = newInstance(Class.forName("nl.jiankai.mapper.strategies.IdentityFieldNamingStrategy"));
        setField(term1310, term1310.getClass(), "name", "nl.jiankai.mapper.ResultSetMapper");
        setField(term1310, term1310.getClass(), "level", null);
        setIntField(term1310, term1310.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1347, term1347.getClass(), "name", "nl.jiankai.mapper");
        setField(term1347, term1347.getClass(), "level", null);
        setIntField(term1347, term1347.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1368, term1368.getClass(), "name", "");
        setField(term1368, term1368.getClass(), "level", null);
        setIntField(term1368, term1368.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1371, term1371.getClass(), "name", null);
        setField(term1371, term1371.getClass(), "level", null);
        setIntField(term1371, term1371.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1371, term1371.getClass(), "parent", null);
        setField(term1371, term1371.getClass(), "childrenList", null);
        setField(term1371, term1371.getClass(), "aai", null);
        setBooleanField(term1371, term1371.getClass(), "additive", true);
        setField(term1371, term1371.getClass(), "loggerContext", null);
        setField(term1368, term1368.getClass(), "parent", term1371);
        setField(term1374, term1374.getClass(), "lock", null);
        setField(term1374, term1374.getClass(), "array", null);
        setField(term1368, term1368.getClass(), "childrenList", term1374);
        setField(term1368, term1368.getClass(), "aai", null);
        setBooleanField(term1368, term1368.getClass(), "additive", true);
        setField(term1376, term1376.getClass(), "root", null);
        setIntField(term1376, term1376.getClass(), "size", 35);
        setIntField(term1376, term1376.getClass(), "noAppenderWarning", 0);
        setField(term1376, term1376.getClass(), "loggerContextListenerList", null);
        setField(term1376, term1376.getClass(), "loggerCache", null);
        setField(term1376, term1376.getClass(), "loggerContextRemoteView", null);
        setField(term1376, term1376.getClass(), "turboFilterList", null);
        setBooleanField(term1376, term1376.getClass(), "packagingDataEnabled", false);
        setIntField(term1376, term1376.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1376, term1376.getClass(), "resetCount", 0);
        setField(term1376, term1376.getClass(), "frameworkPackages", null);
        setLongField(term1376, term1376.getClass(), "birthTime", 1786403842639L);
        setField(term1376, term1376.getClass(), "name", null);
        setField(term1376, term1376.getClass(), "sm", null);
        setField(term1376, term1376.getClass(), "propertyMap", null);
        setField(term1376, term1376.getClass(), "objectMap", null);
        setField(term1376, term1376.getClass(), "configurationLock", null);
        setField(term1376, term1376.getClass(), "scheduledExecutorService", null);
        setField(term1376, term1376.getClass(), "scheduledFutures", null);
        setField(term1376, term1376.getClass(), "lifeCycleManager", null);
        setBooleanField(term1376, term1376.getClass(), "started", false);
        setField(term1368, term1368.getClass(), "loggerContext", term1376);
        setField(term1347, term1347.getClass(), "parent", term1368);
        setField(term1384, term1384.getClass(), "lock", term1385);
        setElement(term1386, 0, term1310);
        setField(term1384, term1384.getClass(), "array", term1386);
        setField(term1347, term1347.getClass(), "childrenList", term1384);
        setField(term1347, term1347.getClass(), "aai", null);
        setBooleanField(term1347, term1347.getClass(), "additive", true);
        setField(term1347, term1347.getClass(), "loggerContext", term1376);
        setField(term1310, term1310.getClass(), "parent", term1347);
        setField(term1388, term1388.getClass(), "lock", term1389);
        setField(term1391, term1391.getClass(), "name", null);
        setField(term1391, term1391.getClass(), "level", null);
        setIntField(term1391, term1391.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1391, term1391.getClass(), "parent", term1310);
        setField(term1391, term1391.getClass(), "childrenList", null);
        setField(term1391, term1391.getClass(), "aai", null);
        setBooleanField(term1391, term1391.getClass(), "additive", true);
        setField(term1391, term1391.getClass(), "loggerContext", term1376);
        setElement(term1390, 0, term1391);
        setField(term1394, term1394.getClass(), "name", null);
        setField(term1394, term1394.getClass(), "level", null);
        setIntField(term1394, term1394.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1394, term1394.getClass(), "parent", term1310);
        setField(term1394, term1394.getClass(), "childrenList", null);
        setField(term1394, term1394.getClass(), "aai", null);
        setBooleanField(term1394, term1394.getClass(), "additive", true);
        setField(term1394, term1394.getClass(), "loggerContext", term1376);
        setElement(term1390, 1, term1394);
        setField(term1388, term1388.getClass(), "array", term1390);
        setField(term1310, term1310.getClass(), "childrenList", term1388);
        setField(term1310, term1310.getClass(), "aai", null);
        setBooleanField(term1310, term1310.getClass(), "additive", true);
        setField(term1310, term1310.getClass(), "loggerContext", term1376);
        setField(term1309, term1309.getClass(), "logger", term1310);
        setField(term1398, term1398.getClass(), "logger", term1394);
        setField(term1398, term1398.getClass(), "cachedClassFields", term1399);
        setField(term1398, term1398.getClass(), "cachedClassAnnotations", term1404);
        setField(term1398, term1398.getClass(), "cachedFieldAnnotations", term1409);
        setField(term1398, term1398.getClass(), "cachedPrimitiveFields", term1414);
        setField(term1398, term1398.getClass(), "this$0", term1309);
        setField(term1309, term1309.getClass(), "classCache", term1398);
        setField(term1309, term1309.getClass(), "fieldNamingStrategy", term1419);
        setField(term1309, term1309.getClass(), "attributeConvertersBySourceAndTarget", term1420);
        setField(term1309, term1309.getClass(), "attributeConvertersByClass", term1436);
        setBooleanField(term1309, term1309.getClass(), "hasClassLevelWarningSuppression", true);
        Class<? extends Object> term1633 = Class.forName((String) "java.util.Formatter$FormatSpecifier$BigDecimalLayout");
        term1456 = ((Class) term1633).getDeclaredField((String) "exp");
        ((Field) term1456).setAccessible(false);
        term1582 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term1456;
        args[1] = term1582;
        callMethod(klass, "tryConvertValue", argTypes, term1309, args);
    }

};


