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
import java.lang.Integer;

public class UnionFind_setParent_1695290746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3443;
     Object term3452;
     Object term3454;

    public UnionFind_setParent_1695290746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3443 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term3446 = (int[]) newIntArray(4);
        setIntField(term3443, term3443.getClass(), "numVertices", -2018333791);
        setBooleanField(term3443, term3443.getClass(), "pathCompression", false);
        setIntElement(term3446, 0, -742476678);
        setIntElement(term3446, 1, -824369460);
        setIntElement(term3446, 2, -1573760035);
        setIntElement(term3446, 3, -1147965121);
        setField(term3443, term3443.getClass(), "parent", term3446);
        setIntField(term3443, term3443.getClass(), "numSets", -867099093);
        term3452 = new Integer(-1091199008);
        term3454 = new Integer(1837886253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3452;
        args[1] = term3454;
        callMethod(klass, "setParent", argTypes, term3443, args);
    }

};


