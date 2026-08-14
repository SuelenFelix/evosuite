package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.util.ArrayDeque;

public class SpanningTreeIterator_hasNext_15146182333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3544;

    public SpanningTreeIterator_hasNext_15146182333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3551 = new Double(0.8896348979317397);
        Double term3553 = new Double(0.26895104127686764);
        Double term3555 = new Double(0.44147348766746497);
        Double term3557 = new Double(0.20785767731652216);
        Double term3559 = new Double(0.8233926052583531);
        Double term3561 = new Double(0.01480700687689196);
        Double term3563 = new Double(0.2199442770536334);
        Double term3565 = new Double(0.18246579362349058);
        Double term3567 = new Double(0.4625644623844958);
        Double term3576 = new Double(0.20372080216921717);
        Double term3578 = new Double(0.3858905478901201);
        Double term3580 = new Double(0.06209980384851188);
        Double term3582 = new Double(0.7510022677490469);
        Object term3571 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term3575 = (Object[]) newArray("java.lang.Double", 4);
        setBooleanField(term3571, term3571.getClass(), "directed", false);
        setIntField(term3571, term3571.getClass(), "source", -1300947782);
        setIntField(term3571, term3571.getClass(), "target", 188512644);
        setElement(term3575, 0, term3576);
        setElement(term3575, 1, term3578);
        setElement(term3575, 2, term3580);
        setElement(term3575, 3, term3582);
        setField(term3571, term3571.getClass(), "data", term3575);
        setField(term3571, term3571.getClass(), "label", null);
        ArrayDeque term3569 = new ArrayDeque();
        ((ArrayDeque) term3569).add(term3571);
        ArrayDeque term3586 = new ArrayDeque();
        Object term3593 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node"));
        setIntField(term3593, term3593.getClass(), "currentPos", 783730213);
        setIntField(term3593, term3593.getClass(), "root1", 1815951606);
        setIntField(term3593, term3593.getClass(), "root2", 1105016932);
        setIntField(term3593, term3593.getClass(), "parent1", -365784998);
        setIntField(term3593, term3593.getClass(), "parent2", -1893236300);
        setField(term3593, term3593.getClass(), "this$0", null);
        Object term3599 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node"));
        setIntField(term3599, term3599.getClass(), "currentPos", -1858909368);
        setIntField(term3599, term3599.getClass(), "root1", -280113263);
        setIntField(term3599, term3599.getClass(), "root2", 529625347);
        setIntField(term3599, term3599.getClass(), "parent1", 1409095253);
        setIntField(term3599, term3599.getClass(), "parent2", 315179039);
        setField(term3599, term3599.getClass(), "this$0", null);
        ArrayDeque term3591 = new ArrayDeque();
        ((ArrayDeque) term3591).add(term3593);
        ((ArrayDeque) term3591).add(term3599);
        term3544 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator"));
        Object[] term3545 = (Object[]) newArray("org.graph4j.Edge", 1);
        Object term3546 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term3550 = (Object[]) newArray("java.lang.Double", 9);
        Object term3607 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$UnionFindExt"));
        int[] term3610 = (int[]) newIntArray(1);
        setField(term3544, term3544.getClass(), "graph", null);
        setBooleanField(term3546, term3546.getClass(), "directed", false);
        setIntField(term3546, term3546.getClass(), "source", -1292704466);
        setIntField(term3546, term3546.getClass(), "target", 1991858584);
        setElement(term3550, 0, term3551);
        setElement(term3550, 1, term3553);
        setElement(term3550, 2, term3555);
        setElement(term3550, 3, term3557);
        setElement(term3550, 4, term3559);
        setElement(term3550, 5, term3561);
        setElement(term3550, 6, term3563);
        setElement(term3550, 7, term3565);
        setElement(term3550, 8, term3567);
        setField(term3546, term3546.getClass(), "data", term3550);
        setField(term3546, term3546.getClass(), "label", null);
        setElement(term3545, 0, term3546);
        setField(term3544, term3544.getClass(), "edges", term3545);
        setField(term3544, term3544.getClass(), "workTree", term3569);
        setField(term3544, term3544.getClass(), "nextTree", term3586);
        setIntField(term3544, term3544.getClass(), "currentPos", 1851127634);
        setField(term3544, term3544.getClass(), "stack", term3591);
        setField(term3607, term3607.getClass(), "this$0", null);
        setIntField(term3607, term3607.getClass(), "numVertices", -1835923897);
        setBooleanField(term3607, term3607.getClass(), "pathCompression", true);
        setIntElement(term3610, 0, -341287775);
        setField(term3607, term3607.getClass(), "parent", term3610);
        setIntField(term3607, term3607.getClass(), "numSets", -1651110911);
        setField(term3544, term3544.getClass(), "unionFind", term3607);
        setBooleanField(term3544, term3544.getClass(), "finished", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.SpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term3544, args);
    }

};


