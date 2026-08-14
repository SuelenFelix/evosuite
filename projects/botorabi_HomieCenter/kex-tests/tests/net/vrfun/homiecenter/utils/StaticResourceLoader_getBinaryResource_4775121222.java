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

public class StaticResourceLoader_getBinaryResource_4775121222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203;

    public StaticResourceLoader_getBinaryResource_4775121222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203 = newInstance(Class.forName("net.vrfun.homiecenter.utils.StaticResourceLoader"));
        Object term204 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term256 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term287 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term290 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term293 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term295 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term303 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term304 = newInstance(Class.forName("java.lang.Object"));
        Object[] term305 = (Object[]) newArray("java.lang.Object", 1);
        setField(term204, term204.getClass(), "name", "net.vrfun.homiecenter.utils.StaticResourceLoader");
        setField(term204, term204.getClass(), "level", null);
        setIntField(term204, term204.getClass(), "effectiveLevelInt", -2147483648);
        setField(term256, term256.getClass(), "name", "net.vrfun.homiecenter.utils");
        setField(term256, term256.getClass(), "level", null);
        setIntField(term256, term256.getClass(), "effectiveLevelInt", -2147483648);
        setField(term287, term287.getClass(), "name", "");
        setField(term287, term287.getClass(), "level", null);
        setIntField(term287, term287.getClass(), "effectiveLevelInt", -2147483648);
        setField(term290, term290.getClass(), "name", null);
        setField(term290, term290.getClass(), "level", null);
        setIntField(term290, term290.getClass(), "effectiveLevelInt", -2147483648);
        setField(term290, term290.getClass(), "parent", null);
        setField(term290, term290.getClass(), "childrenList", null);
        setField(term290, term290.getClass(), "aai", null);
        setBooleanField(term290, term290.getClass(), "additive", true);
        setField(term290, term290.getClass(), "loggerContext", null);
        setField(term287, term287.getClass(), "parent", term290);
        setField(term293, term293.getClass(), "lock", null);
        setField(term293, term293.getClass(), "array", null);
        setField(term287, term287.getClass(), "childrenList", term293);
        setField(term287, term287.getClass(), "aai", null);
        setBooleanField(term287, term287.getClass(), "additive", true);
        setField(term295, term295.getClass(), "root", null);
        setIntField(term295, term295.getClass(), "size", 31);
        setIntField(term295, term295.getClass(), "noAppenderWarning", 0);
        setField(term295, term295.getClass(), "loggerContextListenerList", null);
        setField(term295, term295.getClass(), "loggerCache", null);
        setField(term295, term295.getClass(), "loggerContextRemoteView", null);
        setField(term295, term295.getClass(), "turboFilterList", null);
        setBooleanField(term295, term295.getClass(), "packagingDataEnabled", false);
        setIntField(term295, term295.getClass(), "maxCallerDataDepth", 8);
        setIntField(term295, term295.getClass(), "resetCount", 0);
        setField(term295, term295.getClass(), "frameworkPackages", null);
        setLongField(term295, term295.getClass(), "birthTime", 1786404001425L);
        setField(term295, term295.getClass(), "name", null);
        setField(term295, term295.getClass(), "sm", null);
        setField(term295, term295.getClass(), "propertyMap", null);
        setField(term295, term295.getClass(), "objectMap", null);
        setField(term295, term295.getClass(), "configurationLock", null);
        setField(term295, term295.getClass(), "scheduledExecutorService", null);
        setField(term295, term295.getClass(), "scheduledFutures", null);
        setField(term295, term295.getClass(), "lifeCycleManager", null);
        setBooleanField(term295, term295.getClass(), "started", false);
        setField(term287, term287.getClass(), "loggerContext", term295);
        setField(term256, term256.getClass(), "parent", term287);
        setField(term303, term303.getClass(), "lock", term304);
        setElement(term305, 0, term204);
        setField(term303, term303.getClass(), "array", term305);
        setField(term256, term256.getClass(), "childrenList", term303);
        setField(term256, term256.getClass(), "aai", null);
        setBooleanField(term256, term256.getClass(), "additive", true);
        setField(term256, term256.getClass(), "loggerContext", term295);
        setField(term204, term204.getClass(), "parent", term256);
        setField(term204, term204.getClass(), "childrenList", null);
        setField(term204, term204.getClass(), "aai", null);
        setBooleanField(term204, term204.getClass(), "additive", true);
        setField(term204, term204.getClass(), "loggerContext", term295);
        setField(term203, term203.getClass(), "LOGGER", term204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.utils.StaticResourceLoader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        callMethod(klass, "getBinaryResource", argTypes, term203, args);
    }

};


