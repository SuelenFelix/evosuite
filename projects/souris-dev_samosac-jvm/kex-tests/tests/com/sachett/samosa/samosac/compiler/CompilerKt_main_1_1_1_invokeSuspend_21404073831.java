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

public class CompilerKt_main_1_1_1_invokeSuspend_21404073831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922;
     Object term952;

    public CompilerKt_main_1_1_1_invokeSuspend_21404073831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term922 = newInstance(Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1"));
        Object[] term924 = (Object[]) newArray("java.lang.String", 2);
        Object term950 = newInstance(Class.forName("kotlin.jvm.internal.Ref$ObjectRef"));
        setIntField(term922, term922.getClass(), "label", -1339778481);
        setElement(term924, 0, "vrQLuWIDJX");
        setElement(term924, 1, "flxyYxBRtu");
        setField(term922, term922.getClass(), "$args", term924);
        setIntField(term922, term922.getClass(), "$it", 1725571209);
        setField(term950, term950.getClass(), "element", null);
        setField(term922, term922.getClass(), "$outputDir", term950);
        setIntField(term922, term922.getClass(), "arity", -522618178);
        setField(term922, term922.getClass(), "_context", null);
        setField(term922, term922.getClass(), "intercepted", null);
        setField(term922, term922.getClass(), "completion", null);
        term952 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term952;
        callMethod(klass, "invokeSuspend", argTypes, term922, args);
    }

};


