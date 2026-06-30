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
import java.lang.Object;

public class Solution_dfs_17473223222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term23;

    public Solution_dfs_17473223222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution"));
        setIntField(term21, term21.getClass(), "res", -522618178);
        term23 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term25 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term27 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term29 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term31 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term33 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term35 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term37 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term39 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        setIntField(term23, term23.getClass(), "val", 1134449235);
        setIntField(term25, term25.getClass(), "val", -883034806);
        setIntField(term27, term27.getClass(), "val", 1585847225);
        setIntField(term29, term29.getClass(), "val", 597278769);
        setIntField(term31, term31.getClass(), "val", -1685132342);
        setField(term31, term31.getClass(), "left", null);
        setField(term31, term31.getClass(), "right", term25);
        setField(term31, term31.getClass(), "this$0", null);
        setField(term29, term29.getClass(), "left", term31);
        setIntField(term33, term33.getClass(), "val", -6029667);
        setField(term33, term33.getClass(), "left", null);
        setField(term33, term33.getClass(), "right", null);
        setField(term33, term33.getClass(), "this$0", null);
        setField(term29, term29.getClass(), "right", term33);
        setField(term29, term29.getClass(), "this$0", null);
        setField(term27, term27.getClass(), "left", term29);
        setIntField(term35, term35.getClass(), "val", 1048535127);
        setIntField(term37, term37.getClass(), "val", -655067527);
        setField(term37, term37.getClass(), "left", term33);
        setField(term37, term37.getClass(), "right", term23);
        setField(term37, term37.getClass(), "this$0", null);
        setField(term35, term35.getClass(), "left", term37);
        setIntField(term39, term39.getClass(), "val", -1456670397);
        setField(term39, term39.getClass(), "left", null);
        setField(term39, term39.getClass(), "right", term25);
        setField(term39, term39.getClass(), "this$0", null);
        setField(term35, term35.getClass(), "right", term39);
        setField(term35, term35.getClass(), "this$0", null);
        setField(term27, term27.getClass(), "right", term35);
        setField(term27, term27.getClass(), "this$0", null);
        setField(term25, term25.getClass(), "left", term27);
        setField(term25, term25.getClass(), "right", term35);
        setField(term25, term25.getClass(), "this$0", null);
        setField(term23, term23.getClass(), "left", term25);
        setField(term23, term23.getClass(), "right", term31);
        setField(term23, term23.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode");
        Object[] args = new Object[1];
        args[0] = term23;
        callMethod(klass, "dfs", argTypes, term21, args);
    }

};


