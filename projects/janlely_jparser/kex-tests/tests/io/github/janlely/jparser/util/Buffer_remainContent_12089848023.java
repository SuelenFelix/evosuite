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

public class Buffer_remainContent_12089848023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;

    public Buffer_remainContent_12089848023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer"));
        byte[] term217 = (byte[]) newByteArray(5);
        setByteElement(term217, 0, (byte) -23);
        setByteElement(term217, 1, (byte) 100);
        setByteElement(term217, 2, (byte) 106);
        setByteElement(term217, 3, (byte) -57);
        setByteElement(term217, 4, (byte) -103);
        setField(term216, term216.getClass(), "data", term217);
        setIntField(term216, term216.getClass(), "pos", 1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "remainContent", argTypes, term216, args);
    }

};


