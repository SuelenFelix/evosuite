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

public class TtlMdcListener_onReset_6973674316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162;
     Object term164;

    public TtlMdcListener_onReset_6973674316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162 = newInstance(Class.forName("com.ofpay.logback.TtlMdcListener"));
        setIntField(term162, term162.getClass(), "noContextWarning", -2038273078);
        setField(term162, term162.getClass(), "context", null);
        setField(term162, term162.getClass(), "declaredOrigin", term162);
        ArrayList term185 = new ArrayList();
        HashMap term199 = new HashMap();
        ArrayList term211 = new ArrayList();
        ArrayList term230 = new ArrayList();
        ArrayList term242 = new ArrayList();
        HashMap term247 = new HashMap();
        HashMap term252 = new HashMap();
        ArrayList term283 = new ArrayList();
        HashMap term289 = new HashMap();
        Set<Object> term314 =  ((Map) term289).keySet();
        HashSet term288 = new HashSet((Collection<? extends Object>) term314);
        term164 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term165 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term172 = newInstance(Class.forName("ch.qos.logback.classic.Level"));
        Object term189 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term190 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 16);
        Object term191 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$Node"));
        Object term198 = newInstance(Class.forName("ch.qos.logback.classic.spi.LoggerContextVO"));
        Object term205 = newInstance(Class.forName("ch.qos.logback.classic.spi.TurboFilterList"));
        Object term206 = newInstance(Class.forName("java.lang.Object"));
        Object[] term207 = (Object[]) newArray("java.lang.Object", 0);
        Object term228 = newInstance(Class.forName("ch.qos.logback.core.BasicStatusManager"));
        Object term234 = newInstance(Class.forName("ch.qos.logback.core.helpers.CyclicBuffer"));
        Object[] term235 = (Object[]) newArray("java.lang.Object", 150);
        Object term240 = newInstance(Class.forName("ch.qos.logback.core.spi.LogbackLock"));
        Object term246 = newInstance(Class.forName("ch.qos.logback.core.spi.LogbackLock"));
        Object term282 = newInstance(Class.forName("ch.qos.logback.core.spi.LogbackLock"));
        Object term287 = newInstance(Class.forName("ch.qos.logback.core.LifeCycleManager"));
        setField(term165, term165.getClass(), "name", "ROOT");
        setIntField(term172, term172.getClass(), "levelInt", 10000);
        setField(term172, term172.getClass(), "levelStr", "DEBUG");
        setField(term165, term165.getClass(), "level", term172);
        setIntField(term165, term165.getClass(), "effectiveLevelInt", 10000);
        setField(term165, term165.getClass(), "parent", null);
        setField(term165, term165.getClass(), "childrenList", null);
        setField(term165, term165.getClass(), "aai", null);
        setBooleanField(term165, term165.getClass(), "additive", true);
        setField(term165, term165.getClass(), "loggerContext", term164);
        setField(term164, term164.getClass(), "root", term165);
        setIntField(term164, term164.getClass(), "size", 1);
        setIntField(term164, term164.getClass(), "noAppenderWarning", 1227103734);
        setField(term164, term164.getClass(), "loggerContextListenerList", term185);
        setIntField(term191, term191.getClass(), "hash", 2521284);
        setField(term191, term191.getClass(), "key", "");
        setField(term191, term191.getClass(), "val", term165);
        setField(term191, term191.getClass(), "next", null);
        setElement(term190, 4, term191);
        setField(term189, term189.getClass(), "table", term190);
        setField(term189, term189.getClass(), "nextTable", null);
        setLongField(term189, term189.getClass(), "baseCount", 1L);
        setIntField(term189, term189.getClass(), "sizeCtl", 12);
        setIntField(term189, term189.getClass(), "transferIndex", 0);
        setIntField(term189, term189.getClass(), "cellsBusy", 0);
        setField(term189, term189.getClass(), "counterCells", null);
        setField(term189, term189.getClass(), "keySet", null);
        setField(term189, term189.getClass(), "values", null);
        setField(term189, term189.getClass(), "entrySet", null);
        setField(term189, term189.getClass(), "keySet", null);
        setField(term189, term189.getClass(), "values", null);
        setField(term164, term164.getClass(), "loggerCache", term189);
        setField(term198, term198.getClass(), "name", null);
        setField(term198, term198.getClass(), "propertyMap", term199);
        setLongField(term198, term198.getClass(), "birthTime", 1786517748279L);
        setField(term164, term164.getClass(), "loggerContextRemoteView", term198);
        setField(term205, term205.getClass(), "lock", term206);
        setField(term205, term205.getClass(), "array", term207);
        setField(term164, term164.getClass(), "turboFilterList", term205);
        setBooleanField(term164, term164.getClass(), "packagingDataEnabled", true);
        setIntField(term164, term164.getClass(), "maxCallerDataDepth", 8);
        setIntField(term164, term164.getClass(), "resetCount", -1339778481);
        setField(term164, term164.getClass(), "frameworkPackages", term211);
        setLongField(term164, term164.getClass(), "birthTime", 1786517748279L);
        setField(term164, term164.getClass(), "name", "sjlJAEtRrb");
        setIntField(term228, term228.getClass(), "count", 0);
        setField(term228, term228.getClass(), "statusList", term230);
        setField(term234, term234.getClass(), "ea", term235);
        setIntField(term234, term234.getClass(), "first", 0);
        setIntField(term234, term234.getClass(), "last", 0);
        setIntField(term234, term234.getClass(), "numElems", 0);
        setIntField(term234, term234.getClass(), "maxSize", 150);
        setField(term228, term228.getClass(), "tailBuffer", term234);
        setField(term228, term228.getClass(), "statusListLock", term240);
        setIntField(term228, term228.getClass(), "level", 0);
        setField(term228, term228.getClass(), "statusListenerList", term242);
        setField(term228, term228.getClass(), "statusListenerListLock", term246);
        setField(term164, term164.getClass(), "sm", term228);
        setField(term164, term164.getClass(), "propertyMap", term247);
        setField(term164, term164.getClass(), "objectMap", term252);
        setField(term164, term164.getClass(), "configurationLock", term282);
        setField(term164, term164.getClass(), "scheduledExecutorService", null);
        setField(term164, term164.getClass(), "scheduledFutures", term283);
        setField(term287, term287.getClass(), "components", term288);
        setField(term164, term164.getClass(), "lifeCycleManager", term287);
        setBooleanField(term164, term164.getClass(), "started", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ofpay.logback.TtlMdcListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ch.qos.logback.classic.LoggerContext");
        Object[] args = new Object[1];
        args[0] = term164;
        callMethod(klass, "onReset", argTypes, term162, args);
    }

};


