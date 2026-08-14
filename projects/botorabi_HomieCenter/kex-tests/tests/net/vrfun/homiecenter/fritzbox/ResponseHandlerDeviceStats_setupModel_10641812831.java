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

public class ResponseHandlerDeviceStats_setupModel_10641812831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1244;
     Object term1362;

    public ResponseHandlerDeviceStats_setupModel_10641812831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1244 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats"));
        Object term1245 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1306 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1340 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1343 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1346 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1348 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term1356 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1357 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1358 = (Object[]) newArray("java.lang.Object", 1);
        setField(term1245, term1245.getClass(), "name", "net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        setField(term1245, term1245.getClass(), "level", null);
        setIntField(term1245, term1245.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1306, term1306.getClass(), "name", "net.vrfun.homiecenter.fritzbox");
        setField(term1306, term1306.getClass(), "level", null);
        setIntField(term1306, term1306.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1340, term1340.getClass(), "name", "");
        setField(term1340, term1340.getClass(), "level", null);
        setIntField(term1340, term1340.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1343, term1343.getClass(), "name", null);
        setField(term1343, term1343.getClass(), "level", null);
        setIntField(term1343, term1343.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1343, term1343.getClass(), "parent", null);
        setField(term1343, term1343.getClass(), "childrenList", null);
        setField(term1343, term1343.getClass(), "aai", null);
        setBooleanField(term1343, term1343.getClass(), "additive", true);
        setField(term1343, term1343.getClass(), "loggerContext", null);
        setField(term1340, term1340.getClass(), "parent", term1343);
        setField(term1346, term1346.getClass(), "lock", null);
        setField(term1346, term1346.getClass(), "array", null);
        setField(term1340, term1340.getClass(), "childrenList", term1346);
        setField(term1340, term1340.getClass(), "aai", null);
        setBooleanField(term1340, term1340.getClass(), "additive", true);
        setField(term1348, term1348.getClass(), "root", null);
        setIntField(term1348, term1348.getClass(), "size", 33);
        setIntField(term1348, term1348.getClass(), "noAppenderWarning", 0);
        setField(term1348, term1348.getClass(), "loggerContextListenerList", null);
        setField(term1348, term1348.getClass(), "loggerCache", null);
        setField(term1348, term1348.getClass(), "loggerContextRemoteView", null);
        setField(term1348, term1348.getClass(), "turboFilterList", null);
        setBooleanField(term1348, term1348.getClass(), "packagingDataEnabled", false);
        setIntField(term1348, term1348.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1348, term1348.getClass(), "resetCount", 0);
        setField(term1348, term1348.getClass(), "frameworkPackages", null);
        setLongField(term1348, term1348.getClass(), "birthTime", 1786403364665L);
        setField(term1348, term1348.getClass(), "name", null);
        setField(term1348, term1348.getClass(), "sm", null);
        setField(term1348, term1348.getClass(), "propertyMap", null);
        setField(term1348, term1348.getClass(), "objectMap", null);
        setField(term1348, term1348.getClass(), "configurationLock", null);
        setField(term1348, term1348.getClass(), "scheduledExecutorService", null);
        setField(term1348, term1348.getClass(), "scheduledFutures", null);
        setField(term1348, term1348.getClass(), "lifeCycleManager", null);
        setBooleanField(term1348, term1348.getClass(), "started", false);
        setField(term1340, term1340.getClass(), "loggerContext", term1348);
        setField(term1306, term1306.getClass(), "parent", term1340);
        setField(term1356, term1356.getClass(), "lock", term1357);
        setElement(term1358, 0, term1245);
        setField(term1356, term1356.getClass(), "array", term1358);
        setField(term1306, term1306.getClass(), "childrenList", term1356);
        setField(term1306, term1306.getClass(), "aai", null);
        setBooleanField(term1306, term1306.getClass(), "additive", true);
        setField(term1306, term1306.getClass(), "loggerContext", term1348);
        setField(term1245, term1245.getClass(), "parent", term1306);
        setField(term1245, term1245.getClass(), "childrenList", null);
        setField(term1245, term1245.getClass(), "aai", null);
        setBooleanField(term1245, term1245.getClass(), "additive", true);
        setField(term1245, term1245.getClass(), "loggerContext", term1348);
        setField(term1244, term1244.getClass(), "LOGGER", term1245);
        setBooleanField(term1244, term1244.getClass(), "useCaseSensitiveNames", false);
        ArrayList term1366 = new ArrayList();
        ArrayList term1371 = new ArrayList();
        ArrayList term1376 = new ArrayList();
        term1362 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term1365 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term1370 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term1375 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term1362, term1362.getClass(), "ain", "");
        setField(term1365, term1365.getClass(), "stats", term1366);
        setField(term1362, term1362.getClass(), "temperature", term1365);
        setField(term1370, term1370.getClass(), "stats", term1371);
        setField(term1362, term1362.getClass(), "power", term1370);
        setField(term1375, term1375.getClass(), "stats", term1376);
        setField(term1362, term1362.getClass(), "energy", term1375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1362;
        callMethod(klass, "setupModel", argTypes, term1244, args);
    }

};


