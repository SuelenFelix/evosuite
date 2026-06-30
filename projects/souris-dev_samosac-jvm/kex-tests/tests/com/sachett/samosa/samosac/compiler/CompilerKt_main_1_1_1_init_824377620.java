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
import java.lang.Integer;
import java.lang.String;

public class CompilerKt_main_1_1_1_init_824377620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608;
     Object term681;
     Object term683;

    public CompilerKt_main_1_1_1_init_824377620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608 = (Object[]) newArray("java.lang.String", 6);
        setElement(term608, 0, "HyxfbSQYBe");
        setElement(term608, 1, "pCTimMblYc");
        setElement(term608, 2, "hNxWaHcfhY");
        setElement(term608, 3, "RkybSrpybU");
        setElement(term608, 4, "xOEqzGAmDU");
        setElement(term608, 5, "eZFUvlxvGV");
        term681 = new Integer(-2038273078);
        Class<? extends Object> term780 = Class.forName((String) "java.io.File$PathStatus");
        Field term779 = ((Class) term780).getDeclaredField((String) "INVALID");
        ((Field) term779).setAccessible(true);
        Object enum1 = ((Field) term779).get((Object) null);
        term683 = newInstance(Class.forName("kotlin.jvm.internal.Ref$ObjectRef"));
        Object term684 = newInstance(Class.forName("java.io.File"));
        setField(term684, term684.getClass(), "path", "BYqFIqCKAV");
        setField(term684, term684.getClass(), "status", enum1);
        setIntField(term684, term684.getClass(), "prefixLength", 1227103734);
        setField(term684, term684.getClass(), "filePath", null);
        setField(term683, term683.getClass(), "element", term684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.compiler.CompilerKt$main$1$1$1");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("kotlin.jvm.internal.Ref$ObjectRef");
        argTypes[3] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[4];
        args[0] = term608;
        args[1] = term681;
        args[2] = term683;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


