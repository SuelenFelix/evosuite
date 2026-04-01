package org.openRealmOfStars.ambient;

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
import static org.openRealmOfStars.ambient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BridgeThread_sleepFor_108237805010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1118;
     Object term1131;

    public BridgeThread_sleepFor_108237805010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1118 = newInstance(Class.forName("org.openRealmOfStars.ambient.BridgeThread"));
        setField(term1118, term1118.getClass(), "bridge", null);
        setBooleanField(term1118, term1118.getClass(), "started", false);
        setBooleanField(term1118, term1118.getClass(), "running", false);
        setField(term1118, term1118.getClass(), "name", null);
        setIntField(term1118, term1118.getClass(), "priority", 0);
        setBooleanField(term1118, term1118.getClass(), "daemon", false);
        setBooleanField(term1118, term1118.getClass(), "stillborn", false);
        setLongField(term1118, term1118.getClass(), "eetop", 0L);
        setField(term1118, term1118.getClass(), "target", null);
        setField(term1118, term1118.getClass(), "group", null);
        setField(term1118, term1118.getClass(), "contextClassLoader", null);
        setField(term1118, term1118.getClass(), "inheritedAccessControlContext", null);
        setField(term1118, term1118.getClass(), "threadLocals", null);
        setField(term1118, term1118.getClass(), "inheritableThreadLocals", null);
        setLongField(term1118, term1118.getClass(), "stackSize", 0L);
        setLongField(term1118, term1118.getClass(), "tid", 0L);
        setIntField(term1118, term1118.getClass(), "threadStatus", 0);
        setField(term1118, term1118.getClass(), "parkBlocker", null);
        setField(term1118, term1118.getClass(), "blocker", null);
        setField(term1118, term1118.getClass(), "blockerLock", null);
        setField(term1118, term1118.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1118, term1118.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1118, term1118.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1118, term1118.getClass(), "threadLocalRandomSecondarySeed", 0);
        term1131 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ambient.BridgeThread");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1131;
        callMethod(klass, "sleepFor", argTypes, term1118, args);
    }

};


