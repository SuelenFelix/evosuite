package net.obvj.performetrics.util.print;

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
import static net.obvj.performetrics.util.print.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PrintFormat_appendLine_543841563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10280;
     Object term10312;

    public PrintFormat_appendLine_543841563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10280 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10281 = (byte[]) newByteArray(16);
        setField(term10280, term10280.getClass(), "value", term10281);
        setByteField(term10280, term10280.getClass(), "coder", (byte) 48);
        setIntField(term10280, term10280.getClass(), "count", 1134449235);
        term10312 = (Object[]) newArray("java.lang.Object", 2);
        Object term10313 = newInstance(Class.forName("java.lang.Object"));
        Object term10314 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10312, 0, term10313);
        setElement(term10312, 1, term10314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term10280;
        args[1] = "onpbIeEKoi";
        args[2] = term10312;
        callMethod(klass, "appendLine", argTypes, null, args);
    }

};


