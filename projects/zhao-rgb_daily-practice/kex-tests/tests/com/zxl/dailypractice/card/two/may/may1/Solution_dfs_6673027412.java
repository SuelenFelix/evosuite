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

public class Solution_dfs_6673027412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;
     Object term65;

    public Solution_dfs_6673027412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term55 = new Integer(-616727354);
        Integer term57 = new Integer(-1955890973);
        Integer term59 = new Integer(-2038273078);
        Integer term61 = new Integer(1227103734);
        ArrayList term53 = new ArrayList();
        ((ArrayList) term53).add(term55);
        ((ArrayList) term53).add(term57);
        ((ArrayList) term53).add(term59);
        ((ArrayList) term53).add(term61);
        term52 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.Solution"));
        setField(term52, term52.getClass(), "ans", term53);
        term65 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term67 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term69 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term71 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term73 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term75 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term77 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term79 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        Object term81 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode"));
        setIntField(term65, term65.getClass(), "val", -655067527);
        setIntField(term67, term67.getClass(), "val", -6029667);
        setIntField(term69, term69.getClass(), "val", -2068769794);
        setIntField(term71, term71.getClass(), "val", -117576464);
        setIntField(term73, term73.getClass(), "val", -1007160944);
        setField(term73, term73.getClass(), "left", null);
        setField(term73, term73.getClass(), "right", term67);
        setField(term71, term71.getClass(), "left", term73);
        setIntField(term75, term75.getClass(), "val", -244121226);
        setField(term75, term75.getClass(), "left", null);
        setField(term75, term75.getClass(), "right", null);
        setField(term71, term71.getClass(), "right", term75);
        setField(term69, term69.getClass(), "left", term71);
        setIntField(term77, term77.getClass(), "val", 865208305);
        setIntField(term79, term79.getClass(), "val", -1275173084);
        setField(term79, term79.getClass(), "left", term75);
        setField(term79, term79.getClass(), "right", term65);
        setField(term77, term77.getClass(), "left", term79);
        setIntField(term81, term81.getClass(), "val", 1135664017);
        setField(term81, term81.getClass(), "left", null);
        setField(term81, term81.getClass(), "right", term67);
        setField(term77, term77.getClass(), "right", term81);
        setField(term69, term69.getClass(), "right", term77);
        setField(term67, term67.getClass(), "left", term69);
        setField(term67, term67.getClass(), "right", term77);
        setField(term65, term65.getClass(), "left", term67);
        setField(term65, term65.getClass(), "right", term73);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may1.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.may.may1.TreeNode");
        Object[] args = new Object[1];
        args[0] = term65;
        callMethod(klass, "dfs", argTypes, term52, args);
    }

};


