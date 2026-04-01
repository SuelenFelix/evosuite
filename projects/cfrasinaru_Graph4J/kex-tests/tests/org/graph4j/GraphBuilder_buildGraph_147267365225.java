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

public class GraphBuilder_buildGraph_147267365225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180297;

    public GraphBuilder_buildGraph_147267365225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180299 = new ArrayList();
        HashMap term180303 = new HashMap();
        HashMap term180308 = new HashMap();
        Integer term180313 = new Integer(-348612876);
        Long term180315 = new Long(2120084523938730454L);
        Integer term180317 = new Integer(1302807565);
        Double term180319 = new Double(0.5590560519342122);
        ArrayList term180338 = new ArrayList();
        ArrayList term180342 = new ArrayList();
        ArrayList term180346 = new ArrayList();
        ArrayList term180350 = new ArrayList();
        term180297 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term180298 = (int[]) newIntArray(0);
        setField(term180297, term180297.getClass(), "vertices", term180298);
        setField(term180297, term180297.getClass(), "dynamicVertices", term180299);
        setField(term180297, term180297.getClass(), "vertexLabelMap", term180303);
        setField(term180297, term180297.getClass(), "vertexWeightMap", term180308);
        setField(term180297, term180297.getClass(), "maxVertices", term180313);
        setField(term180297, term180297.getClass(), "numEdges", term180315);
        setField(term180297, term180297.getClass(), "avgDegree", term180317);
        setField(term180297, term180297.getClass(), "density", term180319);
        setBooleanField(term180297, term180297.getClass(), "directed", true);
        setBooleanField(term180297, term180297.getClass(), "allowingSelfLoops", false);
        setBooleanField(term180297, term180297.getClass(), "allowingMultiEdges", true);
        setIntField(term180297, term180297.getClass(), "vertexDataSize", 1);
        setIntField(term180297, term180297.getClass(), "edgeDataSize", 1);
        setField(term180297, term180297.getClass(), "name", "cmuaUiHMVL");
        setField(term180297, term180297.getClass(), "edges", term180338);
        setField(term180297, term180297.getClass(), "paths", term180342);
        setField(term180297, term180297.getClass(), "cycles", term180346);
        setField(term180297, term180297.getClass(), "cliques", term180350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildGraph", argTypes, term180297, args);
    }

};


