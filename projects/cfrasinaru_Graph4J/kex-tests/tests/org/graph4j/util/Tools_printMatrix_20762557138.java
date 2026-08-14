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

public class Tools_printMatrix_20762557138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10775;

    public Tools_printMatrix_20762557138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10775 = (Object[]) newArray("[I", 5);
        int[] term10776 = (int[]) newIntArray(9);
        int[] term10786 = (int[]) newIntArray(5);
        int[] term10792 = (int[]) newIntArray(7);
        int[] term10800 = (int[]) newIntArray(3);
        int[] term10804 = (int[]) newIntArray(6);
        setIntElement(term10776, 0, -1920705464);
        setIntElement(term10776, 1, 428714196);
        setIntElement(term10776, 2, 934939315);
        setIntElement(term10776, 3, -935897776);
        setIntElement(term10776, 4, 1370328728);
        setIntElement(term10776, 5, 1126005767);
        setIntElement(term10776, 6, -1155333431);
        setIntElement(term10776, 7, -2110210183);
        setIntElement(term10776, 8, -687531774);
        setElement(term10775, 0, term10776);
        setIntElement(term10786, 0, -1997574107);
        setIntElement(term10786, 1, 748487022);
        setIntElement(term10786, 2, -706230330);
        setIntElement(term10786, 3, -926446006);
        setIntElement(term10786, 4, 572417171);
        setElement(term10775, 1, term10786);
        setIntElement(term10792, 0, 46222099);
        setIntElement(term10792, 1, 1985711069);
        setIntElement(term10792, 2, -1497378582);
        setIntElement(term10792, 3, -449740668);
        setIntElement(term10792, 4, 1283268105);
        setIntElement(term10792, 5, -220552939);
        setIntElement(term10792, 6, -444257155);
        setElement(term10775, 2, term10792);
        setIntElement(term10800, 0, -309536114);
        setIntElement(term10800, 1, 755500171);
        setIntElement(term10800, 2, -535062491);
        setElement(term10775, 3, term10800);
        setIntElement(term10804, 0, -147381920);
        setIntElement(term10804, 1, -7568006);
        setIntElement(term10804, 2, 1952367361);
        setIntElement(term10804, 3, -715290594);
        setIntElement(term10804, 4, -860371306);
        setIntElement(term10804, 5, -125626789);
        setElement(term10775, 4, term10804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10775;
        callMethod(klass, "printMatrix", argTypes, null, args);
    }

};


