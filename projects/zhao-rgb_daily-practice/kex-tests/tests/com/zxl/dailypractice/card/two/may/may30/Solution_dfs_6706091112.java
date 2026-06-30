package com.zxl.dailypractice.card.two.may.may30;

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
import static com.zxl.dailypractice.card.two.may.may30.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Solution_dfs_6706091112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;
     Object term65;
     Object term83;

    public Solution_dfs_6706091112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may30.Solution"));
        term65 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may30.TreeNode"));
        Object term67 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may30.TreeNode"));
        Object term69 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may30.TreeNode"));
        Object term71 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may30.TreeNode"));
        Object term73 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may30.TreeNode"));
        Object term75 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may30.TreeNode"));
        Object term77 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may30.TreeNode"));
        Object term79 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may30.TreeNode"));
        Object term81 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may30.TreeNode"));
        setIntField(term65, term65.getClass(), "val", -73683645);
        setIntField(term67, term67.getClass(), "val", -226514366);
        setIntField(term69, term69.getClass(), "val", 1193880199);
        setIntField(term71, term71.getClass(), "val", -1087774327);
        setIntField(term73, term73.getClass(), "val", -1530420153);
        setField(term73, term73.getClass(), "left", null);
        setField(term73, term73.getClass(), "right", term67);
        setField(term71, term71.getClass(), "left", term73);
        setIntField(term75, term75.getClass(), "val", 767834723);
        setField(term75, term75.getClass(), "left", null);
        setField(term75, term75.getClass(), "right", null);
        setField(term71, term71.getClass(), "right", term75);
        setField(term69, term69.getClass(), "left", term71);
        setIntField(term77, term77.getClass(), "val", 679763016);
        setIntField(term79, term79.getClass(), "val", 1962444399);
        setField(term79, term79.getClass(), "left", term75);
        setField(term79, term79.getClass(), "right", term65);
        setField(term77, term77.getClass(), "left", term79);
        setIntField(term81, term81.getClass(), "val", -469968304);
        setField(term81, term81.getClass(), "left", null);
        setField(term81, term81.getClass(), "right", term67);
        setField(term77, term77.getClass(), "right", term81);
        setField(term69, term69.getClass(), "right", term77);
        setField(term67, term67.getClass(), "left", term69);
        setField(term67, term67.getClass(), "right", term77);
        setField(term65, term65.getClass(), "left", term67);
        setField(term65, term65.getClass(), "right", term73);
        term83 = new Integer(-602026508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may30.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.may.may30.TreeNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term65;
        args[1] = term83;
        callMethod(klass, "dfs", argTypes, term64, args);
    }

};


