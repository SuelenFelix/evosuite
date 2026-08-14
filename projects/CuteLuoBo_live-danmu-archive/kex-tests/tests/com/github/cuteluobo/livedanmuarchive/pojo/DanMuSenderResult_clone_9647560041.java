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

public class DanMuSenderResult_clone_9647560041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23934;

    public DanMuSenderResult_clone_9647560041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24090 = new Long(-4920224193275732920L);
        Object term24081 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term24082 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term24084 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term24082, term24082.getClass(), "uid", null);
        setField(term24082, term24082.getClass(), "nickName", null);
        setField(term24081, term24081.getClass(), "userIfo", term24082);
        setField(term24081, term24081.getClass(), "content", "");
        setIntField(term24084, term24084.getClass(), "fontColor", 722787672);
        setIntField(term24084, term24084.getClass(), "fontSize", 25);
        setIntField(term24084, term24084.getClass(), "textSpeed", 2077491675);
        setIntField(term24084, term24084.getClass(), "transitionType", 1);
        setIntField(term24084, term24084.getClass(), "popupStyle", -1728316609);
        setField(term24081, term24081.getClass(), "danMuFormatData", term24084);
        setField(term24081, term24081.getClass(), "timestamp", term24090);
        setField(term24081, term24081.getClass(), "msgType", "");
        Long term24102 = new Long(8428634514691209827L);
        Object term24093 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term24094 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term24096 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term24094, term24094.getClass(), "uid", null);
        setField(term24094, term24094.getClass(), "nickName", null);
        setField(term24093, term24093.getClass(), "userIfo", term24094);
        setField(term24093, term24093.getClass(), "content", "");
        setIntField(term24096, term24096.getClass(), "fontColor", 47118909);
        setIntField(term24096, term24096.getClass(), "fontSize", 25);
        setIntField(term24096, term24096.getClass(), "textSpeed", -2093707412);
        setIntField(term24096, term24096.getClass(), "transitionType", 1);
        setIntField(term24096, term24096.getClass(), "popupStyle", -680627153);
        setField(term24093, term24093.getClass(), "danMuFormatData", term24096);
        setField(term24093, term24093.getClass(), "timestamp", term24102);
        setField(term24093, term24093.getClass(), "msgType", "");
        ArrayList term24079 = new ArrayList();
        ((ArrayList) term24079).add(term24081);
        ((ArrayList) term24079).add(term24093);
        term23934 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        Object term23935 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term23999 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term24045 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term24048 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term24051 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term24053 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term24061 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term24062 = newInstance(Class.forName("java.lang.Object"));
        Object[] term24063 = (Object[]) newArray("java.lang.Object", 1);
        Object term24066 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term24068 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term24070 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term23935, term23935.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        setField(term23935, term23935.getClass(), "level", null);
        setIntField(term23935, term23935.getClass(), "effectiveLevelInt", -2147483648);
        setField(term23999, term23999.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo");
        setField(term23999, term23999.getClass(), "level", null);
        setIntField(term23999, term23999.getClass(), "effectiveLevelInt", -2147483648);
        setField(term24045, term24045.getClass(), "name", "");
        setField(term24045, term24045.getClass(), "level", null);
        setIntField(term24045, term24045.getClass(), "effectiveLevelInt", -2147483648);
        setField(term24048, term24048.getClass(), "name", null);
        setField(term24048, term24048.getClass(), "level", null);
        setIntField(term24048, term24048.getClass(), "effectiveLevelInt", -2147483648);
        setField(term24048, term24048.getClass(), "parent", null);
        setField(term24048, term24048.getClass(), "childrenList", null);
        setField(term24048, term24048.getClass(), "aai", null);
        setBooleanField(term24048, term24048.getClass(), "additive", true);
        setField(term24048, term24048.getClass(), "loggerContext", null);
        setField(term24045, term24045.getClass(), "parent", term24048);
        setField(term24051, term24051.getClass(), "lock", null);
        setField(term24051, term24051.getClass(), "array", null);
        setField(term24045, term24045.getClass(), "childrenList", term24051);
        setField(term24045, term24045.getClass(), "aai", null);
        setBooleanField(term24045, term24045.getClass(), "additive", true);
        setField(term24053, term24053.getClass(), "root", null);
        setIntField(term24053, term24053.getClass(), "size", 34);
        setIntField(term24053, term24053.getClass(), "noAppenderWarning", 0);
        setField(term24053, term24053.getClass(), "loggerContextListenerList", null);
        setField(term24053, term24053.getClass(), "loggerCache", null);
        setField(term24053, term24053.getClass(), "loggerContextRemoteView", null);
        setField(term24053, term24053.getClass(), "turboFilterList", null);
        setBooleanField(term24053, term24053.getClass(), "packagingDataEnabled", false);
        setIntField(term24053, term24053.getClass(), "maxCallerDataDepth", 8);
        setIntField(term24053, term24053.getClass(), "resetCount", 0);
        setField(term24053, term24053.getClass(), "frameworkPackages", null);
        setLongField(term24053, term24053.getClass(), "birthTime", 1786460230244L);
        setField(term24053, term24053.getClass(), "name", null);
        setField(term24053, term24053.getClass(), "sm", null);
        setField(term24053, term24053.getClass(), "propertyMap", null);
        setField(term24053, term24053.getClass(), "objectMap", null);
        setField(term24053, term24053.getClass(), "configurationLock", null);
        setField(term24053, term24053.getClass(), "scheduledExecutorService", null);
        setField(term24053, term24053.getClass(), "scheduledFutures", null);
        setField(term24053, term24053.getClass(), "lifeCycleManager", null);
        setBooleanField(term24053, term24053.getClass(), "started", false);
        setField(term24045, term24045.getClass(), "loggerContext", term24053);
        setField(term23999, term23999.getClass(), "parent", term24045);
        setField(term24061, term24061.getClass(), "lock", term24062);
        setElement(term24063, 0, term23935);
        setField(term24061, term24061.getClass(), "array", term24063);
        setField(term23999, term23999.getClass(), "childrenList", term24061);
        setField(term23999, term23999.getClass(), "aai", null);
        setBooleanField(term23999, term23999.getClass(), "additive", true);
        setField(term23999, term23999.getClass(), "loggerContext", term24053);
        setField(term23935, term23935.getClass(), "parent", term23999);
        setField(term23935, term23935.getClass(), "childrenList", null);
        setField(term23935, term23935.getClass(), "aai", null);
        setBooleanField(term23935, term23935.getClass(), "additive", true);
        setField(term23935, term23935.getClass(), "loggerContext", term24053);
        setField(term23934, term23934.getClass(), "logger", term23935);
        setLongField(term24066, term24066.getClass(), "value", 0L);
        setField(term23934, term23934.getClass(), "total", term24066);
        setLongField(term24068, term24068.getClass(), "value", 0L);
        setField(term23934, term23934.getClass(), "successNum", term24068);
        setLongField(term24070, term24070.getClass(), "value", 0L);
        setField(term23934, term23934.getClass(), "failNum", term24070);
        setLongField(term23934, term23934.getClass(), "startTime", 1786460352620L);
        setIntField(term23934, term23934.getClass(), "lastWorkVideoPartIndex", 297582552);
        setIntField(term23934, term23934.getClass(), "lastWorkDataPageNum", -1485916498);
        setLongField(term23934, term23934.getClass(), "lastSuccessTime", 987797117310260031L);
        setLongField(term23934, term23934.getClass(), "lastFailTimeSuccessNum", -4703513086610650698L);
        setLongField(term23934, term23934.getClass(), "lastFailTime", 1786460352620L);
        setLongField(term23934, term23934.getClass(), "lastFailNum", -8123300791906968552L);
        setField(term23934, term23934.getClass(), "residueDataList", term24079);
        setField(term23934, term23934.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term23934, args);
    }

};


