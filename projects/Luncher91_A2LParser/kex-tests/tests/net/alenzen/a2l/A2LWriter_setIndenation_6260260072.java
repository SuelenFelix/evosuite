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

public class A2LWriter_setIndenation_6260260072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23201;

    public A2LWriter_setIndenation_6260260072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23201 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23202 = (byte[]) newByteArray(8);
        byte[] term23211 = (byte[]) newByteArray(2);
        setByteElement(term23202, 0, (byte) -70);
        setByteElement(term23202, 1, (byte) -73);
        setByteElement(term23202, 2, (byte) 1);
        setByteElement(term23202, 3, (byte) 99);
        setByteElement(term23202, 4, (byte) -121);
        setByteElement(term23202, 5, (byte) -50);
        setByteElement(term23202, 6, (byte) -79);
        setByteElement(term23202, 7, (byte) 110);
        setField(term23201, term23201.getClass(), "lineBreak", term23202);
        setByteElement(term23211, 0, (byte) -111);
        setByteElement(term23211, 1, (byte) -54);
        setField(term23201, term23201.getClass(), "indentation", term23211);
        setField(term23201, term23201.getClass(), "charset", null);
        setField(term23201, term23201.getClass(), "os", null);
        setIntField(term23201, term23201.getClass(), "indentationDepth", -1034506028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IpQuOGMgmj";
        callMethod(klass, "setIndenation", argTypes, term23201, args);
    }

};


