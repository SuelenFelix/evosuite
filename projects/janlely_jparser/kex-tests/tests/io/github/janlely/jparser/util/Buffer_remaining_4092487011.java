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

public class Buffer_remaining_4092487011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;

    public Buffer_remaining_4092487011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer"));
        byte[] term189 = (byte[]) newByteArray(6);
        setByteElement(term189, 0, (byte) 72);
        setByteElement(term189, 1, (byte) 111);
        setByteElement(term189, 2, (byte) 99);
        setByteElement(term189, 3, (byte) -12);
        setByteElement(term189, 4, (byte) -61);
        setByteElement(term189, 5, (byte) -85);
        setField(term188, term188.getClass(), "data", term189);
        setIntField(term188, term188.getClass(), "pos", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "remaining", argTypes, term188, args);
    }

};


