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

public class A2LWriter_getLineBreak_14284680420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23785;

    public A2LWriter_getLineBreak_14284680420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23785 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23786 = (byte[]) newByteArray(4);
        byte[] term23791 = (byte[]) newByteArray(6);
        setByteElement(term23786, 0, (byte) -73);
        setByteElement(term23786, 1, (byte) 105);
        setByteElement(term23786, 2, (byte) -86);
        setByteElement(term23786, 3, (byte) 84);
        setField(term23785, term23785.getClass(), "lineBreak", term23786);
        setByteElement(term23791, 0, (byte) -70);
        setByteElement(term23791, 1, (byte) 84);
        setByteElement(term23791, 2, (byte) 114);
        setByteElement(term23791, 3, (byte) 60);
        setByteElement(term23791, 4, (byte) -20);
        setByteElement(term23791, 5, (byte) 100);
        setField(term23785, term23785.getClass(), "indentation", term23791);
        setField(term23785, term23785.getClass(), "charset", null);
        setField(term23785, term23785.getClass(), "os", null);
        setIntField(term23785, term23785.getClass(), "indentationDepth", 1141317871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLineBreak", argTypes, term23785, args);
    }

};


