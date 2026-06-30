package com.gin.mergegfassets.utils;

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
import static com.gin.mergegfassets.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class FileUtils_deleteFileWithKeyword_6597607274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1014;
     Object term1035;

    public FileUtils_deleteFileWithKeyword_6597607274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1047 = Class.forName((String) "java.io.File$PathStatus");
        Field term1046 = ((Class) term1047).getDeclaredField((String) "CHECKED");
        ((Field) term1046).setAccessible(true);
        Object enum4 = ((Field) term1046).get((Object) null);
        Object term1017 = newInstance(Class.forName("java.io.File"));
        setField(term1017, term1017.getClass(), "path", "ZiaGIbnzTs");
        setField(term1017, term1017.getClass(), "status", enum4);
        setIntField(term1017, term1017.getClass(), "prefixLength", -1955890973);
        setField(term1017, term1017.getClass(), "filePath", null);
        term1014 = new LinkedList();
        ((LinkedList) term1014).add(term1017);
        term1035 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.FileUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1014;
        args[1] = term1035;
        callMethod(klass, "deleteFileWithKeyword", argTypes, null, args);
    }

};


