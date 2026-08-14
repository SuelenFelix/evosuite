package org.openapijsonschematools.codegen.common;

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
import static org.openapijsonschematools.codegen.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonCacheImpl_2_run_8588312203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3606;

    public JsonCacheImpl_2_run_8588312203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3606 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.JsonCacheImpl$2"));
        setField(term3606, term3606.getClass(), "val$out", null);
        setField(term3606, term3606.getClass(), "this$0", null);
        setField(term3606, term3606.getClass(), "name", null);
        setIntField(term3606, term3606.getClass(), "priority", 0);
        setBooleanField(term3606, term3606.getClass(), "daemon", false);
        setBooleanField(term3606, term3606.getClass(), "stillborn", false);
        setLongField(term3606, term3606.getClass(), "eetop", 0L);
        setField(term3606, term3606.getClass(), "target", null);
        setField(term3606, term3606.getClass(), "group", null);
        setField(term3606, term3606.getClass(), "contextClassLoader", null);
        setField(term3606, term3606.getClass(), "inheritedAccessControlContext", null);
        setField(term3606, term3606.getClass(), "threadLocals", null);
        setField(term3606, term3606.getClass(), "inheritableThreadLocals", null);
        setLongField(term3606, term3606.getClass(), "stackSize", 0L);
        setLongField(term3606, term3606.getClass(), "tid", 0L);
        setIntField(term3606, term3606.getClass(), "threadStatus", 0);
        setField(term3606, term3606.getClass(), "parkBlocker", null);
        setField(term3606, term3606.getClass(), "blocker", null);
        setField(term3606, term3606.getClass(), "blockerLock", null);
        setField(term3606, term3606.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term3606, term3606.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term3606, term3606.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term3606, term3606.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.JsonCacheImpl$2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term3606, args);
    }

};


