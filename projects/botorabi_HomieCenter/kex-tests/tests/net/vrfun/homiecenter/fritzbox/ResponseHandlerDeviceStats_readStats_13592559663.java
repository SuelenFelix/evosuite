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

public class ResponseHandlerDeviceStats_readStats_13592559663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1690;
     Object term1808;

    public ResponseHandlerDeviceStats_readStats_13592559663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1690 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats"));
        Object term1691 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1752 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1786 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1789 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1792 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1794 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term1802 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1803 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1804 = (Object[]) newArray("java.lang.Object", 1);
        setField(term1691, term1691.getClass(), "name", "net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        setField(term1691, term1691.getClass(), "level", null);
        setIntField(term1691, term1691.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1752, term1752.getClass(), "name", "net.vrfun.homiecenter.fritzbox");
        setField(term1752, term1752.getClass(), "level", null);
        setIntField(term1752, term1752.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1786, term1786.getClass(), "name", "");
        setField(term1786, term1786.getClass(), "level", null);
        setIntField(term1786, term1786.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1789, term1789.getClass(), "name", null);
        setField(term1789, term1789.getClass(), "level", null);
        setIntField(term1789, term1789.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1789, term1789.getClass(), "parent", null);
        setField(term1789, term1789.getClass(), "childrenList", null);
        setField(term1789, term1789.getClass(), "aai", null);
        setBooleanField(term1789, term1789.getClass(), "additive", true);
        setField(term1789, term1789.getClass(), "loggerContext", null);
        setField(term1786, term1786.getClass(), "parent", term1789);
        setField(term1792, term1792.getClass(), "lock", null);
        setField(term1792, term1792.getClass(), "array", null);
        setField(term1786, term1786.getClass(), "childrenList", term1792);
        setField(term1786, term1786.getClass(), "aai", null);
        setBooleanField(term1786, term1786.getClass(), "additive", true);
        setField(term1794, term1794.getClass(), "root", null);
        setIntField(term1794, term1794.getClass(), "size", 33);
        setIntField(term1794, term1794.getClass(), "noAppenderWarning", 0);
        setField(term1794, term1794.getClass(), "loggerContextListenerList", null);
        setField(term1794, term1794.getClass(), "loggerCache", null);
        setField(term1794, term1794.getClass(), "loggerContextRemoteView", null);
        setField(term1794, term1794.getClass(), "turboFilterList", null);
        setBooleanField(term1794, term1794.getClass(), "packagingDataEnabled", false);
        setIntField(term1794, term1794.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1794, term1794.getClass(), "resetCount", 0);
        setField(term1794, term1794.getClass(), "frameworkPackages", null);
        setLongField(term1794, term1794.getClass(), "birthTime", 1786403364665L);
        setField(term1794, term1794.getClass(), "name", null);
        setField(term1794, term1794.getClass(), "sm", null);
        setField(term1794, term1794.getClass(), "propertyMap", null);
        setField(term1794, term1794.getClass(), "objectMap", null);
        setField(term1794, term1794.getClass(), "configurationLock", null);
        setField(term1794, term1794.getClass(), "scheduledExecutorService", null);
        setField(term1794, term1794.getClass(), "scheduledFutures", null);
        setField(term1794, term1794.getClass(), "lifeCycleManager", null);
        setBooleanField(term1794, term1794.getClass(), "started", false);
        setField(term1786, term1786.getClass(), "loggerContext", term1794);
        setField(term1752, term1752.getClass(), "parent", term1786);
        setField(term1802, term1802.getClass(), "lock", term1803);
        setElement(term1804, 0, term1691);
        setField(term1802, term1802.getClass(), "array", term1804);
        setField(term1752, term1752.getClass(), "childrenList", term1802);
        setField(term1752, term1752.getClass(), "aai", null);
        setBooleanField(term1752, term1752.getClass(), "additive", true);
        setField(term1752, term1752.getClass(), "loggerContext", term1794);
        setField(term1691, term1691.getClass(), "parent", term1752);
        setField(term1691, term1691.getClass(), "childrenList", null);
        setField(term1691, term1691.getClass(), "aai", null);
        setBooleanField(term1691, term1691.getClass(), "additive", true);
        setField(term1691, term1691.getClass(), "loggerContext", term1794);
        setField(term1690, term1690.getClass(), "LOGGER", term1691);
        setBooleanField(term1690, term1690.getClass(), "useCaseSensitiveNames", true);
        ArrayList term1809 = new ArrayList();
        term1808 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term1808, term1808.getClass(), "stats", term1809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1808;
        callMethod(klass, "readStats", argTypes, term1690, args);
    }

};


