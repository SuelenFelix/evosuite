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

public class Buffer_SubBuffer_remaining_12553401852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;

    public Buffer_SubBuffer_remaining_12553401852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer"));
        byte[] term35 = (byte[]) newByteArray(3);
        setIntField(term31, term31.getClass(), "start", -1955890973);
        setIntField(term31, term31.getClass(), "end", -2038273078);
        setIntField(term31, term31.getClass(), "p", 1227103734);
        setByteElement(term35, 0, (byte) 79);
        setByteElement(term35, 1, (byte) -119);
        setByteElement(term35, 2, (byte) -66);
        setField(term31, term31.getClass(), "data", term35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "remaining", argTypes, term31, args);
    }

};


