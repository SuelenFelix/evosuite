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

public class ResponseHandlerDeviceStats_readStats_13592559665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11248;
     Object term11366;

    public ResponseHandlerDeviceStats_readStats_13592559665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11248 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats"));
        Object term11249 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11310 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11344 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11347 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11350 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term11352 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term11360 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term11361 = newInstance(Class.forName("java.lang.Object"));
        Object[] term11362 = (Object[]) newArray("java.lang.Object", 1);
        setField(term11249, term11249.getClass(), "name", "net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        setField(term11249, term11249.getClass(), "level", null);
        setIntField(term11249, term11249.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11310, term11310.getClass(), "name", "net.vrfun.homiecenter.fritzbox");
        setField(term11310, term11310.getClass(), "level", null);
        setIntField(term11310, term11310.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11344, term11344.getClass(), "name", "");
        setField(term11344, term11344.getClass(), "level", null);
        setIntField(term11344, term11344.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11347, term11347.getClass(), "name", null);
        setField(term11347, term11347.getClass(), "level", null);
        setIntField(term11347, term11347.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11347, term11347.getClass(), "parent", null);
        setField(term11347, term11347.getClass(), "childrenList", null);
        setField(term11347, term11347.getClass(), "aai", null);
        setBooleanField(term11347, term11347.getClass(), "additive", true);
        setField(term11347, term11347.getClass(), "loggerContext", null);
        setField(term11344, term11344.getClass(), "parent", term11347);
        setField(term11350, term11350.getClass(), "lock", null);
        setField(term11350, term11350.getClass(), "array", null);
        setField(term11344, term11344.getClass(), "childrenList", term11350);
        setField(term11344, term11344.getClass(), "aai", null);
        setBooleanField(term11344, term11344.getClass(), "additive", true);
        setField(term11352, term11352.getClass(), "root", null);
        setIntField(term11352, term11352.getClass(), "size", 36);
        setIntField(term11352, term11352.getClass(), "noAppenderWarning", 0);
        setField(term11352, term11352.getClass(), "loggerContextListenerList", null);
        setField(term11352, term11352.getClass(), "loggerCache", null);
        setField(term11352, term11352.getClass(), "loggerContextRemoteView", null);
        setField(term11352, term11352.getClass(), "turboFilterList", null);
        setBooleanField(term11352, term11352.getClass(), "packagingDataEnabled", false);
        setIntField(term11352, term11352.getClass(), "maxCallerDataDepth", 8);
        setIntField(term11352, term11352.getClass(), "resetCount", 0);
        setField(term11352, term11352.getClass(), "frameworkPackages", null);
        setLongField(term11352, term11352.getClass(), "birthTime", 1786403247882L);
        setField(term11352, term11352.getClass(), "name", null);
        setField(term11352, term11352.getClass(), "sm", null);
        setField(term11352, term11352.getClass(), "propertyMap", null);
        setField(term11352, term11352.getClass(), "objectMap", null);
        setField(term11352, term11352.getClass(), "configurationLock", null);
        setField(term11352, term11352.getClass(), "scheduledExecutorService", null);
        setField(term11352, term11352.getClass(), "scheduledFutures", null);
        setField(term11352, term11352.getClass(), "lifeCycleManager", null);
        setBooleanField(term11352, term11352.getClass(), "started", false);
        setField(term11344, term11344.getClass(), "loggerContext", term11352);
        setField(term11310, term11310.getClass(), "parent", term11344);
        setField(term11360, term11360.getClass(), "lock", term11361);
        setElement(term11362, 0, term11249);
        setField(term11360, term11360.getClass(), "array", term11362);
        setField(term11310, term11310.getClass(), "childrenList", term11360);
        setField(term11310, term11310.getClass(), "aai", null);
        setBooleanField(term11310, term11310.getClass(), "additive", true);
        setField(term11310, term11310.getClass(), "loggerContext", term11352);
        setField(term11249, term11249.getClass(), "parent", term11310);
        setField(term11249, term11249.getClass(), "childrenList", null);
        setField(term11249, term11249.getClass(), "aai", null);
        setBooleanField(term11249, term11249.getClass(), "additive", true);
        setField(term11249, term11249.getClass(), "loggerContext", term11352);
        setField(term11248, term11248.getClass(), "LOGGER", term11249);
        setBooleanField(term11248, term11248.getClass(), "useCaseSensitiveNames", false);
        ArrayList term11367 = new ArrayList();
        term11366 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term11366, term11366.getClass(), "stats", term11367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11366;
        callMethod(klass, "readStats", argTypes, term11248, args);
    }

};


