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

public class GraphImpl_vertexIterator_124785731119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7618;

    public GraphImpl_vertexIterator_124785731119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7726 = new Integer(1622346318);
        HashMap term7728 = new HashMap();
        HashMap term7733 = new HashMap();
        term7618 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        int[] term7634 = (int[]) newIntArray(4);
        int[] term7639 = (int[]) newIntArray(2);
        Object[] term7642 = (Object[]) newArray("[I", 2);
        int[] term7643 = (int[]) newIntArray(3);
        int[] term7647 = (int[]) newIntArray(7);
        Object[] term7655 = (Object[]) newArray("[I", 1);
        int[] term7656 = (int[]) newIntArray(3);
        double[] term7660 = (double[]) newDoubleArray(7);
        Object[] term7669 = (Object[]) newArray("[[D", 1);
        Object[] term7670 = (Object[]) newArray("[D", 7);
        double[] term7671 = (double[]) newDoubleArray(2);
        double[] term7674 = (double[]) newDoubleArray(6);
        double[] term7681 = (double[]) newDoubleArray(3);
        double[] term7685 = (double[]) newDoubleArray(9);
        double[] term7695 = (double[]) newDoubleArray(0);
        double[] term7696 = (double[]) newDoubleArray(5);
        double[] term7702 = (double[]) newDoubleArray(5);
        Object[] term7709 = (Object[]) newArray("java.lang.Object", 6);
        Object term7710 = newInstance(Class.forName("java.lang.Object"));
        Object term7711 = newInstance(Class.forName("java.lang.Object"));
        Object term7712 = newInstance(Class.forName("java.lang.Object"));
        Object term7713 = newInstance(Class.forName("java.lang.Object"));
        Object term7714 = newInstance(Class.forName("java.lang.Object"));
        Object term7715 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7716 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 3);
        Object[] term7717 = (Object[]) newArray("java.lang.Object", 2);
        Object term7718 = newInstance(Class.forName("java.lang.Object"));
        Object term7719 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7720 = (Object[]) newArray("java.lang.Object", 5);
        Object term7721 = newInstance(Class.forName("java.lang.Object"));
        Object term7722 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7723 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term7724 = (Object[]) newArray("org.graph4j.AdjacencySet", 2);
        Object[] term7725 = (Object[]) newArray("org.graph4j.AdjacencyMap", 1);
        setField(term7618, term7618.getClass(), "name", "HyxfbSQYBe");
        setIntField(term7618, term7618.getClass(), "maxVertices", -2027012650);
        setIntField(term7618, term7618.getClass(), "numVertices", 1343432022);
        setLongField(term7618, term7618.getClass(), "numEdges", -6573104506744284592L);
        setIntElement(term7634, 0, -1767079160);
        setIntElement(term7634, 1, -201010601);
        setIntElement(term7634, 2, 2060027076);
        setIntElement(term7634, 3, 2084868811);
        setField(term7618, term7618.getClass(), "vertices", term7634);
        setIntElement(term7639, 0, 314478878);
        setIntElement(term7639, 1, 1425342686);
        setField(term7618, term7618.getClass(), "degree", term7639);
        setIntElement(term7643, 0, -1042470635);
        setIntElement(term7643, 1, -524352937);
        setIntElement(term7643, 2, 1472218987);
        setElement(term7642, 0, term7643);
        setIntElement(term7647, 0, 805176809);
        setIntElement(term7647, 1, -82632953);
        setIntElement(term7647, 2, -1473876284);
        setIntElement(term7647, 3, -1389314671);
        setIntElement(term7647, 4, -499699841);
        setIntElement(term7647, 5, 360972386);
        setIntElement(term7647, 6, -2063884849);
        setElement(term7642, 1, term7647);
        setField(term7618, term7618.getClass(), "adjList", term7642);
        setIntElement(term7656, 0, 1054887169);
        setIntElement(term7656, 1, 692873905);
        setIntElement(term7656, 2, 1734759369);
        setElement(term7655, 0, term7656);
        setField(term7618, term7618.getClass(), "adjPos", term7655);
        setDoubleElement(term7660, 0, 0.24946956393957898);
        setDoubleElement(term7660, 1, 0.20660269955202237);
        setDoubleElement(term7660, 2, 0.7074091088647776);
        setDoubleElement(term7660, 3, 0.7000407967210135);
        setDoubleElement(term7660, 4, 0.3724671795059947);
        setDoubleElement(term7660, 5, 0.8800802342679814);
        setDoubleElement(term7660, 6, 0.2967811635938967);
        setField(term7618, term7618.getClass(), "vertexWeight", term7660);
        setIntField(term7618, term7618.getClass(), "vertexDataSize", 1);
        setDoubleElement(term7671, 0, 0.7455766528856747);
        setDoubleElement(term7671, 1, 0.7848284328368673);
        setElement(term7670, 0, term7671);
        setDoubleElement(term7674, 0, 0.45405874014259684);
        setDoubleElement(term7674, 1, 0.8287003692505468);
        setDoubleElement(term7674, 2, 0.872183435442562);
        setDoubleElement(term7674, 3, 0.2882121702089331);
        setDoubleElement(term7674, 4, 0.33173641696480016);
        setDoubleElement(term7674, 5, 0.8178843489441128);
        setElement(term7670, 1, term7674);
        setDoubleElement(term7681, 0, 0.5180057494602744);
        setDoubleElement(term7681, 1, 0.03653451194617485);
        setDoubleElement(term7681, 2, 0.1330120006712231);
        setElement(term7670, 2, term7681);
        setDoubleElement(term7685, 0, 0.6592051986007408);
        setDoubleElement(term7685, 1, 0.9029786080117671);
        setDoubleElement(term7685, 2, 0.49687206530148353);
        setDoubleElement(term7685, 3, 0.4393239742435411);
        setDoubleElement(term7685, 4, 0.061396562031202806);
        setDoubleElement(term7685, 5, 0.7952410141267131);
        setDoubleElement(term7685, 6, 0.3792040313417304);
        setDoubleElement(term7685, 7, 0.4936029650695076);
        setDoubleElement(term7685, 8, 0.8580005557306133);
        setElement(term7670, 3, term7685);
        setElement(term7670, 4, term7695);
        setDoubleElement(term7696, 0, 0.6226318229146778);
        setDoubleElement(term7696, 1, 0.21043841763332094);
        setDoubleElement(term7696, 2, 0.9177463037116731);
        setDoubleElement(term7696, 3, 0.5140671128103492);
        setDoubleElement(term7696, 4, 0.7636490217504489);
        setElement(term7670, 5, term7696);
        setDoubleElement(term7702, 0, 0.17836343343055017);
        setDoubleElement(term7702, 1, 0.7805302796119583);
        setDoubleElement(term7702, 2, 0.5504375992148846);
        setDoubleElement(term7702, 3, 0.20088626716870783);
        setDoubleElement(term7702, 4, 0.9776101302714891);
        setElement(term7670, 6, term7702);
        setElement(term7669, 0, term7670);
        setField(term7618, term7618.getClass(), "edgeData", term7669);
        setIntField(term7618, term7618.getClass(), "edgeDataSize", 1);
        setElement(term7709, 0, term7710);
        setElement(term7709, 1, term7711);
        setElement(term7709, 2, term7712);
        setElement(term7709, 3, term7713);
        setElement(term7709, 4, term7714);
        setElement(term7709, 5, term7715);
        setField(term7618, term7618.getClass(), "vertexLabel", term7709);
        setElement(term7717, 0, term7718);
        setElement(term7717, 1, term7719);
        setElement(term7716, 0, term7717);
        setElement(term7720, 0, term7721);
        setElement(term7720, 1, term7722);
        setElement(term7720, 2, term7719);
        setElement(term7720, 3, term7721);
        setElement(term7720, 4, term7710);
        setElement(term7716, 1, term7720);
        setElement(term7716, 2, term7723);
        setField(term7618, term7618.getClass(), "edgeLabel", term7716);
        setField(term7618, term7618.getClass(), "vertexIndex", null);
        setField(term7618, term7618.getClass(), "adjSet", term7724);
        setField(term7618, term7618.getClass(), "adjMap", term7725);
        setField(term7618, term7618.getClass(), "maxVertexNumber", term7726);
        setField(term7618, term7618.getClass(), "labelVertexMap", term7728);
        setField(term7618, term7618.getClass(), "labelEdgeMap", term7733);
        setBooleanField(term7618, term7618.getClass(), "directed", false);
        setBooleanField(term7618, term7618.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term7618, term7618.getClass(), "allowingSelfLoops", false);
        setIntField(term7618, term7618.getClass(), "avgDegree", 1841493736);
        setBooleanField(term7618, term7618.getClass(), "safeMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "vertexIterator", argTypes, term7618, args);
    }

};


