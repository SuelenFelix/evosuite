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
     Object term180511;

    public GraphBuilder_buildDirectedMultigraph_7813173828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180515 = new ArrayList();
        HashMap term180519 = new HashMap();
        HashMap term180524 = new HashMap();
        Integer term180529 = new Integer(-124088550);
        Long term180531 = new Long(5262507301787091109L);
        Integer term180533 = new Integer(777492093);
        Double term180535 = new Double(0.9741325890186254);
        ArrayList term180554 = new ArrayList();
        ArrayList term180558 = new ArrayList();
        ArrayList term180562 = new ArrayList();
        ArrayList term180566 = new ArrayList();
        term180511 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180512 = (int[]) newIntArray(2);
        setIntElement(term180512, 0, -1088856216);
        setIntElement(term180512, 1, 1484656499);
        setField(term180511, term180511.getClass(), "vertices", term180512);
        setField(term180511, term180511.getClass(), "dynamicVertices", term180515);
        setField(term180511, term180511.getClass(), "vertexLabelMap", term180519);
        setField(term180511, term180511.getClass(), "vertexWeightMap", term180524);
        setField(term180511, term180511.getClass(), "maxVertices", term180529);
        setField(term180511, term180511.getClass(), "numEdges", term180531);
        setField(term180511, term180511.getClass(), "avgDegree", term180533);
        setField(term180511, term180511.getClass(), "density", term180535);
        setBooleanField(term180511, term180511.getClass(), "directed", false);
        setBooleanField(term180511, term180511.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180511, term180511.getClass(), "allowingMultiEdges", true);
        setIntField(term180511, term180511.getClass(), "vertexDataSize", 1);
        setIntField(term180511, term180511.getClass(), "edgeDataSize", 1);
        setField(term180511, term180511.getClass(), "name", "xeyjTOCOJb");
        setField(term180511, term180511.getClass(), "edges", term180554);
        setField(term180511, term180511.getClass(), "paths", term180558);
        setField(term180511, term180511.getClass(), "cycles", term180562);
        setField(term180511, term180511.getClass(), "cliques", term180566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildDirectedMultigraph", argTypes, term180511, args);
    }

};


