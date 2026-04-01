package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;

public class DFSTraverser_numComponents_14075972858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110583;

    public DFSTraverser_numComponents_14075972858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term110627 = new ArrayDeque();
        term110583 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        Object[] term110587 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 2);
        Object term110588 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110593 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110598 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110603 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110608 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term110613 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        int[] term110618 = (int[]) newIntArray(7);
        boolean[] term110631 = (boolean[]) newBooleanArray(5);
        setField(term110583, term110583.getClass(), "graph", null);
        setBooleanField(term110583, term110583.getClass(), "directed", false);
        setField(term110583, term110583.getClass(), "visitor", null);
        setIntField(term110583, term110583.getClass(), "orderIndex", 640309304);
        setIntField(term110583, term110583.getClass(), "compIndex", -219854717);
        setIntField(term110588, term110588.getClass(), "component", 873009421);
        setIntField(term110588, term110588.getClass(), "vertex", 262200959);
        setIntField(term110588, term110588.getClass(), "level", 974169701);
        setIntField(term110588, term110588.getClass(), "order", -314909077);
        setIntField(term110593, term110593.getClass(), "component", 1607017048);
        setIntField(term110593, term110593.getClass(), "vertex", -99136729);
        setIntField(term110593, term110593.getClass(), "level", -355824448);
        setIntField(term110593, term110593.getClass(), "order", 852249692);
        setIntField(term110598, term110598.getClass(), "component", 1951861706);
        setIntField(term110598, term110598.getClass(), "vertex", -586915273);
        setIntField(term110598, term110598.getClass(), "level", -2047610899);
        setIntField(term110598, term110598.getClass(), "order", 926362344);
        setField(term110598, term110598.getClass(), "parent", null);
        setField(term110593, term110593.getClass(), "parent", term110598);
        setField(term110588, term110588.getClass(), "parent", term110593);
        setElement(term110587, 0, term110588);
        setIntField(term110603, term110603.getClass(), "component", 664653763);
        setIntField(term110603, term110603.getClass(), "vertex", 2134829135);
        setIntField(term110603, term110603.getClass(), "level", -1719222583);
        setIntField(term110603, term110603.getClass(), "order", 437944159);
        setIntField(term110608, term110608.getClass(), "component", -2076214380);
        setIntField(term110608, term110608.getClass(), "vertex", -1080020994);
        setIntField(term110608, term110608.getClass(), "level", -1903678868);
        setIntField(term110608, term110608.getClass(), "order", 1081203074);
        setIntField(term110613, term110613.getClass(), "component", 0);
        setIntField(term110613, term110613.getClass(), "vertex", 0);
        setIntField(term110613, term110613.getClass(), "level", 0);
        setIntField(term110613, term110613.getClass(), "order", 0);
        setField(term110613, term110613.getClass(), "parent", null);
        setField(term110608, term110608.getClass(), "parent", term110613);
        setField(term110603, term110603.getClass(), "parent", term110608);
        setElement(term110587, 1, term110603);
        setField(term110583, term110583.getClass(), "visited", term110587);
        setIntElement(term110618, 0, 168032716);
        setIntElement(term110618, 1, 942811278);
        setIntElement(term110618, 2, -15679804);
        setIntElement(term110618, 3, -492536842);
        setIntElement(term110618, 4, 151903958);
        setIntElement(term110618, 5, 12496784);
        setIntElement(term110618, 6, -844034618);
        setField(term110583, term110583.getClass(), "nextPos", term110618);
        setIntField(term110583, term110583.getClass(), "restartIndex", -1748142279);
        setField(term110583, term110583.getClass(), "stack", term110627);
        setBooleanElement(term110631, 0, true);
        setBooleanElement(term110631, 1, true);
        setBooleanElement(term110631, 3, true);
        setField(term110583, term110583.getClass(), "instack", term110631);
        setBooleanField(term110583, term110583.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numComponents", argTypes, term110583, args);
    }

};


