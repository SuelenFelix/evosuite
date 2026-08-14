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

public class ResultSetMapper_SourceAndTarget_init_1546175080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7236;

    public ResultSetMapper_SourceAndTarget_init_1546175080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7326 = new HashMap();
        HashMap term7331 = new HashMap();
        HashMap term7336 = new HashMap();
        HashMap term7341 = new HashMap();
        HashMap term7347 = new HashMap();
        HashMap term7363 = new HashMap();
        term7236 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        Object term7237 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term7274 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term7295 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term7298 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term7301 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term7303 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term7311 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term7312 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7313 = (Object[]) newArray("java.lang.Object", 2);
        Object term7315 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term7316 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7317 = (Object[]) newArray("java.lang.Object", 2);
        Object term7318 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term7321 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term7325 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        Object term7346 = newInstance(Class.forName("nl.jiankai.mapper.strategies.IdentityFieldNamingStrategy"));
        setField(term7237, term7237.getClass(), "name", "nl.jiankai.mapper.ResultSetMapper");
        setField(term7237, term7237.getClass(), "level", null);
        setIntField(term7237, term7237.getClass(), "effectiveLevelInt", -2147483648);
        setField(term7274, term7274.getClass(), "name", "nl.jiankai.mapper");
        setField(term7274, term7274.getClass(), "level", null);
        setIntField(term7274, term7274.getClass(), "effectiveLevelInt", -2147483648);
        setField(term7295, term7295.getClass(), "name", "");
        setField(term7295, term7295.getClass(), "level", null);
        setIntField(term7295, term7295.getClass(), "effectiveLevelInt", -2147483648);
        setField(term7298, term7298.getClass(), "name", null);
        setField(term7298, term7298.getClass(), "level", null);
        setIntField(term7298, term7298.getClass(), "effectiveLevelInt", -2147483648);
        setField(term7298, term7298.getClass(), "parent", null);
        setField(term7298, term7298.getClass(), "childrenList", null);
        setField(term7298, term7298.getClass(), "aai", null);
        setBooleanField(term7298, term7298.getClass(), "additive", true);
        setField(term7298, term7298.getClass(), "loggerContext", null);
        setField(term7295, term7295.getClass(), "parent", term7298);
        setField(term7301, term7301.getClass(), "lock", null);
        setField(term7301, term7301.getClass(), "array", null);
        setField(term7295, term7295.getClass(), "childrenList", term7301);
        setField(term7295, term7295.getClass(), "aai", null);
        setBooleanField(term7295, term7295.getClass(), "additive", true);
        setField(term7303, term7303.getClass(), "root", null);
        setIntField(term7303, term7303.getClass(), "size", 35);
        setIntField(term7303, term7303.getClass(), "noAppenderWarning", 0);
        setField(term7303, term7303.getClass(), "loggerContextListenerList", null);
        setField(term7303, term7303.getClass(), "loggerCache", null);
        setField(term7303, term7303.getClass(), "loggerContextRemoteView", null);
        setField(term7303, term7303.getClass(), "turboFilterList", null);
        setBooleanField(term7303, term7303.getClass(), "packagingDataEnabled", false);
        setIntField(term7303, term7303.getClass(), "maxCallerDataDepth", 8);
        setIntField(term7303, term7303.getClass(), "resetCount", 0);
        setField(term7303, term7303.getClass(), "frameworkPackages", null);
        setLongField(term7303, term7303.getClass(), "birthTime", 1786403842639L);
        setField(term7303, term7303.getClass(), "name", null);
        setField(term7303, term7303.getClass(), "sm", null);
        setField(term7303, term7303.getClass(), "propertyMap", null);
        setField(term7303, term7303.getClass(), "objectMap", null);
        setField(term7303, term7303.getClass(), "configurationLock", null);
        setField(term7303, term7303.getClass(), "scheduledExecutorService", null);
        setField(term7303, term7303.getClass(), "scheduledFutures", null);
        setField(term7303, term7303.getClass(), "lifeCycleManager", null);
        setBooleanField(term7303, term7303.getClass(), "started", false);
        setField(term7295, term7295.getClass(), "loggerContext", term7303);
        setField(term7274, term7274.getClass(), "parent", term7295);
        setField(term7311, term7311.getClass(), "lock", term7312);
        setElement(term7313, 0, term7237);
        setField(term7311, term7311.getClass(), "array", term7313);
        setField(term7274, term7274.getClass(), "childrenList", term7311);
        setField(term7274, term7274.getClass(), "aai", null);
        setBooleanField(term7274, term7274.getClass(), "additive", true);
        setField(term7274, term7274.getClass(), "loggerContext", term7303);
        setField(term7237, term7237.getClass(), "parent", term7274);
        setField(term7315, term7315.getClass(), "lock", term7316);
        setField(term7318, term7318.getClass(), "name", null);
        setField(term7318, term7318.getClass(), "level", null);
        setIntField(term7318, term7318.getClass(), "effectiveLevelInt", -2147483648);
        setField(term7318, term7318.getClass(), "parent", term7237);
        setField(term7318, term7318.getClass(), "childrenList", null);
        setField(term7318, term7318.getClass(), "aai", null);
        setBooleanField(term7318, term7318.getClass(), "additive", true);
        setField(term7318, term7318.getClass(), "loggerContext", term7303);
        setElement(term7317, 0, term7318);
        setField(term7321, term7321.getClass(), "name", null);
        setField(term7321, term7321.getClass(), "level", null);
        setIntField(term7321, term7321.getClass(), "effectiveLevelInt", -2147483648);
        setField(term7321, term7321.getClass(), "parent", term7237);
        setField(term7321, term7321.getClass(), "childrenList", null);
        setField(term7321, term7321.getClass(), "aai", null);
        setBooleanField(term7321, term7321.getClass(), "additive", true);
        setField(term7321, term7321.getClass(), "loggerContext", term7303);
        setElement(term7317, 1, term7321);
        setField(term7315, term7315.getClass(), "array", term7317);
        setField(term7237, term7237.getClass(), "childrenList", term7315);
        setField(term7237, term7237.getClass(), "aai", null);
        setBooleanField(term7237, term7237.getClass(), "additive", true);
        setField(term7237, term7237.getClass(), "loggerContext", term7303);
        setField(term7236, term7236.getClass(), "logger", term7237);
        setField(term7325, term7325.getClass(), "logger", term7321);
        setField(term7325, term7325.getClass(), "cachedClassFields", term7326);
        setField(term7325, term7325.getClass(), "cachedClassAnnotations", term7331);
        setField(term7325, term7325.getClass(), "cachedFieldAnnotations", term7336);
        setField(term7325, term7325.getClass(), "cachedPrimitiveFields", term7341);
        setField(term7325, term7325.getClass(), "this$0", term7236);
        setField(term7236, term7236.getClass(), "classCache", term7325);
        setField(term7236, term7236.getClass(), "fieldNamingStrategy", term7346);
        setField(term7236, term7236.getClass(), "attributeConvertersBySourceAndTarget", term7347);
        setField(term7236, term7236.getClass(), "attributeConvertersByClass", term7363);
        setBooleanField(term7236, term7236.getClass(), "hasClassLevelWarningSuppression", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper$SourceAndTarget");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term7236;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


