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
     Object term180375;

    public GraphBuilder_buildDigraph_172619701426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180377 = new ArrayList();
        HashMap term180381 = new HashMap();
        HashMap term180386 = new HashMap();
        Integer term180391 = new Integer(-838848221);
        Long term180393 = new Long(6855071767938501807L);
        Integer term180395 = new Integer(1163761623);
        Double term180397 = new Double(0.3075544266401189);
        ArrayList term180416 = new ArrayList();
        ArrayList term180420 = new ArrayList();
        ArrayList term180424 = new ArrayList();
        ArrayList term180428 = new ArrayList();
        term180375 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180376 = (int[]) newIntArray(0);
        setField(term180375, term180375.getClass(), "vertices", term180376);
        setField(term180375, term180375.getClass(), "dynamicVertices", term180377);
        setField(term180375, term180375.getClass(), "vertexLabelMap", term180381);
        setField(term180375, term180375.getClass(), "vertexWeightMap", term180386);
        setField(term180375, term180375.getClass(), "maxVertices", term180391);
        setField(term180375, term180375.getClass(), "numEdges", term180393);
        setField(term180375, term180375.getClass(), "avgDegree", term180395);
        setField(term180375, term180375.getClass(), "density", term180397);
        setBooleanField(term180375, term180375.getClass(), "directed", false);
        setBooleanField(term180375, term180375.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180375, term180375.getClass(), "allowingMultiEdges", true);
        setIntField(term180375, term180375.getClass(), "vertexDataSize", 1);
        setIntField(term180375, term180375.getClass(), "edgeDataSize", 1);
        setField(term180375, term180375.getClass(), "name", "xjoSGPWUgu");
        setField(term180375, term180375.getClass(), "edges", term180416);
        setField(term180375, term180375.getClass(), "paths", term180420);
        setField(term180375, term180375.getClass(), "cycles", term180424);
        setField(term180375, term180375.getClass(), "cliques", term180428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildDigraph", argTypes, term180375, args);
    }

};


