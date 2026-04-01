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

public class PlaceController_getPlaceList_2219828331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2791;

    public PlaceController_getPlaceList_2219828331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2791 = newInstance(Class.forName("com.prac.react.controller.PlaceController"));
        Object term2792 = newInstance(Class.forName("com.prac.react.service.PlaceService"));
        Object term2793 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term2794 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term2825 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2863 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2866 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2869 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2871 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setField(term2791, term2791.getClass(), "logger", null);
        setField(term2792, term2792.getClass(), "logger", null);
        setField(term2792, term2792.getClass(), "pd", null);
        setField(term2791, term2791.getClass(), "ps", term2792);
        setField(term2794, term2794.getClass(), "secretKey", "ieCtQFdkii");
        setField(term2793, term2793.getClass(), "sk", term2794);
        setField(term2793, term2793.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term2825, term2825.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term2825, term2825.getClass(), "level", null);
        setIntField(term2825, term2825.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2863, term2863.getClass(), "name", "");
        setField(term2863, term2863.getClass(), "level", null);
        setIntField(term2863, term2863.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2866, term2866.getClass(), "name", null);
        setField(term2866, term2866.getClass(), "level", null);
        setIntField(term2866, term2866.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2866, term2866.getClass(), "parent", null);
        setField(term2866, term2866.getClass(), "childrenList", null);
        setField(term2866, term2866.getClass(), "aai", null);
        setBooleanField(term2866, term2866.getClass(), "additive", true);
        setField(term2866, term2866.getClass(), "loggerContext", null);
        setField(term2863, term2863.getClass(), "parent", term2866);
        setField(term2869, term2869.getClass(), "lock", null);
        setField(term2869, term2869.getClass(), "array", null);
        setField(term2863, term2863.getClass(), "childrenList", term2869);
        setField(term2863, term2863.getClass(), "aai", null);
        setBooleanField(term2863, term2863.getClass(), "additive", true);
        setField(term2871, term2871.getClass(), "root", null);
        setIntField(term2871, term2871.getClass(), "size", 33);
        setIntField(term2871, term2871.getClass(), "noAppenderWarning", 0);
        setField(term2871, term2871.getClass(), "loggerContextListenerList", null);
        setField(term2871, term2871.getClass(), "loggerCache", null);
        setField(term2871, term2871.getClass(), "loggerContextRemoteView", null);
        setField(term2871, term2871.getClass(), "turboFilterList", null);
        setBooleanField(term2871, term2871.getClass(), "packagingDataEnabled", false);
        setIntField(term2871, term2871.getClass(), "maxCallerDataDepth", 8);
        setIntField(term2871, term2871.getClass(), "resetCount", 0);
        setField(term2871, term2871.getClass(), "frameworkPackages", null);
        setLongField(term2871, term2871.getClass(), "birthTime", 1775069216969L);
        setField(term2871, term2871.getClass(), "name", null);
        setField(term2871, term2871.getClass(), "sm", null);
        setField(term2871, term2871.getClass(), "propertyMap", null);
        setField(term2871, term2871.getClass(), "objectMap", null);
        setField(term2871, term2871.getClass(), "configurationLock", null);
        setField(term2871, term2871.getClass(), "scheduledExecutorService", null);
        setField(term2871, term2871.getClass(), "scheduledFutures", null);
        setField(term2871, term2871.getClass(), "lifeCycleManager", null);
        setBooleanField(term2871, term2871.getClass(), "started", false);
        setField(term2863, term2863.getClass(), "loggerContext", term2871);
        setField(term2825, term2825.getClass(), "parent", term2863);
        setField(term2825, term2825.getClass(), "childrenList", null);
        setField(term2825, term2825.getClass(), "aai", null);
        setBooleanField(term2825, term2825.getClass(), "additive", true);
        setField(term2825, term2825.getClass(), "loggerContext", term2871);
        setField(term2793, term2793.getClass(), "logger", term2825);
        setField(term2791, term2791.getClass(), "encryption", term2793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.PlaceController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceList", argTypes, term2791, args);
    }

};


