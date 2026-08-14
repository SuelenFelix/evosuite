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

public class DanMuSenderResult_success_9619724433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24520;

    public DanMuSenderResult_success_9619724433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24676 = new Long(-7672528020740371001L);
        Object term24667 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term24668 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term24670 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term24668, term24668.getClass(), "uid", null);
        setField(term24668, term24668.getClass(), "nickName", null);
        setField(term24667, term24667.getClass(), "userIfo", term24668);
        setField(term24667, term24667.getClass(), "content", "");
        setIntField(term24670, term24670.getClass(), "fontColor", -68615285);
        setIntField(term24670, term24670.getClass(), "fontSize", 25);
        setIntField(term24670, term24670.getClass(), "textSpeed", -337504086);
        setIntField(term24670, term24670.getClass(), "transitionType", 1);
        setIntField(term24670, term24670.getClass(), "popupStyle", 2074130991);
        setField(term24667, term24667.getClass(), "danMuFormatData", term24670);
        setField(term24667, term24667.getClass(), "timestamp", term24676);
        setField(term24667, term24667.getClass(), "msgType", "");
        ArrayList term24665 = new ArrayList();
        ((ArrayList) term24665).add(term24667);
        term24520 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        Object term24521 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term24585 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term24631 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term24634 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term24637 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term24639 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term24647 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term24648 = newInstance(Class.forName("java.lang.Object"));
        Object[] term24649 = (Object[]) newArray("java.lang.Object", 1);
        Object term24652 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term24654 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term24656 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term24521, term24521.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        setField(term24521, term24521.getClass(), "level", null);
        setIntField(term24521, term24521.getClass(), "effectiveLevelInt", -2147483648);
        setField(term24585, term24585.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo");
        setField(term24585, term24585.getClass(), "level", null);
        setIntField(term24585, term24585.getClass(), "effectiveLevelInt", -2147483648);
        setField(term24631, term24631.getClass(), "name", "");
        setField(term24631, term24631.getClass(), "level", null);
        setIntField(term24631, term24631.getClass(), "effectiveLevelInt", -2147483648);
        setField(term24634, term24634.getClass(), "name", null);
        setField(term24634, term24634.getClass(), "level", null);
        setIntField(term24634, term24634.getClass(), "effectiveLevelInt", -2147483648);
        setField(term24634, term24634.getClass(), "parent", null);
        setField(term24634, term24634.getClass(), "childrenList", null);
        setField(term24634, term24634.getClass(), "aai", null);
        setBooleanField(term24634, term24634.getClass(), "additive", true);
        setField(term24634, term24634.getClass(), "loggerContext", null);
        setField(term24631, term24631.getClass(), "parent", term24634);
        setField(term24637, term24637.getClass(), "lock", null);
        setField(term24637, term24637.getClass(), "array", null);
        setField(term24631, term24631.getClass(), "childrenList", term24637);
        setField(term24631, term24631.getClass(), "aai", null);
        setBooleanField(term24631, term24631.getClass(), "additive", true);
        setField(term24639, term24639.getClass(), "root", null);
        setIntField(term24639, term24639.getClass(), "size", 34);
        setIntField(term24639, term24639.getClass(), "noAppenderWarning", 0);
        setField(term24639, term24639.getClass(), "loggerContextListenerList", null);
        setField(term24639, term24639.getClass(), "loggerCache", null);
        setField(term24639, term24639.getClass(), "loggerContextRemoteView", null);
        setField(term24639, term24639.getClass(), "turboFilterList", null);
        setBooleanField(term24639, term24639.getClass(), "packagingDataEnabled", false);
        setIntField(term24639, term24639.getClass(), "maxCallerDataDepth", 8);
        setIntField(term24639, term24639.getClass(), "resetCount", 0);
        setField(term24639, term24639.getClass(), "frameworkPackages", null);
        setLongField(term24639, term24639.getClass(), "birthTime", 1786460230244L);
        setField(term24639, term24639.getClass(), "name", null);
        setField(term24639, term24639.getClass(), "sm", null);
        setField(term24639, term24639.getClass(), "propertyMap", null);
        setField(term24639, term24639.getClass(), "objectMap", null);
        setField(term24639, term24639.getClass(), "configurationLock", null);
        setField(term24639, term24639.getClass(), "scheduledExecutorService", null);
        setField(term24639, term24639.getClass(), "scheduledFutures", null);
        setField(term24639, term24639.getClass(), "lifeCycleManager", null);
        setBooleanField(term24639, term24639.getClass(), "started", false);
        setField(term24631, term24631.getClass(), "loggerContext", term24639);
        setField(term24585, term24585.getClass(), "parent", term24631);
        setField(term24647, term24647.getClass(), "lock", term24648);
        setElement(term24649, 0, term24521);
        setField(term24647, term24647.getClass(), "array", term24649);
        setField(term24585, term24585.getClass(), "childrenList", term24647);
        setField(term24585, term24585.getClass(), "aai", null);
        setBooleanField(term24585, term24585.getClass(), "additive", true);
        setField(term24585, term24585.getClass(), "loggerContext", term24639);
        setField(term24521, term24521.getClass(), "parent", term24585);
        setField(term24521, term24521.getClass(), "childrenList", null);
        setField(term24521, term24521.getClass(), "aai", null);
        setBooleanField(term24521, term24521.getClass(), "additive", true);
        setField(term24521, term24521.getClass(), "loggerContext", term24639);
        setField(term24520, term24520.getClass(), "logger", term24521);
        setLongField(term24652, term24652.getClass(), "value", 0L);
        setField(term24520, term24520.getClass(), "total", term24652);
        setLongField(term24654, term24654.getClass(), "value", 0L);
        setField(term24520, term24520.getClass(), "successNum", term24654);
        setLongField(term24656, term24656.getClass(), "value", 0L);
        setField(term24520, term24520.getClass(), "failNum", term24656);
        setLongField(term24520, term24520.getClass(), "startTime", 1786460352734L);
        setIntField(term24520, term24520.getClass(), "lastWorkVideoPartIndex", 588390599);
        setIntField(term24520, term24520.getClass(), "lastWorkDataPageNum", -95969566);
        setLongField(term24520, term24520.getClass(), "lastSuccessTime", 1592020674405941254L);
        setLongField(term24520, term24520.getClass(), "lastFailTimeSuccessNum", 4098407345651793258L);
        setLongField(term24520, term24520.getClass(), "lastFailTime", 1786460352734L);
        setLongField(term24520, term24520.getClass(), "lastFailNum", 3128610259359668233L);
        setField(term24520, term24520.getClass(), "residueDataList", term24665);
        setField(term24520, term24520.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "success", argTypes, term24520, args);
    }

};


