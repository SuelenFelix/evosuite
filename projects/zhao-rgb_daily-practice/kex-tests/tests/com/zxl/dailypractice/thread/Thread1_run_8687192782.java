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

public class Thread1_run_8687192782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153315;

    public Thread1_run_8687192782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153315 = newInstance(Class.forName("com.zxl.dailypractice.thread.Thread1"));
        setField(term153315, term153315.getClass(), "name", null);
        setIntField(term153315, term153315.getClass(), "priority", 0);
        setBooleanField(term153315, term153315.getClass(), "daemon", false);
        setBooleanField(term153315, term153315.getClass(), "stillborn", false);
        setLongField(term153315, term153315.getClass(), "eetop", 0L);
        setField(term153315, term153315.getClass(), "target", null);
        setField(term153315, term153315.getClass(), "group", null);
        setField(term153315, term153315.getClass(), "contextClassLoader", null);
        setField(term153315, term153315.getClass(), "inheritedAccessControlContext", null);
        setField(term153315, term153315.getClass(), "threadLocals", null);
        setField(term153315, term153315.getClass(), "inheritableThreadLocals", null);
        setLongField(term153315, term153315.getClass(), "stackSize", 0L);
        setLongField(term153315, term153315.getClass(), "tid", 0L);
        setIntField(term153315, term153315.getClass(), "threadStatus", 0);
        setField(term153315, term153315.getClass(), "parkBlocker", null);
        setField(term153315, term153315.getClass(), "blocker", null);
        setField(term153315, term153315.getClass(), "blockerLock", null);
        setField(term153315, term153315.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term153315, term153315.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term153315, term153315.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term153315, term153315.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.thread.Thread1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term153315, args);
    }

};


