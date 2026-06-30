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

public class Buffer_SubBuffer_splitAt_7900682387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term103;

    public Buffer_SubBuffer_splitAt_7900682387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer"));
        byte[] term96 = (byte[]) newByteArray(6);
        setIntField(term92, term92.getClass(), "start", -117576464);
        setIntField(term92, term92.getClass(), "end", -1007160944);
        setIntField(term92, term92.getClass(), "p", 1135664017);
        setByteElement(term96, 0, (byte) -111);
        setByteElement(term96, 1, (byte) 23);
        setByteElement(term96, 2, (byte) -15);
        setByteElement(term96, 3, (byte) 36);
        setByteElement(term96, 4, (byte) 118);
        setByteElement(term96, 5, (byte) 106);
        setField(term92, term92.getClass(), "data", term96);
        term103 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term103;
        callMethod(klass, "splitAt", argTypes, term92, args);
    }

};


