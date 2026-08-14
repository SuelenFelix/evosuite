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

public class TreeIsomorphism_getTree2_3625600565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2982;

    public TreeIsomorphism_getTree2_3625600565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2996 = new HashMap();
        Boolean term3002 = new Boolean(false);
        Boolean term3008 = new Boolean(true);
        term2982 = newInstance(Class.forName("org.graph4j.isomorphism.TreeIsomorphism"));
        Object term2983 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term2986 = (int[]) newIntArray(3);
        int[] term2990 = (int[]) newIntArray(5);
        Object term3004 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term3005 = (int[]) newIntArray(0);
        int[] term3006 = (int[]) newIntArray(1);
        Object term3010 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term2982, term2982.getClass(), "tree1", null);
        setField(term2982, term2982.getClass(), "tree2", null);
        setField(term2983, term2983.getClass(), "tree1", null);
        setField(term2983, term2983.getClass(), "tree2", null);
        setIntField(term2983, term2983.getClass(), "root1", -1677599962);
        setIntField(term2983, term2983.getClass(), "root2", -1790275458);
        setIntElement(term2986, 0, -497534255);
        setIntElement(term2986, 1, 1588942911);
        setIntElement(term2986, 2, -2129828854);
        setField(term2983, term2983.getClass(), "labels1", term2986);
        setIntElement(term2990, 0, -47438786);
        setIntElement(term2990, 1, -1955400589);
        setIntElement(term2990, 2, 626179200);
        setIntElement(term2990, 3, -511077684);
        setIntElement(term2990, 4, -711507760);
        setField(term2983, term2983.getClass(), "labels2", term2990);
        setField(term2983, term2983.getClass(), "labelListToInt", term2996);
        setIntField(term2983, term2983.getClass(), "maxLabel", 1053773809);
        setField(term2983, term2983.getClass(), "isomorphic", term3002);
        setField(term3004, term3004.getClass(), "graph1", null);
        setField(term3004, term3004.getClass(), "graph2", null);
        setField(term3004, term3004.getClass(), "mapping", term3005);
        setIntElement(term3006, 0, 924127883);
        setField(term3004, term3004.getClass(), "inverse", term3006);
        setField(term2983, term2983.getClass(), "isomorphism", term3004);
        setField(term2983, term2983.getClass(), "sortingAlgorithm", null);
        setField(term2982, term2982.getClass(), "rootedAlg", term2983);
        setField(term2982, term2982.getClass(), "isomorphic", term3008);
        setField(term3010, term3010.getClass(), "graph1", null);
        setField(term3010, term3010.getClass(), "graph2", null);
        setField(term3010, term3010.getClass(), "mapping", null);
        setField(term3010, term3010.getClass(), "inverse", null);
        setField(term2982, term2982.getClass(), "isomorphism", term3010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.TreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTree2", argTypes, term2982, args);
    }

};


