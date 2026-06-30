package com.zxl.dailypractice.card.two.may.may1;

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
import static com.zxl.dailypractice.card.two.may.may1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Solution_getAllElements_2415787154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;

    public Solution_getAllElements_2415787154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.Solution"));
        setField(term83, term83.getClass(), "ans", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may1.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode");
        argTypes[1] = Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getAllElements", argTypes, term83, args);
    }

};


