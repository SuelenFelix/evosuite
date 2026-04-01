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

public class SpanningTreeIterator_removeCurrentEdge_7666324169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177889;

    public SpanningTreeIterator_removeCurrentEdge_7666324169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term177896 = new Double(0.8991292188543525);
        Double term177898 = new Double(0.6951370783696084);
        Double term177900 = new Double(0.9196328131891488);
        Double term177909 = new Double(0.2830248509669434);
        Double term177911 = new Double(0.9599551328713044);
        Double term177913 = new Double(0.2581606045879299);
        Double term177915 = new Double(0.06031523312277309);
        Double term177917 = new Double(0.02808473575120307);
        Double term177919 = new Double(0.6023559289188395);
        Double term177921 = new Double(0.0078631465072323);
        Double term177923 = new Double(0.5923361444223373);
        Object term177904 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term177908 = (Object[]) newArray("java.lang.Double", 8);
        setBooleanField(term177904, term177904.getClass(), "directed", false);
        setIntField(term177904, term177904.getClass(), "source", -1588936708);
        setIntField(term177904, term177904.getClass(), "target", -1163042163);
        setElement(term177908, 0, term177909);
        setElement(term177908, 1, term177911);
        setElement(term177908, 2, term177913);
        setElement(term177908, 3, term177915);
        setElement(term177908, 4, term177917);
        setElement(term177908, 5, term177919);
        setElement(term177908, 6, term177921);
        setElement(term177908, 7, term177923);
        setField(term177904, term177904.getClass(), "data", term177908);
        setField(term177904, term177904.getClass(), "label", null);
        ArrayDeque term177902 = new ArrayDeque();
        ((ArrayDeque) term177902).add(term177904);
        Object term177929 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term177933 = (Object[]) newArray("java.lang.Double", 0);
        setBooleanField(term177929, term177929.getClass(), "directed", false);
        setIntField(term177929, term177929.getClass(), "source", -1232142795);
        setIntField(term177929, term177929.getClass(), "target", 1481382782);
        setField(term177929, term177929.getClass(), "data", term177933);
        setField(term177929, term177929.getClass(), "label", null);
        ArrayDeque term177927 = new ArrayDeque();
        ((ArrayDeque) term177927).add(term177929);
        Object term177939 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node"));
        setIntField(term177939, term177939.getClass(), "currentPos", 680874602);
        setIntField(term177939, term177939.getClass(), "root1", 754551588);
        setIntField(term177939, term177939.getClass(), "root2", 1629366494);
        setIntField(term177939, term177939.getClass(), "parent1", -796037627);
        setIntField(term177939, term177939.getClass(), "parent2", -1912013588);
        setField(term177939, term177939.getClass(), "this$0", null);
        Object term177945 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node"));
        setIntField(term177945, term177945.getClass(), "currentPos", 444406125);
        setIntField(term177945, term177945.getClass(), "root1", 1173807660);
        setIntField(term177945, term177945.getClass(), "root2", -306416560);
        setIntField(term177945, term177945.getClass(), "parent1", -289932504);
        setIntField(term177945, term177945.getClass(), "parent2", 695086450);
        setField(term177945, term177945.getClass(), "this$0", null);
        Object term177951 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node"));
        setIntField(term177951, term177951.getClass(), "currentPos", 1156216002);
        setIntField(term177951, term177951.getClass(), "root1", -1980201278);
        setIntField(term177951, term177951.getClass(), "root2", -861023124);
        setIntField(term177951, term177951.getClass(), "parent1", 767188123);
        setIntField(term177951, term177951.getClass(), "parent2", 885517088);
        setField(term177951, term177951.getClass(), "this$0", null);
        Object term177957 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node"));
        setIntField(term177957, term177957.getClass(), "currentPos", 556762697);
        setIntField(term177957, term177957.getClass(), "root1", -1950981517);
        setIntField(term177957, term177957.getClass(), "root2", 547204989);
        setIntField(term177957, term177957.getClass(), "parent1", 1487949380);
        setIntField(term177957, term177957.getClass(), "parent2", 1909733030);
        setField(term177957, term177957.getClass(), "this$0", null);
        ArrayDeque term177937 = new ArrayDeque();
        ((ArrayDeque) term177937).add(term177939);
        ((ArrayDeque) term177937).add(term177945);
        ((ArrayDeque) term177937).add(term177951);
        ((ArrayDeque) term177937).add(term177957);
        term177889 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator"));
        Object[] term177890 = (Object[]) newArray("org.graph4j.Edge", 1);
        Object term177891 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term177895 = (Object[]) newArray("java.lang.Double", 3);
        Object term177965 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$UnionFindExt"));
        int[] term177968 = (int[]) newIntArray(2);
        setField(term177889, term177889.getClass(), "graph", null);
        setBooleanField(term177891, term177891.getClass(), "directed", true);
        setIntField(term177891, term177891.getClass(), "source", 1407104864);
        setIntField(term177891, term177891.getClass(), "target", 1440413130);
        setElement(term177895, 0, term177896);
        setElement(term177895, 1, term177898);
        setElement(term177895, 2, term177900);
        setField(term177891, term177891.getClass(), "data", term177895);
        setField(term177891, term177891.getClass(), "label", null);
        setElement(term177890, 0, term177891);
        setField(term177889, term177889.getClass(), "edges", term177890);
        setField(term177889, term177889.getClass(), "workTree", term177902);
        setField(term177889, term177889.getClass(), "nextTree", term177927);
        setIntField(term177889, term177889.getClass(), "currentPos", -2008560380);
        setField(term177889, term177889.getClass(), "stack", term177937);
        setField(term177965, term177965.getClass(), "this$0", null);
        setIntField(term177965, term177965.getClass(), "numVertices", -1322793773);
        setBooleanField(term177965, term177965.getClass(), "pathCompression", true);
        setIntElement(term177968, 0, -1052147143);
        setIntElement(term177968, 1, 1223559230);
        setField(term177965, term177965.getClass(), "parent", term177968);
        setIntField(term177965, term177965.getClass(), "numSets", 1536438131);
        setField(term177889, term177889.getClass(), "unionFind", term177965);
        setBooleanField(term177889, term177889.getClass(), "finished", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.SpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeCurrentEdge", argTypes, term177889, args);
    }

};


