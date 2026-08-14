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
import java.lang.Integer;
import java.lang.Long;

public class ExportCommand_createOutputInfo_8454498133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1297;
     Object term1667;
     Object term1669;
     Object term1671;
     Object term1673;
     Object term1687;

    public ExportCommand_createOutputInfo_8454498133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1579 = new HashMap();
        term1297 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.ExportCommand"));
        Object term1441 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1520 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1420 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1423 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1426 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1428 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term1574 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1575 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1576 = (Object[]) newArray("java.lang.Object", 1);
        Object[] term1615 = (Object[]) newArray("java.lang.String", 1);
        setField(term1441, term1441.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.command.base.AbstractCompositeCommand");
        setField(term1441, term1441.getClass(), "level", null);
        setIntField(term1441, term1441.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1520, term1520.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.command.base");
        setField(term1520, term1520.getClass(), "level", null);
        setIntField(term1520, term1520.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1420, term1420.getClass(), "name", "");
        setField(term1420, term1420.getClass(), "level", null);
        setIntField(term1420, term1420.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1423, term1423.getClass(), "name", null);
        setField(term1423, term1423.getClass(), "level", null);
        setIntField(term1423, term1423.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1423, term1423.getClass(), "parent", null);
        setField(term1423, term1423.getClass(), "childrenList", null);
        setField(term1423, term1423.getClass(), "aai", null);
        setBooleanField(term1423, term1423.getClass(), "additive", true);
        setField(term1423, term1423.getClass(), "loggerContext", null);
        setField(term1420, term1420.getClass(), "parent", term1423);
        setField(term1426, term1426.getClass(), "lock", null);
        setField(term1426, term1426.getClass(), "array", null);
        setField(term1420, term1420.getClass(), "childrenList", term1426);
        setField(term1420, term1420.getClass(), "aai", null);
        setBooleanField(term1420, term1420.getClass(), "additive", true);
        setField(term1428, term1428.getClass(), "root", null);
        setIntField(term1428, term1428.getClass(), "size", 35);
        setIntField(term1428, term1428.getClass(), "noAppenderWarning", 0);
        setField(term1428, term1428.getClass(), "loggerContextListenerList", null);
        setField(term1428, term1428.getClass(), "loggerCache", null);
        setField(term1428, term1428.getClass(), "loggerContextRemoteView", null);
        setField(term1428, term1428.getClass(), "turboFilterList", null);
        setBooleanField(term1428, term1428.getClass(), "packagingDataEnabled", false);
        setIntField(term1428, term1428.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1428, term1428.getClass(), "resetCount", 0);
        setField(term1428, term1428.getClass(), "frameworkPackages", null);
        setLongField(term1428, term1428.getClass(), "birthTime", 1786458530797L);
        setField(term1428, term1428.getClass(), "name", null);
        setField(term1428, term1428.getClass(), "sm", null);
        setField(term1428, term1428.getClass(), "propertyMap", null);
        setField(term1428, term1428.getClass(), "objectMap", null);
        setField(term1428, term1428.getClass(), "configurationLock", null);
        setField(term1428, term1428.getClass(), "scheduledExecutorService", null);
        setField(term1428, term1428.getClass(), "scheduledFutures", null);
        setField(term1428, term1428.getClass(), "lifeCycleManager", null);
        setBooleanField(term1428, term1428.getClass(), "started", false);
        setField(term1420, term1420.getClass(), "loggerContext", term1428);
        setField(term1520, term1520.getClass(), "parent", term1420);
        setField(term1574, term1574.getClass(), "lock", term1575);
        setElement(term1576, 0, term1441);
        setField(term1574, term1574.getClass(), "array", term1576);
        setField(term1520, term1520.getClass(), "childrenList", term1574);
        setField(term1520, term1520.getClass(), "aai", null);
        setBooleanField(term1520, term1520.getClass(), "additive", true);
        setField(term1520, term1520.getClass(), "loggerContext", term1428);
        setField(term1441, term1441.getClass(), "parent", term1520);
        setField(term1441, term1441.getClass(), "childrenList", null);
        setField(term1441, term1441.getClass(), "aai", null);
        setBooleanField(term1441, term1441.getClass(), "additive", true);
        setField(term1441, term1441.getClass(), "loggerContext", term1428);
        setField(term1297, term1297.getClass(), "logger", term1441);
        setField(term1297, term1297.getClass(), "subCommandMap", term1579);
        setField(term1297, term1297.getClass(), "commandName", "export");
        setElement(term1615, 0, "exp");
        setField(term1297, term1297.getClass(), "CommandSecondName", term1615);
        setField(term1297, term1297.getClass(), "commandDescription", "\uFFFC[\uFFFAQ9_U^penc, \uFFEFS\u007FO(ue x p   h e l p \uFFB7\uFF83\uFFD6S.^\uFFA9R");
        term1667 = new Integer(568599855);
        term1669 = new Long(2442117782898005296L);
        term1671 = new Long(6375119433582206027L);
        term1673 = new Integer(1162663216);
        term1687 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.ExportCommand");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = long.class;
        Object[] args = new Object[6];
        args[0] = term1667;
        args[1] = term1669;
        args[2] = term1671;
        args[3] = term1673;
        args[4] = "RMFIsYGgne";
        args[5] = term1687;
        callMethod(klass, "createOutputInfo", argTypes, term1297, args);
    }

};


