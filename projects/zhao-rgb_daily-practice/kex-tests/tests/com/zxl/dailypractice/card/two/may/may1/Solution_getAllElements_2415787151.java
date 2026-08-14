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
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Object;

public class Solution_getAllElements_2415787151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term16;
     Object term34;

    public Solution_getAllElements_2415787151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4 = new Integer(568599855);
        Integer term6 = new Integer(1162663216);
        Integer term8 = new Integer(1484323161);
        Integer term10 = new Integer(391863371);
        Integer term12 = new Integer(-1922583790);
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add(term4);
        ((ArrayList) term2).add(term6);
        ((ArrayList) term2).add(term8);
        ((ArrayList) term2).add(term10);
        ((ArrayList) term2).add(term12);
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.Solution"));
        setField(term1, term1.getClass(), "ans", term2);
        term16 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term18 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term20 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term22 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term24 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term26 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term28 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term30 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term32 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        setIntField(term16, term16.getClass(), "val", 568599855);
        setIntField(term18, term18.getClass(), "val", 1162663216);
        setIntField(term20, term20.getClass(), "val", 1484323161);
        setIntField(term22, term22.getClass(), "val", 391863371);
        setIntField(term24, term24.getClass(), "val", -1922583790);
        setField(term24, term24.getClass(), "left", null);
        setField(term24, term24.getClass(), "right", term18);
        setField(term22, term22.getClass(), "left", term24);
        setIntField(term26, term26.getClass(), "val", -1339778481);
        setField(term26, term26.getClass(), "left", null);
        setField(term26, term26.getClass(), "right", null);
        setField(term22, term22.getClass(), "right", term26);
        setField(term20, term20.getClass(), "left", term22);
        setIntField(term28, term28.getClass(), "val", -2038273078);
        setIntField(term30, term30.getClass(), "val", 1227103734);
        setField(term30, term30.getClass(), "left", term26);
        setField(term30, term30.getClass(), "right", term16);
        setField(term28, term28.getClass(), "left", term30);
        setIntField(term32, term32.getClass(), "val", -616727354);
        setField(term32, term32.getClass(), "left", null);
        setField(term32, term32.getClass(), "right", term18);
        setField(term28, term28.getClass(), "right", term32);
        setField(term20, term20.getClass(), "right", term28);
        setField(term18, term18.getClass(), "left", term20);
        setField(term18, term18.getClass(), "right", term28);
        setField(term16, term16.getClass(), "left", term18);
        setField(term16, term16.getClass(), "right", term24);
        term34 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term36 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term38 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term40 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term42 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term44 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term46 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term48 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term50 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        setIntField(term34, term34.getClass(), "val", 1725571209);
        setIntField(term36, term36.getClass(), "val", -522618178);
        setIntField(term38, term38.getClass(), "val", 1134449235);
        setIntField(term40, term40.getClass(), "val", -883034806);
        setIntField(term42, term42.getClass(), "val", 1585847225);
        setField(term42, term42.getClass(), "left", null);
        setField(term42, term42.getClass(), "right", term36);
        setField(term40, term40.getClass(), "left", term42);
        setIntField(term44, term44.getClass(), "val", 1048535127);
        setField(term44, term44.getClass(), "left", null);
        setField(term44, term44.getClass(), "right", null);
        setField(term40, term40.getClass(), "right", term44);
        setField(term38, term38.getClass(), "left", term40);
        setIntField(term46, term46.getClass(), "val", -1456670397);
        setIntField(term48, term48.getClass(), "val", 1622346318);
        setField(term48, term48.getClass(), "left", term44);
        setField(term48, term48.getClass(), "right", term34);
        setField(term46, term46.getClass(), "left", term48);
        setIntField(term50, term50.getClass(), "val", 597278769);
        setField(term50, term50.getClass(), "left", null);
        setField(term50, term50.getClass(), "right", term36);
        setField(term46, term46.getClass(), "right", term50);
        setField(term38, term38.getClass(), "right", term46);
        setField(term36, term36.getClass(), "left", term38);
        setField(term36, term36.getClass(), "right", term46);
        setField(term34, term34.getClass(), "left", term36);
        setField(term34, term34.getClass(), "right", term42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may1.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode");
        argTypes[1] = Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode");
        Object[] args = new Object[2];
        args[0] = term16;
        args[1] = term34;
        callMethod(klass, "getAllElements", argTypes, term1, args);
    }

};


