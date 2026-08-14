package net.vrfun.homiecenter.fritzbox;

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
import static net.vrfun.homiecenter.fritzbox.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ResponseHandlerDeviceStats_createIntegerValues_19262657156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11458;

    public ResponseHandlerDeviceStats_createIntegerValues_19262657156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11458 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats"));
        Object term11459 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11520 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11554 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11557 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11560 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term11562 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term11570 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term11571 = newInstance(Class.forName("java.lang.Object"));
        Object[] term11572 = (Object[]) newArray("java.lang.Object", 1);
        setField(term11459, term11459.getClass(), "name", "net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        setField(term11459, term11459.getClass(), "level", null);
        setIntField(term11459, term11459.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11520, term11520.getClass(), "name", "net.vrfun.homiecenter.fritzbox");
        setField(term11520, term11520.getClass(), "level", null);
        setIntField(term11520, term11520.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11554, term11554.getClass(), "name", "");
        setField(term11554, term11554.getClass(), "level", null);
        setIntField(term11554, term11554.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11557, term11557.getClass(), "name", null);
        setField(term11557, term11557.getClass(), "level", null);
        setIntField(term11557, term11557.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11557, term11557.getClass(), "parent", null);
        setField(term11557, term11557.getClass(), "childrenList", null);
        setField(term11557, term11557.getClass(), "aai", null);
        setBooleanField(term11557, term11557.getClass(), "additive", true);
        setField(term11557, term11557.getClass(), "loggerContext", null);
        setField(term11554, term11554.getClass(), "parent", term11557);
        setField(term11560, term11560.getClass(), "lock", null);
        setField(term11560, term11560.getClass(), "array", null);
        setField(term11554, term11554.getClass(), "childrenList", term11560);
        setField(term11554, term11554.getClass(), "aai", null);
        setBooleanField(term11554, term11554.getClass(), "additive", true);
        setField(term11562, term11562.getClass(), "root", null);
        setIntField(term11562, term11562.getClass(), "size", 36);
        setIntField(term11562, term11562.getClass(), "noAppenderWarning", 0);
        setField(term11562, term11562.getClass(), "loggerContextListenerList", null);
        setField(term11562, term11562.getClass(), "loggerCache", null);
        setField(term11562, term11562.getClass(), "loggerContextRemoteView", null);
        setField(term11562, term11562.getClass(), "turboFilterList", null);
        setBooleanField(term11562, term11562.getClass(), "packagingDataEnabled", false);
        setIntField(term11562, term11562.getClass(), "maxCallerDataDepth", 8);
        setIntField(term11562, term11562.getClass(), "resetCount", 0);
        setField(term11562, term11562.getClass(), "frameworkPackages", null);
        setLongField(term11562, term11562.getClass(), "birthTime", 1786403247882L);
        setField(term11562, term11562.getClass(), "name", null);
        setField(term11562, term11562.getClass(), "sm", null);
        setField(term11562, term11562.getClass(), "propertyMap", null);
        setField(term11562, term11562.getClass(), "objectMap", null);
        setField(term11562, term11562.getClass(), "configurationLock", null);
        setField(term11562, term11562.getClass(), "scheduledExecutorService", null);
        setField(term11562, term11562.getClass(), "scheduledFutures", null);
        setField(term11562, term11562.getClass(), "lifeCycleManager", null);
        setBooleanField(term11562, term11562.getClass(), "started", false);
        setField(term11554, term11554.getClass(), "loggerContext", term11562);
        setField(term11520, term11520.getClass(), "parent", term11554);
        setField(term11570, term11570.getClass(), "lock", term11571);
        setElement(term11572, 0, term11459);
        setField(term11570, term11570.getClass(), "array", term11572);
        setField(term11520, term11520.getClass(), "childrenList", term11570);
        setField(term11520, term11520.getClass(), "aai", null);
        setBooleanField(term11520, term11520.getClass(), "additive", true);
        setField(term11520, term11520.getClass(), "loggerContext", term11562);
        setField(term11459, term11459.getClass(), "parent", term11520);
        setField(term11459, term11459.getClass(), "childrenList", null);
        setField(term11459, term11459.getClass(), "aai", null);
        setBooleanField(term11459, term11459.getClass(), "additive", true);
        setField(term11459, term11459.getClass(), "loggerContext", term11562);
        setField(term11458, term11458.getClass(), "LOGGER", term11459);
        setBooleanField(term11458, term11458.getClass(), "useCaseSensitiveNames", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uXYcXVYJZM";
        callMethod(klass, "createIntegerValues", argTypes, term11458, args);
    }

};


