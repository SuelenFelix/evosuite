package com.zxl.dailypractice.algorithm.Day8;

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
import static com.zxl.dailypractice.algorithm.Day8.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Solution_mergeTrees_649720605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280;

    public Solution_mergeTrees_649720605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode");
        argTypes[1] = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "mergeTrees", argTypes, term280, args);
    }

};


