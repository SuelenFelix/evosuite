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
import java.lang.Long;

public class DanMuSenderResult_setTotal_9895569996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25465;
     Object term25638;

    public DanMuSenderResult_setTotal_9895569996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25621 = new Long(-6292278961887936280L);
        Object term25612 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term25613 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term25615 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term25613, term25613.getClass(), "uid", null);
        setField(term25613, term25613.getClass(), "nickName", null);
        setField(term25612, term25612.getClass(), "userIfo", term25613);
        setField(term25612, term25612.getClass(), "content", "");
        setIntField(term25615, term25615.getClass(), "fontColor", 836734074);
        setIntField(term25615, term25615.getClass(), "fontSize", 25);
        setIntField(term25615, term25615.getClass(), "textSpeed", -1747711865);
        setIntField(term25615, term25615.getClass(), "transitionType", 1);
        setIntField(term25615, term25615.getClass(), "popupStyle", 682812715);
        setField(term25612, term25612.getClass(), "danMuFormatData", term25615);
        setField(term25612, term25612.getClass(), "timestamp", term25621);
        setField(term25612, term25612.getClass(), "msgType", "");
        Long term25633 = new Long(-6645965768855543712L);
        Object term25624 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term25625 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term25627 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term25625, term25625.getClass(), "uid", null);
        setField(term25625, term25625.getClass(), "nickName", null);
        setField(term25624, term25624.getClass(), "userIfo", term25625);
        setField(term25624, term25624.getClass(), "content", "");
        setIntField(term25627, term25627.getClass(), "fontColor", -1092883950);
        setIntField(term25627, term25627.getClass(), "fontSize", 25);
        setIntField(term25627, term25627.getClass(), "textSpeed", 950385621);
        setIntField(term25627, term25627.getClass(), "transitionType", 1);
        setIntField(term25627, term25627.getClass(), "popupStyle", -232352320);
        setField(term25624, term25624.getClass(), "danMuFormatData", term25627);
        setField(term25624, term25624.getClass(), "timestamp", term25633);
        setField(term25624, term25624.getClass(), "msgType", "");
        ArrayList term25610 = new ArrayList();
        ((ArrayList) term25610).add(term25612);
        ((ArrayList) term25610).add(term25624);
        term25465 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        Object term25466 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term25530 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term25576 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term25579 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term25582 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term25584 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term25592 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term25593 = newInstance(Class.forName("java.lang.Object"));
        Object[] term25594 = (Object[]) newArray("java.lang.Object", 1);
        Object term25597 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term25599 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term25601 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term25466, term25466.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        setField(term25466, term25466.getClass(), "level", null);
        setIntField(term25466, term25466.getClass(), "effectiveLevelInt", -2147483648);
        setField(term25530, term25530.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo");
        setField(term25530, term25530.getClass(), "level", null);
        setIntField(term25530, term25530.getClass(), "effectiveLevelInt", -2147483648);
        setField(term25576, term25576.getClass(), "name", "");
        setField(term25576, term25576.getClass(), "level", null);
        setIntField(term25576, term25576.getClass(), "effectiveLevelInt", -2147483648);
        setField(term25579, term25579.getClass(), "name", null);
        setField(term25579, term25579.getClass(), "level", null);
        setIntField(term25579, term25579.getClass(), "effectiveLevelInt", -2147483648);
        setField(term25579, term25579.getClass(), "parent", null);
        setField(term25579, term25579.getClass(), "childrenList", null);
        setField(term25579, term25579.getClass(), "aai", null);
        setBooleanField(term25579, term25579.getClass(), "additive", true);
        setField(term25579, term25579.getClass(), "loggerContext", null);
        setField(term25576, term25576.getClass(), "parent", term25579);
        setField(term25582, term25582.getClass(), "lock", null);
        setField(term25582, term25582.getClass(), "array", null);
        setField(term25576, term25576.getClass(), "childrenList", term25582);
        setField(term25576, term25576.getClass(), "aai", null);
        setBooleanField(term25576, term25576.getClass(), "additive", true);
        setField(term25584, term25584.getClass(), "root", null);
        setIntField(term25584, term25584.getClass(), "size", 34);
        setIntField(term25584, term25584.getClass(), "noAppenderWarning", 0);
        setField(term25584, term25584.getClass(), "loggerContextListenerList", null);
        setField(term25584, term25584.getClass(), "loggerCache", null);
        setField(term25584, term25584.getClass(), "loggerContextRemoteView", null);
        setField(term25584, term25584.getClass(), "turboFilterList", null);
        setBooleanField(term25584, term25584.getClass(), "packagingDataEnabled", false);
        setIntField(term25584, term25584.getClass(), "maxCallerDataDepth", 8);
        setIntField(term25584, term25584.getClass(), "resetCount", 0);
        setField(term25584, term25584.getClass(), "frameworkPackages", null);
        setLongField(term25584, term25584.getClass(), "birthTime", 1786460230244L);
        setField(term25584, term25584.getClass(), "name", null);
        setField(term25584, term25584.getClass(), "sm", null);
        setField(term25584, term25584.getClass(), "propertyMap", null);
        setField(term25584, term25584.getClass(), "objectMap", null);
        setField(term25584, term25584.getClass(), "configurationLock", null);
        setField(term25584, term25584.getClass(), "scheduledExecutorService", null);
        setField(term25584, term25584.getClass(), "scheduledFutures", null);
        setField(term25584, term25584.getClass(), "lifeCycleManager", null);
        setBooleanField(term25584, term25584.getClass(), "started", false);
        setField(term25576, term25576.getClass(), "loggerContext", term25584);
        setField(term25530, term25530.getClass(), "parent", term25576);
        setField(term25592, term25592.getClass(), "lock", term25593);
        setElement(term25594, 0, term25466);
        setField(term25592, term25592.getClass(), "array", term25594);
        setField(term25530, term25530.getClass(), "childrenList", term25592);
        setField(term25530, term25530.getClass(), "aai", null);
        setBooleanField(term25530, term25530.getClass(), "additive", true);
        setField(term25530, term25530.getClass(), "loggerContext", term25584);
        setField(term25466, term25466.getClass(), "parent", term25530);
        setField(term25466, term25466.getClass(), "childrenList", null);
        setField(term25466, term25466.getClass(), "aai", null);
        setBooleanField(term25466, term25466.getClass(), "additive", true);
        setField(term25466, term25466.getClass(), "loggerContext", term25584);
        setField(term25465, term25465.getClass(), "logger", term25466);
        setLongField(term25597, term25597.getClass(), "value", 0L);
        setField(term25465, term25465.getClass(), "total", term25597);
        setLongField(term25599, term25599.getClass(), "value", 0L);
        setField(term25465, term25465.getClass(), "successNum", term25599);
        setLongField(term25601, term25601.getClass(), "value", 0L);
        setField(term25465, term25465.getClass(), "failNum", term25601);
        setLongField(term25465, term25465.getClass(), "startTime", 1786460352909L);
        setIntField(term25465, term25465.getClass(), "lastWorkVideoPartIndex", 788630042);
        setIntField(term25465, term25465.getClass(), "lastWorkDataPageNum", 1430066560);
        setLongField(term25465, term25465.getClass(), "lastSuccessTime", -7163612258041042650L);
        setLongField(term25465, term25465.getClass(), "lastFailTimeSuccessNum", -7186158121023817313L);
        setLongField(term25465, term25465.getClass(), "lastFailTime", 1786460352909L);
        setLongField(term25465, term25465.getClass(), "lastFailNum", -8510452367371037137L);
        setField(term25465, term25465.getClass(), "residueDataList", term25610);
        setField(term25465, term25465.getClass(), "processedVideoData", null);
        term25638 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term25638, term25638.getClass(), "value", 2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.atomic.AtomicLong");
        Object[] args = new Object[1];
        args[0] = term25638;
        callMethod(klass, "setTotal", argTypes, term25465, args);
    }

};


