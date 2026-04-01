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

public class NetworkBuilder_named_208044065110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64864;

    public NetworkBuilder_named_208044065110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term64877 = new ArrayList();
        HashMap term64881 = new HashMap();
        HashMap term64886 = new HashMap();
        Integer term64891 = new Integer(1296895584);
        Long term64893 = new Long(6375119433582206027L);
        Integer term64895 = new Integer(628918458);
        Double term64897 = new Double(0.1713603524061028);
        ArrayList term64916 = new ArrayList();
        ArrayList term64920 = new ArrayList();
        ArrayList term64924 = new ArrayList();
        ArrayList term64928 = new ArrayList();
        term64864 = newInstance(Class.forName("org.graph4j.NetworkBuilder"));
        int[] term64867 = (int[]) newIntArray(9);
        setIntField(term64864, term64864.getClass(), "source", -1);
        setIntField(term64864, term64864.getClass(), "sink", -1);
        setIntElement(term64867, 0, -1014439536);
        setIntElement(term64867, 1, 476298983);
        setIntElement(term64867, 2, 271979703);
        setIntElement(term64867, 3, -191087684);
        setIntElement(term64867, 4, -776090822);
        setIntElement(term64867, 5, -179776820);
        setIntElement(term64867, 6, -477105508);
        setIntElement(term64867, 7, -1964032020);
        setIntElement(term64867, 8, -1625554081);
        setField(term64864, term64864.getClass(), "vertices", term64867);
        setField(term64864, term64864.getClass(), "dynamicVertices", term64877);
        setField(term64864, term64864.getClass(), "vertexLabelMap", term64881);
        setField(term64864, term64864.getClass(), "vertexWeightMap", term64886);
        setField(term64864, term64864.getClass(), "maxVertices", term64891);
        setField(term64864, term64864.getClass(), "numEdges", term64893);
        setField(term64864, term64864.getClass(), "avgDegree", term64895);
        setField(term64864, term64864.getClass(), "density", term64897);
        setBooleanField(term64864, term64864.getClass(), "directed", false);
        setBooleanField(term64864, term64864.getClass(), "allowingSelfLoops", true);
        setBooleanField(term64864, term64864.getClass(), "allowingMultiEdges", false);
        setIntField(term64864, term64864.getClass(), "vertexDataSize", 1);
        setIntField(term64864, term64864.getClass(), "edgeDataSize", 3);
        setField(term64864, term64864.getClass(), "name", "WVbxuoDBcn");
        setField(term64864, term64864.getClass(), "edges", term64916);
        setField(term64864, term64864.getClass(), "paths", term64920);
        setField(term64864, term64864.getClass(), "cycles", term64924);
        setField(term64864, term64864.getClass(), "cliques", term64928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pvDEABOxLt";
        callMethod(klass, "named", argTypes, term64864, args);
    }

};


