package com.prac.react.security;

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
import static com.prac.react.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Encryption_aesEncrypt_4305467383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;

    public Encryption_aesEncrypt_4305467383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term248 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term279 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term317 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term344 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term347 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term350 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term352 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term360 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term361 = newInstance(Class.forName("java.lang.Object"));
        Object[] term362 = (Object[]) newArray("java.lang.Object", 1);
        setField(term248, term248.getClass(), "secretKey", "xxtlPwDYFs");
        setField(term247, term247.getClass(), "sk", term248);
        setField(term247, term247.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term279, term279.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term279, term279.getClass(), "level", null);
        setIntField(term279, term279.getClass(), "effectiveLevelInt", -2147483648);
        setField(term317, term317.getClass(), "name", "com.prac.react.security");
        setField(term317, term317.getClass(), "level", null);
        setIntField(term317, term317.getClass(), "effectiveLevelInt", -2147483648);
        setField(term344, term344.getClass(), "name", "");
        setField(term344, term344.getClass(), "level", null);
        setIntField(term344, term344.getClass(), "effectiveLevelInt", -2147483648);
        setField(term347, term347.getClass(), "name", null);
        setField(term347, term347.getClass(), "level", null);
        setIntField(term347, term347.getClass(), "effectiveLevelInt", -2147483648);
        setField(term347, term347.getClass(), "parent", null);
        setField(term347, term347.getClass(), "childrenList", null);
        setField(term347, term347.getClass(), "aai", null);
        setBooleanField(term347, term347.getClass(), "additive", true);
        setField(term347, term347.getClass(), "loggerContext", null);
        setField(term344, term344.getClass(), "parent", term347);
        setField(term350, term350.getClass(), "lock", null);
        setField(term350, term350.getClass(), "array", null);
        setField(term344, term344.getClass(), "childrenList", term350);
        setField(term344, term344.getClass(), "aai", null);
        setBooleanField(term344, term344.getClass(), "additive", true);
        setField(term352, term352.getClass(), "root", null);
        setIntField(term352, term352.getClass(), "size", 31);
        setIntField(term352, term352.getClass(), "noAppenderWarning", 0);
        setField(term352, term352.getClass(), "loggerContextListenerList", null);
        setField(term352, term352.getClass(), "loggerCache", null);
        setField(term352, term352.getClass(), "loggerContextRemoteView", null);
        setField(term352, term352.getClass(), "turboFilterList", null);
        setBooleanField(term352, term352.getClass(), "packagingDataEnabled", false);
        setIntField(term352, term352.getClass(), "maxCallerDataDepth", 8);
        setIntField(term352, term352.getClass(), "resetCount", 0);
        setField(term352, term352.getClass(), "frameworkPackages", null);
        setLongField(term352, term352.getClass(), "birthTime", 1782677941489L);
        setField(term352, term352.getClass(), "name", null);
        setField(term352, term352.getClass(), "sm", null);
        setField(term352, term352.getClass(), "propertyMap", null);
        setField(term352, term352.getClass(), "objectMap", null);
        setField(term352, term352.getClass(), "configurationLock", null);
        setField(term352, term352.getClass(), "scheduledExecutorService", null);
        setField(term352, term352.getClass(), "scheduledFutures", null);
        setField(term352, term352.getClass(), "lifeCycleManager", null);
        setBooleanField(term352, term352.getClass(), "started", false);
        setField(term344, term344.getClass(), "loggerContext", term352);
        setField(term317, term317.getClass(), "parent", term344);
        setField(term360, term360.getClass(), "lock", term361);
        setElement(term362, 0, term279);
        setField(term360, term360.getClass(), "array", term362);
        setField(term317, term317.getClass(), "childrenList", term360);
        setField(term317, term317.getClass(), "aai", null);
        setBooleanField(term317, term317.getClass(), "additive", true);
        setField(term317, term317.getClass(), "loggerContext", term352);
        setField(term279, term279.getClass(), "parent", term317);
        setField(term279, term279.getClass(), "childrenList", null);
        setField(term279, term279.getClass(), "aai", null);
        setBooleanField(term279, term279.getClass(), "additive", true);
        setField(term279, term279.getClass(), "loggerContext", term352);
        setField(term247, term247.getClass(), "logger", term279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.security.Encryption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "aesEncrypt", argTypes, term247, args);
    }

};


