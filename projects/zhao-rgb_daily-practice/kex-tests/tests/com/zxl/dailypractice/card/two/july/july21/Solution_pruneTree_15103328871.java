package com.zxl.dailypractice.card.two.july.july21;

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
import static com.zxl.dailypractice.card.two.july.july21.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_pruneTree_15103328871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term46;

    public Solution_pruneTree_15103328871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july21.Solution"));
        term46 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july21.TreeNode"));
        Object term48 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july21.TreeNode"));
        Object term50 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july21.TreeNode"));
        Object term52 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july21.TreeNode"));
        Object term54 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july21.TreeNode"));
        Object term56 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july21.TreeNode"));
        Object term58 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july21.TreeNode"));
        Object term60 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july21.TreeNode"));
        Object term62 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july21.TreeNode"));
        setIntField(term46, term46.getClass(), "val", -2068769794);
        setIntField(term48, term48.getClass(), "val", -117576464);
        setIntField(term50, term50.getClass(), "val", -1007160944);
        setIntField(term52, term52.getClass(), "val", 1135664017);
        setIntField(term54, term54.getClass(), "val", 590364439);
        setField(term54, term54.getClass(), "left", null);
        setField(term54, term54.getClass(), "right", term48);
        setField(term52, term52.getClass(), "left", term54);
        setIntField(term56, term56.getClass(), "val", -1179120542);
        setField(term56, term56.getClass(), "left", null);
        setField(term56, term56.getClass(), "right", null);
        setField(term52, term52.getClass(), "right", term56);
        setField(term50, term50.getClass(), "left", term52);
        setIntField(term58, term58.getClass(), "val", -244121226);
        setIntField(term60, term60.getClass(), "val", -203030934);
        setField(term60, term60.getClass(), "left", term56);
        setField(term60, term60.getClass(), "right", term46);
        setField(term58, term58.getClass(), "left", term60);
        setIntField(term62, term62.getClass(), "val", 865208305);
        setField(term62, term62.getClass(), "left", null);
        setField(term62, term62.getClass(), "right", term48);
        setField(term58, term58.getClass(), "right", term62);
        setField(term50, term50.getClass(), "right", term58);
        setField(term48, term48.getClass(), "left", term50);
        setField(term48, term48.getClass(), "right", term58);
        setField(term46, term46.getClass(), "left", term48);
        setField(term46, term46.getClass(), "right", term54);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.july.july21.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.july.july21.TreeNode");
        Object[] args = new Object[1];
        args[0] = term46;
        callMethod(klass, "pruneTree", argTypes, term45, args);
    }

};


