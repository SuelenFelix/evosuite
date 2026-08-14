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

public class GraphImpl_setEdgeDataSize_2625109711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4908;
     Object term5035;

    public GraphImpl_setEdgeDataSize_2625109711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5018 = new Integer(1725571209);
        HashMap term5020 = new HashMap();
        HashMap term5025 = new HashMap();
        term4908 = newInstance(Class.forName("org.graph4j.GraphImpl"));
        int[] term4924 = (int[]) newIntArray(9);
        int[] term4934 = (int[]) newIntArray(0);
        Object[] term4935 = (Object[]) newArray("[I", 8);
        int[] term4936 = (int[]) newIntArray(9);
        int[] term4946 = (int[]) newIntArray(0);
        int[] term4947 = (int[]) newIntArray(2);
        int[] term4950 = (int[]) newIntArray(0);
        int[] term4951 = (int[]) newIntArray(4);
        int[] term4956 = (int[]) newIntArray(4);
        int[] term4961 = (int[]) newIntArray(8);
        int[] term4970 = (int[]) newIntArray(4);
        Object[] term4975 = (Object[]) newArray("[I", 1);
        int[] term4976 = (int[]) newIntArray(9);
        double[] term4986 = (double[]) newDoubleArray(2);
        Object[] term4990 = (Object[]) newArray("[[D", 1);
        Object[] term4991 = (Object[]) newArray("[D", 2);
        double[] term4992 = (double[]) newDoubleArray(1);
        double[] term4994 = (double[]) newDoubleArray(4);
        Object[] term5000 = (Object[]) newArray("java.lang.Object", 1);
        Object term5001 = newInstance(Class.forName("java.lang.Object"));
        Object[] term5002 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 4);
        Object[] term5003 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term5004 = (Object[]) newArray("java.lang.Object", 3);
        Object term5005 = newInstance(Class.forName("java.lang.Object"));
        Object term5006 = newInstance(Class.forName("java.lang.Object"));
        Object term5007 = newInstance(Class.forName("java.lang.Object"));
        Object[] term5008 = (Object[]) newArray("java.lang.Object", 6);
        Object term5009 = newInstance(Class.forName("java.lang.Object"));
        Object term5010 = newInstance(Class.forName("java.lang.Object"));
        Object term5011 = newInstance(Class.forName("java.lang.Object"));
        Object term5012 = newInstance(Class.forName("java.lang.Object"));
        Object term5013 = newInstance(Class.forName("java.lang.Object"));
        Object term5014 = newInstance(Class.forName("java.lang.Object"));
        Object[] term5015 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term5016 = (Object[]) newArray("org.graph4j.AdjacencySet", 3);
        Object[] term5017 = (Object[]) newArray("org.graph4j.AdjacencyMap", 6);
        setField(term4908, term4908.getClass(), "name", "NRdvgJlhkX");
        setIntField(term4908, term4908.getClass(), "maxVertices", -1626451656);
        setIntField(term4908, term4908.getClass(), "numVertices", 173952451);
        setLongField(term4908, term4908.getClass(), "numEdges", -2813493605142626659L);
        setIntElement(term4924, 0, -1972033388);
        setIntElement(term4924, 1, -1005024758);
        setIntElement(term4924, 2, 2634669);
        setIntElement(term4924, 3, -1912429941);
        setIntElement(term4924, 4, 1801052257);
        setIntElement(term4924, 5, -2110556060);
        setIntElement(term4924, 6, 313459791);
        setIntElement(term4924, 7, 752615112);
        setIntElement(term4924, 8, -1674430871);
        setField(term4908, term4908.getClass(), "vertices", term4924);
        setField(term4908, term4908.getClass(), "degree", term4934);
        setIntElement(term4936, 0, 794352120);
        setIntElement(term4936, 1, 340719678);
        setIntElement(term4936, 2, 299791142);
        setIntElement(term4936, 3, 1862191391);
        setIntElement(term4936, 4, 1131398807);
        setIntElement(term4936, 5, -344907703);
        setIntElement(term4936, 6, 824341437);
        setIntElement(term4936, 7, -1794965320);
        setIntElement(term4936, 8, 520504102);
        setElement(term4935, 0, term4936);
        setElement(term4935, 1, term4946);
        setIntElement(term4947, 0, -457396133);
        setIntElement(term4947, 1, -1793950607);
        setElement(term4935, 2, term4947);
        setElement(term4935, 3, term4950);
        setIntElement(term4951, 0, 1091954101);
        setIntElement(term4951, 1, 1895143076);
        setIntElement(term4951, 2, 1981860404);
        setIntElement(term4951, 3, 732174235);
        setElement(term4935, 4, term4951);
        setIntElement(term4956, 0, 470895808);
        setIntElement(term4956, 1, 1787325291);
        setIntElement(term4956, 2, 1470349147);
        setIntElement(term4956, 3, -255317272);
        setElement(term4935, 5, term4956);
        setIntElement(term4961, 0, -706253892);
        setIntElement(term4961, 1, -1341439819);
        setIntElement(term4961, 2, -728760750);
        setIntElement(term4961, 3, -1617383807);
        setIntElement(term4961, 4, -1244386281);
        setIntElement(term4961, 5, -885788574);
        setIntElement(term4961, 6, -865722613);
        setIntElement(term4961, 7, -1551355284);
        setElement(term4935, 6, term4961);
        setIntElement(term4970, 0, -1381970335);
        setIntElement(term4970, 1, 1213549815);
        setIntElement(term4970, 2, -1518419301);
        setIntElement(term4970, 3, 674879025);
        setElement(term4935, 7, term4970);
        setField(term4908, term4908.getClass(), "adjList", term4935);
        setIntElement(term4976, 0, -1538936030);
        setIntElement(term4976, 1, -752870423);
        setIntElement(term4976, 2, -1698809299);
        setIntElement(term4976, 3, 401512128);
        setIntElement(term4976, 4, -2069930777);
        setIntElement(term4976, 5, 1543696412);
        setIntElement(term4976, 6, -1385748168);
        setIntElement(term4976, 7, -270592367);
        setIntElement(term4976, 8, 178847646);
        setElement(term4975, 0, term4976);
        setField(term4908, term4908.getClass(), "adjPos", term4975);
        setDoubleElement(term4986, 0, 0.03234340029222138);
        setDoubleElement(term4986, 1, 0.19671648397453156);
        setField(term4908, term4908.getClass(), "vertexWeight", term4986);
        setIntField(term4908, term4908.getClass(), "vertexDataSize", 1);
        setDoubleElement(term4992, 0, 0.30660613136199666);
        setElement(term4991, 0, term4992);
        setDoubleElement(term4994, 0, 0.6717352294199702);
        setDoubleElement(term4994, 1, 0.24939968658916778);
        setDoubleElement(term4994, 2, 0.039913942834409855);
        setDoubleElement(term4994, 3, 0.5454459427467968);
        setElement(term4991, 1, term4994);
        setElement(term4990, 0, term4991);
        setField(term4908, term4908.getClass(), "edgeData", term4990);
        setIntField(term4908, term4908.getClass(), "edgeDataSize", 1);
        setElement(term5000, 0, term5001);
        setField(term4908, term4908.getClass(), "vertexLabel", term5000);
        setElement(term5002, 0, term5003);
        setElement(term5004, 0, term5005);
        setElement(term5004, 1, term5006);
        setElement(term5004, 2, term5007);
        setElement(term5002, 1, term5004);
        setElement(term5008, 0, term5009);
        setElement(term5008, 1, term5010);
        setElement(term5008, 2, term5011);
        setElement(term5008, 3, term5012);
        setElement(term5008, 4, term5013);
        setElement(term5008, 5, term5014);
        setElement(term5002, 2, term5008);
        setElement(term5015, 0, term5012);
        setElement(term5015, 1, term5013);
        setElement(term5015, 2, term5001);
        setElement(term5015, 3, term5010);
        setElement(term5002, 3, term5015);
        setField(term4908, term4908.getClass(), "edgeLabel", term5002);
        setField(term4908, term4908.getClass(), "vertexIndex", null);
        setField(term4908, term4908.getClass(), "adjSet", term5016);
        setField(term4908, term4908.getClass(), "adjMap", term5017);
        setField(term4908, term4908.getClass(), "maxVertexNumber", term5018);
        setField(term4908, term4908.getClass(), "labelVertexMap", term5020);
        setField(term4908, term4908.getClass(), "labelEdgeMap", term5025);
        setBooleanField(term4908, term4908.getClass(), "directed", true);
        setBooleanField(term4908, term4908.getClass(), "allowingMultipleEdges", false);
        setBooleanField(term4908, term4908.getClass(), "allowingSelfLoops", true);
        setIntField(term4908, term4908.getClass(), "avgDegree", 273590437);
        setBooleanField(term4908, term4908.getClass(), "safeMode", true);
        term5035 = new Integer(-348612876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5035;
        callMethod(klass, "setEdgeDataSize", argTypes, term4908, args);
    }

};


