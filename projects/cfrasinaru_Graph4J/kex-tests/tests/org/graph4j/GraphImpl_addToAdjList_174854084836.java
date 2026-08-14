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

public class GraphImpl_addToAdjList_174854084836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13518;
     Object term13643;
     Object term13645;

    public GraphImpl_addToAdjList_174854084836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13626 = new Integer(-1087774327);
        HashMap term13628 = new HashMap();
        HashMap term13633 = new HashMap();
        term13518 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        int[] term13534 = (int[]) newIntArray(3);
        int[] term13538 = (int[]) newIntArray(6);
        Object[] term13545 = (Object[]) newArray("[I", 1);
        int[] term13546 = (int[]) newIntArray(9);
        Object[] term13556 = (Object[]) newArray("[I", 8);
        int[] term13557 = (int[]) newIntArray(0);
        int[] term13558 = (int[]) newIntArray(3);
        int[] term13562 = (int[]) newIntArray(1);
        int[] term13564 = (int[]) newIntArray(4);
        int[] term13569 = (int[]) newIntArray(0);
        int[] term13570 = (int[]) newIntArray(3);
        int[] term13574 = (int[]) newIntArray(3);
        int[] term13578 = (int[]) newIntArray(0);
        double[] term13579 = (double[]) newDoubleArray(9);
        Object[] term13590 = (Object[]) newArray("[[D", 2);
        Object[] term13591 = (Object[]) newArray("[D", 2);
        double[] term13592 = (double[]) newDoubleArray(5);
        double[] term13598 = (double[]) newDoubleArray(7);
        Object[] term13606 = (Object[]) newArray("[D", 2);
        double[] term13607 = (double[]) newDoubleArray(2);
        double[] term13610 = (double[]) newDoubleArray(9);
        Object[] term13621 = (Object[]) newArray("java.lang.Object", 1);
        Object term13622 = newInstance(Class.forName("java.lang.Object"));
        Object[] term13623 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 0);
        Object[] term13624 = (Object[]) newArray("org.graph4j.AdjacencySet", 8);
        Object[] term13625 = (Object[]) newArray("org.graph4j.AdjacencyMap", 1);
        setField(term13518, term13518.getClass(), "name", "Ghbwtircqb");
        setIntField(term13518, term13518.getClass(), "maxVertices", -985577036);
        setIntField(term13518, term13518.getClass(), "numVertices", 802539130);
        setLongField(term13518, term13518.getClass(), "numEdges", 1233889271256172047L);
        setIntElement(term13534, 0, 2105146188);
        setIntElement(term13534, 1, -862415480);
        setIntElement(term13534, 2, 312605349);
        setField(term13518, term13518.getClass(), "vertices", term13534);
        setIntElement(term13538, 0, -402072606);
        setIntElement(term13538, 1, -477355193);
        setIntElement(term13538, 2, 168425089);
        setIntElement(term13538, 3, -571931590);
        setIntElement(term13538, 4, 37757400);
        setIntElement(term13538, 5, -1632221612);
        setField(term13518, term13518.getClass(), "degree", term13538);
        setIntElement(term13546, 0, 1545314376);
        setIntElement(term13546, 1, 437959151);
        setIntElement(term13546, 2, 27780241);
        setIntElement(term13546, 3, -683868408);
        setIntElement(term13546, 4, -381130069);
        setIntElement(term13546, 5, 885769749);
        setIntElement(term13546, 6, -1021168716);
        setIntElement(term13546, 7, -1238055654);
        setIntElement(term13546, 8, 1561513428);
        setElement(term13545, 0, term13546);
        setField(term13518, term13518.getClass(), "adjList", term13545);
        setElement(term13556, 0, term13557);
        setIntElement(term13558, 0, 778959809);
        setIntElement(term13558, 1, -7504064);
        setIntElement(term13558, 2, -1464364418);
        setElement(term13556, 1, term13558);
        setIntElement(term13562, 0, 1050420173);
        setElement(term13556, 2, term13562);
        setIntElement(term13564, 0, 994300935);
        setIntElement(term13564, 1, 433954476);
        setIntElement(term13564, 2, 1780958641);
        setIntElement(term13564, 3, 1890582085);
        setElement(term13556, 3, term13564);
        setElement(term13556, 4, term13569);
        setIntElement(term13570, 0, 2146568808);
        setIntElement(term13570, 1, 245081679);
        setIntElement(term13570, 2, 1199789398);
        setElement(term13556, 5, term13570);
        setIntElement(term13574, 0, -1056402285);
        setIntElement(term13574, 1, 1881803912);
        setIntElement(term13574, 2, -188535038);
        setElement(term13556, 6, term13574);
        setElement(term13556, 7, term13578);
        setField(term13518, term13518.getClass(), "adjPos", term13556);
        setDoubleElement(term13579, 0, 0.2601153548499665);
        setDoubleElement(term13579, 1, 0.25664640991810517);
        setDoubleElement(term13579, 2, 0.3771823013175696);
        setDoubleElement(term13579, 3, 0.1676350637629238);
        setDoubleElement(term13579, 4, 0.9365724873830299);
        setDoubleElement(term13579, 5, 0.7692453960847958);
        setDoubleElement(term13579, 6, 0.26904484930820927);
        setDoubleElement(term13579, 7, 0.16094197919044806);
        setDoubleElement(term13579, 8, 0.2573588936293666);
        setField(term13518, term13518.getClass(), "vertexWeight", term13579);
        setIntField(term13518, term13518.getClass(), "vertexDataSize", 1);
        setDoubleElement(term13592, 0, 0.8693079310863931);
        setDoubleElement(term13592, 1, 0.028720251798983187);
        setDoubleElement(term13592, 2, 0.2761043987108316);
        setDoubleElement(term13592, 3, 0.09089102380278025);
        setDoubleElement(term13592, 4, 0.881306623668332);
        setElement(term13591, 0, term13592);
        setDoubleElement(term13598, 0, 0.8991292188543525);
        setDoubleElement(term13598, 1, 0.6951370783696084);
        setDoubleElement(term13598, 2, 0.9196328131891488);
        setDoubleElement(term13598, 3, 0.2830248509669434);
        setDoubleElement(term13598, 4, 0.9599551328713044);
        setDoubleElement(term13598, 5, 0.2581606045879299);
        setDoubleElement(term13598, 6, 0.06031523312277309);
        setElement(term13591, 1, term13598);
        setElement(term13590, 0, term13591);
        setDoubleElement(term13607, 0, 0.02808473575120307);
        setDoubleElement(term13607, 1, 0.6023559289188395);
        setElement(term13606, 0, term13607);
        setDoubleElement(term13610, 0, 0.0078631465072323);
        setDoubleElement(term13610, 1, 0.5923361444223373);
        setDoubleElement(term13610, 2, 0.1693145920063992);
        setDoubleElement(term13610, 3, 0.740741118899312);
        setDoubleElement(term13610, 4, 0.013027541984609425);
        setDoubleElement(term13610, 5, 0.9947375007259692);
        setDoubleElement(term13610, 6, 0.8402373624757052);
        setDoubleElement(term13610, 7, 0.41679615013166527);
        setDoubleElement(term13610, 8, 0.5308463195194373);
        setElement(term13606, 1, term13610);
        setElement(term13590, 1, term13606);
        setField(term13518, term13518.getClass(), "edgeData", term13590);
        setIntField(term13518, term13518.getClass(), "edgeDataSize", 1);
        setElement(term13621, 0, term13622);
        setField(term13518, term13518.getClass(), "vertexLabel", term13621);
        setField(term13518, term13518.getClass(), "edgeLabel", term13623);
        setField(term13518, term13518.getClass(), "vertexIndex", null);
        setField(term13518, term13518.getClass(), "adjSet", term13624);
        setField(term13518, term13518.getClass(), "adjMap", term13625);
        setField(term13518, term13518.getClass(), "maxVertexNumber", term13626);
        setField(term13518, term13518.getClass(), "labelVertexMap", term13628);
        setField(term13518, term13518.getClass(), "labelEdgeMap", term13633);
        setBooleanField(term13518, term13518.getClass(), "directed", false);
        setBooleanField(term13518, term13518.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term13518, term13518.getClass(), "allowingSelfLoops", true);
        setIntField(term13518, term13518.getClass(), "avgDegree", 254650626);
        setBooleanField(term13518, term13518.getClass(), "safeMode", true);
        term13643 = new Integer(-1789030917);
        term13645 = new Integer(912208163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term13643;
        args[1] = term13645;
        callMethod(klass, "addToAdjList", argTypes, term13518, args);
    }

};


