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
import java.lang.Integer;

public class Buffer_SubBuffer_backward_5374794141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term25;

    public Buffer_SubBuffer_backward_5374794141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer"));
        byte[] term20 = (byte[]) newByteArray(4);
        setIntField(term16, term16.getClass(), "start", 1484323161);
        setIntField(term16, term16.getClass(), "end", 391863371);
        setIntField(term16, term16.getClass(), "p", -1922583790);
        setByteElement(term20, 0, (byte) -58);
        setByteElement(term20, 1, (byte) -29);
        setByteElement(term20, 2, (byte) -54);
        setByteElement(term20, 3, (byte) -10);
        setField(term16, term16.getClass(), "data", term20);
        term25 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25;
        callMethod(klass, "backward", argTypes, term16, args);
    }

};


