package com.github.cuteluobo.livedanmuarchive.command.impl;

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
import static com.github.cuteluobo.livedanmuarchive.command.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class DanMuSenderCommand_addVideoId_17786427262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2694;
     Object term3076;

    public DanMuSenderCommand_addVideoId_17786427262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2981 = new HashMap();
        term2694 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.DanMuSenderCommand"));
        Object term2843 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2922 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2822 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2825 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2828 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2830 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term2976 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2977 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2978 = (Object[]) newArray("java.lang.Object", 1);
        Object[] term3022 = (Object[]) newArray("java.lang.String", 1);
        setField(term2843, term2843.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.command.base.AbstractCompositeCommand");
        setField(term2843, term2843.getClass(), "level", null);
        setIntField(term2843, term2843.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2922, term2922.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.command.base");
        setField(term2922, term2922.getClass(), "level", null);
        setIntField(term2922, term2922.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2822, term2822.getClass(), "name", "");
        setField(term2822, term2822.getClass(), "level", null);
        setIntField(term2822, term2822.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2825, term2825.getClass(), "name", null);
        setField(term2825, term2825.getClass(), "level", null);
        setIntField(term2825, term2825.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2825, term2825.getClass(), "parent", null);
        setField(term2825, term2825.getClass(), "childrenList", null);
        setField(term2825, term2825.getClass(), "aai", null);
        setBooleanField(term2825, term2825.getClass(), "additive", true);
        setField(term2825, term2825.getClass(), "loggerContext", null);
        setField(term2822, term2822.getClass(), "parent", term2825);
        setField(term2828, term2828.getClass(), "lock", null);
        setField(term2828, term2828.getClass(), "array", null);
        setField(term2822, term2822.getClass(), "childrenList", term2828);
        setField(term2822, term2822.getClass(), "aai", null);
        setBooleanField(term2822, term2822.getClass(), "additive", true);
        setField(term2830, term2830.getClass(), "root", null);
        setIntField(term2830, term2830.getClass(), "size", 38);
        setIntField(term2830, term2830.getClass(), "noAppenderWarning", 0);
        setField(term2830, term2830.getClass(), "loggerContextListenerList", null);
        setField(term2830, term2830.getClass(), "loggerCache", null);
        setField(term2830, term2830.getClass(), "loggerContextRemoteView", null);
        setField(term2830, term2830.getClass(), "turboFilterList", null);
        setBooleanField(term2830, term2830.getClass(), "packagingDataEnabled", false);
        setIntField(term2830, term2830.getClass(), "maxCallerDataDepth", 8);
        setIntField(term2830, term2830.getClass(), "resetCount", 0);
        setField(term2830, term2830.getClass(), "frameworkPackages", null);
        setLongField(term2830, term2830.getClass(), "birthTime", 1786458530797L);
        setField(term2830, term2830.getClass(), "name", null);
        setField(term2830, term2830.getClass(), "sm", null);
        setField(term2830, term2830.getClass(), "propertyMap", null);
        setField(term2830, term2830.getClass(), "objectMap", null);
        setField(term2830, term2830.getClass(), "configurationLock", null);
        setField(term2830, term2830.getClass(), "scheduledExecutorService", null);
        setField(term2830, term2830.getClass(), "scheduledFutures", null);
        setField(term2830, term2830.getClass(), "lifeCycleManager", null);
        setBooleanField(term2830, term2830.getClass(), "started", false);
        setField(term2822, term2822.getClass(), "loggerContext", term2830);
        setField(term2922, term2922.getClass(), "parent", term2822);
        setField(term2976, term2976.getClass(), "lock", term2977);
        setElement(term2978, 0, term2843);
        setField(term2976, term2976.getClass(), "array", term2978);
        setField(term2922, term2922.getClass(), "childrenList", term2976);
        setField(term2922, term2922.getClass(), "aai", null);
        setBooleanField(term2922, term2922.getClass(), "additive", true);
        setField(term2922, term2922.getClass(), "loggerContext", term2830);
        setField(term2843, term2843.getClass(), "parent", term2922);
        setField(term2843, term2843.getClass(), "childrenList", null);
        setField(term2843, term2843.getClass(), "aai", null);
        setBooleanField(term2843, term2843.getClass(), "additive", true);
        setField(term2843, term2843.getClass(), "loggerContext", term2830);
        setField(term2694, term2694.getClass(), "logger", term2843);
        setField(term2694, term2694.getClass(), "subCommandMap", term2981);
        setField(term2694, term2694.getClass(), "commandName", "danMuSender");
        setElement(term3022, 0, "dms");
        setField(term2694, term2694.getClass(), "CommandSecondName", term3022);
        setField(term2694, term2694.getClass(), "commandDescription", "9_U^\uFFEA\uFF81\uFFA8R\uFFD1S\u0001\uFF90M\uFF91n\u007F, \u007FO(ud m s   h e l p \uFFB7\uFF83\uFFD6S.^\uFFA9R");
        term3076 = (Object[]) newArray("java.lang.String", 6);
        setElement(term3076, 0, "HyxfbSQYBe");
        setElement(term3076, 1, "pCTimMblYc");
        setElement(term3076, 2, "hNxWaHcfhY");
        setElement(term3076, 3, "RkybSrpybU");
        setElement(term3076, 4, "xOEqzGAmDU");
        setElement(term3076, 5, "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.DanMuSenderCommand");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3076;
        callMethod(klass, "addVideoId", argTypes, term2694, args);
    }

};


