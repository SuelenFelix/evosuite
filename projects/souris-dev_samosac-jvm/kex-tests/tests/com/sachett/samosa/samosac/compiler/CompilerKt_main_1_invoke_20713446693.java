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

public class CompilerKt_main_1_invoke_20713446693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481;

    public CompilerKt_main_1_invoke_20713446693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481 = newInstance(Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1"));
        Object term483 = newInstance(Class.forName("java.lang.Object"));
        Object[] term484 = (Object[]) newArray("java.lang.String", 4);
        Object term533 = newInstance(Class.forName("kotlin.jvm.internal.Ref$ObjectRef"));
        setIntField(term481, term481.getClass(), "label", -616727354);
        setField(term481, term481.getClass(), "L$0", term483);
        setElement(term484, 0, "LQFpaHEwXR");
        setElement(term484, 1, "oVcInYnLWB");
        setElement(term484, 2, "aJlieCFVtF");
        setElement(term484, 3, "ZiaGIbnzTs");
        setField(term481, term481.getClass(), "$args", term484);
        setField(term533, term533.getClass(), "element", null);
        setField(term481, term481.getClass(), "$outputDir", term533);
        setIntField(term481, term481.getClass(), "arity", -1955890973);
        setField(term481, term481.getClass(), "_context", null);
        setField(term481, term481.getClass(), "intercepted", null);
        setField(term481, term481.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("kotlinx.coroutines.CoroutineScope");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "invoke", argTypes, term481, args);
    }

};


