package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class JohnsonShortestPath_compute_17517525447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71237;
     Object term71270;

    public JohnsonShortestPath_compute_17517525447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71237 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term71238 = (double[]) newDoubleArray(8);
        Object[] term71247 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 6);
        Object[] term71248 = (Object[]) newArray("[D", 4);
        double[] term71249 = (double[]) newDoubleArray(4);
        double[] term71254 = (double[]) newDoubleArray(9);
        double[] term71264 = (double[]) newDoubleArray(1);
        double[] term71266 = (double[]) newDoubleArray(2);
        setField(term71237, term71237.getClass(), "auxGraph", null);
        setDoubleElement(term71238, 0, 0.43541921133408534);
        setDoubleElement(term71238, 1, 0.12184752254774556);
        setDoubleElement(term71238, 2, 0.33537271252005063);
        setDoubleElement(term71238, 3, 0.8876155338157564);
        setDoubleElement(term71238, 4, 0.4584734712349676);
        setDoubleElement(term71238, 5, 0.5123870773486777);
        setDoubleElement(term71238, 6, 0.9768956625875892);
        setDoubleElement(term71238, 7, 0.034284905782548614);
        setField(term71237, term71237.getClass(), "h", term71238);
        setField(term71237, term71237.getClass(), "algs", term71247);
        setDoubleElement(term71249, 0, 0.39688185784741115);
        setDoubleElement(term71249, 1, 0.04528510649671047);
        setDoubleElement(term71249, 2, 0.3988239277643454);
        setDoubleElement(term71249, 3, 0.7236698511243649);
        setElement(term71248, 0, term71249);
        setDoubleElement(term71254, 0, 0.08757822992011322);
        setDoubleElement(term71254, 1, 0.10960593483343495);
        setDoubleElement(term71254, 2, 0.8919766505971615);
        setDoubleElement(term71254, 3, 0.9561355550991962);
        setDoubleElement(term71254, 4, 0.15604156631976762);
        setDoubleElement(term71254, 5, 0.9403681601733156);
        setDoubleElement(term71254, 6, 0.3854530749131764);
        setDoubleElement(term71254, 7, 0.5901472423236452);
        setDoubleElement(term71254, 8, 0.4531060269640679);
        setElement(term71248, 1, term71254);
        setDoubleElement(term71264, 0, 0.15450083774173307);
        setElement(term71248, 2, term71264);
        setDoubleElement(term71266, 0, 0.7070188458950907);
        setDoubleElement(term71266, 1, 0.709466507100044);
        setElement(term71248, 3, term71266);
        setField(term71237, term71237.getClass(), "weights", term71248);
        setField(term71237, term71237.getClass(), "graph", null);
        setBooleanField(term71237, term71237.getClass(), "directed", false);
        term71270 = new Integer(-1003288946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71270;
        callMethod(klass, "compute", argTypes, term71237, args);
    }

};


