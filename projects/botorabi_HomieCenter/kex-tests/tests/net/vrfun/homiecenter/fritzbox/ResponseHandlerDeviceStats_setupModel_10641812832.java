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
import java.util.ArrayList;

public class ResponseHandlerDeviceStats_setupModel_10641812832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10800;
     Object term10918;

    public ResponseHandlerDeviceStats_setupModel_10641812832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10800 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats"));
        Object term10801 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10862 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10896 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10899 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10902 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term10904 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term10912 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term10913 = newInstance(Class.forName("java.lang.Object"));
        Object[] term10914 = (Object[]) newArray("java.lang.Object", 1);
        setField(term10801, term10801.getClass(), "name", "net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        setField(term10801, term10801.getClass(), "level", null);
        setIntField(term10801, term10801.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10862, term10862.getClass(), "name", "net.vrfun.homiecenter.fritzbox");
        setField(term10862, term10862.getClass(), "level", null);
        setIntField(term10862, term10862.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10896, term10896.getClass(), "name", "");
        setField(term10896, term10896.getClass(), "level", null);
        setIntField(term10896, term10896.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10899, term10899.getClass(), "name", null);
        setField(term10899, term10899.getClass(), "level", null);
        setIntField(term10899, term10899.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10899, term10899.getClass(), "parent", null);
        setField(term10899, term10899.getClass(), "childrenList", null);
        setField(term10899, term10899.getClass(), "aai", null);
        setBooleanField(term10899, term10899.getClass(), "additive", true);
        setField(term10899, term10899.getClass(), "loggerContext", null);
        setField(term10896, term10896.getClass(), "parent", term10899);
        setField(term10902, term10902.getClass(), "lock", null);
        setField(term10902, term10902.getClass(), "array", null);
        setField(term10896, term10896.getClass(), "childrenList", term10902);
        setField(term10896, term10896.getClass(), "aai", null);
        setBooleanField(term10896, term10896.getClass(), "additive", true);
        setField(term10904, term10904.getClass(), "root", null);
        setIntField(term10904, term10904.getClass(), "size", 36);
        setIntField(term10904, term10904.getClass(), "noAppenderWarning", 0);
        setField(term10904, term10904.getClass(), "loggerContextListenerList", null);
        setField(term10904, term10904.getClass(), "loggerCache", null);
        setField(term10904, term10904.getClass(), "loggerContextRemoteView", null);
        setField(term10904, term10904.getClass(), "turboFilterList", null);
        setBooleanField(term10904, term10904.getClass(), "packagingDataEnabled", false);
        setIntField(term10904, term10904.getClass(), "maxCallerDataDepth", 8);
        setIntField(term10904, term10904.getClass(), "resetCount", 0);
        setField(term10904, term10904.getClass(), "frameworkPackages", null);
        setLongField(term10904, term10904.getClass(), "birthTime", 1786403247882L);
        setField(term10904, term10904.getClass(), "name", null);
        setField(term10904, term10904.getClass(), "sm", null);
        setField(term10904, term10904.getClass(), "propertyMap", null);
        setField(term10904, term10904.getClass(), "objectMap", null);
        setField(term10904, term10904.getClass(), "configurationLock", null);
        setField(term10904, term10904.getClass(), "scheduledExecutorService", null);
        setField(term10904, term10904.getClass(), "scheduledFutures", null);
        setField(term10904, term10904.getClass(), "lifeCycleManager", null);
        setBooleanField(term10904, term10904.getClass(), "started", false);
        setField(term10896, term10896.getClass(), "loggerContext", term10904);
        setField(term10862, term10862.getClass(), "parent", term10896);
        setField(term10912, term10912.getClass(), "lock", term10913);
        setElement(term10914, 0, term10801);
        setField(term10912, term10912.getClass(), "array", term10914);
        setField(term10862, term10862.getClass(), "childrenList", term10912);
        setField(term10862, term10862.getClass(), "aai", null);
        setBooleanField(term10862, term10862.getClass(), "additive", true);
        setField(term10862, term10862.getClass(), "loggerContext", term10904);
        setField(term10801, term10801.getClass(), "parent", term10862);
        setField(term10801, term10801.getClass(), "childrenList", null);
        setField(term10801, term10801.getClass(), "aai", null);
        setBooleanField(term10801, term10801.getClass(), "additive", true);
        setField(term10801, term10801.getClass(), "loggerContext", term10904);
        setField(term10800, term10800.getClass(), "LOGGER", term10801);
        setBooleanField(term10800, term10800.getClass(), "useCaseSensitiveNames", true);
        ArrayList term10922 = new ArrayList();
        ArrayList term10927 = new ArrayList();
        ArrayList term10932 = new ArrayList();
        term10918 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term10921 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term10926 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term10931 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term10918, term10918.getClass(), "ain", "");
        setField(term10921, term10921.getClass(), "stats", term10922);
        setField(term10918, term10918.getClass(), "temperature", term10921);
        setField(term10926, term10926.getClass(), "stats", term10927);
        setField(term10918, term10918.getClass(), "power", term10926);
        setField(term10931, term10931.getClass(), "stats", term10932);
        setField(term10918, term10918.getClass(), "energy", term10931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10918;
        callMethod(klass, "setupModel", argTypes, term10800, args);
    }

};


