package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class TreeIsomorphism_getTree1_3625590954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2920;

    public TreeIsomorphism_getTree1_3625590954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2933 = new HashMap();
        Boolean term2939 = new Boolean(true);
        Boolean term2958 = new Boolean(true);
        term2920 = newInstance(Class.forName("org.graph4j.isomorphism.TreeIsomorphism"));
        Object term2921 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term2924 = (int[]) newIntArray(4);
        int[] term2929 = (int[]) newIntArray(3);
        Object term2941 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term2942 = (int[]) newIntArray(5);
        int[] term2948 = (int[]) newIntArray(9);
        Object term2960 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term2920, term2920.getClass(), "tree1", null);
        setField(term2920, term2920.getClass(), "tree2", null);
        setField(term2921, term2921.getClass(), "tree1", null);
        setField(term2921, term2921.getClass(), "tree2", null);
        setIntField(term2921, term2921.getClass(), "root1", 1238598518);
        setIntField(term2921, term2921.getClass(), "root2", -558146961);
        setIntElement(term2924, 0, 1505480070);
        setIntElement(term2924, 1, -829088844);
        setIntElement(term2924, 2, -31751777);
        setIntElement(term2924, 3, -246967963);
        setField(term2921, term2921.getClass(), "labels1", term2924);
        setIntElement(term2929, 0, -1777140369);
        setIntElement(term2929, 1, 993627098);
        setIntElement(term2929, 2, 872295704);
        setField(term2921, term2921.getClass(), "labels2", term2929);
        setField(term2921, term2921.getClass(), "labelListToInt", term2933);
        setIntField(term2921, term2921.getClass(), "maxLabel", 86041387);
        setField(term2921, term2921.getClass(), "isomorphic", term2939);
        setField(term2941, term2941.getClass(), "graph1", null);
        setField(term2941, term2941.getClass(), "graph2", null);
        setIntElement(term2942, 0, 1010721666);
        setIntElement(term2942, 1, 27043781);
        setIntElement(term2942, 2, -1367122405);
        setIntElement(term2942, 3, -1703625118);
        setIntElement(term2942, 4, 1104108112);
        setField(term2941, term2941.getClass(), "mapping", term2942);
        setIntElement(term2948, 0, 1648665618);
        setIntElement(term2948, 1, 633765954);
        setIntElement(term2948, 2, 269110087);
        setIntElement(term2948, 3, 1545119095);
        setIntElement(term2948, 4, 1671229683);
        setIntElement(term2948, 5, 34167717);
        setIntElement(term2948, 6, -514195141);
        setIntElement(term2948, 7, -297946422);
        setIntElement(term2948, 8, 385463636);
        setField(term2941, term2941.getClass(), "inverse", term2948);
        setField(term2921, term2921.getClass(), "isomorphism", term2941);
        setField(term2921, term2921.getClass(), "sortingAlgorithm", null);
        setField(term2920, term2920.getClass(), "rootedAlg", term2921);
        setField(term2920, term2920.getClass(), "isomorphic", term2958);
        setField(term2960, term2960.getClass(), "graph1", null);
        setField(term2960, term2960.getClass(), "graph2", null);
        setField(term2960, term2960.getClass(), "mapping", null);
        setField(term2960, term2960.getClass(), "inverse", null);
        setField(term2920, term2920.getClass(), "isomorphism", term2960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.TreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTree1", argTypes, term2920, args);
    }

};


