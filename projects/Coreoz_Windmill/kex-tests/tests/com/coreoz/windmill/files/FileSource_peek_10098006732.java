package com.coreoz.windmill.files;

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
import static com.coreoz.windmill.files.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class FileSource_peek_10098006732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468;
     Object term473;

    public FileSource_peek_10098006732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term468 = newInstance(Class.forName("com.coreoz.windmill.files.FileSource"));
        Object term469 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term470 = (byte[]) newByteArray(1);
        setByteElement(term470, 0, (byte) 79);
        setField(term469, term469.getClass(), "buf", term470);
        setIntField(term469, term469.getClass(), "pos", -1955890973);
        setField(term469, term469.getClass(), "in", null);
        setField(term468, term468.getClass(), "bufferedStream", term469);
        term473 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.files.FileSource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term473;
        callMethod(klass, "peek", argTypes, term468, args);
    }

};


