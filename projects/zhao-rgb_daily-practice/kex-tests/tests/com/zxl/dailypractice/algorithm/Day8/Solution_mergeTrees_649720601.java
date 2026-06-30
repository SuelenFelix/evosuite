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
import java.lang.Object;

public class Solution_mergeTrees_649720601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term114;
     Object term132;

    public Solution_mergeTrees_649720601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution"));
        term114 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term116 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term118 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term120 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term122 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term124 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term126 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term128 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term130 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        setIntField(term114, term114.getClass(), "val", -1048298087);
        setIntField(term116, term116.getClass(), "val", 292681826);
        setIntField(term118, term118.getClass(), "val", 458147407);
        setIntField(term120, term120.getClass(), "val", -184153539);
        setIntField(term122, term122.getClass(), "val", 493620644);
        setField(term122, term122.getClass(), "left", null);
        setField(term122, term122.getClass(), "right", term116);
        setField(term122, term122.getClass(), "this$0", null);
        setField(term120, term120.getClass(), "left", term122);
        setIntField(term124, term124.getClass(), "val", -2095575670);
        setField(term124, term124.getClass(), "left", null);
        setField(term124, term124.getClass(), "right", null);
        setField(term124, term124.getClass(), "this$0", null);
        setField(term120, term120.getClass(), "right", term124);
        setField(term120, term120.getClass(), "this$0", null);
        setField(term118, term118.getClass(), "left", term120);
        setIntField(term126, term126.getClass(), "val", 97029295);
        setIntField(term128, term128.getClass(), "val", -1371869594);
        setField(term128, term128.getClass(), "left", term124);
        setField(term128, term128.getClass(), "right", term114);
        setField(term128, term128.getClass(), "this$0", null);
        setField(term126, term126.getClass(), "left", term128);
        setIntField(term130, term130.getClass(), "val", 1328271830);
        setField(term130, term130.getClass(), "left", null);
        setField(term130, term130.getClass(), "right", term116);
        setField(term130, term130.getClass(), "this$0", null);
        setField(term126, term126.getClass(), "right", term130);
        setField(term126, term126.getClass(), "this$0", null);
        setField(term118, term118.getClass(), "right", term126);
        setField(term118, term118.getClass(), "this$0", null);
        setField(term116, term116.getClass(), "left", term118);
        setField(term116, term116.getClass(), "right", term126);
        setField(term116, term116.getClass(), "this$0", null);
        setField(term114, term114.getClass(), "left", term116);
        setField(term114, term114.getClass(), "right", term122);
        setField(term114, term114.getClass(), "this$0", null);
        term132 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term134 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term136 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term138 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term140 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term142 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term144 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term146 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        Object term148 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode"));
        setIntField(term132, term132.getClass(), "val", 1225272962);
        setIntField(term134, term134.getClass(), "val", 1324040357);
        setIntField(term136, term136.getClass(), "val", -1588772968);
        setIntField(term138, term138.getClass(), "val", -93135961);
        setIntField(term140, term140.getClass(), "val", -112921587);
        setField(term140, term140.getClass(), "left", null);
        setField(term140, term140.getClass(), "right", term134);
        setField(term140, term140.getClass(), "this$0", null);
        setField(term138, term138.getClass(), "left", term140);
        setIntField(term142, term142.getClass(), "val", 1265463001);
        setField(term142, term142.getClass(), "left", null);
        setField(term142, term142.getClass(), "right", null);
        setField(term142, term142.getClass(), "this$0", null);
        setField(term138, term138.getClass(), "right", term142);
        setField(term138, term138.getClass(), "this$0", null);
        setField(term136, term136.getClass(), "left", term138);
        setIntField(term144, term144.getClass(), "val", 962840079);
        setIntField(term146, term146.getClass(), "val", 1540719661);
        setField(term146, term146.getClass(), "left", term142);
        setField(term146, term146.getClass(), "right", term132);
        setField(term146, term146.getClass(), "this$0", null);
        setField(term144, term144.getClass(), "left", term146);
        setIntField(term148, term148.getClass(), "val", 933028652);
        setField(term148, term148.getClass(), "left", null);
        setField(term148, term148.getClass(), "right", term134);
        setField(term148, term148.getClass(), "this$0", null);
        setField(term144, term144.getClass(), "right", term148);
        setField(term144, term144.getClass(), "this$0", null);
        setField(term136, term136.getClass(), "right", term144);
        setField(term136, term136.getClass(), "this$0", null);
        setField(term134, term134.getClass(), "left", term136);
        setField(term134, term134.getClass(), "right", term144);
        setField(term134, term134.getClass(), "this$0", null);
        setField(term132, term132.getClass(), "left", term134);
        setField(term132, term132.getClass(), "right", term140);
        setField(term132, term132.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode");
        argTypes[1] = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$TreeNode");
        Object[] args = new Object[2];
        args[0] = term114;
        args[1] = term132;
        callMethod(klass, "mergeTrees", argTypes, term113, args);
    }

};


