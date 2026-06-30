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

public class Buffer_SubBuffer_forward_18448841165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;
     Object term75;

    public Buffer_SubBuffer_forward_18448841165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer"));
        byte[] term68 = (byte[]) newByteArray(6);
        setIntField(term64, term64.getClass(), "start", -1685132342);
        setIntField(term64, term64.getClass(), "end", -1456670397);
        setIntField(term64, term64.getClass(), "p", 1622346318);
        setByteElement(term68, 0, (byte) 67);
        setByteElement(term68, 1, (byte) 78);
        setByteElement(term68, 2, (byte) 87);
        setByteElement(term68, 3, (byte) 121);
        setByteElement(term68, 4, (byte) -99);
        setByteElement(term68, 5, (byte) -2);
        setField(term64, term64.getClass(), "data", term68);
        term75 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75;
        callMethod(klass, "forward", argTypes, term64, args);
    }

};


