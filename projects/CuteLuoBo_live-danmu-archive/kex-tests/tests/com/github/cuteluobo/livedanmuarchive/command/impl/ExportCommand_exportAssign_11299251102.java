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

public class ExportCommand_exportAssign_11299251102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;
     Object term1030;

    public ExportCommand_exportAssign_11299251102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term942 = new HashMap();
        term660 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.ExportCommand"));
        Object term804 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term883 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term783 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term786 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term789 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term791 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term937 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term938 = newInstance(Class.forName("java.lang.Object"));
        Object[] term939 = (Object[]) newArray("java.lang.Object", 1);
        Object[] term978 = (Object[]) newArray("java.lang.String", 1);
        setField(term804, term804.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.command.base.AbstractCompositeCommand");
        setField(term804, term804.getClass(), "level", null);
        setIntField(term804, term804.getClass(), "effectiveLevelInt", -2147483648);
        setField(term883, term883.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.command.base");
        setField(term883, term883.getClass(), "level", null);
        setIntField(term883, term883.getClass(), "effectiveLevelInt", -2147483648);
        setField(term783, term783.getClass(), "name", "");
        setField(term783, term783.getClass(), "level", null);
        setIntField(term783, term783.getClass(), "effectiveLevelInt", -2147483648);
        setField(term786, term786.getClass(), "name", null);
        setField(term786, term786.getClass(), "level", null);
        setIntField(term786, term786.getClass(), "effectiveLevelInt", -2147483648);
        setField(term786, term786.getClass(), "parent", null);
        setField(term786, term786.getClass(), "childrenList", null);
        setField(term786, term786.getClass(), "aai", null);
        setBooleanField(term786, term786.getClass(), "additive", true);
        setField(term786, term786.getClass(), "loggerContext", null);
        setField(term783, term783.getClass(), "parent", term786);
        setField(term789, term789.getClass(), "lock", null);
        setField(term789, term789.getClass(), "array", null);
        setField(term783, term783.getClass(), "childrenList", term789);
        setField(term783, term783.getClass(), "aai", null);
        setBooleanField(term783, term783.getClass(), "additive", true);
        setField(term791, term791.getClass(), "root", null);
        setIntField(term791, term791.getClass(), "size", 35);
        setIntField(term791, term791.getClass(), "noAppenderWarning", 0);
        setField(term791, term791.getClass(), "loggerContextListenerList", null);
        setField(term791, term791.getClass(), "loggerCache", null);
        setField(term791, term791.getClass(), "loggerContextRemoteView", null);
        setField(term791, term791.getClass(), "turboFilterList", null);
        setBooleanField(term791, term791.getClass(), "packagingDataEnabled", false);
        setIntField(term791, term791.getClass(), "maxCallerDataDepth", 8);
        setIntField(term791, term791.getClass(), "resetCount", 0);
        setField(term791, term791.getClass(), "frameworkPackages", null);
        setLongField(term791, term791.getClass(), "birthTime", 1786458530797L);
        setField(term791, term791.getClass(), "name", null);
        setField(term791, term791.getClass(), "sm", null);
        setField(term791, term791.getClass(), "propertyMap", null);
        setField(term791, term791.getClass(), "objectMap", null);
        setField(term791, term791.getClass(), "configurationLock", null);
        setField(term791, term791.getClass(), "scheduledExecutorService", null);
        setField(term791, term791.getClass(), "scheduledFutures", null);
        setField(term791, term791.getClass(), "lifeCycleManager", null);
        setBooleanField(term791, term791.getClass(), "started", false);
        setField(term783, term783.getClass(), "loggerContext", term791);
        setField(term883, term883.getClass(), "parent", term783);
        setField(term937, term937.getClass(), "lock", term938);
        setElement(term939, 0, term804);
        setField(term937, term937.getClass(), "array", term939);
        setField(term883, term883.getClass(), "childrenList", term937);
        setField(term883, term883.getClass(), "aai", null);
        setBooleanField(term883, term883.getClass(), "additive", true);
        setField(term883, term883.getClass(), "loggerContext", term791);
        setField(term804, term804.getClass(), "parent", term883);
        setField(term804, term804.getClass(), "childrenList", null);
        setField(term804, term804.getClass(), "aai", null);
        setBooleanField(term804, term804.getClass(), "additive", true);
        setField(term804, term804.getClass(), "loggerContext", term791);
        setField(term660, term660.getClass(), "logger", term804);
        setField(term660, term660.getClass(), "subCommandMap", term942);
        setField(term660, term660.getClass(), "commandName", "export");
        setElement(term978, 0, "exp");
        setField(term660, term660.getClass(), "CommandSecondName", term978);
        setField(term660, term660.getClass(), "commandDescription", "\uFFFC[\uFFFAQ9_U^penc, \uFFEFS\u007FO(ue x p   h e l p \uFFB7\uFF83\uFFD6S.^\uFFA9R");
        term1030 = (Object[]) newArray("java.lang.String", 4);
        setElement(term1030, 0, "EGtDIRbSSb");
        setElement(term1030, 1, "SzjVpOQTyS");
        setElement(term1030, 2, "MjGYSRKTNF");
        setElement(term1030, 3, "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.ExportCommand");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1030;
        callMethod(klass, "exportAssign", argTypes, term660, args);
    }

};


