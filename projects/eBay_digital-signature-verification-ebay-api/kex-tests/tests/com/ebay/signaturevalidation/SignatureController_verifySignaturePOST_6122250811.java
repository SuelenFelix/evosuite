package com.ebay.signaturevalidation;

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
import static com.ebay.signaturevalidation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SignatureController_verifySignaturePOST_6122250811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;

    public SignatureController_verifySignaturePOST_6122250811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("com.ebay.signaturevalidation.SignatureController"));
        Object term114 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term166 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term198 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term201 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term204 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term206 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term214 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term215 = newInstance(Class.forName("java.lang.Object"));
        Object[] term216 = (Object[]) newArray("java.lang.Object", 1);
        setField(term114, term114.getClass(), "name", "com.ebay.signaturevalidation.SignatureController");
        setField(term114, term114.getClass(), "level", null);
        setIntField(term114, term114.getClass(), "effectiveLevelInt", -2147483648);
        setField(term166, term166.getClass(), "name", "com.ebay.signaturevalidation");
        setField(term166, term166.getClass(), "level", null);
        setIntField(term166, term166.getClass(), "effectiveLevelInt", -2147483648);
        setField(term198, term198.getClass(), "name", "");
        setField(term198, term198.getClass(), "level", null);
        setIntField(term198, term198.getClass(), "effectiveLevelInt", -2147483648);
        setField(term201, term201.getClass(), "name", null);
        setField(term201, term201.getClass(), "level", null);
        setIntField(term201, term201.getClass(), "effectiveLevelInt", -2147483648);
        setField(term201, term201.getClass(), "parent", null);
        setField(term201, term201.getClass(), "childrenList", null);
        setField(term201, term201.getClass(), "aai", null);
        setBooleanField(term201, term201.getClass(), "additive", true);
        setField(term201, term201.getClass(), "loggerContext", null);
        setField(term198, term198.getClass(), "parent", term201);
        setField(term204, term204.getClass(), "lock", null);
        setField(term204, term204.getClass(), "array", null);
        setField(term198, term198.getClass(), "childrenList", term204);
        setField(term198, term198.getClass(), "aai", null);
        setBooleanField(term198, term198.getClass(), "additive", true);
        setField(term206, term206.getClass(), "root", null);
        setIntField(term206, term206.getClass(), "size", 32);
        setIntField(term206, term206.getClass(), "noAppenderWarning", 0);
        setField(term206, term206.getClass(), "loggerContextListenerList", null);
        setField(term206, term206.getClass(), "loggerCache", null);
        setField(term206, term206.getClass(), "loggerContextRemoteView", null);
        setField(term206, term206.getClass(), "turboFilterList", null);
        setBooleanField(term206, term206.getClass(), "packagingDataEnabled", false);
        setIntField(term206, term206.getClass(), "maxCallerDataDepth", 8);
        setIntField(term206, term206.getClass(), "resetCount", 0);
        setField(term206, term206.getClass(), "frameworkPackages", null);
        setLongField(term206, term206.getClass(), "birthTime", 1782695692642L);
        setField(term206, term206.getClass(), "name", null);
        setField(term206, term206.getClass(), "sm", null);
        setField(term206, term206.getClass(), "propertyMap", null);
        setField(term206, term206.getClass(), "objectMap", null);
        setField(term206, term206.getClass(), "configurationLock", null);
        setField(term206, term206.getClass(), "scheduledExecutorService", null);
        setField(term206, term206.getClass(), "scheduledFutures", null);
        setField(term206, term206.getClass(), "lifeCycleManager", null);
        setBooleanField(term206, term206.getClass(), "started", false);
        setField(term198, term198.getClass(), "loggerContext", term206);
        setField(term166, term166.getClass(), "parent", term198);
        setField(term214, term214.getClass(), "lock", term215);
        setElement(term216, 0, term114);
        setField(term214, term214.getClass(), "array", term216);
        setField(term166, term166.getClass(), "childrenList", term214);
        setField(term166, term166.getClass(), "aai", null);
        setBooleanField(term166, term166.getClass(), "additive", true);
        setField(term166, term166.getClass(), "loggerContext", term206);
        setField(term114, term114.getClass(), "parent", term166);
        setField(term114, term114.getClass(), "childrenList", null);
        setField(term114, term114.getClass(), "aai", null);
        setBooleanField(term114, term114.getClass(), "additive", true);
        setField(term114, term114.getClass(), "loggerContext", term206);
        setField(term113, term113.getClass(), "logger", term114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ebay.signaturevalidation.SignatureController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "verifySignaturePOST", argTypes, term113, args);
    }

};


