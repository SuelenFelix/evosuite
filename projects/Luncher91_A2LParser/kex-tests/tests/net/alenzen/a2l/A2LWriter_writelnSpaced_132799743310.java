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
import java.lang.Object;

public class A2LWriter_writelnSpaced_132799743310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23526;
     Object term23539;

    public A2LWriter_writelnSpaced_132799743310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23526 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23527 = (byte[]) newByteArray(3);
        byte[] term23531 = (byte[]) newByteArray(6);
        setByteElement(term23527, 0, (byte) -14);
        setByteElement(term23527, 1, (byte) 10);
        setByteElement(term23527, 2, (byte) 65);
        setField(term23526, term23526.getClass(), "lineBreak", term23527);
        setByteElement(term23531, 0, (byte) -44);
        setByteElement(term23531, 1, (byte) 115);
        setByteElement(term23531, 2, (byte) -32);
        setByteElement(term23531, 3, (byte) -52);
        setByteElement(term23531, 4, (byte) 53);
        setByteElement(term23531, 5, (byte) 44);
        setField(term23526, term23526.getClass(), "indentation", term23531);
        setField(term23526, term23526.getClass(), "charset", null);
        setField(term23526, term23526.getClass(), "os", null);
        setIntField(term23526, term23526.getClass(), "indentationDepth", -268815336);
        term23539 = (Object[]) newArray("java.lang.String", 1);
        setElement(term23539, 0, "UKAReurpHG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term23539;
        callMethod(klass, "writelnSpaced", argTypes, term23526, args);
    }

};


