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

public class Simulator_RunLoop_requestStop_9262541077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100570;

    public Simulator_RunLoop_requestStop_9262541077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100570 = newInstance(Class.forName("com.loomcom.symon.Simulator$RunLoop"));
        setBooleanField(term100570, term100570.getClass(), "isRunning", false);
        setBooleanField(term100570, term100570.getClass(), "haltOnRts", false);
        setIntField(term100570, term100570.getClass(), "callStackDepth", 0);
        setField(term100570, term100570.getClass(), "this$0", null);
        setField(term100570, term100570.getClass(), "name", null);
        setIntField(term100570, term100570.getClass(), "priority", 0);
        setBooleanField(term100570, term100570.getClass(), "daemon", false);
        setBooleanField(term100570, term100570.getClass(), "stillborn", false);
        setLongField(term100570, term100570.getClass(), "eetop", 0L);
        setField(term100570, term100570.getClass(), "target", null);
        setField(term100570, term100570.getClass(), "group", null);
        setField(term100570, term100570.getClass(), "contextClassLoader", null);
        setField(term100570, term100570.getClass(), "inheritedAccessControlContext", null);
        setField(term100570, term100570.getClass(), "threadLocals", null);
        setField(term100570, term100570.getClass(), "inheritableThreadLocals", null);
        setLongField(term100570, term100570.getClass(), "stackSize", 0L);
        setLongField(term100570, term100570.getClass(), "tid", 0L);
        setIntField(term100570, term100570.getClass(), "threadStatus", 0);
        setField(term100570, term100570.getClass(), "parkBlocker", null);
        setField(term100570, term100570.getClass(), "blocker", null);
        setField(term100570, term100570.getClass(), "blockerLock", null);
        setField(term100570, term100570.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term100570, term100570.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term100570, term100570.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term100570, term100570.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$RunLoop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "requestStop", argTypes, term100570, args);
    }

};


