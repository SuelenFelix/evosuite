package com.ofpay.logback;

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
import static com.ofpay.logback.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TtlMdcListener_onStop_2296475927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315;
     Object term317;

    public TtlMdcListener_onStop_2296475927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315 = newInstance(Class.forName("com.ofpay.logback.TtlMdcListener"));
        setIntField(term315, term315.getClass(), "noContextWarning", 1725571209);
        setField(term315, term315.getClass(), "context", null);
        setField(term315, term315.getClass(), "declaredOrigin", term315);
        ArrayList term338 = new ArrayList();
        HashMap term352 = new HashMap();
        ArrayList term364 = new ArrayList();
        ArrayList term383 = new ArrayList();
        ArrayList term395 = new ArrayList();
        HashMap term400 = new HashMap();
        HashMap term405 = new HashMap();
        ArrayList term436 = new ArrayList();
        HashMap term442 = new HashMap();
        Set<Object> term467 =  ((Map) term442).keySet();
        HashSet term441 = new HashSet((Collection<? extends Object>) term467);
        term317 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term318 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term325 = newInstance(Class.forName("ch.qos.logback.classic.Level"));
        Object term342 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term343 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 16);
        Object term344 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$Node"));
        Object term351 = newInstance(Class.forName("ch.qos.logback.classic.spi.LoggerContextVO"));
        Object term358 = newInstance(Class.forName("ch.qos.logback.classic.spi.TurboFilterList"));
        Object term359 = newInstance(Class.forName("java.lang.Object"));
        Object[] term360 = (Object[]) newArray("java.lang.Object", 0);
        Object term381 = newInstance(Class.forName("ch.qos.logback.core.BasicStatusManager"));
        Object term387 = newInstance(Class.forName("ch.qos.logback.core.helpers.CyclicBuffer"));
        Object[] term388 = (Object[]) newArray("java.lang.Object", 150);
        Object term393 = newInstance(Class.forName("ch.qos.logback.core.spi.LogbackLock"));
        Object term399 = newInstance(Class.forName("ch.qos.logback.core.spi.LogbackLock"));
        Object term435 = newInstance(Class.forName("ch.qos.logback.core.spi.LogbackLock"));
        Object term440 = newInstance(Class.forName("ch.qos.logback.core.LifeCycleManager"));
        setField(term318, term318.getClass(), "name", "ROOT");
        setIntField(term325, term325.getClass(), "levelInt", 10000);
        setField(term325, term325.getClass(), "levelStr", "DEBUG");
        setField(term318, term318.getClass(), "level", term325);
        setIntField(term318, term318.getClass(), "effectiveLevelInt", 10000);
        setField(term318, term318.getClass(), "parent", null);
        setField(term318, term318.getClass(), "childrenList", null);
        setField(term318, term318.getClass(), "aai", null);
        setBooleanField(term318, term318.getClass(), "additive", true);
        setField(term318, term318.getClass(), "loggerContext", term317);
        setField(term317, term317.getClass(), "root", term318);
        setIntField(term317, term317.getClass(), "size", 1);
        setIntField(term317, term317.getClass(), "noAppenderWarning", -522618178);
        setField(term317, term317.getClass(), "loggerContextListenerList", term338);
        setIntField(term344, term344.getClass(), "hash", 2521284);
        setField(term344, term344.getClass(), "key", "");
        setField(term344, term344.getClass(), "val", term318);
        setField(term344, term344.getClass(), "next", null);
        setElement(term343, 4, term344);
        setField(term342, term342.getClass(), "table", term343);
        setField(term342, term342.getClass(), "nextTable", null);
        setLongField(term342, term342.getClass(), "baseCount", 1L);
        setIntField(term342, term342.getClass(), "sizeCtl", 12);
        setIntField(term342, term342.getClass(), "transferIndex", 0);
        setIntField(term342, term342.getClass(), "cellsBusy", 0);
        setField(term342, term342.getClass(), "counterCells", null);
        setField(term342, term342.getClass(), "keySet", null);
        setField(term342, term342.getClass(), "values", null);
        setField(term342, term342.getClass(), "entrySet", null);
        setField(term342, term342.getClass(), "keySet", null);
        setField(term342, term342.getClass(), "values", null);
        setField(term317, term317.getClass(), "loggerCache", term342);
        setField(term351, term351.getClass(), "name", null);
        setField(term351, term351.getClass(), "propertyMap", term352);
        setLongField(term351, term351.getClass(), "birthTime", 1786517748351L);
        setField(term317, term317.getClass(), "loggerContextRemoteView", term351);
        setField(term358, term358.getClass(), "lock", term359);
        setField(term358, term358.getClass(), "array", term360);
        setField(term317, term317.getClass(), "turboFilterList", term358);
        setBooleanField(term317, term317.getClass(), "packagingDataEnabled", true);
        setIntField(term317, term317.getClass(), "maxCallerDataDepth", 8);
        setIntField(term317, term317.getClass(), "resetCount", 1134449235);
        setField(term317, term317.getClass(), "frameworkPackages", term364);
        setLongField(term317, term317.getClass(), "birthTime", 1786517748351L);
        setField(term317, term317.getClass(), "name", "MuLcgQHgqz");
        setIntField(term381, term381.getClass(), "count", 0);
        setField(term381, term381.getClass(), "statusList", term383);
        setField(term387, term387.getClass(), "ea", term388);
        setIntField(term387, term387.getClass(), "first", 0);
        setIntField(term387, term387.getClass(), "last", 0);
        setIntField(term387, term387.getClass(), "numElems", 0);
        setIntField(term387, term387.getClass(), "maxSize", 150);
        setField(term381, term381.getClass(), "tailBuffer", term387);
        setField(term381, term381.getClass(), "statusListLock", term393);
        setIntField(term381, term381.getClass(), "level", 0);
        setField(term381, term381.getClass(), "statusListenerList", term395);
        setField(term381, term381.getClass(), "statusListenerListLock", term399);
        setField(term317, term317.getClass(), "sm", term381);
        setField(term317, term317.getClass(), "propertyMap", term400);
        setField(term317, term317.getClass(), "objectMap", term405);
        setField(term317, term317.getClass(), "configurationLock", term435);
        setField(term317, term317.getClass(), "scheduledExecutorService", null);
        setField(term317, term317.getClass(), "scheduledFutures", term436);
        setField(term440, term440.getClass(), "components", term441);
        setField(term317, term317.getClass(), "lifeCycleManager", term440);
        setBooleanField(term317, term317.getClass(), "started", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ofpay.logback.TtlMdcListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ch.qos.logback.classic.LoggerContext");
        Object[] args = new Object[1];
        args[0] = term317;
        callMethod(klass, "onStop", argTypes, term315, args);
    }

};


