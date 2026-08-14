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

public class DanMuSenderCommand_help_6370016461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2104;
     Object term2486;

    public DanMuSenderCommand_help_6370016461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2391 = new HashMap();
        term2104 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.DanMuSenderCommand"));
        Object term2253 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2332 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2232 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2235 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term2238 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2240 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term2386 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term2387 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2388 = (Object[]) newArray("java.lang.Object", 1);
        Object[] term2432 = (Object[]) newArray("java.lang.String", 1);
        setField(term2253, term2253.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.command.base.AbstractCompositeCommand");
        setField(term2253, term2253.getClass(), "level", null);
        setIntField(term2253, term2253.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2332, term2332.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.command.base");
        setField(term2332, term2332.getClass(), "level", null);
        setIntField(term2332, term2332.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2232, term2232.getClass(), "name", "");
        setField(term2232, term2232.getClass(), "level", null);
        setIntField(term2232, term2232.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2235, term2235.getClass(), "name", null);
        setField(term2235, term2235.getClass(), "level", null);
        setIntField(term2235, term2235.getClass(), "effectiveLevelInt", -2147483648);
        setField(term2235, term2235.getClass(), "parent", null);
        setField(term2235, term2235.getClass(), "childrenList", null);
        setField(term2235, term2235.getClass(), "aai", null);
        setBooleanField(term2235, term2235.getClass(), "additive", true);
        setField(term2235, term2235.getClass(), "loggerContext", null);
        setField(term2232, term2232.getClass(), "parent", term2235);
        setField(term2238, term2238.getClass(), "lock", null);
        setField(term2238, term2238.getClass(), "array", null);
        setField(term2232, term2232.getClass(), "childrenList", term2238);
        setField(term2232, term2232.getClass(), "aai", null);
        setBooleanField(term2232, term2232.getClass(), "additive", true);
        setField(term2240, term2240.getClass(), "root", null);
        setIntField(term2240, term2240.getClass(), "size", 38);
        setIntField(term2240, term2240.getClass(), "noAppenderWarning", 0);
        setField(term2240, term2240.getClass(), "loggerContextListenerList", null);
        setField(term2240, term2240.getClass(), "loggerCache", null);
        setField(term2240, term2240.getClass(), "loggerContextRemoteView", null);
        setField(term2240, term2240.getClass(), "turboFilterList", null);
        setBooleanField(term2240, term2240.getClass(), "packagingDataEnabled", false);
        setIntField(term2240, term2240.getClass(), "maxCallerDataDepth", 8);
        setIntField(term2240, term2240.getClass(), "resetCount", 0);
        setField(term2240, term2240.getClass(), "frameworkPackages", null);
        setLongField(term2240, term2240.getClass(), "birthTime", 1786458530797L);
        setField(term2240, term2240.getClass(), "name", null);
        setField(term2240, term2240.getClass(), "sm", null);
        setField(term2240, term2240.getClass(), "propertyMap", null);
        setField(term2240, term2240.getClass(), "objectMap", null);
        setField(term2240, term2240.getClass(), "configurationLock", null);
        setField(term2240, term2240.getClass(), "scheduledExecutorService", null);
        setField(term2240, term2240.getClass(), "scheduledFutures", null);
        setField(term2240, term2240.getClass(), "lifeCycleManager", null);
        setBooleanField(term2240, term2240.getClass(), "started", false);
        setField(term2232, term2232.getClass(), "loggerContext", term2240);
        setField(term2332, term2332.getClass(), "parent", term2232);
        setField(term2386, term2386.getClass(), "lock", term2387);
        setElement(term2388, 0, term2253);
        setField(term2386, term2386.getClass(), "array", term2388);
        setField(term2332, term2332.getClass(), "childrenList", term2386);
        setField(term2332, term2332.getClass(), "aai", null);
        setBooleanField(term2332, term2332.getClass(), "additive", true);
        setField(term2332, term2332.getClass(), "loggerContext", term2240);
        setField(term2253, term2253.getClass(), "parent", term2332);
        setField(term2253, term2253.getClass(), "childrenList", null);
        setField(term2253, term2253.getClass(), "aai", null);
        setBooleanField(term2253, term2253.getClass(), "additive", true);
        setField(term2253, term2253.getClass(), "loggerContext", term2240);
        setField(term2104, term2104.getClass(), "logger", term2253);
        setField(term2104, term2104.getClass(), "subCommandMap", term2391);
        setField(term2104, term2104.getClass(), "commandName", "danMuSender");
        setElement(term2432, 0, "dms");
        setField(term2104, term2104.getClass(), "CommandSecondName", term2432);
        setField(term2104, term2104.getClass(), "commandDescription", "9_U^\uFFEA\uFF81\uFFA8R\uFFD1S\u0001\uFF90M\uFF91n\u007F, \u007FO(ud m s   h e l p \uFFB7\uFF83\uFFD6S.^\uFFA9R");
        term2486 = (Object[]) newArray("java.lang.String", 1);
        setElement(term2486, 0, "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.DanMuSenderCommand");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2486;
        callMethod(klass, "help", argTypes, term2104, args);
    }

};


