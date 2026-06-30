package com.zxl.dailypractice.card.two.may.may24;

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
import static com.zxl.dailypractice.card.two.may.may24.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class TreeNode_init_12295951072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;
     Object term23;

    public TreeNode_init_12295951072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(1162663216);
        term5 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term7 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term9 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term11 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term13 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term15 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term17 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term19 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term21 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        setIntField(term5, term5.getClass(), "val", 1484323161);
        setIntField(term7, term7.getClass(), "val", 391863371);
        setIntField(term9, term9.getClass(), "val", -1922583790);
        setIntField(term11, term11.getClass(), "val", -616727354);
        setIntField(term13, term13.getClass(), "val", -1955890973);
        setField(term13, term13.getClass(), "left", null);
        setField(term13, term13.getClass(), "right", term7);
        setField(term11, term11.getClass(), "left", term13);
        setIntField(term15, term15.getClass(), "val", -522618178);
        setField(term15, term15.getClass(), "left", null);
        setField(term15, term15.getClass(), "right", null);
        setField(term11, term11.getClass(), "right", term15);
        setField(term9, term9.getClass(), "left", term11);
        setIntField(term17, term17.getClass(), "val", -1339778481);
        setIntField(term19, term19.getClass(), "val", 1725571209);
        setField(term19, term19.getClass(), "left", term15);
        setField(term19, term19.getClass(), "right", term5);
        setField(term17, term17.getClass(), "left", term19);
        setIntField(term21, term21.getClass(), "val", -2038273078);
        setField(term21, term21.getClass(), "left", null);
        setField(term21, term21.getClass(), "right", term7);
        setField(term17, term17.getClass(), "right", term21);
        setField(term9, term9.getClass(), "right", term17);
        setField(term7, term7.getClass(), "left", term9);
        setField(term7, term7.getClass(), "right", term17);
        setField(term5, term5.getClass(), "left", term7);
        setField(term5, term5.getClass(), "right", term13);
        term23 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term25 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term27 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term29 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term31 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term33 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term35 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term37 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        Object term39 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode"));
        setIntField(term23, term23.getClass(), "val", 1134449235);
        setIntField(term25, term25.getClass(), "val", -883034806);
        setIntField(term27, term27.getClass(), "val", 1585847225);
        setIntField(term29, term29.getClass(), "val", 597278769);
        setIntField(term31, term31.getClass(), "val", -1685132342);
        setField(term31, term31.getClass(), "left", null);
        setField(term31, term31.getClass(), "right", term25);
        setField(term29, term29.getClass(), "left", term31);
        setIntField(term33, term33.getClass(), "val", -6029667);
        setField(term33, term33.getClass(), "left", null);
        setField(term33, term33.getClass(), "right", null);
        setField(term29, term29.getClass(), "right", term33);
        setField(term27, term27.getClass(), "left", term29);
        setIntField(term35, term35.getClass(), "val", 1048535127);
        setIntField(term37, term37.getClass(), "val", -655067527);
        setField(term37, term37.getClass(), "left", term33);
        setField(term37, term37.getClass(), "right", term23);
        setField(term35, term35.getClass(), "left", term37);
        setIntField(term39, term39.getClass(), "val", -1456670397);
        setField(term39, term39.getClass(), "left", null);
        setField(term39, term39.getClass(), "right", term25);
        setField(term35, term35.getClass(), "right", term39);
        setField(term27, term27.getClass(), "right", term35);
        setField(term25, term25.getClass(), "left", term27);
        setField(term25, term25.getClass(), "right", term35);
        setField(term23, term23.getClass(), "left", term25);
        setField(term23, term23.getClass(), "right", term31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode");
        argTypes[2] = Class.forName("com.zxl.dailypractice.card.two.may.may24.TreeNode");
        Object[] args = new Object[3];
        args[0] = term3;
        args[1] = term5;
        args[2] = term23;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


