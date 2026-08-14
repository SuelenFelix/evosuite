package net.obvj.performetrics.util;

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
import static net.obvj.performetrics.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DurationFormat_appendSign_21019826914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9263;
     Object term9283;

    public DurationFormat_appendSign_21019826914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9263 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9264 = (byte[]) newByteArray(16);
        setField(term9263, term9263.getClass(), "value", term9264);
        setByteField(term9263, term9263.getClass(), "coder", (byte) 47);
        setIntField(term9263, term9263.getClass(), "count", -344842608);
        term9283 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term9284 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term9284, term9284.getClass(), "seconds", 21600L);
        setIntField(term9284, term9284.getClass(), "nanos", 0);
        setField(term9283, term9283.getClass(), "internalDuration", term9284);
        setLongField(term9283, term9283.getClass(), "effectiveTotalSeconds", 4178434741742309755L);
        setIntField(term9283, term9283.getClass(), "effectiveNanoseconds", 941650513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("net.obvj.performetrics.util.Duration");
        Object[] args = new Object[2];
        args[0] = term9263;
        args[1] = term9283;
        callMethod(klass, "appendSign", argTypes, null, args);
    }

};


