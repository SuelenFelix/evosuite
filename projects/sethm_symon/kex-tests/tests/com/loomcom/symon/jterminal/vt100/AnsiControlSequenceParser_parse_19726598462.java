package com.loomcom.symon.jterminal.vt100;

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
import static com.loomcom.symon.jterminal.vt100.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AnsiControlSequenceParser_parse_19726598462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1927;

    public AnsiControlSequenceParser_parse_19726598462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1927 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term1928 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1929 = (byte[]) newByteArray(16);
        setField(term1928, term1928.getClass(), "value", term1929);
        setByteField(term1928, term1928.getClass(), "coder", (byte) 48);
        setIntField(term1928, term1928.getClass(), "count", 1375330971);
        setField(term1927, term1927.getClass(), "buffer", term1928);
        setField(term1927, term1927.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Reader");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parse", argTypes, term1927, args);
    }

};


