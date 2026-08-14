package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class Simulator_RunLoop_haltOnRts_15655923558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100584;
     Object term100598;

    public Simulator_RunLoop_haltOnRts_15655923558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100584 = newInstance(Class.forName("com.loomcom.symon.Simulator$RunLoop"));
        setBooleanField(term100584, term100584.getClass(), "isRunning", false);
        setBooleanField(term100584, term100584.getClass(), "haltOnRts", false);
        setIntField(term100584, term100584.getClass(), "callStackDepth", 0);
        setField(term100584, term100584.getClass(), "this$0", null);
        setField(term100584, term100584.getClass(), "name", null);
        setIntField(term100584, term100584.getClass(), "priority", 0);
        setBooleanField(term100584, term100584.getClass(), "daemon", false);
        setBooleanField(term100584, term100584.getClass(), "stillborn", false);
        setLongField(term100584, term100584.getClass(), "eetop", 0L);
        setField(term100584, term100584.getClass(), "target", null);
        setField(term100584, term100584.getClass(), "group", null);
        setField(term100584, term100584.getClass(), "contextClassLoader", null);
        setField(term100584, term100584.getClass(), "inheritedAccessControlContext", null);
        setField(term100584, term100584.getClass(), "threadLocals", null);
        setField(term100584, term100584.getClass(), "inheritableThreadLocals", null);
        setLongField(term100584, term100584.getClass(), "stackSize", 0L);
        setLongField(term100584, term100584.getClass(), "tid", 0L);
        setIntField(term100584, term100584.getClass(), "threadStatus", 0);
        setField(term100584, term100584.getClass(), "parkBlocker", null);
        setField(term100584, term100584.getClass(), "blocker", null);
        setField(term100584, term100584.getClass(), "blockerLock", null);
        setField(term100584, term100584.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term100584, term100584.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term100584, term100584.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term100584, term100584.getClass(), "threadLocalRandomSecondarySeed", 0);
        term100598 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$RunLoop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term100598;
        callMethod(klass, "haltOnRts", argTypes, term100584, args);
    }

};


