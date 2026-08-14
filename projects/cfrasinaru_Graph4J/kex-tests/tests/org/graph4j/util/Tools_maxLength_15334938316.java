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
import java.lang.Object;

public class Tools_maxLength_15334938316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10717;

    public Tools_maxLength_15334938316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10717 = (Object[]) newArray("[I", 2);
        int[] term10718 = (int[]) newIntArray(6);
        int[] term10725 = (int[]) newIntArray(4);
        setIntElement(term10718, 0, 1498231709);
        setIntElement(term10718, 1, -775074162);
        setIntElement(term10718, 2, 304255923);
        setIntElement(term10718, 3, 1532668668);
        setIntElement(term10718, 4, -100547107);
        setIntElement(term10718, 5, 2140567451);
        setElement(term10717, 0, term10718);
        setIntElement(term10725, 0, -390400057);
        setIntElement(term10725, 1, -157273113);
        setIntElement(term10725, 2, 1497057438);
        setIntElement(term10725, 3, 1526060255);
        setElement(term10717, 1, term10725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10717;
        callMethod(klass, "maxLength", argTypes, null, args);
    }

};


