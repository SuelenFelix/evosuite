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

public class ResponseHandlerDeviceStats_createIntegerValues_19262657154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1900;

    public ResponseHandlerDeviceStats_createIntegerValues_19262657154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1900 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats"));
        Object term1901 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1962 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1996 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1999 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2002 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2004 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term2012 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2013 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2014 = (Object[]) newArray("java.lang.Object", 1);
        setField(term1901, term1901.getClass(), "name", "net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        setField(term1901, term1901.getClass(), "level", null);
        setIntField(term1901, term1901.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1962, term1962.getClass(), "name", "net.vrfun.homiecenter.fritzbox");
        setField(term1962, term1962.getClass(), "level", null);
        setIntField(term1962, term1962.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1996, term1996.getClass(), "name", "");
        setField(term1996, term1996.getClass(), "level", null);
        setIntField(term1996, term1996.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1999, term1999.getClass(), "name", null);
        setField(term1999, term1999.getClass(), "level", null);
        setIntField(term1999, term1999.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1999, term1999.getClass(), "parent", null);
        setField(term1999, term1999.getClass(), "childrenList", null);
        setField(term1999, term1999.getClass(), "aai", null);
        setBooleanField(term1999, term1999.getClass(), "additive", true);
        setField(term1999, term1999.getClass(), "loggerContext", null);
        setField(term1996, term1996.getClass(), "parent", term1999);
        setField(term2002, term2002.getClass(), "lock", null);
        setField(term2002, term2002.getClass(), "array", null);
        setField(term1996, term1996.getClass(), "childrenList", term2002);
        setField(term1996, term1996.getClass(), "aai", null);
        setBooleanField(term1996, term1996.getClass(), "additive", true);
        setField(term2004, term2004.getClass(), "root", null);
        setIntField(term2004, term2004.getClass(), "size", 33);
        setIntField(term2004, term2004.getClass(), "noAppenderWarning", 0);
        setField(term2004, term2004.getClass(), "loggerContextListenerList", null);
        setField(term2004, term2004.getClass(), "loggerCache", null);
        setField(term2004, term2004.getClass(), "loggerContextRemoteView", null);
        setField(term2004, term2004.getClass(), "turboFilterList", null);
        setBooleanField(term2004, term2004.getClass(), "packagingDataEnabled", false);
        setIntField(term2004, term2004.getClass(), "maxCallerDataDepth", 8);
        setIntField(term2004, term2004.getClass(), "resetCount", 0);
        setField(term2004, term2004.getClass(), "frameworkPackages", null);
        setLongField(term2004, term2004.getClass(), "birthTime", 1786403364665L);
        setField(term2004, term2004.getClass(), "name", null);
        setField(term2004, term2004.getClass(), "sm", null);
        setField(term2004, term2004.getClass(), "propertyMap", null);
        setField(term2004, term2004.getClass(), "objectMap", null);
        setField(term2004, term2004.getClass(), "configurationLock", null);
        setField(term2004, term2004.getClass(), "scheduledExecutorService", null);
        setField(term2004, term2004.getClass(), "scheduledFutures", null);
        setField(term2004, term2004.getClass(), "lifeCycleManager", null);
        setBooleanField(term2004, term2004.getClass(), "started", false);
        setField(term1996, term1996.getClass(), "loggerContext", term2004);
        setField(term1962, term1962.getClass(), "parent", term1996);
        setField(term2012, term2012.getClass(), "lock", term2013);
        setElement(term2014, 0, term1901);
        setField(term2012, term2012.getClass(), "array", term2014);
        setField(term1962, term1962.getClass(), "childrenList", term2012);
        setField(term1962, term1962.getClass(), "aai", null);
        setBooleanField(term1962, term1962.getClass(), "additive", true);
        setField(term1962, term1962.getClass(), "loggerContext", term2004);
        setField(term1901, term1901.getClass(), "parent", term1962);
        setField(term1901, term1901.getClass(), "childrenList", null);
        setField(term1901, term1901.getClass(), "aai", null);
        setBooleanField(term1901, term1901.getClass(), "additive", true);
        setField(term1901, term1901.getClass(), "loggerContext", term2004);
        setField(term1900, term1900.getClass(), "LOGGER", term1901);
        setBooleanField(term1900, term1900.getClass(), "useCaseSensitiveNames", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWKQODBLzb";
        callMethod(klass, "createIntegerValues", argTypes, term1900, args);
    }

};


