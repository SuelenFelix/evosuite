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

public class BridgeThread_run_56600903511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1133;

    public BridgeThread_run_56600903511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1133 = newInstance(Class.forName("org.openRealmOfStars.ambient.BridgeThread"));
        setField(term1133, term1133.getClass(), "bridge", null);
        setBooleanField(term1133, term1133.getClass(), "started", false);
        setBooleanField(term1133, term1133.getClass(), "running", false);
        setField(term1133, term1133.getClass(), "name", null);
        setIntField(term1133, term1133.getClass(), "priority", 0);
        setBooleanField(term1133, term1133.getClass(), "daemon", false);
        setBooleanField(term1133, term1133.getClass(), "stillborn", false);
        setLongField(term1133, term1133.getClass(), "eetop", 0L);
        setField(term1133, term1133.getClass(), "target", null);
        setField(term1133, term1133.getClass(), "group", null);
        setField(term1133, term1133.getClass(), "contextClassLoader", null);
        setField(term1133, term1133.getClass(), "inheritedAccessControlContext", null);
        setField(term1133, term1133.getClass(), "threadLocals", null);
        setField(term1133, term1133.getClass(), "inheritableThreadLocals", null);
        setLongField(term1133, term1133.getClass(), "stackSize", 0L);
        setLongField(term1133, term1133.getClass(), "tid", 0L);
        setIntField(term1133, term1133.getClass(), "threadStatus", 0);
        setField(term1133, term1133.getClass(), "parkBlocker", null);
        setField(term1133, term1133.getClass(), "blocker", null);
        setField(term1133, term1133.getClass(), "blockerLock", null);
        setField(term1133, term1133.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1133, term1133.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1133, term1133.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1133, term1133.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ambient.BridgeThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term1133, args);
    }

};


