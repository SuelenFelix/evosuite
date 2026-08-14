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

public class ResponseHandlerDeviceStats_readNextNode_15724951064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11025;
     Object term11143;

    public ResponseHandlerDeviceStats_readNextNode_15724951064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11025 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats"));
        Object term11026 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11087 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11121 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11124 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term11127 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term11129 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term11137 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term11138 = newInstance(Class.forName("java.lang.Object"));
        Object[] term11139 = (Object[]) newArray("java.lang.Object", 1);
        setField(term11026, term11026.getClass(), "name", "net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        setField(term11026, term11026.getClass(), "level", null);
        setIntField(term11026, term11026.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11087, term11087.getClass(), "name", "net.vrfun.homiecenter.fritzbox");
        setField(term11087, term11087.getClass(), "level", null);
        setIntField(term11087, term11087.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11121, term11121.getClass(), "name", "");
        setField(term11121, term11121.getClass(), "level", null);
        setIntField(term11121, term11121.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11124, term11124.getClass(), "name", null);
        setField(term11124, term11124.getClass(), "level", null);
        setIntField(term11124, term11124.getClass(), "effectiveLevelInt", -2147483648);
        setField(term11124, term11124.getClass(), "parent", null);
        setField(term11124, term11124.getClass(), "childrenList", null);
        setField(term11124, term11124.getClass(), "aai", null);
        setBooleanField(term11124, term11124.getClass(), "additive", true);
        setField(term11124, term11124.getClass(), "loggerContext", null);
        setField(term11121, term11121.getClass(), "parent", term11124);
        setField(term11127, term11127.getClass(), "lock", null);
        setField(term11127, term11127.getClass(), "array", null);
        setField(term11121, term11121.getClass(), "childrenList", term11127);
        setField(term11121, term11121.getClass(), "aai", null);
        setBooleanField(term11121, term11121.getClass(), "additive", true);
        setField(term11129, term11129.getClass(), "root", null);
        setIntField(term11129, term11129.getClass(), "size", 36);
        setIntField(term11129, term11129.getClass(), "noAppenderWarning", 0);
        setField(term11129, term11129.getClass(), "loggerContextListenerList", null);
        setField(term11129, term11129.getClass(), "loggerCache", null);
        setField(term11129, term11129.getClass(), "loggerContextRemoteView", null);
        setField(term11129, term11129.getClass(), "turboFilterList", null);
        setBooleanField(term11129, term11129.getClass(), "packagingDataEnabled", false);
        setIntField(term11129, term11129.getClass(), "maxCallerDataDepth", 8);
        setIntField(term11129, term11129.getClass(), "resetCount", 0);
        setField(term11129, term11129.getClass(), "frameworkPackages", null);
        setLongField(term11129, term11129.getClass(), "birthTime", 1786403247882L);
        setField(term11129, term11129.getClass(), "name", null);
        setField(term11129, term11129.getClass(), "sm", null);
        setField(term11129, term11129.getClass(), "propertyMap", null);
        setField(term11129, term11129.getClass(), "objectMap", null);
        setField(term11129, term11129.getClass(), "configurationLock", null);
        setField(term11129, term11129.getClass(), "scheduledExecutorService", null);
        setField(term11129, term11129.getClass(), "scheduledFutures", null);
        setField(term11129, term11129.getClass(), "lifeCycleManager", null);
        setBooleanField(term11129, term11129.getClass(), "started", false);
        setField(term11121, term11121.getClass(), "loggerContext", term11129);
        setField(term11087, term11087.getClass(), "parent", term11121);
        setField(term11137, term11137.getClass(), "lock", term11138);
        setElement(term11139, 0, term11026);
        setField(term11137, term11137.getClass(), "array", term11139);
        setField(term11087, term11087.getClass(), "childrenList", term11137);
        setField(term11087, term11087.getClass(), "aai", null);
        setBooleanField(term11087, term11087.getClass(), "additive", true);
        setField(term11087, term11087.getClass(), "loggerContext", term11129);
        setField(term11026, term11026.getClass(), "parent", term11087);
        setField(term11026, term11026.getClass(), "childrenList", null);
        setField(term11026, term11026.getClass(), "aai", null);
        setBooleanField(term11026, term11026.getClass(), "additive", true);
        setField(term11026, term11026.getClass(), "loggerContext", term11129);
        setField(term11025, term11025.getClass(), "LOGGER", term11026);
        setBooleanField(term11025, term11025.getClass(), "useCaseSensitiveNames", true);
        ArrayList term11147 = new ArrayList();
        ArrayList term11152 = new ArrayList();
        ArrayList term11157 = new ArrayList();
        term11143 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term11146 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term11151 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term11156 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term11143, term11143.getClass(), "ain", "");
        setField(term11146, term11146.getClass(), "stats", term11147);
        setField(term11143, term11143.getClass(), "temperature", term11146);
        setField(term11151, term11151.getClass(), "stats", term11152);
        setField(term11143, term11143.getClass(), "power", term11151);
        setField(term11156, term11156.getClass(), "stats", term11157);
        setField(term11143, term11143.getClass(), "energy", term11156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11143;
        callMethod(klass, "readNextNode", argTypes, term11025, args);
    }

};


