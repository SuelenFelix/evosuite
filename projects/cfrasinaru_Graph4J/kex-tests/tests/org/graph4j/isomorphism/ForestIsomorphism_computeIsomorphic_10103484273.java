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

public class ForestIsomorphism_computeIsomorphic_10103484273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3133;

    public ForestIsomorphism_computeIsomorphic_10103484273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3149 = new HashMap();
        Boolean term3155 = new Boolean(false);
        Boolean term3163 = new Boolean(false);
        term3133 = newInstance(Class.forName("org.graph4j.isomorphism.ForestIsomorphism"));
        Object term3134 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3137 = (int[]) newIntArray(6);
        int[] term3144 = (int[]) newIntArray(4);
        Object term3157 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term3158 = (int[]) newIntArray(0);
        int[] term3159 = (int[]) newIntArray(3);
        Object term3165 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3133, term3133.getClass(), "forest1", null);
        setField(term3133, term3133.getClass(), "forest2", null);
        setField(term3134, term3134.getClass(), "tree1", null);
        setField(term3134, term3134.getClass(), "tree2", null);
        setIntField(term3134, term3134.getClass(), "root1", -1631048635);
        setIntField(term3134, term3134.getClass(), "root2", 1342808731);
        setIntElement(term3137, 0, -64893740);
        setIntElement(term3137, 1, -222012928);
        setIntElement(term3137, 2, -146564963);
        setIntElement(term3137, 3, -83178716);
        setIntElement(term3137, 4, -1292704466);
        setIntElement(term3137, 5, 1991858584);
        setField(term3134, term3134.getClass(), "labels1", term3137);
        setIntElement(term3144, 0, -1300947782);
        setIntElement(term3144, 1, 188512644);
        setIntElement(term3144, 2, 1851127634);
        setIntElement(term3144, 3, 783730213);
        setField(term3134, term3134.getClass(), "labels2", term3144);
        setField(term3134, term3134.getClass(), "labelListToInt", term3149);
        setIntField(term3134, term3134.getClass(), "maxLabel", 1815951606);
        setField(term3134, term3134.getClass(), "isomorphic", term3155);
        setField(term3157, term3157.getClass(), "graph1", null);
        setField(term3157, term3157.getClass(), "graph2", null);
        setField(term3157, term3157.getClass(), "mapping", term3158);
        setIntElement(term3159, 0, 1105016932);
        setIntElement(term3159, 1, -365784998);
        setIntElement(term3159, 2, -1893236300);
        setField(term3157, term3157.getClass(), "inverse", term3159);
        setField(term3134, term3134.getClass(), "isomorphism", term3157);
        setField(term3134, term3134.getClass(), "sortingAlgorithm", null);
        setField(term3133, term3133.getClass(), "rootedTreeAlg", term3134);
        setField(term3133, term3133.getClass(), "isomorphic", term3163);
        setField(term3165, term3165.getClass(), "graph1", null);
        setField(term3165, term3165.getClass(), "graph2", null);
        setField(term3165, term3165.getClass(), "mapping", null);
        setField(term3165, term3165.getClass(), "inverse", null);
        setField(term3133, term3133.getClass(), "isomorphism", term3165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.ForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeIsomorphic", argTypes, term3133, args);
    }

};


