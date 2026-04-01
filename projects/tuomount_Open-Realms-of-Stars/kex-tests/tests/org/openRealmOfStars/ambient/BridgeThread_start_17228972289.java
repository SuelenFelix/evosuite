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

public class BridgeThread_start_17228972289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1105;

    public BridgeThread_start_17228972289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1105 = newInstance(Class.forName("org.openRealmOfStars.ambient.BridgeThread"));
        setField(term1105, term1105.getClass(), "bridge", null);
        setBooleanField(term1105, term1105.getClass(), "started", false);
        setBooleanField(term1105, term1105.getClass(), "running", false);
        setField(term1105, term1105.getClass(), "name", null);
        setIntField(term1105, term1105.getClass(), "priority", 0);
        setBooleanField(term1105, term1105.getClass(), "daemon", false);
        setBooleanField(term1105, term1105.getClass(), "stillborn", false);
        setLongField(term1105, term1105.getClass(), "eetop", 0L);
        setField(term1105, term1105.getClass(), "target", null);
        setField(term1105, term1105.getClass(), "group", null);
        setField(term1105, term1105.getClass(), "contextClassLoader", null);
        setField(term1105, term1105.getClass(), "inheritedAccessControlContext", null);
        setField(term1105, term1105.getClass(), "threadLocals", null);
        setField(term1105, term1105.getClass(), "inheritableThreadLocals", null);
        setLongField(term1105, term1105.getClass(), "stackSize", 0L);
        setLongField(term1105, term1105.getClass(), "tid", 0L);
        setIntField(term1105, term1105.getClass(), "threadStatus", 0);
        setField(term1105, term1105.getClass(), "parkBlocker", null);
        setField(term1105, term1105.getClass(), "blocker", null);
        setField(term1105, term1105.getClass(), "blockerLock", null);
        setField(term1105, term1105.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1105, term1105.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1105, term1105.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1105, term1105.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ambient.BridgeThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term1105, args);
    }

};


