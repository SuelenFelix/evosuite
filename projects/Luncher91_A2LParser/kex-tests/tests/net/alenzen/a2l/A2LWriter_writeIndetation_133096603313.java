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

public class A2LWriter_writeIndetation_133096603313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23645;

    public A2LWriter_writeIndetation_133096603313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23645 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23646 = (byte[]) newByteArray(4);
        byte[] term23651 = (byte[]) newByteArray(6);
        setByteElement(term23646, 0, (byte) 124);
        setByteElement(term23646, 1, (byte) -124);
        setByteElement(term23646, 2, (byte) -72);
        setByteElement(term23646, 3, (byte) 90);
        setField(term23645, term23645.getClass(), "lineBreak", term23646);
        setByteElement(term23651, 0, (byte) -34);
        setByteElement(term23651, 1, (byte) -2);
        setByteElement(term23651, 2, (byte) 96);
        setByteElement(term23651, 3, (byte) 55);
        setByteElement(term23651, 4, (byte) -103);
        setByteElement(term23651, 5, (byte) -103);
        setField(term23645, term23645.getClass(), "indentation", term23651);
        setField(term23645, term23645.getClass(), "charset", null);
        setField(term23645, term23645.getClass(), "os", null);
        setIntField(term23645, term23645.getClass(), "indentationDepth", 339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeIndetation", argTypes, term23645, args);
    }

};


