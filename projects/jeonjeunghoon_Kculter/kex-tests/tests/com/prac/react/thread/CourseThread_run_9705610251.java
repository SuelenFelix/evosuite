package com.prac.react.thread;

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
import static com.prac.react.thread.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CourseThread_run_9705610251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;

    public CourseThread_run_9705610251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94 = newInstance(Class.forName("com.prac.react.thread.CourseThread"));
        Object term95 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        Object term146 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term147 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term178 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term216 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term219 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term222 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term224 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setIntField(term95, term95.getClass(), "courseNum", 391863371);
        setField(term95, term95.getClass(), "courseHash", "jJCZpVmanW");
        setField(term95, term95.getClass(), "courseName", "EGtDIRbSSb");
        setField(term95, term95.getClass(), "places", "SzjVpOQTyS");
        setIntField(term95, term95.getClass(), "memberNum", -1922583790);
        setField(term95, term95.getClass(), "memberHash", "MjGYSRKTNF");
        setField(term94, term94.getClass(), "course", term95);
        setField(term147, term147.getClass(), "secretKey", "hRNSzYYIrc");
        setField(term146, term146.getClass(), "sk", term147);
        setField(term146, term146.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term178, term178.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term178, term178.getClass(), "level", null);
        setIntField(term178, term178.getClass(), "effectiveLevelInt", -2147483648);
        setField(term216, term216.getClass(), "name", "");
        setField(term216, term216.getClass(), "level", null);
        setIntField(term216, term216.getClass(), "effectiveLevelInt", -2147483648);
        setField(term219, term219.getClass(), "name", null);
        setField(term219, term219.getClass(), "level", null);
        setIntField(term219, term219.getClass(), "effectiveLevelInt", -2147483648);
        setField(term219, term219.getClass(), "parent", null);
        setField(term219, term219.getClass(), "childrenList", null);
        setField(term219, term219.getClass(), "aai", null);
        setBooleanField(term219, term219.getClass(), "additive", true);
        setField(term219, term219.getClass(), "loggerContext", null);
        setField(term216, term216.getClass(), "parent", term219);
        setField(term222, term222.getClass(), "lock", null);
        setField(term222, term222.getClass(), "array", null);
        setField(term216, term216.getClass(), "childrenList", term222);
        setField(term216, term216.getClass(), "aai", null);
        setBooleanField(term216, term216.getClass(), "additive", true);
        setField(term224, term224.getClass(), "root", null);
        setIntField(term224, term224.getClass(), "size", 31);
        setIntField(term224, term224.getClass(), "noAppenderWarning", 0);
        setField(term224, term224.getClass(), "loggerContextListenerList", null);
        setField(term224, term224.getClass(), "loggerCache", null);
        setField(term224, term224.getClass(), "loggerContextRemoteView", null);
        setField(term224, term224.getClass(), "turboFilterList", null);
        setBooleanField(term224, term224.getClass(), "packagingDataEnabled", false);
        setIntField(term224, term224.getClass(), "maxCallerDataDepth", 8);
        setIntField(term224, term224.getClass(), "resetCount", 0);
        setField(term224, term224.getClass(), "frameworkPackages", null);
        setLongField(term224, term224.getClass(), "birthTime", 1782678153144L);
        setField(term224, term224.getClass(), "name", null);
        setField(term224, term224.getClass(), "sm", null);
        setField(term224, term224.getClass(), "propertyMap", null);
        setField(term224, term224.getClass(), "objectMap", null);
        setField(term224, term224.getClass(), "configurationLock", null);
        setField(term224, term224.getClass(), "scheduledExecutorService", null);
        setField(term224, term224.getClass(), "scheduledFutures", null);
        setField(term224, term224.getClass(), "lifeCycleManager", null);
        setBooleanField(term224, term224.getClass(), "started", false);
        setField(term216, term216.getClass(), "loggerContext", term224);
        setField(term178, term178.getClass(), "parent", term216);
        setField(term178, term178.getClass(), "childrenList", null);
        setField(term178, term178.getClass(), "aai", null);
        setBooleanField(term178, term178.getClass(), "additive", true);
        setField(term178, term178.getClass(), "loggerContext", term224);
        setField(term146, term146.getClass(), "logger", term178);
        setField(term94, term94.getClass(), "encrypt", term146);
        setField(term94, term94.getClass(), "pd", null);
        setField(term94, term94.getClass(), "callBack", null);
        setIntField(term94, term94.getClass(), "memberNum", -616727354);
        setField(term94, term94.getClass(), "logger", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.thread.CourseThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term94, args);
    }

};


