package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class RootedTree_height_10620447845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6875;

    public RootedTree_height_10620447845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6886 = new ArrayList();
        term6875 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term6877 = (int[]) newIntArray(8);
        setField(term6875, term6875.getClass(), "tree", null);
        setIntField(term6875, term6875.getClass(), "root", -139927812);
        setIntElement(term6877, 0, -2065157320);
        setIntElement(term6877, 1, 1782011477);
        setIntElement(term6877, 2, 2129957018);
        setIntElement(term6877, 3, 691663312);
        setIntElement(term6877, 4, -1236696275);
        setIntElement(term6877, 5, 575249858);
        setIntElement(term6877, 6, -297957951);
        setIntElement(term6877, 7, -1816920588);
        setField(term6875, term6875.getClass(), "parents", term6877);
        setField(term6875, term6875.getClass(), "levels", term6886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "height", argTypes, term6875, args);
    }

};


