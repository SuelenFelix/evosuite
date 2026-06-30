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

public class CompilerKt_main_1_1_1_invokeSuspend_21404073835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1274;

    public CompilerKt_main_1_1_1_invokeSuspend_21404073835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1274 = newInstance(Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1"));
        setIntField(term1274, term1274.getClass(), "label", 0);
        setField(term1274, term1274.getClass(), "$args", null);
        setIntField(term1274, term1274.getClass(), "$it", 0);
        setField(term1274, term1274.getClass(), "$outputDir", null);
        setIntField(term1274, term1274.getClass(), "arity", 0);
        setField(term1274, term1274.getClass(), "_context", null);
        setField(term1274, term1274.getClass(), "intercepted", null);
        setField(term1274, term1274.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "invokeSuspend", argTypes, term1274, args);
    }

};


