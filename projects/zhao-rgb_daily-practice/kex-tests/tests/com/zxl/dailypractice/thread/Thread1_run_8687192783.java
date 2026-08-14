package com.zxl.dailypractice.thread;

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
import static com.zxl.dailypractice.thread.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Thread1_run_8687192783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1047;

    public Thread1_run_8687192783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1047 = newInstance(Class.forName("com.zxl.dailypractice.thread.Thread1"));
        setField(term1047, term1047.getClass(), "name", null);
        setIntField(term1047, term1047.getClass(), "priority", 0);
        setBooleanField(term1047, term1047.getClass(), "daemon", false);
        setBooleanField(term1047, term1047.getClass(), "stillborn", false);
        setLongField(term1047, term1047.getClass(), "eetop", 0L);
        setField(term1047, term1047.getClass(), "target", null);
        setField(term1047, term1047.getClass(), "group", null);
        setField(term1047, term1047.getClass(), "contextClassLoader", null);
        setField(term1047, term1047.getClass(), "inheritedAccessControlContext", null);
        setField(term1047, term1047.getClass(), "threadLocals", null);
        setField(term1047, term1047.getClass(), "inheritableThreadLocals", null);
        setLongField(term1047, term1047.getClass(), "stackSize", 0L);
        setLongField(term1047, term1047.getClass(), "tid", 0L);
        setIntField(term1047, term1047.getClass(), "threadStatus", 0);
        setField(term1047, term1047.getClass(), "parkBlocker", null);
        setField(term1047, term1047.getClass(), "blocker", null);
        setField(term1047, term1047.getClass(), "blockerLock", null);
        setField(term1047, term1047.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1047, term1047.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1047, term1047.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1047, term1047.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.thread.Thread1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term1047, args);
    }

};


