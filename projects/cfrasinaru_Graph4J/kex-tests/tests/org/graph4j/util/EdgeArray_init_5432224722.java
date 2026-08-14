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

public class EdgeArray_init_5432224722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861;

    public EdgeArray_init_5432224722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term861 = (Object[]) newArray("[I", 9);
        int[] term862 = (int[]) newIntArray(0);
        int[] term863 = (int[]) newIntArray(4);
        int[] term868 = (int[]) newIntArray(0);
        int[] term869 = (int[]) newIntArray(7);
        int[] term877 = (int[]) newIntArray(4);
        int[] term882 = (int[]) newIntArray(8);
        int[] term891 = (int[]) newIntArray(0);
        int[] term892 = (int[]) newIntArray(9);
        int[] term902 = (int[]) newIntArray(4);
        setElement(term861, 0, term862);
        setIntElement(term863, 0, -945116798);
        setIntElement(term863, 1, 1593461795);
        setIntElement(term863, 2, 515182546);
        setIntElement(term863, 3, -936895502);
        setElement(term861, 1, term863);
        setElement(term861, 2, term868);
        setIntElement(term869, 0, -129547140);
        setIntElement(term869, 1, 199287428);
        setIntElement(term869, 2, -1195339592);
        setIntElement(term869, 3, -376422566);
        setIntElement(term869, 4, 306847454);
        setIntElement(term869, 5, 1745276158);
        setIntElement(term869, 6, 2009020256);
        setElement(term861, 3, term869);
        setIntElement(term877, 0, 2049577015);
        setIntElement(term877, 1, 1236004505);
        setIntElement(term877, 2, 1050765721);
        setIntElement(term877, 3, 474518942);
        setElement(term861, 4, term877);
        setIntElement(term882, 0, -1656687479);
        setIntElement(term882, 1, -249614216);
        setIntElement(term882, 2, 1870727665);
        setIntElement(term882, 3, -519881101);
        setIntElement(term882, 4, -680920524);
        setIntElement(term882, 5, -916335264);
        setIntElement(term882, 6, -919416536);
        setIntElement(term882, 7, -43417861);
        setElement(term861, 5, term882);
        setElement(term861, 6, term891);
        setIntElement(term892, 0, -1533843432);
        setIntElement(term892, 1, -123338791);
        setIntElement(term892, 2, -1467089634);
        setIntElement(term892, 3, 413548937);
        setIntElement(term892, 4, 1901317214);
        setIntElement(term892, 5, 1166710220);
        setIntElement(term892, 6, -1070592289);
        setIntElement(term892, 7, -1464172784);
        setIntElement(term892, 8, 32185364);
        setElement(term861, 7, term892);
        setIntElement(term902, 0, 1768204942);
        setIntElement(term902, 1, 1252951645);
        setIntElement(term902, 2, 574481092);
        setIntElement(term902, 3, -310528004);
        setElement(term861, 8, term902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term861;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


