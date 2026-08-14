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

public class Simulator_RunLoop_run_3682301559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100600;

    public Simulator_RunLoop_run_3682301559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100600 = newInstance(Class.forName("com.loomcom.symon.Simulator$RunLoop"));
        setBooleanField(term100600, term100600.getClass(), "isRunning", false);
        setBooleanField(term100600, term100600.getClass(), "haltOnRts", false);
        setIntField(term100600, term100600.getClass(), "callStackDepth", 0);
        setField(term100600, term100600.getClass(), "this$0", null);
        setField(term100600, term100600.getClass(), "name", null);
        setIntField(term100600, term100600.getClass(), "priority", 0);
        setBooleanField(term100600, term100600.getClass(), "daemon", false);
        setBooleanField(term100600, term100600.getClass(), "stillborn", false);
        setLongField(term100600, term100600.getClass(), "eetop", 0L);
        setField(term100600, term100600.getClass(), "target", null);
        setField(term100600, term100600.getClass(), "group", null);
        setField(term100600, term100600.getClass(), "contextClassLoader", null);
        setField(term100600, term100600.getClass(), "inheritedAccessControlContext", null);
        setField(term100600, term100600.getClass(), "threadLocals", null);
        setField(term100600, term100600.getClass(), "inheritableThreadLocals", null);
        setLongField(term100600, term100600.getClass(), "stackSize", 0L);
        setLongField(term100600, term100600.getClass(), "tid", 0L);
        setIntField(term100600, term100600.getClass(), "threadStatus", 0);
        setField(term100600, term100600.getClass(), "parkBlocker", null);
        setField(term100600, term100600.getClass(), "blocker", null);
        setField(term100600, term100600.getClass(), "blockerLock", null);
        setField(term100600, term100600.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term100600, term100600.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term100600, term100600.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term100600, term100600.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$RunLoop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term100600, args);
    }

};


