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
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;

public class GraphBuilder_buildDirectedMultigraph_7813173828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180500;

    public GraphBuilder_buildDirectedMultigraph_7813173828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180504 = new ArrayList();
        HashMap term180508 = new HashMap();
        HashMap term180513 = new HashMap();
        Integer term180518 = new Integer(-124088550);
        Long term180520 = new Long(5262507301787091109L);
        Integer term180522 = new Integer(777492093);
        Double term180524 = new Double(0.9741325890186254);
        ArrayList term180543 = new ArrayList();
        ArrayList term180547 = new ArrayList();
        ArrayList term180551 = new ArrayList();
        ArrayList term180555 = new ArrayList();
        term180500 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180501 = (int[]) newIntArray(2);
        setIntElement(term180501, 0, -1088856216);
        setIntElement(term180501, 1, 1484656499);
        setField(term180500, term180500.getClass(), "vertices", term180501);
        setField(term180500, term180500.getClass(), "dynamicVertices", term180504);
        setField(term180500, term180500.getClass(), "vertexLabelMap", term180508);
        setField(term180500, term180500.getClass(), "vertexWeightMap", term180513);
        setField(term180500, term180500.getClass(), "maxVertices", term180518);
        setField(term180500, term180500.getClass(), "numEdges", term180520);
        setField(term180500, term180500.getClass(), "avgDegree", term180522);
        setField(term180500, term180500.getClass(), "density", term180524);
        setBooleanField(term180500, term180500.getClass(), "directed", false);
        setBooleanField(term180500, term180500.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180500, term180500.getClass(), "allowingMultiEdges", true);
        setIntField(term180500, term180500.getClass(), "vertexDataSize", 1);
        setIntField(term180500, term180500.getClass(), "edgeDataSize", 1);
        setField(term180500, term180500.getClass(), "name", "xeyjTOCOJb");
        setField(term180500, term180500.getClass(), "edges", term180543);
        setField(term180500, term180500.getClass(), "paths", term180547);
        setField(term180500, term180500.getClass(), "cycles", term180551);
        setField(term180500, term180500.getClass(), "cliques", term180555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildDirectedMultigraph", argTypes, term180500, args);
    }

};


