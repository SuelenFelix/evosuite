package com.zxl.dailypractice.card.two.august.august2;

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
import static com.zxl.dailypractice.card.two.august.august2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Solution_isFull_127628696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;

    public Solution_isFull_127628696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution"));
        int[] term68 = (int[]) newIntArray(6);
        setIntField(term64, term64.getClass(), "front", 1193880199);
        setIntField(term64, term64.getClass(), "rear", -1087774327);
        setIntField(term64, term64.getClass(), "capacity", -1530420153);
        setIntElement(term68, 0, -469968304);
        setIntElement(term68, 1, -1145578966);
        setIntElement(term68, 2, 679763016);
        setIntElement(term68, 3, 1962444399);
        setIntElement(term68, 4, 767834723);
        setIntElement(term68, 5, -602026508);
        setField(term64, term64.getClass(), "elements", term68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFull", argTypes, term64, args);
    }

};


