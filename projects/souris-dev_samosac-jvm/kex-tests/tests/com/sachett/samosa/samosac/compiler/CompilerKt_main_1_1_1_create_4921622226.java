package com.sachett.samosa.samosac.compiler;

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
import static com.sachett.samosa.samosac.compiler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CompilerKt_main_1_1_1_create_4921622226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1278;

    public CompilerKt_main_1_1_1_create_4921622226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1278 = newInstance(Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1"));
        setIntField(term1278, term1278.getClass(), "label", 0);
        setField(term1278, term1278.getClass(), "$args", null);
        setIntField(term1278, term1278.getClass(), "$it", 0);
        setField(term1278, term1278.getClass(), "$outputDir", null);
        setIntField(term1278, term1278.getClass(), "arity", 0);
        setField(term1278, term1278.getClass(), "_context", null);
        setField(term1278, term1278.getClass(), "intercepted", null);
        setField(term1278, term1278.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "create", argTypes, term1278, args);
    }

};


