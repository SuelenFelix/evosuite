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

public class JsonCacheImpl_1_run_8588312513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4147;

    public JsonCacheImpl_1_run_8588312513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4147 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.JsonCacheImpl$1"));
        setField(term4147, term4147.getClass(), "val$file", null);
        setField(term4147, term4147.getClass(), "this$0", null);
        setField(term4147, term4147.getClass(), "name", null);
        setIntField(term4147, term4147.getClass(), "priority", 0);
        setBooleanField(term4147, term4147.getClass(), "daemon", false);
        setBooleanField(term4147, term4147.getClass(), "stillborn", false);
        setLongField(term4147, term4147.getClass(), "eetop", 0L);
        setField(term4147, term4147.getClass(), "target", null);
        setField(term4147, term4147.getClass(), "group", null);
        setField(term4147, term4147.getClass(), "contextClassLoader", null);
        setField(term4147, term4147.getClass(), "inheritedAccessControlContext", null);
        setField(term4147, term4147.getClass(), "threadLocals", null);
        setField(term4147, term4147.getClass(), "inheritableThreadLocals", null);
        setLongField(term4147, term4147.getClass(), "stackSize", 0L);
        setLongField(term4147, term4147.getClass(), "tid", 0L);
        setIntField(term4147, term4147.getClass(), "threadStatus", 0);
        setField(term4147, term4147.getClass(), "parkBlocker", null);
        setField(term4147, term4147.getClass(), "blocker", null);
        setField(term4147, term4147.getClass(), "blockerLock", null);
        setField(term4147, term4147.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term4147, term4147.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term4147, term4147.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term4147, term4147.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.JsonCacheImpl$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term4147, args);
    }

};


