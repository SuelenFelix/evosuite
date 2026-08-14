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

public class RootedTreeIsomorphism_createIsomorphism_17623527667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12179;

    public RootedTreeIsomorphism_createIsomorphism_17623527667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12189 = new HashMap();
        Boolean term12195 = new Boolean(true);
        term12179 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term12182 = (int[]) newIntArray(2);
        int[] term12185 = (int[]) newIntArray(3);
        Object term12197 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term12198 = (int[]) newIntArray(2);
        int[] term12201 = (int[]) newIntArray(7);
        setField(term12179, term12179.getClass(), "tree1", null);
        setField(term12179, term12179.getClass(), "tree2", null);
        setIntField(term12179, term12179.getClass(), "root1", -548967985);
        setIntField(term12179, term12179.getClass(), "root2", -1923425156);
        setIntElement(term12182, 0, 1237861885);
        setIntElement(term12182, 1, 1433214025);
        setField(term12179, term12179.getClass(), "labels1", term12182);
        setIntElement(term12185, 0, 1424797105);
        setIntElement(term12185, 1, 386281072);
        setIntElement(term12185, 2, -782180775);
        setField(term12179, term12179.getClass(), "labels2", term12185);
        setField(term12179, term12179.getClass(), "labelListToInt", term12189);
        setIntField(term12179, term12179.getClass(), "maxLabel", -1971308334);
        setField(term12179, term12179.getClass(), "isomorphic", term12195);
        setField(term12197, term12197.getClass(), "graph1", null);
        setField(term12197, term12197.getClass(), "graph2", null);
        setIntElement(term12198, 0, -2070149565);
        setIntElement(term12198, 1, 1682543276);
        setField(term12197, term12197.getClass(), "mapping", term12198);
        setIntElement(term12201, 0, 156914536);
        setIntElement(term12201, 1, -1745894636);
        setIntElement(term12201, 2, 571282234);
        setIntElement(term12201, 3, 1131350330);
        setIntElement(term12201, 4, -1463702476);
        setIntElement(term12201, 5, 90151812);
        setIntElement(term12201, 6, -416703693);
        setField(term12197, term12197.getClass(), "inverse", term12201);
        setField(term12179, term12179.getClass(), "isomorphism", term12197);
        setField(term12179, term12179.getClass(), "sortingAlgorithm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createIsomorphism", argTypes, term12179, args);
    }

};


