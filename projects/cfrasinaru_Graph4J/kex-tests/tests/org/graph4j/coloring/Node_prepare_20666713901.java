package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_prepare_20666713901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public Node_prepare_20666713901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term277 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term280 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term283 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term286 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term292 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term294 = (Object[]) newArray("org.graph4j.util.Domain", 1);
        Object term295 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term301 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term303 = (Object[]) newArray("org.graph4j.util.Domain", 9);
        Object term304 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term307 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term310 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term313 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term316 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term319 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term322 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term328 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term330 = (Object[]) newArray("org.graph4j.util.Domain", 3);
        Object term331 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term337 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term339 = (Object[]) newArray("org.graph4j.util.Domain", 5);
        Object term340 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setField(term274, term274.getClass(), "alg", null);
        setIntField(term274, term274.getClass(), "vertex", -1476117762);
        setIntField(term274, term274.getClass(), "color", -341962980);
        setField(term277, term277.getClass(), "alg", null);
        setIntField(term277, term277.getClass(), "vertex", 1532716628);
        setIntField(term277, term277.getClass(), "color", -1801760683);
        setField(term280, term280.getClass(), "alg", null);
        setIntField(term280, term280.getClass(), "vertex", 1141317871);
        setIntField(term280, term280.getClass(), "color", 890669485);
        setField(term283, term283.getClass(), "alg", null);
        setIntField(term283, term283.getClass(), "vertex", 691577392);
        setIntField(term283, term283.getClass(), "color", -893623680);
        setField(term286, term286.getClass(), "alg", null);
        setIntField(term286, term286.getClass(), "vertex", -1963434938);
        setIntField(term286, term286.getClass(), "color", 906181092);
        setField(term286, term286.getClass(), "parent", null);
        setField(term286, term286.getClass(), "coloring", null);
        setField(term286, term286.getClass(), "domains", null);
        setField(term286, term286.getClass(), "minDomain", null);
        setBooleanField(term286, term286.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term286, term286.getClass(), "propagator", true);
        setBooleanField(term286, term286.getClass(), "failed", true);
        setField(term283, term283.getClass(), "parent", term286);
        setField(term292, term292.getClass(), "graph", null);
        setField(term292, term292.getClass(), "vertexColor", null);
        setIntField(term292, term292.getClass(), "numColoredVertices", 0);
        setField(term292, term292.getClass(), "usedColors", null);
        setField(term292, term292.getClass(), "colorMap", null);
        setField(term283, term283.getClass(), "coloring", term292);
        setField(term283, term283.getClass(), "domains", term294);
        setIntField(term295, term295.getClass(), "vertex", 0);
        setField(term295, term295.getClass(), "values", null);
        setField(term295, term295.getClass(), "positions", null);
        setIntField(term295, term295.getClass(), "size", 0);
        setField(term283, term283.getClass(), "minDomain", term295);
        setBooleanField(term283, term283.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term283, term283.getClass(), "propagator", true);
        setBooleanField(term283, term283.getClass(), "failed", true);
        setField(term280, term280.getClass(), "parent", term283);
        setField(term301, term301.getClass(), "graph", null);
        setField(term301, term301.getClass(), "vertexColor", null);
        setIntField(term301, term301.getClass(), "numColoredVertices", 0);
        setField(term301, term301.getClass(), "usedColors", null);
        setField(term301, term301.getClass(), "colorMap", null);
        setField(term280, term280.getClass(), "coloring", term301);
        setIntField(term304, term304.getClass(), "vertex", 0);
        setField(term304, term304.getClass(), "values", null);
        setField(term304, term304.getClass(), "positions", null);
        setIntField(term304, term304.getClass(), "size", 0);
        setElement(term303, 0, term304);
        setIntField(term307, term307.getClass(), "vertex", 0);
        setField(term307, term307.getClass(), "values", null);
        setField(term307, term307.getClass(), "positions", null);
        setIntField(term307, term307.getClass(), "size", 0);
        setElement(term303, 1, term307);
        setIntField(term310, term310.getClass(), "vertex", 0);
        setField(term310, term310.getClass(), "values", null);
        setField(term310, term310.getClass(), "positions", null);
        setIntField(term310, term310.getClass(), "size", 0);
        setElement(term303, 2, term310);
        setIntField(term313, term313.getClass(), "vertex", 0);
        setField(term313, term313.getClass(), "values", null);
        setField(term313, term313.getClass(), "positions", null);
        setIntField(term313, term313.getClass(), "size", 0);
        setElement(term303, 3, term313);
        setIntField(term316, term316.getClass(), "vertex", 0);
        setField(term316, term316.getClass(), "values", null);
        setField(term316, term316.getClass(), "positions", null);
        setIntField(term316, term316.getClass(), "size", 0);
        setElement(term303, 4, term316);
        setElement(term303, 5, term310);
        setElement(term303, 6, term313);
        setIntField(term319, term319.getClass(), "vertex", 0);
        setField(term319, term319.getClass(), "values", null);
        setField(term319, term319.getClass(), "positions", null);
        setIntField(term319, term319.getClass(), "size", 0);
        setElement(term303, 7, term319);
        setElement(term303, 8, term304);
        setField(term280, term280.getClass(), "domains", term303);
        setIntField(term322, term322.getClass(), "vertex", 0);
        setField(term322, term322.getClass(), "values", null);
        setField(term322, term322.getClass(), "positions", null);
        setIntField(term322, term322.getClass(), "size", 0);
        setField(term280, term280.getClass(), "minDomain", term322);
        setBooleanField(term280, term280.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term280, term280.getClass(), "propagator", true);
        setBooleanField(term280, term280.getClass(), "failed", true);
        setField(term277, term277.getClass(), "parent", term280);
        setField(term328, term328.getClass(), "graph", null);
        setField(term328, term328.getClass(), "vertexColor", null);
        setIntField(term328, term328.getClass(), "numColoredVertices", 0);
        setField(term328, term328.getClass(), "usedColors", null);
        setField(term328, term328.getClass(), "colorMap", null);
        setField(term277, term277.getClass(), "coloring", term328);
        setIntField(term331, term331.getClass(), "vertex", 0);
        setField(term331, term331.getClass(), "values", null);
        setField(term331, term331.getClass(), "positions", null);
        setIntField(term331, term331.getClass(), "size", 0);
        setElement(term330, 0, term331);
        setElement(term330, 1, term331);
        setElement(term330, 2, term316);
        setField(term277, term277.getClass(), "domains", term330);
        setField(term277, term277.getClass(), "minDomain", term310);
        setBooleanField(term277, term277.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term277, term277.getClass(), "propagator", true);
        setBooleanField(term277, term277.getClass(), "failed", false);
        setField(term274, term274.getClass(), "parent", term277);
        setField(term337, term337.getClass(), "graph", null);
        setField(term337, term337.getClass(), "vertexColor", null);
        setIntField(term337, term337.getClass(), "numColoredVertices", 0);
        setField(term337, term337.getClass(), "usedColors", null);
        setField(term337, term337.getClass(), "colorMap", null);
        setField(term274, term274.getClass(), "coloring", term337);
        setElement(term339, 0, term310);
        setElement(term339, 1, term295);
        setElement(term339, 2, term316);
        setElement(term339, 3, term310);
        setElement(term339, 4, term304);
        setField(term274, term274.getClass(), "domains", term339);
        setIntField(term340, term340.getClass(), "vertex", 0);
        setField(term340, term340.getClass(), "values", null);
        setField(term340, term340.getClass(), "positions", null);
        setIntField(term340, term340.getClass(), "size", 0);
        setField(term274, term274.getClass(), "minDomain", term340);
        setBooleanField(term274, term274.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term274, term274.getClass(), "propagator", false);
        setBooleanField(term274, term274.getClass(), "failed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prepare", argTypes, term274, args);
    }

};


