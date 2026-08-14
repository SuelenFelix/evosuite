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

public class DanMuSenderResult_setProcessedVideoData_199384323420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29778;
     Object term29951;

    public DanMuSenderResult_setProcessedVideoData_199384323420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29934 = new Long(-9040825890007374809L);
        Object term29925 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term29926 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term29928 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term29926, term29926.getClass(), "uid", null);
        setField(term29926, term29926.getClass(), "nickName", null);
        setField(term29925, term29925.getClass(), "userIfo", term29926);
        setField(term29925, term29925.getClass(), "content", "");
        setIntField(term29928, term29928.getClass(), "fontColor", 1302110708);
        setIntField(term29928, term29928.getClass(), "fontSize", 25);
        setIntField(term29928, term29928.getClass(), "textSpeed", 594705497);
        setIntField(term29928, term29928.getClass(), "transitionType", 1);
        setIntField(term29928, term29928.getClass(), "popupStyle", -600102466);
        setField(term29925, term29925.getClass(), "danMuFormatData", term29928);
        setField(term29925, term29925.getClass(), "timestamp", term29934);
        setField(term29925, term29925.getClass(), "msgType", "");
        Long term29946 = new Long(1368340889161782793L);
        Object term29937 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term29938 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term29940 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term29938, term29938.getClass(), "uid", null);
        setField(term29938, term29938.getClass(), "nickName", null);
        setField(term29937, term29937.getClass(), "userIfo", term29938);
        setField(term29937, term29937.getClass(), "content", "");
        setIntField(term29940, term29940.getClass(), "fontColor", -899986714);
        setIntField(term29940, term29940.getClass(), "fontSize", 25);
        setIntField(term29940, term29940.getClass(), "textSpeed", 1307244466);
        setIntField(term29940, term29940.getClass(), "transitionType", 1);
        setIntField(term29940, term29940.getClass(), "popupStyle", -252262096);
        setField(term29937, term29937.getClass(), "danMuFormatData", term29940);
        setField(term29937, term29937.getClass(), "timestamp", term29946);
        setField(term29937, term29937.getClass(), "msgType", "");
        ArrayList term29923 = new ArrayList();
        ((ArrayList) term29923).add(term29925);
        ((ArrayList) term29923).add(term29937);
        term29778 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        Object term29779 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29843 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29889 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29892 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29895 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term29897 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term29905 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term29906 = newInstance(Class.forName("java.lang.Object"));
        Object[] term29907 = (Object[]) newArray("java.lang.Object", 1);
        Object term29910 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term29912 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term29914 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term29779, term29779.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        setField(term29779, term29779.getClass(), "level", null);
        setIntField(term29779, term29779.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29843, term29843.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo");
        setField(term29843, term29843.getClass(), "level", null);
        setIntField(term29843, term29843.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29889, term29889.getClass(), "name", "");
        setField(term29889, term29889.getClass(), "level", null);
        setIntField(term29889, term29889.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29892, term29892.getClass(), "name", null);
        setField(term29892, term29892.getClass(), "level", null);
        setIntField(term29892, term29892.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29892, term29892.getClass(), "parent", null);
        setField(term29892, term29892.getClass(), "childrenList", null);
        setField(term29892, term29892.getClass(), "aai", null);
        setBooleanField(term29892, term29892.getClass(), "additive", true);
        setField(term29892, term29892.getClass(), "loggerContext", null);
        setField(term29889, term29889.getClass(), "parent", term29892);
        setField(term29895, term29895.getClass(), "lock", null);
        setField(term29895, term29895.getClass(), "array", null);
        setField(term29889, term29889.getClass(), "childrenList", term29895);
        setField(term29889, term29889.getClass(), "aai", null);
        setBooleanField(term29889, term29889.getClass(), "additive", true);
        setField(term29897, term29897.getClass(), "root", null);
        setIntField(term29897, term29897.getClass(), "size", 34);
        setIntField(term29897, term29897.getClass(), "noAppenderWarning", 0);
        setField(term29897, term29897.getClass(), "loggerContextListenerList", null);
        setField(term29897, term29897.getClass(), "loggerCache", null);
        setField(term29897, term29897.getClass(), "loggerContextRemoteView", null);
        setField(term29897, term29897.getClass(), "turboFilterList", null);
        setBooleanField(term29897, term29897.getClass(), "packagingDataEnabled", false);
        setIntField(term29897, term29897.getClass(), "maxCallerDataDepth", 8);
        setIntField(term29897, term29897.getClass(), "resetCount", 0);
        setField(term29897, term29897.getClass(), "frameworkPackages", null);
        setLongField(term29897, term29897.getClass(), "birthTime", 1786460230244L);
        setField(term29897, term29897.getClass(), "name", null);
        setField(term29897, term29897.getClass(), "sm", null);
        setField(term29897, term29897.getClass(), "propertyMap", null);
        setField(term29897, term29897.getClass(), "objectMap", null);
        setField(term29897, term29897.getClass(), "configurationLock", null);
        setField(term29897, term29897.getClass(), "scheduledExecutorService", null);
        setField(term29897, term29897.getClass(), "scheduledFutures", null);
        setField(term29897, term29897.getClass(), "lifeCycleManager", null);
        setBooleanField(term29897, term29897.getClass(), "started", false);
        setField(term29889, term29889.getClass(), "loggerContext", term29897);
        setField(term29843, term29843.getClass(), "parent", term29889);
        setField(term29905, term29905.getClass(), "lock", term29906);
        setElement(term29907, 0, term29779);
        setField(term29905, term29905.getClass(), "array", term29907);
        setField(term29843, term29843.getClass(), "childrenList", term29905);
        setField(term29843, term29843.getClass(), "aai", null);
        setBooleanField(term29843, term29843.getClass(), "additive", true);
        setField(term29843, term29843.getClass(), "loggerContext", term29897);
        setField(term29779, term29779.getClass(), "parent", term29843);
        setField(term29779, term29779.getClass(), "childrenList", null);
        setField(term29779, term29779.getClass(), "aai", null);
        setBooleanField(term29779, term29779.getClass(), "additive", true);
        setField(term29779, term29779.getClass(), "loggerContext", term29897);
        setField(term29778, term29778.getClass(), "logger", term29779);
        setLongField(term29910, term29910.getClass(), "value", 0L);
        setField(term29778, term29778.getClass(), "total", term29910);
        setLongField(term29912, term29912.getClass(), "value", 0L);
        setField(term29778, term29778.getClass(), "successNum", term29912);
        setLongField(term29914, term29914.getClass(), "value", 0L);
        setField(term29778, term29778.getClass(), "failNum", term29914);
        setLongField(term29778, term29778.getClass(), "startTime", 1786460353691L);
        setIntField(term29778, term29778.getClass(), "lastWorkVideoPartIndex", -439999692);
        setIntField(term29778, term29778.getClass(), "lastWorkDataPageNum", 924095007);
        setLongField(term29778, term29778.getClass(), "lastSuccessTime", -1234885562462779381L);
        setLongField(term29778, term29778.getClass(), "lastFailTimeSuccessNum", 2678845111978352940L);
        setLongField(term29778, term29778.getClass(), "lastFailTime", 1786460353691L);
        setLongField(term29778, term29778.getClass(), "lastFailNum", 873013799050926004L);
        setField(term29778, term29778.getClass(), "residueDataList", term29923);
        setField(term29778, term29778.getClass(), "processedVideoData", null);
        term29951 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29951;
        callMethod(klass, "setProcessedVideoData", argTypes, term29778, args);
    }

};


