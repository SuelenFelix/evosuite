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

public class A2LWriter_writelnBeginSpaced_10396039508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23385;
     Object term23401;

    public A2LWriter_writelnBeginSpaced_10396039508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23385 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23386 = (byte[]) newByteArray(9);
        byte[] term23396 = (byte[]) newByteArray(3);
        setByteElement(term23386, 0, (byte) 100);
        setByteElement(term23386, 1, (byte) -1);
        setByteElement(term23386, 2, (byte) -127);
        setByteElement(term23386, 3, (byte) -118);
        setByteElement(term23386, 4, (byte) 69);
        setByteElement(term23386, 5, (byte) 112);
        setByteElement(term23386, 6, (byte) 77);
        setByteElement(term23386, 7, (byte) -1);
        setByteElement(term23386, 8, (byte) -83);
        setField(term23385, term23385.getClass(), "lineBreak", term23386);
        setByteElement(term23396, 0, (byte) -63);
        setByteElement(term23396, 1, (byte) 108);
        setByteElement(term23396, 2, (byte) -105);
        setField(term23385, term23385.getClass(), "indentation", term23396);
        setField(term23385, term23385.getClass(), "charset", null);
        setField(term23385, term23385.getClass(), "os", null);
        setIntField(term23385, term23385.getClass(), "indentationDepth", 683666002);
        term23401 = (Object[]) newArray("java.lang.String", 3);
        setElement(term23401, 0, "nghfqDXyCG");
        setElement(term23401, 1, "WBAOTqErtm");
        setElement(term23401, 2, "PqtVXXZMqK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term23401;
        callMethod(klass, "writelnBeginSpaced", argTypes, term23385, args);
    }

};


