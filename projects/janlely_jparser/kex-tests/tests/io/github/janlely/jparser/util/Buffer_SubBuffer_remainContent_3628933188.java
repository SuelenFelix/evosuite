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

public class Buffer_SubBuffer_remainContent_3628933188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;

    public Buffer_SubBuffer_remainContent_3628933188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer"));
        byte[] term115 = (byte[]) newByteArray(7);
        setIntField(term111, term111.getClass(), "start", 865208305);
        setIntField(term111, term111.getClass(), "end", -1275173084);
        setIntField(term111, term111.getClass(), "p", -244121226);
        setByteElement(term115, 0, (byte) 98);
        setByteElement(term115, 1, (byte) 67);
        setByteElement(term115, 2, (byte) 66);
        setByteElement(term115, 3, (byte) -121);
        setByteElement(term115, 4, (byte) -119);
        setByteElement(term115, 5, (byte) 71);
        setByteElement(term115, 6, (byte) 80);
        setField(term111, term111.getClass(), "data", term115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "remainContent", argTypes, term111, args);
    }

};


