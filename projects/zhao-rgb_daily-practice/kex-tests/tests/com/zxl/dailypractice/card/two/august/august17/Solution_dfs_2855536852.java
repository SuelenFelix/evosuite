package com.zxl.dailypractice.card.two.august.august17;

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
import static com.zxl.dailypractice.card.two.august.august17.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Solution_dfs_2855536852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;
     Object term25;
     Object term43;

    public Solution_dfs_2855536852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.Solution"));
        setIntField(term22, term22.getClass(), "maxLevel", -1);
        setIntField(term22, term22.getClass(), "sum", -522618178);
        term25 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term27 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term29 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term31 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term33 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term35 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term37 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term39 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term41 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        setIntField(term25, term25.getClass(), "val", 1134449235);
        setIntField(term27, term27.getClass(), "val", -883034806);
        setIntField(term29, term29.getClass(), "val", 1585847225);
        setIntField(term31, term31.getClass(), "val", 597278769);
        setIntField(term33, term33.getClass(), "val", -1685132342);
        setField(term33, term33.getClass(), "left", null);
        setField(term33, term33.getClass(), "right", term27);
        setField(term31, term31.getClass(), "left", term33);
        setIntField(term35, term35.getClass(), "val", -6029667);
        setField(term35, term35.getClass(), "left", null);
        setField(term35, term35.getClass(), "right", null);
        setField(term31, term31.getClass(), "right", term35);
        setField(term29, term29.getClass(), "left", term31);
        setIntField(term37, term37.getClass(), "val", 1048535127);
        setIntField(term39, term39.getClass(), "val", -655067527);
        setField(term39, term39.getClass(), "left", term35);
        setField(term39, term39.getClass(), "right", term25);
        setField(term37, term37.getClass(), "left", term39);
        setIntField(term41, term41.getClass(), "val", -1456670397);
        setField(term41, term41.getClass(), "left", null);
        setField(term41, term41.getClass(), "right", term27);
        setField(term37, term37.getClass(), "right", term41);
        setField(term29, term29.getClass(), "right", term37);
        setField(term27, term27.getClass(), "left", term29);
        setField(term27, term27.getClass(), "right", term37);
        setField(term25, term25.getClass(), "left", term27);
        setField(term25, term25.getClass(), "right", term33);
        term43 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august17.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term25;
        args[1] = term43;
        callMethod(klass, "dfs", argTypes, term22, args);
    }

};


