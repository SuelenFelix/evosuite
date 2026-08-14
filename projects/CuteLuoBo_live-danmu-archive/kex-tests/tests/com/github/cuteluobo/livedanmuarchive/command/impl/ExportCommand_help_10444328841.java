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

public class ExportCommand_help_10444328841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term371;

    public ExportCommand_help_10444328841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term283 = new HashMap();
        term1 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.ExportCommand"));
        Object term145 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term224 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term124 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term127 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term130 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term132 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term278 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term279 = newInstance(Class.forName("java.lang.Object"));
        Object[] term280 = (Object[]) newArray("java.lang.Object", 1);
        Object[] term319 = (Object[]) newArray("java.lang.String", 1);
        setField(term145, term145.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.command.base.AbstractCompositeCommand");
        setField(term145, term145.getClass(), "level", null);
        setIntField(term145, term145.getClass(), "effectiveLevelInt", -2147483648);
        setField(term224, term224.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.command.base");
        setField(term224, term224.getClass(), "level", null);
        setIntField(term224, term224.getClass(), "effectiveLevelInt", -2147483648);
        setField(term124, term124.getClass(), "name", "");
        setField(term124, term124.getClass(), "level", null);
        setIntField(term124, term124.getClass(), "effectiveLevelInt", -2147483648);
        setField(term127, term127.getClass(), "name", null);
        setField(term127, term127.getClass(), "level", null);
        setIntField(term127, term127.getClass(), "effectiveLevelInt", -2147483648);
        setField(term127, term127.getClass(), "parent", null);
        setField(term127, term127.getClass(), "childrenList", null);
        setField(term127, term127.getClass(), "aai", null);
        setBooleanField(term127, term127.getClass(), "additive", true);
        setField(term127, term127.getClass(), "loggerContext", null);
        setField(term124, term124.getClass(), "parent", term127);
        setField(term130, term130.getClass(), "lock", null);
        setField(term130, term130.getClass(), "array", null);
        setField(term124, term124.getClass(), "childrenList", term130);
        setField(term124, term124.getClass(), "aai", null);
        setBooleanField(term124, term124.getClass(), "additive", true);
        setField(term132, term132.getClass(), "root", null);
        setIntField(term132, term132.getClass(), "size", 35);
        setIntField(term132, term132.getClass(), "noAppenderWarning", 0);
        setField(term132, term132.getClass(), "loggerContextListenerList", null);
        setField(term132, term132.getClass(), "loggerCache", null);
        setField(term132, term132.getClass(), "loggerContextRemoteView", null);
        setField(term132, term132.getClass(), "turboFilterList", null);
        setBooleanField(term132, term132.getClass(), "packagingDataEnabled", false);
        setIntField(term132, term132.getClass(), "maxCallerDataDepth", 8);
        setIntField(term132, term132.getClass(), "resetCount", 0);
        setField(term132, term132.getClass(), "frameworkPackages", null);
        setLongField(term132, term132.getClass(), "birthTime", 1786458530797L);
        setField(term132, term132.getClass(), "name", null);
        setField(term132, term132.getClass(), "sm", null);
        setField(term132, term132.getClass(), "propertyMap", null);
        setField(term132, term132.getClass(), "objectMap", null);
        setField(term132, term132.getClass(), "configurationLock", null);
        setField(term132, term132.getClass(), "scheduledExecutorService", null);
        setField(term132, term132.getClass(), "scheduledFutures", null);
        setField(term132, term132.getClass(), "lifeCycleManager", null);
        setBooleanField(term132, term132.getClass(), "started", false);
        setField(term124, term124.getClass(), "loggerContext", term132);
        setField(term224, term224.getClass(), "parent", term124);
        setField(term278, term278.getClass(), "lock", term279);
        setElement(term280, 0, term145);
        setField(term278, term278.getClass(), "array", term280);
        setField(term224, term224.getClass(), "childrenList", term278);
        setField(term224, term224.getClass(), "aai", null);
        setBooleanField(term224, term224.getClass(), "additive", true);
        setField(term224, term224.getClass(), "loggerContext", term132);
        setField(term145, term145.getClass(), "parent", term224);
        setField(term145, term145.getClass(), "childrenList", null);
        setField(term145, term145.getClass(), "aai", null);
        setBooleanField(term145, term145.getClass(), "additive", true);
        setField(term145, term145.getClass(), "loggerContext", term132);
        setField(term1, term1.getClass(), "logger", term145);
        setField(term1, term1.getClass(), "subCommandMap", term283);
        setField(term1, term1.getClass(), "commandName", "export");
        setElement(term319, 0, "exp");
        setField(term1, term1.getClass(), "CommandSecondName", term319);
        setField(term1, term1.getClass(), "commandDescription", "\uFFFC[\uFFFAQ9_U^penc, \uFFEFS\u007FO(ue x p   h e l p \uFFB7\uFF83\uFFD6S.^\uFFA9R");
        term371 = (Object[]) newArray("java.lang.String", 5);
        setElement(term371, 0, "PAEBtnZtTD");
        setElement(term371, 1, "sjlJAEtRrb");
        setElement(term371, 2, "MuLcgQHgqz");
        setElement(term371, 3, "xxtlPwDYFs");
        setElement(term371, 4, "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.ExportCommand");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term371;
        callMethod(klass, "help", argTypes, term1, args);
    }

};


