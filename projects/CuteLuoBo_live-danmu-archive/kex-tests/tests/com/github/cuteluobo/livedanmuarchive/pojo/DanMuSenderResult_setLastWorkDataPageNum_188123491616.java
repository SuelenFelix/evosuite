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
import java.lang.Integer;

public class DanMuSenderResult_setLastWorkDataPageNum_188123491616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28734;
     Object term28883;

    public DanMuSenderResult_setLastWorkDataPageNum_188123491616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28879 = new ArrayList();
        term28734 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        Object term28735 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term28799 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term28845 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term28848 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term28851 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term28853 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term28861 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term28862 = newInstance(Class.forName("java.lang.Object"));
        Object[] term28863 = (Object[]) newArray("java.lang.Object", 1);
        Object term28866 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term28868 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term28870 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term28735, term28735.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        setField(term28735, term28735.getClass(), "level", null);
        setIntField(term28735, term28735.getClass(), "effectiveLevelInt", -2147483648);
        setField(term28799, term28799.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo");
        setField(term28799, term28799.getClass(), "level", null);
        setIntField(term28799, term28799.getClass(), "effectiveLevelInt", -2147483648);
        setField(term28845, term28845.getClass(), "name", "");
        setField(term28845, term28845.getClass(), "level", null);
        setIntField(term28845, term28845.getClass(), "effectiveLevelInt", -2147483648);
        setField(term28848, term28848.getClass(), "name", null);
        setField(term28848, term28848.getClass(), "level", null);
        setIntField(term28848, term28848.getClass(), "effectiveLevelInt", -2147483648);
        setField(term28848, term28848.getClass(), "parent", null);
        setField(term28848, term28848.getClass(), "childrenList", null);
        setField(term28848, term28848.getClass(), "aai", null);
        setBooleanField(term28848, term28848.getClass(), "additive", true);
        setField(term28848, term28848.getClass(), "loggerContext", null);
        setField(term28845, term28845.getClass(), "parent", term28848);
        setField(term28851, term28851.getClass(), "lock", null);
        setField(term28851, term28851.getClass(), "array", null);
        setField(term28845, term28845.getClass(), "childrenList", term28851);
        setField(term28845, term28845.getClass(), "aai", null);
        setBooleanField(term28845, term28845.getClass(), "additive", true);
        setField(term28853, term28853.getClass(), "root", null);
        setIntField(term28853, term28853.getClass(), "size", 34);
        setIntField(term28853, term28853.getClass(), "noAppenderWarning", 0);
        setField(term28853, term28853.getClass(), "loggerContextListenerList", null);
        setField(term28853, term28853.getClass(), "loggerCache", null);
        setField(term28853, term28853.getClass(), "loggerContextRemoteView", null);
        setField(term28853, term28853.getClass(), "turboFilterList", null);
        setBooleanField(term28853, term28853.getClass(), "packagingDataEnabled", false);
        setIntField(term28853, term28853.getClass(), "maxCallerDataDepth", 8);
        setIntField(term28853, term28853.getClass(), "resetCount", 0);
        setField(term28853, term28853.getClass(), "frameworkPackages", null);
        setLongField(term28853, term28853.getClass(), "birthTime", 1786460230244L);
        setField(term28853, term28853.getClass(), "name", null);
        setField(term28853, term28853.getClass(), "sm", null);
        setField(term28853, term28853.getClass(), "propertyMap", null);
        setField(term28853, term28853.getClass(), "objectMap", null);
        setField(term28853, term28853.getClass(), "configurationLock", null);
        setField(term28853, term28853.getClass(), "scheduledExecutorService", null);
        setField(term28853, term28853.getClass(), "scheduledFutures", null);
        setField(term28853, term28853.getClass(), "lifeCycleManager", null);
        setBooleanField(term28853, term28853.getClass(), "started", false);
        setField(term28845, term28845.getClass(), "loggerContext", term28853);
        setField(term28799, term28799.getClass(), "parent", term28845);
        setField(term28861, term28861.getClass(), "lock", term28862);
        setElement(term28863, 0, term28735);
        setField(term28861, term28861.getClass(), "array", term28863);
        setField(term28799, term28799.getClass(), "childrenList", term28861);
        setField(term28799, term28799.getClass(), "aai", null);
        setBooleanField(term28799, term28799.getClass(), "additive", true);
        setField(term28799, term28799.getClass(), "loggerContext", term28853);
        setField(term28735, term28735.getClass(), "parent", term28799);
        setField(term28735, term28735.getClass(), "childrenList", null);
        setField(term28735, term28735.getClass(), "aai", null);
        setBooleanField(term28735, term28735.getClass(), "additive", true);
        setField(term28735, term28735.getClass(), "loggerContext", term28853);
        setField(term28734, term28734.getClass(), "logger", term28735);
        setLongField(term28866, term28866.getClass(), "value", 0L);
        setField(term28734, term28734.getClass(), "total", term28866);
        setLongField(term28868, term28868.getClass(), "value", 0L);
        setField(term28734, term28734.getClass(), "successNum", term28868);
        setLongField(term28870, term28870.getClass(), "value", 0L);
        setField(term28734, term28734.getClass(), "failNum", term28870);
        setLongField(term28734, term28734.getClass(), "startTime", 1786460353489L);
        setIntField(term28734, term28734.getClass(), "lastWorkVideoPartIndex", -1823255084);
        setIntField(term28734, term28734.getClass(), "lastWorkDataPageNum", 793345010);
        setLongField(term28734, term28734.getClass(), "lastSuccessTime", -3988042285731673145L);
        setLongField(term28734, term28734.getClass(), "lastFailTimeSuccessNum", 1729206737148270563L);
        setLongField(term28734, term28734.getClass(), "lastFailTime", 1786460353489L);
        setLongField(term28734, term28734.getClass(), "lastFailNum", -932981811228171529L);
        setField(term28734, term28734.getClass(), "residueDataList", term28879);
        setField(term28734, term28734.getClass(), "processedVideoData", null);
        term28883 = new Integer(-2092117838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28883;
        callMethod(klass, "setLastWorkDataPageNum", argTypes, term28734, args);
    }

};


