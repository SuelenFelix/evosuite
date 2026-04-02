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

public class CompilerKt_main_1_1_1_create_4921622222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term973;
     Object term1051;

    public CompilerKt_main_1_1_1_create_4921622222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term973 = newInstance(Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1"));
        Object[] term975 = (Object[]) newArray("java.lang.String", 6);
        Object term1049 = newInstance(Class.forName("kotlin.jvm.internal.Ref$ObjectRef"));
        setIntField(term973, term973.getClass(), "label", 1134449235);
        setElement(term975, 0, "OclPbYPkcH");
        setElement(term975, 1, "IoAlmYsBwc");
        setElement(term975, 2, "TEParAifyi");
        setElement(term975, 3, "OWDIEULEFu");
        setElement(term975, 4, "dWRymuLBtr");
        setElement(term975, 5, "AijpHYOFuy");
        setField(term973, term973.getClass(), "$args", term975);
        setIntField(term973, term973.getClass(), "$it", -883034806);
        setField(term1049, term1049.getClass(), "element", null);
        setField(term973, term973.getClass(), "$outputDir", term1049);
        setIntField(term973, term973.getClass(), "arity", 1585847225);
        setField(term973, term973.getClass(), "_context", null);
        setField(term973, term973.getClass(), "intercepted", null);
        setField(term973, term973.getClass(), "completion", null);
        term1051 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = term1051;
        args[1] = null;
        callMethod(klass, "create", argTypes, term973, args);
    }

};


