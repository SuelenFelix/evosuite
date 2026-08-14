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

public class FileTypeGuesser_guess_7103290672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public FileTypeGuesser_guess_7103290672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.coreoz.windmill.files.FileSource"));
        Object term2 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term3 = (byte[]) newByteArray(5);
        setByteElement(term3, 0, (byte) 47);
        setByteElement(term3, 1, (byte) 48);
        setByteElement(term3, 2, (byte) 89);
        setByteElement(term3, 3, (byte) 75);
        setByteElement(term3, 4, (byte) 18);
        setField(term2, term2.getClass(), "buf", term3);
        setIntField(term2, term2.getClass(), "pos", 568599855);
        setField(term2, term2.getClass(), "in", null);
        setField(term1, term1.getClass(), "bufferedStream", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.files.FileTypeGuesser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.coreoz.windmill.files.FileSource");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "guess", argTypes, null, args);
    }

};


