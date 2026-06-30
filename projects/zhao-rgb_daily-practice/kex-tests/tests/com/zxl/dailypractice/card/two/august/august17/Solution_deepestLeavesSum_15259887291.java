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

public class Solution_deepestLeavesSum_15259887291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term4;

    public Solution_deepestLeavesSum_15259887291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.Solution"));
        setIntField(term1, term1.getClass(), "maxLevel", -1);
        setIntField(term1, term1.getClass(), "sum", 568599855);
        term4 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term6 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term8 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term10 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term12 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term14 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term16 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term18 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        Object term20 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode"));
        setIntField(term4, term4.getClass(), "val", 1162663216);
        setIntField(term6, term6.getClass(), "val", 1484323161);
        setIntField(term8, term8.getClass(), "val", 391863371);
        setIntField(term10, term10.getClass(), "val", -1922583790);
        setIntField(term12, term12.getClass(), "val", -616727354);
        setField(term12, term12.getClass(), "left", null);
        setField(term12, term12.getClass(), "right", term6);
        setField(term10, term10.getClass(), "left", term12);
        setIntField(term14, term14.getClass(), "val", 1725571209);
        setField(term14, term14.getClass(), "left", null);
        setField(term14, term14.getClass(), "right", null);
        setField(term10, term10.getClass(), "right", term14);
        setField(term8, term8.getClass(), "left", term10);
        setIntField(term16, term16.getClass(), "val", 1227103734);
        setIntField(term18, term18.getClass(), "val", -1339778481);
        setField(term18, term18.getClass(), "left", term14);
        setField(term18, term18.getClass(), "right", term4);
        setField(term16, term16.getClass(), "left", term18);
        setIntField(term20, term20.getClass(), "val", -1955890973);
        setField(term20, term20.getClass(), "left", null);
        setField(term20, term20.getClass(), "right", term6);
        setField(term16, term16.getClass(), "right", term20);
        setField(term8, term8.getClass(), "right", term16);
        setField(term6, term6.getClass(), "left", term8);
        setField(term6, term6.getClass(), "right", term16);
        setField(term4, term4.getClass(), "left", term6);
        setField(term4, term4.getClass(), "right", term12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august17.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.august.august17.TreeNode");
        Object[] args = new Object[1];
        args[0] = term4;
        callMethod(klass, "deepestLeavesSum", argTypes, term1, args);
    }

};


