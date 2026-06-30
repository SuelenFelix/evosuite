package com.prac.react.controller;

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
import static com.prac.react.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PinController_getKpopPin_4479403241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407;

    public PinController_getKpopPin_4479403241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term407 = newInstance(Class.forName("com.prac.react.controller.PinController"));
        Object term408 = newInstance(Class.forName("com.prac.react.service.PinService"));
        Object term409 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term410 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term441 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term479 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term482 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term485 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term487 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setField(term407, term407.getClass(), "logger", null);
        setField(term408, term408.getClass(), "logger", null);
        setField(term408, term408.getClass(), "pd", null);
        setField(term407, term407.getClass(), "ps", term408);
        setField(term410, term410.getClass(), "secretKey", "MuLcgQHgqz");
        setField(term409, term409.getClass(), "sk", term410);
        setField(term409, term409.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term441, term441.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term441, term441.getClass(), "level", null);
        setIntField(term441, term441.getClass(), "effectiveLevelInt", -2147483648);
        setField(term479, term479.getClass(), "name", "");
        setField(term479, term479.getClass(), "level", null);
        setIntField(term479, term479.getClass(), "effectiveLevelInt", -2147483648);
        setField(term482, term482.getClass(), "name", null);
        setField(term482, term482.getClass(), "level", null);
        setIntField(term482, term482.getClass(), "effectiveLevelInt", -2147483648);
        setField(term482, term482.getClass(), "parent", null);
        setField(term482, term482.getClass(), "childrenList", null);
        setField(term482, term482.getClass(), "aai", null);
        setBooleanField(term482, term482.getClass(), "additive", true);
        setField(term482, term482.getClass(), "loggerContext", null);
        setField(term479, term479.getClass(), "parent", term482);
        setField(term485, term485.getClass(), "lock", null);
        setField(term485, term485.getClass(), "array", null);
        setField(term479, term479.getClass(), "childrenList", term485);
        setField(term479, term479.getClass(), "aai", null);
        setBooleanField(term479, term479.getClass(), "additive", true);
        setField(term487, term487.getClass(), "root", null);
        setIntField(term487, term487.getClass(), "size", 33);
        setIntField(term487, term487.getClass(), "noAppenderWarning", 0);
        setField(term487, term487.getClass(), "loggerContextListenerList", null);
        setField(term487, term487.getClass(), "loggerCache", null);
        setField(term487, term487.getClass(), "loggerContextRemoteView", null);
        setField(term487, term487.getClass(), "turboFilterList", null);
        setBooleanField(term487, term487.getClass(), "packagingDataEnabled", false);
        setIntField(term487, term487.getClass(), "maxCallerDataDepth", 8);
        setIntField(term487, term487.getClass(), "resetCount", 0);
        setField(term487, term487.getClass(), "frameworkPackages", null);
        setLongField(term487, term487.getClass(), "birthTime", 1782677609604L);
        setField(term487, term487.getClass(), "name", null);
        setField(term487, term487.getClass(), "sm", null);
        setField(term487, term487.getClass(), "propertyMap", null);
        setField(term487, term487.getClass(), "objectMap", null);
        setField(term487, term487.getClass(), "configurationLock", null);
        setField(term487, term487.getClass(), "scheduledExecutorService", null);
        setField(term487, term487.getClass(), "scheduledFutures", null);
        setField(term487, term487.getClass(), "lifeCycleManager", null);
        setBooleanField(term487, term487.getClass(), "started", false);
        setField(term479, term479.getClass(), "loggerContext", term487);
        setField(term441, term441.getClass(), "parent", term479);
        setField(term441, term441.getClass(), "childrenList", null);
        setField(term441, term441.getClass(), "aai", null);
        setBooleanField(term441, term441.getClass(), "additive", true);
        setField(term441, term441.getClass(), "loggerContext", term487);
        setField(term409, term409.getClass(), "logger", term441);
        setField(term407, term407.getClass(), "encryption", term409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.PinController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "getKpopPin", argTypes, term407, args);
    }

};


