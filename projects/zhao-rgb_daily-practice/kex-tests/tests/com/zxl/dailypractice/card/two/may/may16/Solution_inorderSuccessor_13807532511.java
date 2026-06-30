package com.zxl.dailypractice.card.two.may.may16;

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
import static com.zxl.dailypractice.card.two.may.may16.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_inorderSuccessor_13807532511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term20;

    public Solution_inorderSuccessor_13807532511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.Solution"));
        term2 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term4 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term6 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term8 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term10 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term12 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term14 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term16 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term18 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        setIntField(term2, term2.getClass(), "val", 568599855);
        setIntField(term4, term4.getClass(), "val", 1162663216);
        setIntField(term6, term6.getClass(), "val", 1484323161);
        setIntField(term8, term8.getClass(), "val", 391863371);
        setIntField(term10, term10.getClass(), "val", -1922583790);
        setField(term10, term10.getClass(), "left", null);
        setField(term10, term10.getClass(), "right", term4);
        setField(term8, term8.getClass(), "left", term10);
        setIntField(term12, term12.getClass(), "val", -1339778481);
        setField(term12, term12.getClass(), "left", null);
        setField(term12, term12.getClass(), "right", null);
        setField(term8, term8.getClass(), "right", term12);
        setField(term6, term6.getClass(), "left", term8);
        setIntField(term14, term14.getClass(), "val", -2038273078);
        setIntField(term16, term16.getClass(), "val", 1227103734);
        setField(term16, term16.getClass(), "left", term12);
        setField(term16, term16.getClass(), "right", term2);
        setField(term14, term14.getClass(), "left", term16);
        setIntField(term18, term18.getClass(), "val", -616727354);
        setField(term18, term18.getClass(), "left", null);
        setField(term18, term18.getClass(), "right", term4);
        setField(term14, term14.getClass(), "right", term18);
        setField(term6, term6.getClass(), "right", term14);
        setField(term4, term4.getClass(), "left", term6);
        setField(term4, term4.getClass(), "right", term14);
        setField(term2, term2.getClass(), "left", term4);
        setField(term2, term2.getClass(), "right", term10);
        term20 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term22 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term24 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term26 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term28 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term30 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term32 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term34 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        Object term36 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode"));
        setIntField(term20, term20.getClass(), "val", 1725571209);
        setIntField(term22, term22.getClass(), "val", -522618178);
        setIntField(term24, term24.getClass(), "val", 1134449235);
        setIntField(term26, term26.getClass(), "val", -883034806);
        setIntField(term28, term28.getClass(), "val", 1585847225);
        setField(term28, term28.getClass(), "left", null);
        setField(term28, term28.getClass(), "right", term22);
        setField(term26, term26.getClass(), "left", term28);
        setIntField(term30, term30.getClass(), "val", 1048535127);
        setField(term30, term30.getClass(), "left", null);
        setField(term30, term30.getClass(), "right", null);
        setField(term26, term26.getClass(), "right", term30);
        setField(term24, term24.getClass(), "left", term26);
        setIntField(term32, term32.getClass(), "val", -1456670397);
        setIntField(term34, term34.getClass(), "val", 1622346318);
        setField(term34, term34.getClass(), "left", term30);
        setField(term34, term34.getClass(), "right", term20);
        setField(term32, term32.getClass(), "left", term34);
        setIntField(term36, term36.getClass(), "val", 597278769);
        setField(term36, term36.getClass(), "left", null);
        setField(term36, term36.getClass(), "right", term22);
        setField(term32, term32.getClass(), "right", term36);
        setField(term24, term24.getClass(), "right", term32);
        setField(term22, term22.getClass(), "left", term24);
        setField(term22, term22.getClass(), "right", term32);
        setField(term20, term20.getClass(), "left", term22);
        setField(term20, term20.getClass(), "right", term28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may16.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode");
        argTypes[1] = Class.forName("com.zxl.dailypractice.card.two.may.may16.TreeNode");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term20;
        callMethod(klass, "inorderSuccessor", argTypes, term1, args);
    }

};


