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

public class ResponseHandlerDeviceStats_readNextNode_15724951062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1467;
     Object term1585;

    public ResponseHandlerDeviceStats_readNextNode_15724951062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1467 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats"));
        Object term1468 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1529 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1563 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1566 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1569 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1571 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term1579 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1580 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1581 = (Object[]) newArray("java.lang.Object", 1);
        setField(term1468, term1468.getClass(), "name", "net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        setField(term1468, term1468.getClass(), "level", null);
        setIntField(term1468, term1468.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1529, term1529.getClass(), "name", "net.vrfun.homiecenter.fritzbox");
        setField(term1529, term1529.getClass(), "level", null);
        setIntField(term1529, term1529.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1563, term1563.getClass(), "name", "");
        setField(term1563, term1563.getClass(), "level", null);
        setIntField(term1563, term1563.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1566, term1566.getClass(), "name", null);
        setField(term1566, term1566.getClass(), "level", null);
        setIntField(term1566, term1566.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1566, term1566.getClass(), "parent", null);
        setField(term1566, term1566.getClass(), "childrenList", null);
        setField(term1566, term1566.getClass(), "aai", null);
        setBooleanField(term1566, term1566.getClass(), "additive", true);
        setField(term1566, term1566.getClass(), "loggerContext", null);
        setField(term1563, term1563.getClass(), "parent", term1566);
        setField(term1569, term1569.getClass(), "lock", null);
        setField(term1569, term1569.getClass(), "array", null);
        setField(term1563, term1563.getClass(), "childrenList", term1569);
        setField(term1563, term1563.getClass(), "aai", null);
        setBooleanField(term1563, term1563.getClass(), "additive", true);
        setField(term1571, term1571.getClass(), "root", null);
        setIntField(term1571, term1571.getClass(), "size", 33);
        setIntField(term1571, term1571.getClass(), "noAppenderWarning", 0);
        setField(term1571, term1571.getClass(), "loggerContextListenerList", null);
        setField(term1571, term1571.getClass(), "loggerCache", null);
        setField(term1571, term1571.getClass(), "loggerContextRemoteView", null);
        setField(term1571, term1571.getClass(), "turboFilterList", null);
        setBooleanField(term1571, term1571.getClass(), "packagingDataEnabled", false);
        setIntField(term1571, term1571.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1571, term1571.getClass(), "resetCount", 0);
        setField(term1571, term1571.getClass(), "frameworkPackages", null);
        setLongField(term1571, term1571.getClass(), "birthTime", 1786403364665L);
        setField(term1571, term1571.getClass(), "name", null);
        setField(term1571, term1571.getClass(), "sm", null);
        setField(term1571, term1571.getClass(), "propertyMap", null);
        setField(term1571, term1571.getClass(), "objectMap", null);
        setField(term1571, term1571.getClass(), "configurationLock", null);
        setField(term1571, term1571.getClass(), "scheduledExecutorService", null);
        setField(term1571, term1571.getClass(), "scheduledFutures", null);
        setField(term1571, term1571.getClass(), "lifeCycleManager", null);
        setBooleanField(term1571, term1571.getClass(), "started", false);
        setField(term1563, term1563.getClass(), "loggerContext", term1571);
        setField(term1529, term1529.getClass(), "parent", term1563);
        setField(term1579, term1579.getClass(), "lock", term1580);
        setElement(term1581, 0, term1468);
        setField(term1579, term1579.getClass(), "array", term1581);
        setField(term1529, term1529.getClass(), "childrenList", term1579);
        setField(term1529, term1529.getClass(), "aai", null);
        setBooleanField(term1529, term1529.getClass(), "additive", true);
        setField(term1529, term1529.getClass(), "loggerContext", term1571);
        setField(term1468, term1468.getClass(), "parent", term1529);
        setField(term1468, term1468.getClass(), "childrenList", null);
        setField(term1468, term1468.getClass(), "aai", null);
        setBooleanField(term1468, term1468.getClass(), "additive", true);
        setField(term1468, term1468.getClass(), "loggerContext", term1571);
        setField(term1467, term1467.getClass(), "LOGGER", term1468);
        setBooleanField(term1467, term1467.getClass(), "useCaseSensitiveNames", true);
        ArrayList term1589 = new ArrayList();
        ArrayList term1594 = new ArrayList();
        ArrayList term1599 = new ArrayList();
        term1585 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term1588 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term1593 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term1598 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term1585, term1585.getClass(), "ain", "");
        setField(term1588, term1588.getClass(), "stats", term1589);
        setField(term1585, term1585.getClass(), "temperature", term1588);
        setField(term1593, term1593.getClass(), "stats", term1594);
        setField(term1585, term1585.getClass(), "power", term1593);
        setField(term1598, term1598.getClass(), "stats", term1599);
        setField(term1585, term1585.getClass(), "energy", term1598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1585;
        callMethod(klass, "readNextNode", argTypes, term1467, args);
    }

};


