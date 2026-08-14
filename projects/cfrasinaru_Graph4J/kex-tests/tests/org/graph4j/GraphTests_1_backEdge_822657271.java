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
import java.lang.Object;

public class GraphTests_1_backEdge_822657271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79048;
     Object term79049;
     Object term79074;

    public GraphTests_1_backEdge_822657271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79048 = newInstance(Class.forName("org.graph4j.GraphTests$1"));
        term79049 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79054 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79059 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79064 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79069 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term79049, term79049.getClass(), "component", -1584130001);
        setIntField(term79049, term79049.getClass(), "vertex", -1669995376);
        setIntField(term79049, term79049.getClass(), "level", -684090418);
        setIntField(term79049, term79049.getClass(), "order", 248781931);
        setIntField(term79054, term79054.getClass(), "component", 1444890082);
        setIntField(term79054, term79054.getClass(), "vertex", -463625508);
        setIntField(term79054, term79054.getClass(), "level", 86106790);
        setIntField(term79054, term79054.getClass(), "order", -1239672206);
        setIntField(term79059, term79059.getClass(), "component", -909873191);
        setIntField(term79059, term79059.getClass(), "vertex", -17106495);
        setIntField(term79059, term79059.getClass(), "level", -1205540932);
        setIntField(term79059, term79059.getClass(), "order", -1477355747);
        setIntField(term79064, term79064.getClass(), "component", -1041405094);
        setIntField(term79064, term79064.getClass(), "vertex", -2004362129);
        setIntField(term79064, term79064.getClass(), "level", 1709267900);
        setIntField(term79064, term79064.getClass(), "order", -2036597343);
        setIntField(term79069, term79069.getClass(), "component", -988488193);
        setIntField(term79069, term79069.getClass(), "vertex", -910318730);
        setIntField(term79069, term79069.getClass(), "level", -1198085025);
        setIntField(term79069, term79069.getClass(), "order", -1420655161);
        setField(term79069, term79069.getClass(), "parent", null);
        setField(term79064, term79064.getClass(), "parent", term79069);
        setField(term79059, term79059.getClass(), "parent", term79064);
        setField(term79054, term79054.getClass(), "parent", term79059);
        setField(term79049, term79049.getClass(), "parent", term79054);
        term79074 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79079 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79084 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79089 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79094 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term79074, term79074.getClass(), "component", -415161512);
        setIntField(term79074, term79074.getClass(), "vertex", -638764759);
        setIntField(term79074, term79074.getClass(), "level", -1643368171);
        setIntField(term79074, term79074.getClass(), "order", 1904125756);
        setIntField(term79079, term79079.getClass(), "component", -174814025);
        setIntField(term79079, term79079.getClass(), "vertex", 958303322);
        setIntField(term79079, term79079.getClass(), "level", 1228479658);
        setIntField(term79079, term79079.getClass(), "order", 129520433);
        setIntField(term79084, term79084.getClass(), "component", 390437953);
        setIntField(term79084, term79084.getClass(), "vertex", -1928220499);
        setIntField(term79084, term79084.getClass(), "level", 1701541391);
        setIntField(term79084, term79084.getClass(), "order", -936192688);
        setIntField(term79089, term79089.getClass(), "component", 938944057);
        setIntField(term79089, term79089.getClass(), "vertex", 855364273);
        setIntField(term79089, term79089.getClass(), "level", -519539376);
        setIntField(term79089, term79089.getClass(), "order", -651264831);
        setIntField(term79094, term79094.getClass(), "component", 801845409);
        setIntField(term79094, term79094.getClass(), "vertex", -638292583);
        setIntField(term79094, term79094.getClass(), "level", -1507192014);
        setIntField(term79094, term79094.getClass(), "order", -444046395);
        setField(term79094, term79094.getClass(), "parent", null);
        setField(term79089, term79089.getClass(), "parent", term79094);
        setField(term79084, term79084.getClass(), "parent", term79089);
        setField(term79079, term79079.getClass(), "parent", term79084);
        setField(term79074, term79074.getClass(), "parent", term79079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphTests$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term79049;
        args[1] = term79074;
        callMethod(klass, "backEdge", argTypes, term79048, args);
    }

};


