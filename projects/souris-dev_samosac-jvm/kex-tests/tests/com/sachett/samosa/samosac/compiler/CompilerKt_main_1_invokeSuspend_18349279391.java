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
import java.lang.Object;

public class CompilerKt_main_1_invokeSuspend_18349279391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313;
     Object term367;

    public CompilerKt_main_1_invokeSuspend_18349279391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313 = newInstance(Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1"));
        Object term315 = newInstance(Class.forName("java.lang.Object"));
        Object[] term316 = (Object[]) newArray("java.lang.String", 4);
        Object term365 = newInstance(Class.forName("kotlin.jvm.internal.Ref$ObjectRef"));
        setIntField(term313, term313.getClass(), "label", 1162663216);
        setField(term313, term313.getClass(), "L$0", term315);
        setElement(term316, 0, "SzjVpOQTyS");
        setElement(term316, 1, "MjGYSRKTNF");
        setElement(term316, 2, "hRNSzYYIrc");
        setElement(term316, 3, "RMFIsYGgne");
        setField(term313, term313.getClass(), "$args", term316);
        setField(term365, term365.getClass(), "element", null);
        setField(term313, term313.getClass(), "$outputDir", term365);
        setIntField(term313, term313.getClass(), "arity", 1484323161);
        setField(term313, term313.getClass(), "_context", null);
        setField(term313, term313.getClass(), "intercepted", null);
        setField(term313, term313.getClass(), "completion", null);
        term367 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term367;
        callMethod(klass, "invokeSuspend", argTypes, term313, args);
    }

};


