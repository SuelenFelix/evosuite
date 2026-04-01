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
     Object term79045;
     Object term79046;
     Object term79071;

    public GraphTests_1_backEdge_822657271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79045 = newInstance(Class.forName("org.graph4j.GraphTests$1"));
        term79046 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79051 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79056 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79061 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79066 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term79046, term79046.getClass(), "component", -1584130001);
        setIntField(term79046, term79046.getClass(), "vertex", -1669995376);
        setIntField(term79046, term79046.getClass(), "level", -684090418);
        setIntField(term79046, term79046.getClass(), "order", 248781931);
        setIntField(term79051, term79051.getClass(), "component", 1444890082);
        setIntField(term79051, term79051.getClass(), "vertex", -463625508);
        setIntField(term79051, term79051.getClass(), "level", 86106790);
        setIntField(term79051, term79051.getClass(), "order", -1239672206);
        setIntField(term79056, term79056.getClass(), "component", -909873191);
        setIntField(term79056, term79056.getClass(), "vertex", -17106495);
        setIntField(term79056, term79056.getClass(), "level", -1205540932);
        setIntField(term79056, term79056.getClass(), "order", -1477355747);
        setIntField(term79061, term79061.getClass(), "component", -1041405094);
        setIntField(term79061, term79061.getClass(), "vertex", -2004362129);
        setIntField(term79061, term79061.getClass(), "level", 1709267900);
        setIntField(term79061, term79061.getClass(), "order", -2036597343);
        setIntField(term79066, term79066.getClass(), "component", -988488193);
        setIntField(term79066, term79066.getClass(), "vertex", -910318730);
        setIntField(term79066, term79066.getClass(), "level", -1198085025);
        setIntField(term79066, term79066.getClass(), "order", -1420655161);
        setField(term79066, term79066.getClass(), "parent", null);
        setField(term79061, term79061.getClass(), "parent", term79066);
        setField(term79056, term79056.getClass(), "parent", term79061);
        setField(term79051, term79051.getClass(), "parent", term79056);
        setField(term79046, term79046.getClass(), "parent", term79051);
        term79071 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79076 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79081 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79086 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term79091 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term79071, term79071.getClass(), "component", -415161512);
        setIntField(term79071, term79071.getClass(), "vertex", -638764759);
        setIntField(term79071, term79071.getClass(), "level", -1643368171);
        setIntField(term79071, term79071.getClass(), "order", 1904125756);
        setIntField(term79076, term79076.getClass(), "component", -174814025);
        setIntField(term79076, term79076.getClass(), "vertex", 958303322);
        setIntField(term79076, term79076.getClass(), "level", 1228479658);
        setIntField(term79076, term79076.getClass(), "order", 129520433);
        setIntField(term79081, term79081.getClass(), "component", 390437953);
        setIntField(term79081, term79081.getClass(), "vertex", -1928220499);
        setIntField(term79081, term79081.getClass(), "level", 1701541391);
        setIntField(term79081, term79081.getClass(), "order", -936192688);
        setIntField(term79086, term79086.getClass(), "component", 938944057);
        setIntField(term79086, term79086.getClass(), "vertex", 855364273);
        setIntField(term79086, term79086.getClass(), "level", -519539376);
        setIntField(term79086, term79086.getClass(), "order", -651264831);
        setIntField(term79091, term79091.getClass(), "component", 801845409);
        setIntField(term79091, term79091.getClass(), "vertex", -638292583);
        setIntField(term79091, term79091.getClass(), "level", -1507192014);
        setIntField(term79091, term79091.getClass(), "order", -444046395);
        setField(term79091, term79091.getClass(), "parent", null);
        setField(term79086, term79086.getClass(), "parent", term79091);
        setField(term79081, term79081.getClass(), "parent", term79086);
        setField(term79076, term79076.getClass(), "parent", term79081);
        setField(term79071, term79071.getClass(), "parent", term79076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphTests$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term79046;
        args[1] = term79071;
        callMethod(klass, "backEdge", argTypes, term79045, args);
    }

};


