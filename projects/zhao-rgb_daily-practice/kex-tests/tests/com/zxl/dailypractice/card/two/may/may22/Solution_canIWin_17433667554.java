package com.zxl.dailypractice.card.two.may.may22;

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
import static com.zxl.dailypractice.card.two.may.may22.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Solution_canIWin_17433667554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100038;
     Object term100041;
     Object term100043;

    public Solution_canIWin_17433667554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100038 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may22.Solution"));
        setIntField(term100038, term100038.getClass(), "n", 0);
        setIntField(term100038, term100038.getClass(), "t", 0);
        setField(term100038, term100038.getClass(), "f", null);
        term100041 = new Integer(0);
        term100043 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may22.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term100041;
        args[1] = term100043;
        callMethod(klass, "canIWin", argTypes, term100038, args);
    }

};


