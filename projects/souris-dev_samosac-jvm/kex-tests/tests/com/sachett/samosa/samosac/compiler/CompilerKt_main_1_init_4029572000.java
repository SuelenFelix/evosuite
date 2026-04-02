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
import java.lang.String;

public class CompilerKt_main_1_init_4029572000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term62;

    public CompilerKt_main_1_init_4029572000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1, 0, "PAEBtnZtTD");
        setElement(term1, 1, "sjlJAEtRrb");
        setElement(term1, 2, "MuLcgQHgqz");
        setElement(term1, 3, "xxtlPwDYFs");
        setElement(term1, 4, "jJCZpVmanW");
        Class<? extends Object> term171 = Class.forName((String) "java.io.File$PathStatus");
        Field term170 = ((Class) term171).getDeclaredField((String) "INVALID");
        ((Field) term170).setAccessible(true);
        Object enum0 = ((Field) term170).get((Object) null);
        term62 = newInstance(Class.forName("kotlin.jvm.internal.Ref$ObjectRef"));
        Object term63 = newInstance(Class.forName("java.io.File"));
        setField(term63, term63.getClass(), "path", "EGtDIRbSSb");
        setField(term63, term63.getClass(), "status", enum0);
        setIntField(term63, term63.getClass(), "prefixLength", 568599855);
        setField(term63, term63.getClass(), "filePath", null);
        setField(term62, term62.getClass(), "element", term63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("kotlin.jvm.internal.Ref$ObjectRef");
        argTypes[2] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term62;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


