package net.vrfun.homiecenter.utils;

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
import static net.vrfun.homiecenter.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StaticResourceLoader_getTextResource_10027712171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public StaticResourceLoader_getTextResource_10027712171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("net.vrfun.homiecenter.utils.StaticResourceLoader"));
        Object term2 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term54 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term85 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term88 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term91 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term93 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term101 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term102 = newInstance(Class.forName("java.lang.Object"));
        Object[] term103 = (Object[]) newArray("java.lang.Object", 1);
        setField(term2, term2.getClass(), "name", "net.vrfun.homiecenter.utils.StaticResourceLoader");
        setField(term2, term2.getClass(), "level", null);
        setIntField(term2, term2.getClass(), "effectiveLevelInt", -2147483648);
        setField(term54, term54.getClass(), "name", "net.vrfun.homiecenter.utils");
        setField(term54, term54.getClass(), "level", null);
        setIntField(term54, term54.getClass(), "effectiveLevelInt", -2147483648);
        setField(term85, term85.getClass(), "name", "");
        setField(term85, term85.getClass(), "level", null);
        setIntField(term85, term85.getClass(), "effectiveLevelInt", -2147483648);
        setField(term88, term88.getClass(), "name", null);
        setField(term88, term88.getClass(), "level", null);
        setIntField(term88, term88.getClass(), "effectiveLevelInt", -2147483648);
        setField(term88, term88.getClass(), "parent", null);
        setField(term88, term88.getClass(), "childrenList", null);
        setField(term88, term88.getClass(), "aai", null);
        setBooleanField(term88, term88.getClass(), "additive", true);
        setField(term88, term88.getClass(), "loggerContext", null);
        setField(term85, term85.getClass(), "parent", term88);
        setField(term91, term91.getClass(), "lock", null);
        setField(term91, term91.getClass(), "array", null);
        setField(term85, term85.getClass(), "childrenList", term91);
        setField(term85, term85.getClass(), "aai", null);
        setBooleanField(term85, term85.getClass(), "additive", true);
        setField(term93, term93.getClass(), "root", null);
        setIntField(term93, term93.getClass(), "size", 31);
        setIntField(term93, term93.getClass(), "noAppenderWarning", 0);
        setField(term93, term93.getClass(), "loggerContextListenerList", null);
        setField(term93, term93.getClass(), "loggerCache", null);
        setField(term93, term93.getClass(), "loggerContextRemoteView", null);
        setField(term93, term93.getClass(), "turboFilterList", null);
        setBooleanField(term93, term93.getClass(), "packagingDataEnabled", false);
        setIntField(term93, term93.getClass(), "maxCallerDataDepth", 8);
        setIntField(term93, term93.getClass(), "resetCount", 0);
        setField(term93, term93.getClass(), "frameworkPackages", null);
        setLongField(term93, term93.getClass(), "birthTime", 1786404001425L);
        setField(term93, term93.getClass(), "name", null);
        setField(term93, term93.getClass(), "sm", null);
        setField(term93, term93.getClass(), "propertyMap", null);
        setField(term93, term93.getClass(), "objectMap", null);
        setField(term93, term93.getClass(), "configurationLock", null);
        setField(term93, term93.getClass(), "scheduledExecutorService", null);
        setField(term93, term93.getClass(), "scheduledFutures", null);
        setField(term93, term93.getClass(), "lifeCycleManager", null);
        setBooleanField(term93, term93.getClass(), "started", false);
        setField(term85, term85.getClass(), "loggerContext", term93);
        setField(term54, term54.getClass(), "parent", term85);
        setField(term101, term101.getClass(), "lock", term102);
        setElement(term103, 0, term2);
        setField(term101, term101.getClass(), "array", term103);
        setField(term54, term54.getClass(), "childrenList", term101);
        setField(term54, term54.getClass(), "aai", null);
        setBooleanField(term54, term54.getClass(), "additive", true);
        setField(term54, term54.getClass(), "loggerContext", term93);
        setField(term2, term2.getClass(), "parent", term54);
        setField(term2, term2.getClass(), "childrenList", null);
        setField(term2, term2.getClass(), "aai", null);
        setBooleanField(term2, term2.getClass(), "additive", true);
        setField(term2, term2.getClass(), "loggerContext", term93);
        setField(term1, term1.getClass(), "LOGGER", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.utils.StaticResourceLoader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "getTextResource", argTypes, term1, args);
    }

};


