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

public class GraphBuilder_estimatedNumVertices_180727423614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179395;
     Object term179458;

    public GraphBuilder_estimatedNumVertices_180727423614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179403 = new ArrayList();
        HashMap term179407 = new HashMap();
        HashMap term179412 = new HashMap();
        Integer term179417 = new Integer(-706253892);
        Long term179419 = new Long(-6573104506744284592L);
        Integer term179421 = new Integer(-1341439819);
        Double term179423 = new Double(0.4163626523414238);
        ArrayList term179442 = new ArrayList();
        ArrayList term179446 = new ArrayList();
        ArrayList term179450 = new ArrayList();
        ArrayList term179454 = new ArrayList();
        term179395 = newInstance(Class.forName("org.graph4j.GraphBuilder"));
        int[] term179396 = (int[]) newIntArray(6);
        setIntElement(term179396, 0, 2628487);
        setIntElement(term179396, 1, 2017254700);
        setIntElement(term179396, 2, -364549983);
        setIntElement(term179396, 3, 510496582);
        setIntElement(term179396, 4, 1873439169);
        setIntElement(term179396, 5, 416754733);
        setField(term179395, term179395.getClass(), "vertices", term179396);
        setField(term179395, term179395.getClass(), "dynamicVertices", term179403);
        setField(term179395, term179395.getClass(), "vertexLabelMap", term179407);
        setField(term179395, term179395.getClass(), "vertexWeightMap", term179412);
        setField(term179395, term179395.getClass(), "maxVertices", term179417);
        setField(term179395, term179395.getClass(), "numEdges", term179419);
        setField(term179395, term179395.getClass(), "avgDegree", term179421);
        setField(term179395, term179395.getClass(), "density", term179423);
        setBooleanField(term179395, term179395.getClass(), "directed", false);
        setBooleanField(term179395, term179395.getClass(), "allowingSelfLoops", false);
        setBooleanField(term179395, term179395.getClass(), "allowingMultiEdges", false);
        setIntField(term179395, term179395.getClass(), "vertexDataSize", 1);
        setIntField(term179395, term179395.getClass(), "edgeDataSize", 1);
        setField(term179395, term179395.getClass(), "name", "rsumfoDNHa");
        setField(term179395, term179395.getClass(), "edges", term179442);
        setField(term179395, term179395.getClass(), "paths", term179446);
        setField(term179395, term179395.getClass(), "cycles", term179450);
        setField(term179395, term179395.getClass(), "cliques", term179454);
        term179458 = new Integer(-699653689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179458;
        callMethod(klass, "estimatedNumVertices", argTypes, term179395, args);
    }

};


