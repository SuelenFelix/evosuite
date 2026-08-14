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

public class DanMuSenderResult_getSuccessNum_13014721427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25742;

    public DanMuSenderResult_getSuccessNum_13014721427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25898 = new Long(4784595517102746672L);
        Object term25889 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term25890 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term25892 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term25890, term25890.getClass(), "uid", null);
        setField(term25890, term25890.getClass(), "nickName", null);
        setField(term25889, term25889.getClass(), "userIfo", term25890);
        setField(term25889, term25889.getClass(), "content", "");
        setIntField(term25892, term25892.getClass(), "fontColor", -1602072035);
        setIntField(term25892, term25892.getClass(), "fontSize", 25);
        setIntField(term25892, term25892.getClass(), "textSpeed", 1902624392);
        setIntField(term25892, term25892.getClass(), "transitionType", 1);
        setIntField(term25892, term25892.getClass(), "popupStyle", 904607217);
        setField(term25889, term25889.getClass(), "danMuFormatData", term25892);
        setField(term25889, term25889.getClass(), "timestamp", term25898);
        setField(term25889, term25889.getClass(), "msgType", "");
        Long term25910 = new Long(-7612550318181586304L);
        Object term25901 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term25902 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term25904 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term25902, term25902.getClass(), "uid", null);
        setField(term25902, term25902.getClass(), "nickName", null);
        setField(term25901, term25901.getClass(), "userIfo", term25902);
        setField(term25901, term25901.getClass(), "content", "");
        setIntField(term25904, term25904.getClass(), "fontColor", 434914590);
        setIntField(term25904, term25904.getClass(), "fontSize", 25);
        setIntField(term25904, term25904.getClass(), "textSpeed", 1983756621);
        setIntField(term25904, term25904.getClass(), "transitionType", 1);
        setIntField(term25904, term25904.getClass(), "popupStyle", -2134711835);
        setField(term25901, term25901.getClass(), "danMuFormatData", term25904);
        setField(term25901, term25901.getClass(), "timestamp", term25910);
        setField(term25901, term25901.getClass(), "msgType", "");
        ArrayList term25887 = new ArrayList();
        ((ArrayList) term25887).add(term25889);
        ((ArrayList) term25887).add(term25901);
        term25742 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        Object term25743 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term25807 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term25853 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term25856 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term25859 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term25861 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term25869 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term25870 = newInstance(Class.forName("java.lang.Object"));
        Object[] term25871 = (Object[]) newArray("java.lang.Object", 1);
        Object term25874 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term25876 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term25878 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term25743, term25743.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        setField(term25743, term25743.getClass(), "level", null);
        setIntField(term25743, term25743.getClass(), "effectiveLevelInt", -2147483648);
        setField(term25807, term25807.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo");
        setField(term25807, term25807.getClass(), "level", null);
        setIntField(term25807, term25807.getClass(), "effectiveLevelInt", -2147483648);
        setField(term25853, term25853.getClass(), "name", "");
        setField(term25853, term25853.getClass(), "level", null);
        setIntField(term25853, term25853.getClass(), "effectiveLevelInt", -2147483648);
        setField(term25856, term25856.getClass(), "name", null);
        setField(term25856, term25856.getClass(), "level", null);
        setIntField(term25856, term25856.getClass(), "effectiveLevelInt", -2147483648);
        setField(term25856, term25856.getClass(), "parent", null);
        setField(term25856, term25856.getClass(), "childrenList", null);
        setField(term25856, term25856.getClass(), "aai", null);
        setBooleanField(term25856, term25856.getClass(), "additive", true);
        setField(term25856, term25856.getClass(), "loggerContext", null);
        setField(term25853, term25853.getClass(), "parent", term25856);
        setField(term25859, term25859.getClass(), "lock", null);
        setField(term25859, term25859.getClass(), "array", null);
        setField(term25853, term25853.getClass(), "childrenList", term25859);
        setField(term25853, term25853.getClass(), "aai", null);
        setBooleanField(term25853, term25853.getClass(), "additive", true);
        setField(term25861, term25861.getClass(), "root", null);
        setIntField(term25861, term25861.getClass(), "size", 34);
        setIntField(term25861, term25861.getClass(), "noAppenderWarning", 0);
        setField(term25861, term25861.getClass(), "loggerContextListenerList", null);
        setField(term25861, term25861.getClass(), "loggerCache", null);
        setField(term25861, term25861.getClass(), "loggerContextRemoteView", null);
        setField(term25861, term25861.getClass(), "turboFilterList", null);
        setBooleanField(term25861, term25861.getClass(), "packagingDataEnabled", false);
        setIntField(term25861, term25861.getClass(), "maxCallerDataDepth", 8);
        setIntField(term25861, term25861.getClass(), "resetCount", 0);
        setField(term25861, term25861.getClass(), "frameworkPackages", null);
        setLongField(term25861, term25861.getClass(), "birthTime", 1786460230244L);
        setField(term25861, term25861.getClass(), "name", null);
        setField(term25861, term25861.getClass(), "sm", null);
        setField(term25861, term25861.getClass(), "propertyMap", null);
        setField(term25861, term25861.getClass(), "objectMap", null);
        setField(term25861, term25861.getClass(), "configurationLock", null);
        setField(term25861, term25861.getClass(), "scheduledExecutorService", null);
        setField(term25861, term25861.getClass(), "scheduledFutures", null);
        setField(term25861, term25861.getClass(), "lifeCycleManager", null);
        setBooleanField(term25861, term25861.getClass(), "started", false);
        setField(term25853, term25853.getClass(), "loggerContext", term25861);
        setField(term25807, term25807.getClass(), "parent", term25853);
        setField(term25869, term25869.getClass(), "lock", term25870);
        setElement(term25871, 0, term25743);
        setField(term25869, term25869.getClass(), "array", term25871);
        setField(term25807, term25807.getClass(), "childrenList", term25869);
        setField(term25807, term25807.getClass(), "aai", null);
        setBooleanField(term25807, term25807.getClass(), "additive", true);
        setField(term25807, term25807.getClass(), "loggerContext", term25861);
        setField(term25743, term25743.getClass(), "parent", term25807);
        setField(term25743, term25743.getClass(), "childrenList", null);
        setField(term25743, term25743.getClass(), "aai", null);
        setBooleanField(term25743, term25743.getClass(), "additive", true);
        setField(term25743, term25743.getClass(), "loggerContext", term25861);
        setField(term25742, term25742.getClass(), "logger", term25743);
        setLongField(term25874, term25874.getClass(), "value", 0L);
        setField(term25742, term25742.getClass(), "total", term25874);
        setLongField(term25876, term25876.getClass(), "value", 0L);
        setField(term25742, term25742.getClass(), "successNum", term25876);
        setLongField(term25878, term25878.getClass(), "value", 0L);
        setField(term25742, term25742.getClass(), "failNum", term25878);
        setLongField(term25742, term25742.getClass(), "startTime", 1786460352963L);
        setIntField(term25742, term25742.getClass(), "lastWorkVideoPartIndex", -232333014);
        setIntField(term25742, term25742.getClass(), "lastWorkDataPageNum", -139694079);
        setLongField(term25742, term25742.getClass(), "lastSuccessTime", 2123432481270520381L);
        setLongField(term25742, term25742.getClass(), "lastFailTimeSuccessNum", 7205698466499430091L);
        setLongField(term25742, term25742.getClass(), "lastFailTime", 1786460352963L);
        setLongField(term25742, term25742.getClass(), "lastFailNum", -4868523627266698649L);
        setField(term25742, term25742.getClass(), "residueDataList", term25887);
        setField(term25742, term25742.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessNum", argTypes, term25742, args);
    }

};


