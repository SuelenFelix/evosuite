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
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Object;

public class RootedTreeIsomorphism_computeIsomorphic_16356062494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11962;

    public RootedTreeIsomorphism_computeIsomorphic_16356062494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11976 = new HashMap();
        Boolean term11982 = new Boolean(true);
        term11962 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term11965 = (int[]) newIntArray(1);
        int[] term11967 = (int[]) newIntArray(8);
        Object term11984 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term11985 = (int[]) newIntArray(6);
        int[] term11992 = (int[]) newIntArray(7);
        setField(term11962, term11962.getClass(), "tree1", null);
        setField(term11962, term11962.getClass(), "tree2", null);
        setIntField(term11962, term11962.getClass(), "root1", -608484309);
        setIntField(term11962, term11962.getClass(), "root2", -396456847);
        setIntElement(term11965, 0, 1826615515);
        setField(term11962, term11962.getClass(), "labels1", term11965);
        setIntElement(term11967, 0, 1129458600);
        setIntElement(term11967, 1, -1559804880);
        setIntElement(term11967, 2, 420300457);
        setIntElement(term11967, 3, 804843661);
        setIntElement(term11967, 4, 1968236726);
        setIntElement(term11967, 5, -1080686915);
        setIntElement(term11967, 6, -1329496162);
        setIntElement(term11967, 7, -1181178091);
        setField(term11962, term11962.getClass(), "labels2", term11967);
        setField(term11962, term11962.getClass(), "labelListToInt", term11976);
        setIntField(term11962, term11962.getClass(), "maxLabel", 797166053);
        setField(term11962, term11962.getClass(), "isomorphic", term11982);
        setField(term11984, term11984.getClass(), "graph1", null);
        setField(term11984, term11984.getClass(), "graph2", null);
        setIntElement(term11985, 0, -1145342603);
        setIntElement(term11985, 1, -1135326582);
        setIntElement(term11985, 2, 594267051);
        setIntElement(term11985, 3, -1225303838);
        setIntElement(term11985, 4, 1093956146);
        setIntElement(term11985, 5, 1459247713);
        setField(term11984, term11984.getClass(), "mapping", term11985);
        setIntElement(term11992, 0, 1400302967);
        setIntElement(term11992, 1, 692198729);
        setIntElement(term11992, 2, -1232290301);
        setIntElement(term11992, 3, -1411058034);
        setIntElement(term11992, 4, -144155597);
        setIntElement(term11992, 5, -996670851);
        setIntElement(term11992, 6, 340642931);
        setField(term11984, term11984.getClass(), "inverse", term11992);
        setField(term11962, term11962.getClass(), "isomorphism", term11984);
        setField(term11962, term11962.getClass(), "sortingAlgorithm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeIsomorphic", argTypes, term11962, args);
    }

};


