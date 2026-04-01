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

public class EdgeArray_addAll_128212328012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62116;
     Object term62142;

    public EdgeArray_addAll_128212328012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62116 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62117 = (Object[]) newArray("[I", 4);
        int[] term62118 = (int[]) newIntArray(6);
        int[] term62125 = (int[]) newIntArray(1);
        int[] term62127 = (int[]) newIntArray(9);
        int[] term62137 = (int[]) newIntArray(3);
        setField(term62116, term62116.getClass(), "graph", null);
        setIntElement(term62118, 0, -1355031554);
        setIntElement(term62118, 1, 74248043);
        setIntElement(term62118, 2, -822902763);
        setIntElement(term62118, 3, -311521176);
        setIntElement(term62118, 4, -1589597933);
        setIntElement(term62118, 5, 721870191);
        setElement(term62117, 0, term62118);
        setIntElement(term62125, 0, -115938612);
        setElement(term62117, 1, term62125);
        setIntElement(term62127, 0, 1101568875);
        setIntElement(term62127, 1, 1737088701);
        setIntElement(term62127, 2, 1115923305);
        setIntElement(term62127, 3, -1288207437);
        setIntElement(term62127, 4, -1906837813);
        setIntElement(term62127, 5, 2029133784);
        setIntElement(term62127, 6, 187622159);
        setIntElement(term62127, 7, 2037267674);
        setIntElement(term62127, 8, -462650026);
        setElement(term62117, 2, term62127);
        setIntElement(term62137, 0, -662384827);
        setIntElement(term62137, 1, 423501341);
        setIntElement(term62137, 2, 281728339);
        setElement(term62117, 3, term62137);
        setField(term62116, term62116.getClass(), "edges", term62117);
        setIntField(term62116, term62116.getClass(), "numEdges", 849043386);
        term62142 = (Object[]) newArray("[I", 5);
        int[] term62143 = (int[]) newIntArray(8);
        int[] term62152 = (int[]) newIntArray(3);
        int[] term62156 = (int[]) newIntArray(0);
        int[] term62157 = (int[]) newIntArray(1);
        int[] term62159 = (int[]) newIntArray(1);
        setIntElement(term62143, 0, 1153533622);
        setIntElement(term62143, 1, -188954978);
        setIntElement(term62143, 2, 740548136);
        setIntElement(term62143, 3, 2136221804);
        setIntElement(term62143, 4, 1553966793);
        setIntElement(term62143, 5, 972197737);
        setIntElement(term62143, 6, -710042993);
        setIntElement(term62143, 7, 861747659);
        setElement(term62142, 0, term62143);
        setIntElement(term62152, 0, 1991398488);
        setIntElement(term62152, 1, -356531986);
        setIntElement(term62152, 2, 606220124);
        setElement(term62142, 1, term62152);
        setElement(term62142, 2, term62156);
        setIntElement(term62157, 0, -1383984508);
        setElement(term62142, 3, term62157);
        setIntElement(term62159, 0, -604080370);
        setElement(term62142, 4, term62159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term62142;
        callMethod(klass, "addAll", argTypes, term62116, args);
    }

};


