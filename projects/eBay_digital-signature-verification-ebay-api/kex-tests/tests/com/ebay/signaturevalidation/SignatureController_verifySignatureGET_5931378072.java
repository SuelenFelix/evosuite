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

public class SignatureController_verifySignatureGET_5931378072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;

    public SignatureController_verifySignatureGET_5931378072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295 = newInstance(Class.forName("com.ebay.signaturevalidation.SignatureController"));
        Object term296 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term348 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term380 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term383 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term386 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term388 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term396 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term397 = newInstance(Class.forName("java.lang.Object"));
        Object[] term398 = (Object[]) newArray("java.lang.Object", 1);
        setField(term296, term296.getClass(), "name", "com.ebay.signaturevalidation.SignatureController");
        setField(term296, term296.getClass(), "level", null);
        setIntField(term296, term296.getClass(), "effectiveLevelInt", -2147483648);
        setField(term348, term348.getClass(), "name", "com.ebay.signaturevalidation");
        setField(term348, term348.getClass(), "level", null);
        setIntField(term348, term348.getClass(), "effectiveLevelInt", -2147483648);
        setField(term380, term380.getClass(), "name", "");
        setField(term380, term380.getClass(), "level", null);
        setIntField(term380, term380.getClass(), "effectiveLevelInt", -2147483648);
        setField(term383, term383.getClass(), "name", null);
        setField(term383, term383.getClass(), "level", null);
        setIntField(term383, term383.getClass(), "effectiveLevelInt", -2147483648);
        setField(term383, term383.getClass(), "parent", null);
        setField(term383, term383.getClass(), "childrenList", null);
        setField(term383, term383.getClass(), "aai", null);
        setBooleanField(term383, term383.getClass(), "additive", true);
        setField(term383, term383.getClass(), "loggerContext", null);
        setField(term380, term380.getClass(), "parent", term383);
        setField(term386, term386.getClass(), "lock", null);
        setField(term386, term386.getClass(), "array", null);
        setField(term380, term380.getClass(), "childrenList", term386);
        setField(term380, term380.getClass(), "aai", null);
        setBooleanField(term380, term380.getClass(), "additive", true);
        setField(term388, term388.getClass(), "root", null);
        setIntField(term388, term388.getClass(), "size", 32);
        setIntField(term388, term388.getClass(), "noAppenderWarning", 0);
        setField(term388, term388.getClass(), "loggerContextListenerList", null);
        setField(term388, term388.getClass(), "loggerCache", null);
        setField(term388, term388.getClass(), "loggerContextRemoteView", null);
        setField(term388, term388.getClass(), "turboFilterList", null);
        setBooleanField(term388, term388.getClass(), "packagingDataEnabled", false);
        setIntField(term388, term388.getClass(), "maxCallerDataDepth", 8);
        setIntField(term388, term388.getClass(), "resetCount", 0);
        setField(term388, term388.getClass(), "frameworkPackages", null);
        setLongField(term388, term388.getClass(), "birthTime", 1786465614955L);
        setField(term388, term388.getClass(), "name", null);
        setField(term388, term388.getClass(), "sm", null);
        setField(term388, term388.getClass(), "propertyMap", null);
        setField(term388, term388.getClass(), "objectMap", null);
        setField(term388, term388.getClass(), "configurationLock", null);
        setField(term388, term388.getClass(), "scheduledExecutorService", null);
        setField(term388, term388.getClass(), "scheduledFutures", null);
        setField(term388, term388.getClass(), "lifeCycleManager", null);
        setBooleanField(term388, term388.getClass(), "started", false);
        setField(term380, term380.getClass(), "loggerContext", term388);
        setField(term348, term348.getClass(), "parent", term380);
        setField(term396, term396.getClass(), "lock", term397);
        setElement(term398, 0, term296);
        setField(term396, term396.getClass(), "array", term398);
        setField(term348, term348.getClass(), "childrenList", term396);
        setField(term348, term348.getClass(), "aai", null);
        setBooleanField(term348, term348.getClass(), "additive", true);
        setField(term348, term348.getClass(), "loggerContext", term388);
        setField(term296, term296.getClass(), "parent", term348);
        setField(term296, term296.getClass(), "childrenList", null);
        setField(term296, term296.getClass(), "aai", null);
        setBooleanField(term296, term296.getClass(), "additive", true);
        setField(term296, term296.getClass(), "loggerContext", term388);
        setField(term295, term295.getClass(), "logger", term296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ebay.signaturevalidation.SignatureController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "verifySignatureGET", argTypes, term295, args);
    }

};


