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

public class GraphBuilder_buildDigraph_172619701426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180364;

    public GraphBuilder_buildDigraph_172619701426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180366 = new ArrayList();
        HashMap term180370 = new HashMap();
        HashMap term180375 = new HashMap();
        Integer term180380 = new Integer(-838848221);
        Long term180382 = new Long(6855071767938501807L);
        Integer term180384 = new Integer(1163761623);
        Double term180386 = new Double(0.3075544266401189);
        ArrayList term180405 = new ArrayList();
        ArrayList term180409 = new ArrayList();
        ArrayList term180413 = new ArrayList();
        ArrayList term180417 = new ArrayList();
        term180364 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180365 = (int[]) newIntArray(0);
        setField(term180364, term180364.getClass(), "vertices", term180365);
        setField(term180364, term180364.getClass(), "dynamicVertices", term180366);
        setField(term180364, term180364.getClass(), "vertexLabelMap", term180370);
        setField(term180364, term180364.getClass(), "vertexWeightMap", term180375);
        setField(term180364, term180364.getClass(), "maxVertices", term180380);
        setField(term180364, term180364.getClass(), "numEdges", term180382);
        setField(term180364, term180364.getClass(), "avgDegree", term180384);
        setField(term180364, term180364.getClass(), "density", term180386);
        setBooleanField(term180364, term180364.getClass(), "directed", false);
        setBooleanField(term180364, term180364.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180364, term180364.getClass(), "allowingMultiEdges", true);
        setIntField(term180364, term180364.getClass(), "vertexDataSize", 1);
        setIntField(term180364, term180364.getClass(), "edgeDataSize", 1);
        setField(term180364, term180364.getClass(), "name", "xjoSGPWUgu");
        setField(term180364, term180364.getClass(), "edges", term180405);
        setField(term180364, term180364.getClass(), "paths", term180409);
        setField(term180364, term180364.getClass(), "cycles", term180413);
        setField(term180364, term180364.getClass(), "cliques", term180417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildDigraph", argTypes, term180364, args);
    }

};


