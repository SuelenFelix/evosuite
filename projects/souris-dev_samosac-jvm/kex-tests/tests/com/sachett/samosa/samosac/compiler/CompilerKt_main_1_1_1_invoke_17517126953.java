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

public class CompilerKt_main_1_1_1_invoke_17517126953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1112;

    public CompilerKt_main_1_1_1_invoke_17517126953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1112 = newInstance(Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1"));
        Object[] term1114 = (Object[]) newArray("java.lang.String", 7);
        Object term1200 = newInstance(Class.forName("kotlin.jvm.internal.Ref$ObjectRef"));
        setIntField(term1112, term1112.getClass(), "label", 597278769);
        setElement(term1114, 0, "SbAoxhfrkn");
        setElement(term1114, 1, "kuTXqwMtDB");
        setElement(term1114, 2, "Ghbwtircqb");
        setElement(term1114, 3, "xrwlQZdwCp");
        setElement(term1114, 4, "IDCWpPLRkE");
        setElement(term1114, 5, "nyiiPDVjAc");
        setElement(term1114, 6, "aKnKipADSo");
        setField(term1112, term1112.getClass(), "$args", term1114);
        setIntField(term1112, term1112.getClass(), "$it", -1685132342);
        setField(term1200, term1200.getClass(), "element", null);
        setField(term1112, term1112.getClass(), "$outputDir", term1200);
        setIntField(term1112, term1112.getClass(), "arity", -1456670397);
        setField(term1112, term1112.getClass(), "_context", null);
        setField(term1112, term1112.getClass(), "intercepted", null);
        setField(term1112, term1112.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("kotlinx.coroutines.CoroutineScope");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "invoke", argTypes, term1112, args);
    }

};


