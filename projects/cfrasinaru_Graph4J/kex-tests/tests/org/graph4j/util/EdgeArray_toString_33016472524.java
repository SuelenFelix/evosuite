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
import java.lang.Object;

public class EdgeArray_toString_33016472524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62770;

    public EdgeArray_toString_33016472524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62770 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62771 = (Object[]) newArray("[I", 4);
        int[] term62772 = (int[]) newIntArray(1);
        int[] term62774 = (int[]) newIntArray(8);
        int[] term62783 = (int[]) newIntArray(4);
        int[] term62788 = (int[]) newIntArray(2);
        setField(term62770, term62770.getClass(), "graph", null);
        setIntElement(term62772, 0, 151330446);
        setElement(term62771, 0, term62772);
        setIntElement(term62774, 0, 1085757815);
        setIntElement(term62774, 1, 1419726204);
        setIntElement(term62774, 2, 327539141);
        setIntElement(term62774, 3, 564309045);
        setIntElement(term62774, 4, -393999611);
        setIntElement(term62774, 5, 277874910);
        setIntElement(term62774, 6, -1564481884);
        setIntElement(term62774, 7, -1891590977);
        setElement(term62771, 1, term62774);
        setIntElement(term62783, 0, -49122115);
        setIntElement(term62783, 1, 1162634645);
        setIntElement(term62783, 2, -1269431491);
        setIntElement(term62783, 3, 2066614250);
        setElement(term62771, 2, term62783);
        setIntElement(term62788, 0, 1678127654);
        setIntElement(term62788, 1, -1503783301);
        setElement(term62771, 3, term62788);
        setField(term62770, term62770.getClass(), "edges", term62771);
        setIntField(term62770, term62770.getClass(), "numEdges", -755256222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term62770, args);
    }

};


