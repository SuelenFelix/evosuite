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

public class A2LWriter_getBOMBytes_1036652483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23247;

    public A2LWriter_getBOMBytes_1036652483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23247 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23248 = (byte[]) newByteArray(0);
        byte[] term23249 = (byte[]) newByteArray(3);
        setField(term23247, term23247.getClass(), "lineBreak", term23248);
        setByteElement(term23249, 0, (byte) -25);
        setByteElement(term23249, 1, (byte) -35);
        setByteElement(term23249, 2, (byte) 3);
        setField(term23247, term23247.getClass(), "indentation", term23249);
        setField(term23247, term23247.getClass(), "charset", null);
        setField(term23247, term23247.getClass(), "os", null);
        setIntField(term23247, term23247.getClass(), "indentationDepth", -1263114719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBOMBytes", argTypes, term23247, args);
    }

};


