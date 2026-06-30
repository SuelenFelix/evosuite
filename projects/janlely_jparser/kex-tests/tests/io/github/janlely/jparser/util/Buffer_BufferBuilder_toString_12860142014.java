package io.github.janlely.jparser.util;

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
import static io.github.janlely.jparser.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Buffer_BufferBuilder_toString_12860142014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340;

    public Buffer_BufferBuilder_toString_12860142014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer$BufferBuilder"));
        byte[] term341 = (byte[]) newByteArray(9);
        setByteElement(term341, 0, (byte) 66);
        setByteElement(term341, 1, (byte) 123);
        setByteElement(term341, 2, (byte) -5);
        setByteElement(term341, 3, (byte) 84);
        setByteElement(term341, 4, (byte) -97);
        setByteElement(term341, 5, (byte) -24);
        setByteElement(term341, 6, (byte) 88);
        setByteElement(term341, 7, (byte) 96);
        setByteElement(term341, 8, (byte) 70);
        setField(term340, term340.getClass(), "data", term341);
        setIntField(term340, term340.getClass(), "pos", -1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer$BufferBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term340, args);
    }

};


