package com.zxl.dailypractice.card.two.june.june6;

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
import static com.zxl.dailypractice.card.two.june.june6.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Solution_book_14805980471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term5;
     Object term7;

    public Solution_book_14805980471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.june.june6.Solution"));
        Object term2 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term2, term2.getClass(), "comparator", null);
        setField(term2, term2.getClass(), "root", null);
        setIntField(term2, term2.getClass(), "size", 0);
        setIntField(term2, term2.getClass(), "modCount", 0);
        setField(term2, term2.getClass(), "entrySet", null);
        setField(term2, term2.getClass(), "navigableKeySet", null);
        setField(term2, term2.getClass(), "descendingMap", null);
        setField(term2, term2.getClass(), "keySet", null);
        setField(term2, term2.getClass(), "values", null);
        setField(term1, term1.getClass(), "cnt", term2);
        term5 = new Integer(568599855);
        term7 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.june.june6.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5;
        args[1] = term7;
        callMethod(klass, "book", argTypes, term1, args);
    }

};


