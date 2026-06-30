package com.zxl.dailypractice.io;

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
import static com.zxl.dailypractice.io.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FileToUnicode_main_12909649621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361;

    public FileToUnicode_main_12909649621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361 = (Object[]) newArray("java.lang.String", 4);
        setElement(term361, 0, "ZiaGIbnzTs");
        setElement(term361, 1, "tbcdzjIfER");
        setElement(term361, 2, "HyxfbSQYBe");
        setElement(term361, 3, "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.io.FileToUnicode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term361;
        callMethod(klass, "main", argTypes, null, args);
    }

};


