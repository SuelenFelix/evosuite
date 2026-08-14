package com.github.cuteluobo.livedanmuarchive.listener.impl;

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
import static com.github.cuteluobo.livedanmuarchive.listener.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class DanMuClientStopListener_doEvent_11156663561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term157;

    public DanMuClientStopListener_doEvent_11156663561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.listener.impl.DanMuClientStopListener"));
        Object term2 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term81 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term136 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term139 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term142 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term144 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term152 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term153 = newInstance(Class.forName("java.lang.Object"));
        Object[] term154 = (Object[]) newArray("java.lang.Object", 1);
        setField(term2, term2.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.listener.impl.DanMuClientStopListener");
        setField(term2, term2.getClass(), "level", null);
        setIntField(term2, term2.getClass(), "effectiveLevelInt", -2147483648);
        setField(term81, term81.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.listener.impl");
        setField(term81, term81.getClass(), "level", null);
        setIntField(term81, term81.getClass(), "effectiveLevelInt", -2147483648);
        setField(term136, term136.getClass(), "name", "");
        setField(term136, term136.getClass(), "level", null);
        setIntField(term136, term136.getClass(), "effectiveLevelInt", -2147483648);
        setField(term139, term139.getClass(), "name", null);
        setField(term139, term139.getClass(), "level", null);
        setIntField(term139, term139.getClass(), "effectiveLevelInt", -2147483648);
        setField(term139, term139.getClass(), "parent", null);
        setField(term139, term139.getClass(), "childrenList", null);
        setField(term139, term139.getClass(), "aai", null);
        setBooleanField(term139, term139.getClass(), "additive", true);
        setField(term139, term139.getClass(), "loggerContext", null);
        setField(term136, term136.getClass(), "parent", term139);
        setField(term142, term142.getClass(), "lock", null);
        setField(term142, term142.getClass(), "array", null);
        setField(term136, term136.getClass(), "childrenList", term142);
        setField(term136, term136.getClass(), "aai", null);
        setBooleanField(term136, term136.getClass(), "additive", true);
        setField(term144, term144.getClass(), "root", null);
        setIntField(term144, term144.getClass(), "size", 33);
        setIntField(term144, term144.getClass(), "noAppenderWarning", 0);
        setField(term144, term144.getClass(), "loggerContextListenerList", null);
        setField(term144, term144.getClass(), "loggerCache", null);
        setField(term144, term144.getClass(), "loggerContextRemoteView", null);
        setField(term144, term144.getClass(), "turboFilterList", null);
        setBooleanField(term144, term144.getClass(), "packagingDataEnabled", false);
        setIntField(term144, term144.getClass(), "maxCallerDataDepth", 8);
        setIntField(term144, term144.getClass(), "resetCount", 0);
        setField(term144, term144.getClass(), "frameworkPackages", null);
        setLongField(term144, term144.getClass(), "birthTime", 1786459488875L);
        setField(term144, term144.getClass(), "name", null);
        setField(term144, term144.getClass(), "sm", null);
        setField(term144, term144.getClass(), "propertyMap", null);
        setField(term144, term144.getClass(), "objectMap", null);
        setField(term144, term144.getClass(), "configurationLock", null);
        setField(term144, term144.getClass(), "scheduledExecutorService", null);
        setField(term144, term144.getClass(), "scheduledFutures", null);
        setField(term144, term144.getClass(), "lifeCycleManager", null);
        setBooleanField(term144, term144.getClass(), "started", false);
        setField(term136, term136.getClass(), "loggerContext", term144);
        setField(term81, term81.getClass(), "parent", term136);
        setField(term152, term152.getClass(), "lock", term153);
        setElement(term154, 0, term2);
        setField(term152, term152.getClass(), "array", term154);
        setField(term81, term81.getClass(), "childrenList", term152);
        setField(term81, term81.getClass(), "aai", null);
        setBooleanField(term81, term81.getClass(), "additive", true);
        setField(term81, term81.getClass(), "loggerContext", term144);
        setField(term2, term2.getClass(), "parent", term81);
        setField(term2, term2.getClass(), "childrenList", null);
        setField(term2, term2.getClass(), "aai", null);
        setBooleanField(term2, term2.getClass(), "additive", true);
        setField(term2, term2.getClass(), "loggerContext", term144);
        setField(term1, term1.getClass(), "logger", term2);
        Class<? extends Object> term454 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term453 = ((Class) term454).getDeclaredField((String) "Bil");
        ((Field) term453).setAccessible(true);
        Object enum0 = ((Field) term453).get((Object) null);
        Boolean term234 = new Boolean(false);
        term157 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult"));
        Object term158 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term158, term158.getClass(), "saveName", "PAEBtnZtTD");
        setField(term158, term158.getClass(), "websiteType", enum0);
        setField(term158, term158.getClass(), "liveRoomUrl", "sjlJAEtRrb");
        setField(term158, term158.getClass(), "liveRoomCode", "MuLcgQHgqz");
        setField(term158, term158.getClass(), "liveAnchorName", "xxtlPwDYFs");
        setField(term157, term157.getClass(), "liveRoomData", term158);
        setField(term157, term157.getClass(), "isWebsocketConnectClose", term234);
        setField(term157, term157.getClass(), "message", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.impl.DanMuClientStopListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult");
        Object[] args = new Object[1];
        args[0] = term157;
        callMethod(klass, "doEvent", argTypes, term1, args);
    }

};


