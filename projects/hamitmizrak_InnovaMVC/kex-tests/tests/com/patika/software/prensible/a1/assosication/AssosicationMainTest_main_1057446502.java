package com.patika.software.prensible.a1.assosication;

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
import static com.patika.software.prensible.a1.assosication.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AssosicationMainTest_main_1057446502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2157;

    public AssosicationMainTest_main_1057446502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2157 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2157, 0, "wsysQLGFnl");
        setElement(term2157, 1, "ckQLZGFjMX");
        setElement(term2157, 2, "qphdrqUtNx");
        setElement(term2157, 3, "bwlLFAfNWx");
        setElement(term2157, 4, "JWodNQzjjV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a1.assosication.AssosicationMainTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2157;
        callMethod(klass, "main", argTypes, null, args);
    }

};


