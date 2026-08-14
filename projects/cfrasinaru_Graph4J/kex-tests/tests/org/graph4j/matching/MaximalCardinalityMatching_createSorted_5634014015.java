package org.graph4j.matching;

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
import static org.graph4j.matching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Double;

public class MaximalCardinalityMatching_createSorted_5634014015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1228;
     Object term1247;

    public MaximalCardinalityMatching_createSorted_5634014015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1229 = new Boolean(false);
        HashMap term1240 = new HashMap();
        Set<Object> term1292 =  ((Map) term1240).keySet();
        HashSet term1239 = new HashSet((Collection<? extends Object>) term1292);
        term1228 = newInstance(Class.forName("org.graph4j.matching.MaximalCardinalityMatching"));
        Object term1231 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term1232 = (int[]) newIntArray(5);
        setField(term1228, term1228.getClass(), "random", term1229);
        setField(term1228, term1228.getClass(), "comparator", null);
        setField(term1231, term1231.getClass(), "graph", null);
        setIntElement(term1232, 0, -516303035);
        setIntElement(term1232, 1, -2143043890);
        setIntElement(term1232, 2, -2138825831);
        setIntElement(term1232, 3, 1454781562);
        setIntElement(term1232, 4, -27944011);
        setField(term1231, term1231.getClass(), "mates", term1232);
        setIntField(term1231, term1231.getClass(), "size", -20614472);
        setField(term1231, term1231.getClass(), "edges", term1239);
        setField(term1228, term1228.getClass(), "matching", term1231);
        setField(term1228, term1228.getClass(), "graph", null);
        setBooleanField(term1228, term1228.getClass(), "directed", true);
        Double term1253 = new Double(0.23070800524236523);
        Double term1260 = new Double(0.4337266793917268);
        Double term1262 = new Double(0.11979392765421404);
        Double term1264 = new Double(0.4555542221910589);
        Double term1266 = new Double(0.9938727080758785);
        Double term1268 = new Double(0.39416780533640805);
        Double term1270 = new Double(0.5384156574050297);
        Double term1272 = new Double(0.28813953022653416);
        Double term1274 = new Double(0.6221715730666386);
        Double term1276 = new Double(0.6375926466054153);
        Double term1283 = new Double(0.6933516214415875);
        Double term1285 = new Double(0.7039847711405768);
        term1247 = (Object[]) newArray("org.graph4j.Edge", 3);
        Object term1248 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1252 = (Object[]) newArray("java.lang.Double", 1);
        Object term1255 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1259 = (Object[]) newArray("java.lang.Double", 9);
        Object term1278 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1282 = (Object[]) newArray("java.lang.Double", 2);
        setBooleanField(term1248, term1248.getClass(), "directed", true);
        setIntField(term1248, term1248.getClass(), "source", -1114668574);
        setIntField(term1248, term1248.getClass(), "target", 514511037);
        setElement(term1252, 0, term1253);
        setField(term1248, term1248.getClass(), "data", term1252);
        setField(term1248, term1248.getClass(), "label", null);
        setElement(term1247, 0, term1248);
        setBooleanField(term1255, term1255.getClass(), "directed", false);
        setIntField(term1255, term1255.getClass(), "source", 1713573821);
        setIntField(term1255, term1255.getClass(), "target", 1956590498);
        setElement(term1259, 0, term1260);
        setElement(term1259, 1, term1262);
        setElement(term1259, 2, term1264);
        setElement(term1259, 3, term1266);
        setElement(term1259, 4, term1268);
        setElement(term1259, 5, term1270);
        setElement(term1259, 6, term1272);
        setElement(term1259, 7, term1274);
        setElement(term1259, 8, term1276);
        setField(term1255, term1255.getClass(), "data", term1259);
        setField(term1255, term1255.getClass(), "label", null);
        setElement(term1247, 1, term1255);
        setBooleanField(term1278, term1278.getClass(), "directed", false);
        setIntField(term1278, term1278.getClass(), "source", 1467356494);
        setIntField(term1278, term1278.getClass(), "target", -26316536);
        setElement(term1282, 0, term1283);
        setElement(term1282, 1, term1285);
        setField(term1278, term1278.getClass(), "data", term1282);
        setField(term1278, term1278.getClass(), "label", null);
        setElement(term1247, 2, term1278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.matching.MaximalCardinalityMatching");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1247;
        callMethod(klass, "createSorted", argTypes, term1228, args);
    }

};


