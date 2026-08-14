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

public class A2LWriter_indent_37088693517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23727;

    public A2LWriter_indent_37088693517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23727 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23728 = (byte[]) newByteArray(2);
        byte[] term23731 = (byte[]) newByteArray(5);
        setByteElement(term23728, 0, (byte) 52);
        setByteElement(term23728, 1, (byte) 96);
        setField(term23727, term23727.getClass(), "lineBreak", term23728);
        setByteElement(term23731, 0, (byte) 40);
        setByteElement(term23731, 1, (byte) -5);
        setByteElement(term23731, 2, (byte) 24);
        setByteElement(term23731, 3, (byte) -39);
        setByteElement(term23731, 4, (byte) 30);
        setField(term23727, term23727.getClass(), "indentation", term23731);
        setField(term23727, term23727.getClass(), "charset", null);
        setField(term23727, term23727.getClass(), "os", null);
        setIntField(term23727, term23727.getClass(), "indentationDepth", -1476117762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "indent", argTypes, term23727, args);
    }

};


