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

public class BridgeThread_isStarted_16288839557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1079;

    public BridgeThread_isStarted_16288839557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1079 = newInstance(Class.forName("org.openRealmOfStars.ambient.BridgeThread"));
        setField(term1079, term1079.getClass(), "bridge", null);
        setBooleanField(term1079, term1079.getClass(), "started", false);
        setBooleanField(term1079, term1079.getClass(), "running", false);
        setField(term1079, term1079.getClass(), "name", null);
        setIntField(term1079, term1079.getClass(), "priority", 0);
        setBooleanField(term1079, term1079.getClass(), "daemon", false);
        setBooleanField(term1079, term1079.getClass(), "stillborn", false);
        setLongField(term1079, term1079.getClass(), "eetop", 0L);
        setField(term1079, term1079.getClass(), "target", null);
        setField(term1079, term1079.getClass(), "group", null);
        setField(term1079, term1079.getClass(), "contextClassLoader", null);
        setField(term1079, term1079.getClass(), "inheritedAccessControlContext", null);
        setField(term1079, term1079.getClass(), "threadLocals", null);
        setField(term1079, term1079.getClass(), "inheritableThreadLocals", null);
        setLongField(term1079, term1079.getClass(), "stackSize", 0L);
        setLongField(term1079, term1079.getClass(), "tid", 0L);
        setIntField(term1079, term1079.getClass(), "threadStatus", 0);
        setField(term1079, term1079.getClass(), "parkBlocker", null);
        setField(term1079, term1079.getClass(), "blocker", null);
        setField(term1079, term1079.getClass(), "blockerLock", null);
        setField(term1079, term1079.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1079, term1079.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1079, term1079.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1079, term1079.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ambient.BridgeThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStarted", argTypes, term1079, args);
    }

};


