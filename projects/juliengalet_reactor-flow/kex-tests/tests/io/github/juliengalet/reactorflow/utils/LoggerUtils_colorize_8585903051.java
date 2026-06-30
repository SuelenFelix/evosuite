package io.github.juliengalet.reactorflow.utils;

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
import static io.github.juliengalet.reactorflow.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class LoggerUtils_colorize_8585903051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public LoggerUtils_colorize_8585903051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1667 = Class.forName((String) "io.github.juliengalet.reactorflow.utils.ConsoleStyle");
        Field term1666 = ((Class) term1667).getDeclaredField((String) "BLACK");
        ((Field) term1666).setAccessible(true);
        Object enum0 = ((Field) term1666).get((Object) null);
        Class<? extends Object> term1949 = Class.forName((String) "io.github.juliengalet.reactorflow.utils.ConsoleStyle");
        Field term1948 = ((Class) term1949).getDeclaredField((String) "WHITE");
        ((Field) term1948).setAccessible(true);
        Object enum1 = ((Field) term1948).get((Object) null);
        Class<? extends Object> term2231 = Class.forName((String) "io.github.juliengalet.reactorflow.utils.ConsoleStyle");
        Field term2230 = ((Class) term2231).getDeclaredField((String) "RED_BRIGHT");
        ((Field) term2230).setAccessible(true);
        Object enum2 = ((Field) term2230).get((Object) null);
        Class<? extends Object> term2528 = Class.forName((String) "io.github.juliengalet.reactorflow.utils.ConsoleStyle");
        Field term2527 = ((Class) term2528).getDeclaredField((String) "WHITE_BACKGROUND_BRIGHT");
        ((Field) term2527).setAccessible(true);
        Object enum3 = ((Field) term2527).get((Object) null);
        Class<? extends Object> term2864 = Class.forName((String) "io.github.juliengalet.reactorflow.utils.ConsoleStyle");
        Field term2863 = ((Class) term2864).getDeclaredField((String) "YELLOW_BRIGHT");
        ((Field) term2863).setAccessible(true);
        Object enum4 = ((Field) term2863).get((Object) null);
        term13 = (Object[]) newArray("io.github.juliengalet.reactorflow.utils.ConsoleStyle", 5);
        setElement(term13, 0, enum0);
        setElement(term13, 1, enum1);
        setElement(term13, 2, enum2);
        setElement(term13, 3, enum3);
        setElement(term13, 4, enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.utils.LoggerUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("io.github.juliengalet.reactorflow.utils.ConsoleStyle"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        callMethod(klass, "colorize", argTypes, null, args);
    }

};


