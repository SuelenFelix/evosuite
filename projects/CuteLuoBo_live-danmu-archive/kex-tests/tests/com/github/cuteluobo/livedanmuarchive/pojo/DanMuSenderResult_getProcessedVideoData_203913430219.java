package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class DanMuSenderResult_getProcessedVideoData_203913430219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29527;

    public DanMuSenderResult_getProcessedVideoData_203913430219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29672 = new ArrayList();
        term29527 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        Object term29528 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29592 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29638 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29641 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29644 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term29646 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term29654 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term29655 = newInstance(Class.forName("java.lang.Object"));
        Object[] term29656 = (Object[]) newArray("java.lang.Object", 1);
        Object term29659 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term29661 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term29663 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term29528, term29528.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        setField(term29528, term29528.getClass(), "level", null);
        setIntField(term29528, term29528.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29592, term29592.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo");
        setField(term29592, term29592.getClass(), "level", null);
        setIntField(term29592, term29592.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29638, term29638.getClass(), "name", "");
        setField(term29638, term29638.getClass(), "level", null);
        setIntField(term29638, term29638.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29641, term29641.getClass(), "name", null);
        setField(term29641, term29641.getClass(), "level", null);
        setIntField(term29641, term29641.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29641, term29641.getClass(), "parent", null);
        setField(term29641, term29641.getClass(), "childrenList", null);
        setField(term29641, term29641.getClass(), "aai", null);
        setBooleanField(term29641, term29641.getClass(), "additive", true);
        setField(term29641, term29641.getClass(), "loggerContext", null);
        setField(term29638, term29638.getClass(), "parent", term29641);
        setField(term29644, term29644.getClass(), "lock", null);
        setField(term29644, term29644.getClass(), "array", null);
        setField(term29638, term29638.getClass(), "childrenList", term29644);
        setField(term29638, term29638.getClass(), "aai", null);
        setBooleanField(term29638, term29638.getClass(), "additive", true);
        setField(term29646, term29646.getClass(), "root", null);
        setIntField(term29646, term29646.getClass(), "size", 34);
        setIntField(term29646, term29646.getClass(), "noAppenderWarning", 0);
        setField(term29646, term29646.getClass(), "loggerContextListenerList", null);
        setField(term29646, term29646.getClass(), "loggerCache", null);
        setField(term29646, term29646.getClass(), "loggerContextRemoteView", null);
        setField(term29646, term29646.getClass(), "turboFilterList", null);
        setBooleanField(term29646, term29646.getClass(), "packagingDataEnabled", false);
        setIntField(term29646, term29646.getClass(), "maxCallerDataDepth", 8);
        setIntField(term29646, term29646.getClass(), "resetCount", 0);
        setField(term29646, term29646.getClass(), "frameworkPackages", null);
        setLongField(term29646, term29646.getClass(), "birthTime", 1786460230244L);
        setField(term29646, term29646.getClass(), "name", null);
        setField(term29646, term29646.getClass(), "sm", null);
        setField(term29646, term29646.getClass(), "propertyMap", null);
        setField(term29646, term29646.getClass(), "objectMap", null);
        setField(term29646, term29646.getClass(), "configurationLock", null);
        setField(term29646, term29646.getClass(), "scheduledExecutorService", null);
        setField(term29646, term29646.getClass(), "scheduledFutures", null);
        setField(term29646, term29646.getClass(), "lifeCycleManager", null);
        setBooleanField(term29646, term29646.getClass(), "started", false);
        setField(term29638, term29638.getClass(), "loggerContext", term29646);
        setField(term29592, term29592.getClass(), "parent", term29638);
        setField(term29654, term29654.getClass(), "lock", term29655);
        setElement(term29656, 0, term29528);
        setField(term29654, term29654.getClass(), "array", term29656);
        setField(term29592, term29592.getClass(), "childrenList", term29654);
        setField(term29592, term29592.getClass(), "aai", null);
        setBooleanField(term29592, term29592.getClass(), "additive", true);
        setField(term29592, term29592.getClass(), "loggerContext", term29646);
        setField(term29528, term29528.getClass(), "parent", term29592);
        setField(term29528, term29528.getClass(), "childrenList", null);
        setField(term29528, term29528.getClass(), "aai", null);
        setBooleanField(term29528, term29528.getClass(), "additive", true);
        setField(term29528, term29528.getClass(), "loggerContext", term29646);
        setField(term29527, term29527.getClass(), "logger", term29528);
        setLongField(term29659, term29659.getClass(), "value", 0L);
        setField(term29527, term29527.getClass(), "total", term29659);
        setLongField(term29661, term29661.getClass(), "value", 0L);
        setField(term29527, term29527.getClass(), "successNum", term29661);
        setLongField(term29663, term29663.getClass(), "value", 0L);
        setField(term29527, term29527.getClass(), "failNum", term29663);
        setLongField(term29527, term29527.getClass(), "startTime", 1786460353641L);
        setIntField(term29527, term29527.getClass(), "lastWorkVideoPartIndex", -1270258033);
        setIntField(term29527, term29527.getClass(), "lastWorkDataPageNum", 1677994069);
        setLongField(term29527, term29527.getClass(), "lastSuccessTime", -308461294344616496L);
        setLongField(term29527, term29527.getClass(), "lastFailTimeSuccessNum", -6325201865655646423L);
        setLongField(term29527, term29527.getClass(), "lastFailTime", 1786460353641L);
        setLongField(term29527, term29527.getClass(), "lastFailNum", -9093996849713569099L);
        setField(term29527, term29527.getClass(), "residueDataList", term29672);
        setField(term29527, term29527.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProcessedVideoData", argTypes, term29527, args);
    }

};


