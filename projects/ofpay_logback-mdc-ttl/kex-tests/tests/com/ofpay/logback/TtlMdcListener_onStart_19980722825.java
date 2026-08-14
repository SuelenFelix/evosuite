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

public class TtlMdcListener_onStart_19980722825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term11;

    public TtlMdcListener_onStart_19980722825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("com.ofpay.logback.TtlMdcListener"));
        setIntField(term9, term9.getClass(), "noContextWarning", -1922583790);
        setField(term9, term9.getClass(), "context", null);
        setField(term9, term9.getClass(), "declaredOrigin", term9);
        ArrayList term32 = new ArrayList();
        HashMap term46 = new HashMap();
        ArrayList term58 = new ArrayList();
        ArrayList term77 = new ArrayList();
        ArrayList term89 = new ArrayList();
        HashMap term94 = new HashMap();
        HashMap term99 = new HashMap();
        ArrayList term130 = new ArrayList();
        HashMap term136 = new HashMap();
        Set<Object> term161 =  ((Map) term136).keySet();
        HashSet term135 = new HashSet((Collection<? extends Object>) term161);
        term11 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term12 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term19 = newInstance(Class.forName("ch.qos.logback.classic.Level"));
        Object term36 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term37 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 16);
        Object term38 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$Node"));
        Object term45 = newInstance(Class.forName("ch.qos.logback.classic.spi.LoggerContextVO"));
        Object term52 = newInstance(Class.forName("ch.qos.logback.classic.spi.TurboFilterList"));
        Object term53 = newInstance(Class.forName("java.lang.Object"));
        Object[] term54 = (Object[]) newArray("java.lang.Object", 0);
        Object term75 = newInstance(Class.forName("ch.qos.logback.core.BasicStatusManager"));
        Object term81 = newInstance(Class.forName("ch.qos.logback.core.helpers.CyclicBuffer"));
        Object[] term82 = (Object[]) newArray("java.lang.Object", 150);
        Object term87 = newInstance(Class.forName("ch.qos.logback.core.spi.LogbackLock"));
        Object term93 = newInstance(Class.forName("ch.qos.logback.core.spi.LogbackLock"));
        Object term129 = newInstance(Class.forName("ch.qos.logback.core.spi.LogbackLock"));
        Object term134 = newInstance(Class.forName("ch.qos.logback.core.LifeCycleManager"));
        setField(term12, term12.getClass(), "name", "ROOT");
        setIntField(term19, term19.getClass(), "levelInt", 10000);
        setField(term19, term19.getClass(), "levelStr", "DEBUG");
        setField(term12, term12.getClass(), "level", term19);
        setIntField(term12, term12.getClass(), "effectiveLevelInt", 10000);
        setField(term12, term12.getClass(), "parent", null);
        setField(term12, term12.getClass(), "childrenList", null);
        setField(term12, term12.getClass(), "aai", null);
        setBooleanField(term12, term12.getClass(), "additive", true);
        setField(term12, term12.getClass(), "loggerContext", term11);
        setField(term11, term11.getClass(), "root", term12);
        setIntField(term11, term11.getClass(), "size", 1);
        setIntField(term11, term11.getClass(), "noAppenderWarning", -616727354);
        setField(term11, term11.getClass(), "loggerContextListenerList", term32);
        setIntField(term38, term38.getClass(), "hash", 2521284);
        setField(term38, term38.getClass(), "key", "");
        setField(term38, term38.getClass(), "val", term12);
        setField(term38, term38.getClass(), "next", null);
        setElement(term37, 4, term38);
        setField(term36, term36.getClass(), "table", term37);
        setField(term36, term36.getClass(), "nextTable", null);
        setLongField(term36, term36.getClass(), "baseCount", 1L);
        setIntField(term36, term36.getClass(), "sizeCtl", 12);
        setIntField(term36, term36.getClass(), "transferIndex", 0);
        setIntField(term36, term36.getClass(), "cellsBusy", 0);
        setField(term36, term36.getClass(), "counterCells", null);
        setField(term36, term36.getClass(), "keySet", null);
        setField(term36, term36.getClass(), "values", null);
        setField(term36, term36.getClass(), "entrySet", null);
        setField(term36, term36.getClass(), "keySet", null);
        setField(term36, term36.getClass(), "values", null);
        setField(term11, term11.getClass(), "loggerCache", term36);
        setField(term45, term45.getClass(), "name", null);
        setField(term45, term45.getClass(), "propertyMap", term46);
        setLongField(term45, term45.getClass(), "birthTime", 1786517748190L);
        setField(term11, term11.getClass(), "loggerContextRemoteView", term45);
        setField(term52, term52.getClass(), "lock", term53);
        setField(term52, term52.getClass(), "array", term54);
        setField(term11, term11.getClass(), "turboFilterList", term52);
        setBooleanField(term11, term11.getClass(), "packagingDataEnabled", false);
        setIntField(term11, term11.getClass(), "maxCallerDataDepth", 8);
        setIntField(term11, term11.getClass(), "resetCount", -1955890973);
        setField(term11, term11.getClass(), "frameworkPackages", term58);
        setLongField(term11, term11.getClass(), "birthTime", 1786517748190L);
        setField(term11, term11.getClass(), "name", "PAEBtnZtTD");
        setIntField(term75, term75.getClass(), "count", 0);
        setField(term75, term75.getClass(), "statusList", term77);
        setField(term81, term81.getClass(), "ea", term82);
        setIntField(term81, term81.getClass(), "first", 0);
        setIntField(term81, term81.getClass(), "last", 0);
        setIntField(term81, term81.getClass(), "numElems", 0);
        setIntField(term81, term81.getClass(), "maxSize", 150);
        setField(term75, term75.getClass(), "tailBuffer", term81);
        setField(term75, term75.getClass(), "statusListLock", term87);
        setIntField(term75, term75.getClass(), "level", 0);
        setField(term75, term75.getClass(), "statusListenerList", term89);
        setField(term75, term75.getClass(), "statusListenerListLock", term93);
        setField(term11, term11.getClass(), "sm", term75);
        setField(term11, term11.getClass(), "propertyMap", term94);
        setField(term11, term11.getClass(), "objectMap", term99);
        setField(term11, term11.getClass(), "configurationLock", term129);
        setField(term11, term11.getClass(), "scheduledExecutorService", null);
        setField(term11, term11.getClass(), "scheduledFutures", term130);
        setField(term134, term134.getClass(), "components", term135);
        setField(term11, term11.getClass(), "lifeCycleManager", term134);
        setBooleanField(term11, term11.getClass(), "started", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ofpay.logback.TtlMdcListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ch.qos.logback.classic.LoggerContext");
        Object[] args = new Object[1];
        args[0] = term11;
        callMethod(klass, "onStart", argTypes, term9, args);
    }

};


