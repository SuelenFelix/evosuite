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
import java.util.LinkedHashMap;

public class ResultSetMapper_createObject_9199900955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term905;
     Object term1052;

    public ResultSetMapper_createObject_9199900955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term995 = new HashMap();
        HashMap term1000 = new HashMap();
        HashMap term1005 = new HashMap();
        HashMap term1010 = new HashMap();
        HashMap term1016 = new HashMap();
        HashMap term1032 = new HashMap();
        term905 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        Object term906 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term943 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term964 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term967 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term970 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term972 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term980 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term981 = newInstance(Class.forName("java.lang.Object"));
        Object[] term982 = (Object[]) newArray("java.lang.Object", 2);
        Object term984 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term985 = newInstance(Class.forName("java.lang.Object"));
        Object[] term986 = (Object[]) newArray("java.lang.Object", 2);
        Object term987 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term990 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term994 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        Object term1015 = newInstance(Class.forName("nl.jiankai.mapper.strategies.IdentityFieldNamingStrategy"));
        setField(term906, term906.getClass(), "name", "nl.jiankai.mapper.ResultSetMapper");
        setField(term906, term906.getClass(), "level", null);
        setIntField(term906, term906.getClass(), "effectiveLevelInt", -2147483648);
        setField(term943, term943.getClass(), "name", "nl.jiankai.mapper");
        setField(term943, term943.getClass(), "level", null);
        setIntField(term943, term943.getClass(), "effectiveLevelInt", -2147483648);
        setField(term964, term964.getClass(), "name", "");
        setField(term964, term964.getClass(), "level", null);
        setIntField(term964, term964.getClass(), "effectiveLevelInt", -2147483648);
        setField(term967, term967.getClass(), "name", null);
        setField(term967, term967.getClass(), "level", null);
        setIntField(term967, term967.getClass(), "effectiveLevelInt", -2147483648);
        setField(term967, term967.getClass(), "parent", null);
        setField(term967, term967.getClass(), "childrenList", null);
        setField(term967, term967.getClass(), "aai", null);
        setBooleanField(term967, term967.getClass(), "additive", true);
        setField(term967, term967.getClass(), "loggerContext", null);
        setField(term964, term964.getClass(), "parent", term967);
        setField(term970, term970.getClass(), "lock", null);
        setField(term970, term970.getClass(), "array", null);
        setField(term964, term964.getClass(), "childrenList", term970);
        setField(term964, term964.getClass(), "aai", null);
        setBooleanField(term964, term964.getClass(), "additive", true);
        setField(term972, term972.getClass(), "root", null);
        setIntField(term972, term972.getClass(), "size", 35);
        setIntField(term972, term972.getClass(), "noAppenderWarning", 0);
        setField(term972, term972.getClass(), "loggerContextListenerList", null);
        setField(term972, term972.getClass(), "loggerCache", null);
        setField(term972, term972.getClass(), "loggerContextRemoteView", null);
        setField(term972, term972.getClass(), "turboFilterList", null);
        setBooleanField(term972, term972.getClass(), "packagingDataEnabled", false);
        setIntField(term972, term972.getClass(), "maxCallerDataDepth", 8);
        setIntField(term972, term972.getClass(), "resetCount", 0);
        setField(term972, term972.getClass(), "frameworkPackages", null);
        setLongField(term972, term972.getClass(), "birthTime", 1786403842639L);
        setField(term972, term972.getClass(), "name", null);
        setField(term972, term972.getClass(), "sm", null);
        setField(term972, term972.getClass(), "propertyMap", null);
        setField(term972, term972.getClass(), "objectMap", null);
        setField(term972, term972.getClass(), "configurationLock", null);
        setField(term972, term972.getClass(), "scheduledExecutorService", null);
        setField(term972, term972.getClass(), "scheduledFutures", null);
        setField(term972, term972.getClass(), "lifeCycleManager", null);
        setBooleanField(term972, term972.getClass(), "started", false);
        setField(term964, term964.getClass(), "loggerContext", term972);
        setField(term943, term943.getClass(), "parent", term964);
        setField(term980, term980.getClass(), "lock", term981);
        setElement(term982, 0, term906);
        setField(term980, term980.getClass(), "array", term982);
        setField(term943, term943.getClass(), "childrenList", term980);
        setField(term943, term943.getClass(), "aai", null);
        setBooleanField(term943, term943.getClass(), "additive", true);
        setField(term943, term943.getClass(), "loggerContext", term972);
        setField(term906, term906.getClass(), "parent", term943);
        setField(term984, term984.getClass(), "lock", term985);
        setField(term987, term987.getClass(), "name", null);
        setField(term987, term987.getClass(), "level", null);
        setIntField(term987, term987.getClass(), "effectiveLevelInt", -2147483648);
        setField(term987, term987.getClass(), "parent", term906);
        setField(term987, term987.getClass(), "childrenList", null);
        setField(term987, term987.getClass(), "aai", null);
        setBooleanField(term987, term987.getClass(), "additive", true);
        setField(term987, term987.getClass(), "loggerContext", term972);
        setElement(term986, 0, term987);
        setField(term990, term990.getClass(), "name", null);
        setField(term990, term990.getClass(), "level", null);
        setIntField(term990, term990.getClass(), "effectiveLevelInt", -2147483648);
        setField(term990, term990.getClass(), "parent", term906);
        setField(term990, term990.getClass(), "childrenList", null);
        setField(term990, term990.getClass(), "aai", null);
        setBooleanField(term990, term990.getClass(), "additive", true);
        setField(term990, term990.getClass(), "loggerContext", term972);
        setElement(term986, 1, term990);
        setField(term984, term984.getClass(), "array", term986);
        setField(term906, term906.getClass(), "childrenList", term984);
        setField(term906, term906.getClass(), "aai", null);
        setBooleanField(term906, term906.getClass(), "additive", true);
        setField(term906, term906.getClass(), "loggerContext", term972);
        setField(term905, term905.getClass(), "logger", term906);
        setField(term994, term994.getClass(), "logger", term990);
        setField(term994, term994.getClass(), "cachedClassFields", term995);
        setField(term994, term994.getClass(), "cachedClassAnnotations", term1000);
        setField(term994, term994.getClass(), "cachedFieldAnnotations", term1005);
        setField(term994, term994.getClass(), "cachedPrimitiveFields", term1010);
        setField(term994, term994.getClass(), "this$0", term905);
        setField(term905, term905.getClass(), "classCache", term994);
        setField(term905, term905.getClass(), "fieldNamingStrategy", term1015);
        setField(term905, term905.getClass(), "attributeConvertersBySourceAndTarget", term1016);
        setField(term905, term905.getClass(), "attributeConvertersByClass", term1032);
        setBooleanField(term905, term905.getClass(), "hasClassLevelWarningSuppression", false);
        term1052 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.sql.ResultSet");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1052;
        callMethod(klass, "createObject", argTypes, term905, args);
    }

};


