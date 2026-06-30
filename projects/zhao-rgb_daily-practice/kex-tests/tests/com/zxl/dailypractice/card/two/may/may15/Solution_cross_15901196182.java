package com.zxl.dailypractice.card.two.may.may15;

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
import static com.zxl.dailypractice.card.two.may.may15.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Solution_cross_15901196182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term45;
     Object term47;
     Object term49;
     Object term51;

    public Solution_cross_15901196182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may15.Solution"));
        term45 = new Integer(1622346318);
        term47 = new Integer(1048535127);
        term49 = new Integer(-655067527);
        term51 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may15.Solution");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term45;
        args[1] = term47;
        args[2] = term49;
        args[3] = term51;
        callMethod(klass, "cross", argTypes, term44, args);
    }

};


