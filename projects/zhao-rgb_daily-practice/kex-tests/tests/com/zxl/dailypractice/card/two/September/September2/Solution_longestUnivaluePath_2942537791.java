package com.zxl.dailypractice.card.two.September.September2;

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
import static com.zxl.dailypractice.card.two.September.September2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_longestUnivaluePath_2942537791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;

    public Solution_longestUnivaluePath_2942537791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution"));
        setIntField(term1, term1.getClass(), "res", 568599855);
        term3 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term5 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term7 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term9 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term11 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term13 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term15 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term17 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        Object term19 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode"));
        setIntField(term3, term3.getClass(), "val", 1162663216);
        setIntField(term5, term5.getClass(), "val", 1484323161);
        setIntField(term7, term7.getClass(), "val", 391863371);
        setIntField(term9, term9.getClass(), "val", -1922583790);
        setIntField(term11, term11.getClass(), "val", -616727354);
        setField(term11, term11.getClass(), "left", null);
        setField(term11, term11.getClass(), "right", term5);
        setField(term11, term11.getClass(), "this$0", null);
        setField(term9, term9.getClass(), "left", term11);
        setIntField(term13, term13.getClass(), "val", 1725571209);
        setField(term13, term13.getClass(), "left", null);
        setField(term13, term13.getClass(), "right", null);
        setField(term13, term13.getClass(), "this$0", null);
        setField(term9, term9.getClass(), "right", term13);
        setField(term9, term9.getClass(), "this$0", null);
        setField(term7, term7.getClass(), "left", term9);
        setIntField(term15, term15.getClass(), "val", 1227103734);
        setIntField(term17, term17.getClass(), "val", -1339778481);
        setField(term17, term17.getClass(), "left", term13);
        setField(term17, term17.getClass(), "right", term3);
        setField(term17, term17.getClass(), "this$0", null);
        setField(term15, term15.getClass(), "left", term17);
        setIntField(term19, term19.getClass(), "val", -1955890973);
        setField(term19, term19.getClass(), "left", null);
        setField(term19, term19.getClass(), "right", term5);
        setField(term19, term19.getClass(), "this$0", null);
        setField(term15, term15.getClass(), "right", term19);
        setField(term15, term15.getClass(), "this$0", null);
        setField(term7, term7.getClass(), "right", term15);
        setField(term7, term7.getClass(), "this$0", null);
        setField(term5, term5.getClass(), "left", term7);
        setField(term5, term5.getClass(), "right", term15);
        setField(term5, term5.getClass(), "this$0", null);
        setField(term3, term3.getClass(), "left", term5);
        setField(term3, term3.getClass(), "right", term11);
        setField(term3, term3.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.September.September2.Solution$TreeNode");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "longestUnivaluePath", argTypes, term1, args);
    }

};


