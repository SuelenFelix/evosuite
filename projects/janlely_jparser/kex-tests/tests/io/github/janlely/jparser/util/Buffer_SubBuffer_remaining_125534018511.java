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

public class Buffer_SubBuffer_remaining_125534018511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;

    public Buffer_SubBuffer_remaining_125534018511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer"));
        setIntField(term140, term140.getClass(), "start", 0);
        setIntField(term140, term140.getClass(), "end", 0);
        setIntField(term140, term140.getClass(), "p", 0);
        setField(term140, term140.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.util.Buffer$SubBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "remaining", argTypes, term140, args);
    }

};


