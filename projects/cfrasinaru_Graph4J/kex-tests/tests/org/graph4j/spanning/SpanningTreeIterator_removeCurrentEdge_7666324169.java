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
     Object term177892;

    public SpanningTreeIterator_removeCurrentEdge_7666324169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term177899 = new Double(0.8991292188543525);
        Double term177901 = new Double(0.6951370783696084);
        Double term177903 = new Double(0.9196328131891488);
        Double term177912 = new Double(0.2830248509669434);
        Double term177914 = new Double(0.9599551328713044);
        Double term177916 = new Double(0.2581606045879299);
        Double term177918 = new Double(0.06031523312277309);
        Double term177920 = new Double(0.02808473575120307);
        Double term177922 = new Double(0.6023559289188395);
        Double term177924 = new Double(0.0078631465072323);
        Double term177926 = new Double(0.5923361444223373);
        Object term177907 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term177911 = (Object[]) newArray("java.lang.Double", 8);
        setBooleanField(term177907, term177907.getClass(), "directed", false);
        setIntField(term177907, term177907.getClass(), "source", -1588936708);
        setIntField(term177907, term177907.getClass(), "target", -1163042163);
        setElement(term177911, 0, term177912);
        setElement(term177911, 1, term177914);
        setElement(term177911, 2, term177916);
        setElement(term177911, 3, term177918);
        setElement(term177911, 4, term177920);
        setElement(term177911, 5, term177922);
        setElement(term177911, 6, term177924);
        setElement(term177911, 7, term177926);
        setField(term177907, term177907.getClass(), "data", term177911);
        setField(term177907, term177907.getClass(), "label", null);
        ArrayDeque term177905 = new ArrayDeque();
        ((ArrayDeque) term177905).add(term177907);
        Object term177932 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term177936 = (Object[]) newArray("java.lang.Double", 0);
        setBooleanField(term177932, term177932.getClass(), "directed", false);
        setIntField(term177932, term177932.getClass(), "source", -1232142795);
        setIntField(term177932, term177932.getClass(), "target", 1481382782);
        setField(term177932, term177932.getClass(), "data", term177936);
        setField(term177932, term177932.getClass(), "label", null);
        ArrayDeque term177930 = new ArrayDeque();
        ((ArrayDeque) term177930).add(term177932);
        Object term177942 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node"));
        setIntField(term177942, term177942.getClass(), "currentPos", 680874602);
        setIntField(term177942, term177942.getClass(), "root1", 754551588);
        setIntField(term177942, term177942.getClass(), "root2", 1629366494);
        setIntField(term177942, term177942.getClass(), "parent1", -796037627);
        setIntField(term177942, term177942.getClass(), "parent2", -1912013588);
        setField(term177942, term177942.getClass(), "this$0", null);
        Object term177948 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node"));
        setIntField(term177948, term177948.getClass(), "currentPos", 444406125);
        setIntField(term177948, term177948.getClass(), "root1", 1173807660);
        setIntField(term177948, term177948.getClass(), "root2", -306416560);
        setIntField(term177948, term177948.getClass(), "parent1", -289932504);
        setIntField(term177948, term177948.getClass(), "parent2", 695086450);
        setField(term177948, term177948.getClass(), "this$0", null);
        Object term177954 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node"));
        setIntField(term177954, term177954.getClass(), "currentPos", 1156216002);
        setIntField(term177954, term177954.getClass(), "root1", -1980201278);
        setIntField(term177954, term177954.getClass(), "root2", -861023124);
        setIntField(term177954, term177954.getClass(), "parent1", 767188123);
        setIntField(term177954, term177954.getClass(), "parent2", 885517088);
        setField(term177954, term177954.getClass(), "this$0", null);
        Object term177960 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node"));
        setIntField(term177960, term177960.getClass(), "currentPos", 556762697);
        setIntField(term177960, term177960.getClass(), "root1", -1950981517);
        setIntField(term177960, term177960.getClass(), "root2", 547204989);
        setIntField(term177960, term177960.getClass(), "parent1", 1487949380);
        setIntField(term177960, term177960.getClass(), "parent2", 1909733030);
        setField(term177960, term177960.getClass(), "this$0", null);
        ArrayDeque term177940 = new ArrayDeque();
        ((ArrayDeque) term177940).add(term177942);
        ((ArrayDeque) term177940).add(term177948);
        ((ArrayDeque) term177940).add(term177954);
        ((ArrayDeque) term177940).add(term177960);
        term177892 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator"));
        Object[] term177893 = (Object[]) newArray("org.graph4j.Edge", 1);
        Object term177894 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term177898 = (Object[]) newArray("java.lang.Double", 3);
        Object term177968 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$UnionFindExt"));
        int[] term177971 = (int[]) newIntArray(2);
        setField(term177892, term177892.getClass(), "graph", null);
        setBooleanField(term177894, term177894.getClass(), "directed", true);
        setIntField(term177894, term177894.getClass(), "source", 1407104864);
        setIntField(term177894, term177894.getClass(), "target", 1440413130);
        setElement(term177898, 0, term177899);
        setElement(term177898, 1, term177901);
        setElement(term177898, 2, term177903);
        setField(term177894, term177894.getClass(), "data", term177898);
        setField(term177894, term177894.getClass(), "label", null);
        setElement(term177893, 0, term177894);
        setField(term177892, term177892.getClass(), "edges", term177893);
        setField(term177892, term177892.getClass(), "workTree", term177905);
        setField(term177892, term177892.getClass(), "nextTree", term177930);
        setIntField(term177892, term177892.getClass(), "currentPos", -2008560380);
        setField(term177892, term177892.getClass(), "stack", term177940);
        setField(term177968, term177968.getClass(), "this$0", null);
        setIntField(term177968, term177968.getClass(), "numVertices", -1322793773);
        setBooleanField(term177968, term177968.getClass(), "pathCompression", true);
        setIntElement(term177971, 0, -1052147143);
        setIntElement(term177971, 1, 1223559230);
        setField(term177968, term177968.getClass(), "parent", term177971);
        setIntField(term177968, term177968.getClass(), "numSets", 1536438131);
        setField(term177892, term177892.getClass(), "unionFind", term177968);
        setBooleanField(term177892, term177892.getClass(), "finished", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.SpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeCurrentEdge", argTypes, term177892, args);
    }

};


