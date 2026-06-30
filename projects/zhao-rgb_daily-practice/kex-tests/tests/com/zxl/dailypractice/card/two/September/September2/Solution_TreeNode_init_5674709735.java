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
import java.lang.Integer;

public class Solution_TreeNode_init_5674709735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;

    public Solution_TreeNode_init_5674709735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode");
        argTypes[3] = Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term93;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


