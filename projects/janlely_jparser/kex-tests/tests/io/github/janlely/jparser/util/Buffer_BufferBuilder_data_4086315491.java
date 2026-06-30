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

public class Buffer_BufferBuilder_data_4086315491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294;
     Object term305;

    public Buffer_BufferBuilder_data_4086315491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer$BufferBuilder"));
        byte[] term295 = (byte[]) newByteArray(8);
        setByteElement(term295, 0, (byte) -118);
        setByteElement(term295, 1, (byte) -126);
        setByteElement(term295, 2, (byte) -91);
        setByteElement(term295, 3, (byte) -104);
        setByteElement(term295, 4, (byte) -89);
        setByteElement(term295, 5, (byte) 13);
        setByteElement(term295, 6, (byte) 44);
        setByteElement(term295, 7, (byte) -63);
        setField(term294, term294.getClass(), "data", term295);
        setIntField(term294, term294.getClass(), "pos", -157887805);
        term305 = (byte[]) newByteArray(6);
        setByteElement(term305, 0, (byte) 15);
        setByteElement(term305, 1, (byte) 45);
        setByteElement(term305, 2, (byte) -39);
        setByteElement(term305, 3, (byte) -20);
        setByteElement(term305, 4, (byte) 10);
        setByteElement(term305, 5, (byte) 77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer$BufferBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term305;
        callMethod(klass, "data", argTypes, term294, args);
    }

};


