package net.alenzen.a2l;

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
import static net.alenzen.a2l.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class A2LWriter_writeMultiLine_32484023426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23957;

    public A2LWriter_writeMultiLine_32484023426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23957 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23958 = (byte[]) newByteArray(1);
        byte[] term23960 = (byte[]) newByteArray(5);
        setByteElement(term23958, 0, (byte) 56);
        setField(term23957, term23957.getClass(), "lineBreak", term23958);
        setByteElement(term23960, 0, (byte) -76);
        setByteElement(term23960, 1, (byte) -29);
        setByteElement(term23960, 2, (byte) 121);
        setByteElement(term23960, 3, (byte) -17);
        setByteElement(term23960, 4, (byte) -123);
        setField(term23957, term23957.getClass(), "indentation", term23960);
        setField(term23957, term23957.getClass(), "charset", null);
        setField(term23957, term23957.getClass(), "os", null);
        setIntField(term23957, term23957.getClass(), "indentationDepth", 1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qYzsiuXOgS";
        callMethod(klass, "writeMultiLine", argTypes, term23957, args);
    }

};


