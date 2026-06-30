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

public class Buffer_SubBuffer_head_3476117613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42;

    public Buffer_SubBuffer_head_3476117613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer"));
        byte[] term46 = (byte[]) newByteArray(4);
        setIntField(term42, term42.getClass(), "start", -1339778481);
        setIntField(term42, term42.getClass(), "end", 1725571209);
        setIntField(term42, term42.getClass(), "p", -522618178);
        setByteElement(term46, 0, (byte) 83);
        setByteElement(term46, 1, (byte) 74);
        setByteElement(term46, 2, (byte) -71);
        setByteElement(term46, 3, (byte) 49);
        setField(term42, term42.getClass(), "data", term46);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "head", argTypes, term42, args);
    }

};


