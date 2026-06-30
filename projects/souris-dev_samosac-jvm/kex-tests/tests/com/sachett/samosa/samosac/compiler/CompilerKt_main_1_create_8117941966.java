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

public class CompilerKt_main_1_create_8117941966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578;

    public CompilerKt_main_1_create_8117941966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578 = newInstance(Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1"));
        setIntField(term578, term578.getClass(), "label", 0);
        setField(term578, term578.getClass(), "L$0", null);
        setField(term578, term578.getClass(), "$args", null);
        setField(term578, term578.getClass(), "$outputDir", null);
        setIntField(term578, term578.getClass(), "arity", 0);
        setField(term578, term578.getClass(), "_context", null);
        setField(term578, term578.getClass(), "intercepted", null);
        setField(term578, term578.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "create", argTypes, term578, args);
    }

};


