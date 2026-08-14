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

public class A2LWriter_getIndentationDepth_155984893516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23713;

    public A2LWriter_getIndentationDepth_155984893516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23713 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23714 = (byte[]) newByteArray(4);
        byte[] term23719 = (byte[]) newByteArray(1);
        setByteElement(term23714, 0, (byte) -98);
        setByteElement(term23714, 1, (byte) -119);
        setByteElement(term23714, 2, (byte) 120);
        setByteElement(term23714, 3, (byte) -15);
        setField(term23713, term23713.getClass(), "lineBreak", term23714);
        setByteElement(term23719, 0, (byte) 115);
        setField(term23713, term23713.getClass(), "indentation", term23719);
        setField(term23713, term23713.getClass(), "charset", null);
        setField(term23713, term23713.getClass(), "os", null);
        setIntField(term23713, term23713.getClass(), "indentationDepth", -615654495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndentationDepth", argTypes, term23713, args);
    }

};


