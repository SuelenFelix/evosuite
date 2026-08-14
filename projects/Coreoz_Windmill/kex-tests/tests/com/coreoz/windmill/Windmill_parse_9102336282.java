package com.coreoz.windmill;

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
import static com.coreoz.windmill.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Windmill_parse_9102336282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term701;

    public Windmill_parse_9102336282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term701 = newInstance(Class.forName("com.coreoz.windmill.files.FileSource"));
        Object term702 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term703 = (byte[]) newByteArray(1);
        setByteElement(term703, 0, (byte) -66);
        setField(term702, term702.getClass(), "buf", term703);
        setIntField(term702, term702.getClass(), "pos", -2038273078);
        setField(term702, term702.getClass(), "in", null);
        setField(term701, term701.getClass(), "bufferedStream", term702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.Windmill");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.coreoz.windmill.files.FileSource");
        argTypes[1] = Class.forName("com.coreoz.windmill.imports.FileParser");
        Object[] args = new Object[2];
        args[0] = term701;
        args[1] = null;
        callMethod(klass, "parse", argTypes, null, args);
    }

};


