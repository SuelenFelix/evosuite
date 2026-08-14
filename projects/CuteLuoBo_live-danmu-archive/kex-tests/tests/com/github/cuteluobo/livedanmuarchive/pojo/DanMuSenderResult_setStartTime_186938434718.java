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

public class DanMuSenderResult_setStartTime_186938434718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29274;
     Object term29423;

    public DanMuSenderResult_setStartTime_186938434718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29419 = new ArrayList();
        term29274 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        Object term29275 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29339 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29385 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29388 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29391 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term29393 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term29401 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term29402 = newInstance(Class.forName("java.lang.Object"));
        Object[] term29403 = (Object[]) newArray("java.lang.Object", 1);
        Object term29406 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term29408 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term29410 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term29275, term29275.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        setField(term29275, term29275.getClass(), "level", null);
        setIntField(term29275, term29275.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29339, term29339.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo");
        setField(term29339, term29339.getClass(), "level", null);
        setIntField(term29339, term29339.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29385, term29385.getClass(), "name", "");
        setField(term29385, term29385.getClass(), "level", null);
        setIntField(term29385, term29385.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29388, term29388.getClass(), "name", null);
        setField(term29388, term29388.getClass(), "level", null);
        setIntField(term29388, term29388.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29388, term29388.getClass(), "parent", null);
        setField(term29388, term29388.getClass(), "childrenList", null);
        setField(term29388, term29388.getClass(), "aai", null);
        setBooleanField(term29388, term29388.getClass(), "additive", true);
        setField(term29388, term29388.getClass(), "loggerContext", null);
        setField(term29385, term29385.getClass(), "parent", term29388);
        setField(term29391, term29391.getClass(), "lock", null);
        setField(term29391, term29391.getClass(), "array", null);
        setField(term29385, term29385.getClass(), "childrenList", term29391);
        setField(term29385, term29385.getClass(), "aai", null);
        setBooleanField(term29385, term29385.getClass(), "additive", true);
        setField(term29393, term29393.getClass(), "root", null);
        setIntField(term29393, term29393.getClass(), "size", 34);
        setIntField(term29393, term29393.getClass(), "noAppenderWarning", 0);
        setField(term29393, term29393.getClass(), "loggerContextListenerList", null);
        setField(term29393, term29393.getClass(), "loggerCache", null);
        setField(term29393, term29393.getClass(), "loggerContextRemoteView", null);
        setField(term29393, term29393.getClass(), "turboFilterList", null);
        setBooleanField(term29393, term29393.getClass(), "packagingDataEnabled", false);
        setIntField(term29393, term29393.getClass(), "maxCallerDataDepth", 8);
        setIntField(term29393, term29393.getClass(), "resetCount", 0);
        setField(term29393, term29393.getClass(), "frameworkPackages", null);
        setLongField(term29393, term29393.getClass(), "birthTime", 1786460230244L);
        setField(term29393, term29393.getClass(), "name", null);
        setField(term29393, term29393.getClass(), "sm", null);
        setField(term29393, term29393.getClass(), "propertyMap", null);
        setField(term29393, term29393.getClass(), "objectMap", null);
        setField(term29393, term29393.getClass(), "configurationLock", null);
        setField(term29393, term29393.getClass(), "scheduledExecutorService", null);
        setField(term29393, term29393.getClass(), "scheduledFutures", null);
        setField(term29393, term29393.getClass(), "lifeCycleManager", null);
        setBooleanField(term29393, term29393.getClass(), "started", false);
        setField(term29385, term29385.getClass(), "loggerContext", term29393);
        setField(term29339, term29339.getClass(), "parent", term29385);
        setField(term29401, term29401.getClass(), "lock", term29402);
        setElement(term29403, 0, term29275);
        setField(term29401, term29401.getClass(), "array", term29403);
        setField(term29339, term29339.getClass(), "childrenList", term29401);
        setField(term29339, term29339.getClass(), "aai", null);
        setBooleanField(term29339, term29339.getClass(), "additive", true);
        setField(term29339, term29339.getClass(), "loggerContext", term29393);
        setField(term29275, term29275.getClass(), "parent", term29339);
        setField(term29275, term29275.getClass(), "childrenList", null);
        setField(term29275, term29275.getClass(), "aai", null);
        setBooleanField(term29275, term29275.getClass(), "additive", true);
        setField(term29275, term29275.getClass(), "loggerContext", term29393);
        setField(term29274, term29274.getClass(), "logger", term29275);
        setLongField(term29406, term29406.getClass(), "value", 0L);
        setField(term29274, term29274.getClass(), "total", term29406);
        setLongField(term29408, term29408.getClass(), "value", 0L);
        setField(term29274, term29274.getClass(), "successNum", term29408);
        setLongField(term29410, term29410.getClass(), "value", 0L);
        setField(term29274, term29274.getClass(), "failNum", term29410);
        setLongField(term29274, term29274.getClass(), "startTime", 1786460353592L);
        setIntField(term29274, term29274.getClass(), "lastWorkVideoPartIndex", -1644358555);
        setIntField(term29274, term29274.getClass(), "lastWorkDataPageNum", -388591034);
        setLongField(term29274, term29274.getClass(), "lastSuccessTime", 4832511106024339541L);
        setLongField(term29274, term29274.getClass(), "lastFailTimeSuccessNum", 7840243516767232066L);
        setLongField(term29274, term29274.getClass(), "lastFailTime", 1786460353592L);
        setLongField(term29274, term29274.getClass(), "lastFailNum", -4069312743655862444L);
        setField(term29274, term29274.getClass(), "residueDataList", term29419);
        setField(term29274, term29274.getClass(), "processedVideoData", null);
        term29423 = new Long(3233502115953753827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term29423;
        callMethod(klass, "setStartTime", argTypes, term29274, args);
    }

};


