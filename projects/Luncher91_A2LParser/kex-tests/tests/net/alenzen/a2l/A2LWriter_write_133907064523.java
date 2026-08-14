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

public class A2LWriter_write_133907064523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23862;

    public A2LWriter_write_133907064523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23862 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23863 = (byte[]) newByteArray(3);
        byte[] term23867 = (byte[]) newByteArray(4);
        setByteElement(term23863, 0, (byte) 40);
        setByteElement(term23863, 1, (byte) -106);
        setByteElement(term23863, 2, (byte) -95);
        setField(term23862, term23862.getClass(), "lineBreak", term23863);
        setByteElement(term23867, 0, (byte) 69);
        setByteElement(term23867, 1, (byte) 63);
        setByteElement(term23867, 2, (byte) -41);
        setByteElement(term23867, 3, (byte) -44);
        setField(term23862, term23862.getClass(), "indentation", term23867);
        setField(term23862, term23862.getClass(), "charset", null);
        setField(term23862, term23862.getClass(), "os", null);
        setIntField(term23862, term23862.getClass(), "indentationDepth", -893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.IA2LWriteable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "write", argTypes, term23862, args);
    }

};


