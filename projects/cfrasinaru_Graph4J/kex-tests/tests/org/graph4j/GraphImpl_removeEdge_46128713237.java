package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;

public class GraphImpl_removeEdge_46128713237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13721;
     Object term13839;
     Object term13841;

    public GraphImpl_removeEdge_46128713237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13822 = new Integer(-1530420153);
        HashMap term13824 = new HashMap();
        HashMap term13829 = new HashMap();
        term13721 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        int[] term13737 = (int[]) newIntArray(2);
        int[] term13740 = (int[]) newIntArray(8);
        Object[] term13749 = (Object[]) newArray("[I", 4);
        int[] term13750 = (int[]) newIntArray(1);
        int[] term13752 = (int[]) newIntArray(0);
        int[] term13753 = (int[]) newIntArray(4);
        int[] term13758 = (int[]) newIntArray(5);
        Object[] term13764 = (Object[]) newArray("[I", 1);
        int[] term13765 = (int[]) newIntArray(1);
        double[] term13767 = (double[]) newDoubleArray(3);
        Object[] term13772 = (Object[]) newArray("[[D", 3);
        Object[] term13773 = (Object[]) newArray("[D", 3);
        double[] term13774 = (double[]) newDoubleArray(4);
        double[] term13779 = (double[]) newDoubleArray(0);
        double[] term13780 = (double[]) newDoubleArray(5);
        Object[] term13786 = (Object[]) newArray("[D", 2);
        double[] term13787 = (double[]) newDoubleArray(3);
        double[] term13791 = (double[]) newDoubleArray(6);
        Object[] term13798 = (Object[]) newArray("[D", 1);
        double[] term13799 = (double[]) newDoubleArray(5);
        Object[] term13806 = (Object[]) newArray("java.lang.Object", 3);
        Object term13807 = newInstance(Class.forName("java.lang.Object"));
        Object term13808 = newInstance(Class.forName("java.lang.Object"));
        Object term13809 = newInstance(Class.forName("java.lang.Object"));
        Object[] term13810 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 2);
        Object[] term13811 = (Object[]) newArray("java.lang.Object", 3);
        Object term13812 = newInstance(Class.forName("java.lang.Object"));
        Object term13813 = newInstance(Class.forName("java.lang.Object"));
        Object term13814 = newInstance(Class.forName("java.lang.Object"));
        Object[] term13815 = (Object[]) newArray("java.lang.Object", 4);
        Object term13816 = newInstance(Class.forName("java.lang.Object"));
        Object term13817 = newInstance(Class.forName("java.lang.Object"));
        Object term13818 = newInstance(Class.forName("java.lang.Object"));
        Object term13819 = newInstance(Class.forName("java.lang.Object"));
        Object[] term13820 = (Object[]) newArray("org.graph4j.AdjacencySet", 0);
        Object[] term13821 = (Object[]) newArray("org.graph4j.AdjacencyMap", 6);
        setField(term13721, term13721.getClass(), "name", "xrwlQZdwCp");
        setIntField(term13721, term13721.getClass(), "maxVertices", 909767683);
        setIntField(term13721, term13721.getClass(), "numVertices", -639390893);
        setLongField(term13721, term13721.getClass(), "numEdges", 6617340557564669657L);
        setIntElement(term13737, 0, 1176415280);
        setIntElement(term13737, 1, -1272714687);
        setField(term13721, term13721.getClass(), "vertices", term13737);
        setIntElement(term13740, 0, -762778853);
        setIntElement(term13740, 1, 946727239);
        setIntElement(term13740, 2, 349182490);
        setIntElement(term13740, 3, -353671511);
        setIntElement(term13740, 4, 1598831363);
        setIntElement(term13740, 5, -690367798);
        setIntElement(term13740, 6, 1863738073);
        setIntElement(term13740, 7, 2009028243);
        setField(term13721, term13721.getClass(), "degree", term13740);
        setIntElement(term13750, 0, 1900131331);
        setElement(term13749, 0, term13750);
        setElement(term13749, 1, term13752);
        setIntElement(term13753, 0, -1489604464);
        setIntElement(term13753, 1, 601642248);
        setIntElement(term13753, 2, -1186936928);
        setIntElement(term13753, 3, -315380004);
        setElement(term13749, 2, term13753);
        setIntElement(term13758, 0, -1945754843);
        setIntElement(term13758, 1, -1512221115);
        setIntElement(term13758, 2, -515486706);
        setIntElement(term13758, 3, -612862488);
        setIntElement(term13758, 4, 52739905);
        setElement(term13749, 3, term13758);
        setField(term13721, term13721.getClass(), "adjList", term13749);
        setIntElement(term13765, 0, -2105349391);
        setElement(term13764, 0, term13765);
        setField(term13721, term13721.getClass(), "adjPos", term13764);
        setDoubleElement(term13767, 0, 0.6532890920585167);
        setDoubleElement(term13767, 1, 0.07090667811865614);
        setDoubleElement(term13767, 2, 0.9401936369740241);
        setField(term13721, term13721.getClass(), "vertexWeight", term13767);
        setIntField(term13721, term13721.getClass(), "vertexDataSize", 1);
        setDoubleElement(term13774, 0, 0.43981796660202377);
        setDoubleElement(term13774, 1, 0.46659142519684227);
        setDoubleElement(term13774, 2, 0.4895128424983345);
        setDoubleElement(term13774, 3, 0.6059389374567645);
        setElement(term13773, 0, term13774);
        setElement(term13773, 1, term13779);
        setDoubleElement(term13780, 0, 0.4033379793632127);
        setDoubleElement(term13780, 1, 0.7537427717965324);
        setDoubleElement(term13780, 2, 0.6926259576683153);
        setDoubleElement(term13780, 3, 0.3300555589475892);
        setDoubleElement(term13780, 4, 0.40866856501639504);
        setElement(term13773, 2, term13780);
        setElement(term13772, 0, term13773);
        setDoubleElement(term13787, 0, 0.5459984722301383);
        setDoubleElement(term13787, 1, 0.954639335434283);
        setDoubleElement(term13787, 2, 0.2533233864720259);
        setElement(term13786, 0, term13787);
        setDoubleElement(term13791, 0, 0.16679107900169166);
        setDoubleElement(term13791, 1, 0.130983130174689);
        setDoubleElement(term13791, 2, 0.9909206116058732);
        setDoubleElement(term13791, 3, 0.4770406434369542);
        setDoubleElement(term13791, 4, 0.35571557158243994);
        setDoubleElement(term13791, 5, 0.41039956226761753);
        setElement(term13786, 1, term13791);
        setElement(term13772, 1, term13786);
        setDoubleElement(term13799, 0, 0.6893746988510188);
        setDoubleElement(term13799, 1, 0.6152885638315149);
        setDoubleElement(term13799, 2, 0.8431425366332285);
        setDoubleElement(term13799, 3, 0.2308104755849293);
        setDoubleElement(term13799, 4, 0.08156652650104779);
        setElement(term13798, 0, term13799);
        setElement(term13772, 2, term13798);
        setField(term13721, term13721.getClass(), "edgeData", term13772);
        setIntField(term13721, term13721.getClass(), "edgeDataSize", 1);
        setElement(term13806, 0, term13807);
        setElement(term13806, 1, term13808);
        setElement(term13806, 2, term13809);
        setField(term13721, term13721.getClass(), "vertexLabel", term13806);
        setElement(term13811, 0, term13812);
        setElement(term13811, 1, term13813);
        setElement(term13811, 2, term13814);
        setElement(term13810, 0, term13811);
        setElement(term13815, 0, term13816);
        setElement(term13815, 1, term13817);
        setElement(term13815, 2, term13818);
        setElement(term13815, 3, term13819);
        setElement(term13810, 1, term13815);
        setField(term13721, term13721.getClass(), "edgeLabel", term13810);
        setField(term13721, term13721.getClass(), "vertexIndex", null);
        setField(term13721, term13721.getClass(), "adjSet", term13820);
        setField(term13721, term13721.getClass(), "adjMap", term13821);
        setField(term13721, term13721.getClass(), "maxVertexNumber", term13822);
        setField(term13721, term13721.getClass(), "labelVertexMap", term13824);
        setField(term13721, term13721.getClass(), "labelEdgeMap", term13829);
        setBooleanField(term13721, term13721.getClass(), "directed", false);
        setBooleanField(term13721, term13721.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term13721, term13721.getClass(), "allowingSelfLoops", true);
        setIntField(term13721, term13721.getClass(), "avgDegree", -1176968921);
        setBooleanField(term13721, term13721.getClass(), "safeMode", true);
        term13839 = new Integer(-1986225025);
        term13841 = new Integer(-838689952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term13839;
        args[1] = term13841;
        callMethod(klass, "removeEdge", argTypes, term13721, args);
    }

};


