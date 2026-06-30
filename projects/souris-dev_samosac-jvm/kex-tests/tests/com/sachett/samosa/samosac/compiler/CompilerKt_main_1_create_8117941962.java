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

public class CompilerKt_main_1_create_8117941962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408;
     Object term450;

    public CompilerKt_main_1_create_8117941962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408 = newInstance(Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1"));
        Object term410 = newInstance(Class.forName("java.lang.Object"));
        Object[] term411 = (Object[]) newArray("java.lang.String", 3);
        Object term448 = newInstance(Class.forName("kotlin.jvm.internal.Ref$ObjectRef"));
        setIntField(term408, term408.getClass(), "label", 391863371);
        setField(term408, term408.getClass(), "L$0", term410);
        setElement(term411, 0, "NRdvgJlhkX");
        setElement(term411, 1, "uuaPigETmJ");
        setElement(term411, 2, "MxlszYVzRf");
        setField(term408, term408.getClass(), "$args", term411);
        setField(term448, term448.getClass(), "element", null);
        setField(term408, term408.getClass(), "$outputDir", term448);
        setIntField(term408, term408.getClass(), "arity", -1922583790);
        setField(term408, term408.getClass(), "_context", null);
        setField(term408, term408.getClass(), "intercepted", null);
        setField(term408, term408.getClass(), "completion", null);
        term450 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = term450;
        args[1] = null;
        callMethod(klass, "create", argTypes, term408, args);
    }

};


