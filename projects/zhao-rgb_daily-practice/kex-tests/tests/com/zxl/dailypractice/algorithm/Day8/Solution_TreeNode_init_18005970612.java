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
import java.lang.Integer;
import java.lang.Object;

public class Solution_TreeNode_init_18005970612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term6;
     Object term8;
     Object term26;

    public Solution_TreeNode_init_18005970612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution"));
        term6 = new Integer(1162663216);
        term8 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term10 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term12 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term14 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term16 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term18 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term20 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term22 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term24 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        setIntField(term8, term8.getClass(), "val", 1484323161);
        setIntField(term10, term10.getClass(), "val", 391863371);
        setIntField(term12, term12.getClass(), "val", -1922583790);
        setIntField(term14, term14.getClass(), "val", -616727354);
        setIntField(term16, term16.getClass(), "val", -1955890973);
        setField(term16, term16.getClass(), "left", null);
        setField(term16, term16.getClass(), "right", term10);
        setField(term16, term16.getClass(), "this$0", null);
        setField(term14, term14.getClass(), "left", term16);
        setIntField(term18, term18.getClass(), "val", -522618178);
        setField(term18, term18.getClass(), "left", null);
        setField(term18, term18.getClass(), "right", null);
        setField(term18, term18.getClass(), "this$0", null);
        setField(term14, term14.getClass(), "right", term18);
        setField(term14, term14.getClass(), "this$0", null);
        setField(term12, term12.getClass(), "left", term14);
        setIntField(term20, term20.getClass(), "val", -1339778481);
        setIntField(term22, term22.getClass(), "val", 1725571209);
        setField(term22, term22.getClass(), "left", term18);
        setField(term22, term22.getClass(), "right", term8);
        setField(term22, term22.getClass(), "this$0", null);
        setField(term20, term20.getClass(), "left", term22);
        setIntField(term24, term24.getClass(), "val", -2038273078);
        setField(term24, term24.getClass(), "left", null);
        setField(term24, term24.getClass(), "right", term10);
        setField(term24, term24.getClass(), "this$0", null);
        setField(term20, term20.getClass(), "right", term24);
        setField(term20, term20.getClass(), "this$0", null);
        setField(term12, term12.getClass(), "right", term20);
        setField(term12, term12.getClass(), "this$0", null);
        setField(term10, term10.getClass(), "left", term12);
        setField(term10, term10.getClass(), "right", term20);
        setField(term10, term10.getClass(), "this$0", null);
        setField(term8, term8.getClass(), "left", term10);
        setField(term8, term8.getClass(), "right", term16);
        setField(term8, term8.getClass(), "this$0", null);
        term26 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term28 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term30 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term32 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term34 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term36 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term38 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term40 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term42 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        setIntField(term26, term26.getClass(), "val", 1134449235);
        setIntField(term28, term28.getClass(), "val", -883034806);
        setIntField(term30, term30.getClass(), "val", 1585847225);
        setIntField(term32, term32.getClass(), "val", 597278769);
        setIntField(term34, term34.getClass(), "val", -1685132342);
        setField(term34, term34.getClass(), "left", null);
        setField(term34, term34.getClass(), "right", term28);
        setField(term34, term34.getClass(), "this$0", null);
        setField(term32, term32.getClass(), "left", term34);
        setIntField(term36, term36.getClass(), "val", -6029667);
        setField(term36, term36.getClass(), "left", null);
        setField(term36, term36.getClass(), "right", null);
        setField(term36, term36.getClass(), "this$0", null);
        setField(term32, term32.getClass(), "right", term36);
        setField(term32, term32.getClass(), "this$0", null);
        setField(term30, term30.getClass(), "left", term32);
        setIntField(term38, term38.getClass(), "val", 1048535127);
        setIntField(term40, term40.getClass(), "val", -655067527);
        setField(term40, term40.getClass(), "left", term36);
        setField(term40, term40.getClass(), "right", term26);
        setField(term40, term40.getClass(), "this$0", null);
        setField(term38, term38.getClass(), "left", term40);
        setIntField(term42, term42.getClass(), "val", -1456670397);
        setField(term42, term42.getClass(), "left", null);
        setField(term42, term42.getClass(), "right", term28);
        setField(term42, term42.getClass(), "this$0", null);
        setField(term38, term38.getClass(), "right", term42);
        setField(term38, term38.getClass(), "this$0", null);
        setField(term30, term30.getClass(), "right", term38);
        setField(term30, term30.getClass(), "this$0", null);
        setField(term28, term28.getClass(), "left", term30);
        setField(term28, term28.getClass(), "right", term38);
        setField(term28, term28.getClass(), "this$0", null);
        setField(term26, term26.getClass(), "left", term28);
        setField(term26, term26.getClass(), "right", term34);
        setField(term26, term26.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode");
        argTypes[3] = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode");
        Object[] args = new Object[4];
        args[0] = term5;
        args[1] = term6;
        args[2] = term8;
        args[3] = term26;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


