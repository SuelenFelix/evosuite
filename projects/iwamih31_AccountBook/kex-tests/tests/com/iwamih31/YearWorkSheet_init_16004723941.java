package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class YearWorkSheet_init_16004723941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776;
     Object term780;

    public YearWorkSheet_init_16004723941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term776 = (int[]) newIntArray(3);
        setIntElement(term776, 0, -1685132342);
        setIntElement(term776, 1, -1456670397);
        setIntElement(term776, 2, 1622346318);
        term780 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 4);
        Object[] term781 = (Object[]) newArray("java.lang.String", 1);
        Object[] term794 = (Object[]) newArray("java.lang.String", 6);
        Object[] term867 = (Object[]) newArray("java.lang.String", 2);
        Object[] term892 = (Object[]) newArray("java.lang.String", 6);
        setElement(term781, 0, "TEParAifyi");
        setElement(term780, 0, term781);
        setElement(term794, 0, "OWDIEULEFu");
        setElement(term794, 1, "dWRymuLBtr");
        setElement(term794, 2, "AijpHYOFuy");
        setElement(term794, 3, "SbAoxhfrkn");
        setElement(term794, 4, "kuTXqwMtDB");
        setElement(term794, 5, "Ghbwtircqb");
        setElement(term780, 1, term794);
        setElement(term867, 0, "xrwlQZdwCp");
        setElement(term867, 1, "IDCWpPLRkE");
        setElement(term780, 2, term867);
        setElement(term892, 0, "nyiiPDVjAc");
        setElement(term892, 1, "aKnKipADSo");
        setElement(term892, 2, "wSQxaModmm");
        setElement(term892, 3, "UlajhuVLaP");
        setElement(term892, 4, "gGSMzuGICf");
        setElement(term892, 5, "hxCBltsObl");
        setElement(term780, 3, term892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.YearWorkSheet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "IoAlmYsBwc";
        args[1] = term776;
        args[2] = term780;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


