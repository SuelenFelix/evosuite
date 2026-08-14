package com.zxl.dailypractice.card.two.September.September2;

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
import static com.zxl.dailypractice.card.two.September.September2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Solution_TreeNode_init_15985043550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public Solution_TreeNode_init_15985043550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution"));
        setIntField(term45, term45.getClass(), "res", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution");
        Object[] args = new Object[1];
        args[0] = term45;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


