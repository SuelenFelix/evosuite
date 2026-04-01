package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Validator_containsVertices_167227252015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73109;

    public Validator_containsVertices_167227252015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73109 = (int[]) newIntArray(8);
        setIntElement(term73109, 0, 521443191);
        setIntElement(term73109, 1, -2081317858);
        setIntElement(term73109, 2, 521636774);
        setIntElement(term73109, 3, 957822710);
        setIntElement(term73109, 4, 2109876514);
        setIntElement(term73109, 5, 420904170);
        setIntElement(term73109, 6, -1514514018);
        setIntElement(term73109, 7, 589432414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Validator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term73109;
        callMethod(klass, "containsVertices", argTypes, null, args);
    }

};


