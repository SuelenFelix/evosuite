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

public class FileTypeGuesser_fromIntArray_12660203893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;

    public FileTypeGuesser_fromIntArray_12660203893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = (int[]) newIntArray(4);
        setIntElement(term15, 0, 1162663216);
        setIntElement(term15, 1, 1484323161);
        setIntElement(term15, 2, 391863371);
        setIntElement(term15, 3, -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.files.FileTypeGuesser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15;
        callMethod(klass, "fromIntArray", argTypes, null, args);
    }

};


