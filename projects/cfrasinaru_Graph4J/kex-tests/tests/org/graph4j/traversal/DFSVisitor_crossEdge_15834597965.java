package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DFSVisitor_crossEdge_15834597965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3261;
     Object term3286;

    public DFSVisitor_crossEdge_15834597965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3261 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3266 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3271 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3276 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3281 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3261, term3261.getClass(), "component", -1811732249);
        setIntField(term3261, term3261.getClass(), "vertex", 1993504802);
        setIntField(term3261, term3261.getClass(), "level", 526852618);
        setIntField(term3261, term3261.getClass(), "order", 903788782);
        setIntField(term3266, term3266.getClass(), "component", -608033702);
        setIntField(term3266, term3266.getClass(), "vertex", 1118825073);
        setIntField(term3266, term3266.getClass(), "level", 751108197);
        setIntField(term3266, term3266.getClass(), "order", -1810066487);
        setIntField(term3271, term3271.getClass(), "component", 12697707);
        setIntField(term3271, term3271.getClass(), "vertex", -971143668);
        setIntField(term3271, term3271.getClass(), "level", 127763053);
        setIntField(term3271, term3271.getClass(), "order", 968035207);
        setIntField(term3276, term3276.getClass(), "component", -643589717);
        setIntField(term3276, term3276.getClass(), "vertex", -1599482698);
        setIntField(term3276, term3276.getClass(), "level", -370600915);
        setIntField(term3276, term3276.getClass(), "order", -311572875);
        setIntField(term3281, term3281.getClass(), "component", 355595594);
        setIntField(term3281, term3281.getClass(), "vertex", 842697786);
        setIntField(term3281, term3281.getClass(), "level", 1685808201);
        setIntField(term3281, term3281.getClass(), "order", 1565114969);
        setField(term3281, term3281.getClass(), "parent", null);
        setField(term3276, term3276.getClass(), "parent", term3281);
        setField(term3271, term3271.getClass(), "parent", term3276);
        setField(term3266, term3266.getClass(), "parent", term3271);
        setField(term3261, term3261.getClass(), "parent", term3266);
        term3286 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3291 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3296 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3301 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3306 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3286, term3286.getClass(), "component", -665938382);
        setIntField(term3286, term3286.getClass(), "vertex", 325391588);
        setIntField(term3286, term3286.getClass(), "level", 1443046313);
        setIntField(term3286, term3286.getClass(), "order", 1055117337);
        setIntField(term3291, term3291.getClass(), "component", -705616896);
        setIntField(term3291, term3291.getClass(), "vertex", 1057965724);
        setIntField(term3291, term3291.getClass(), "level", 2134707657);
        setIntField(term3291, term3291.getClass(), "order", -357630956);
        setIntField(term3296, term3296.getClass(), "component", -1068878345);
        setIntField(term3296, term3296.getClass(), "vertex", 1386128235);
        setIntField(term3296, term3296.getClass(), "level", -1047109164);
        setIntField(term3296, term3296.getClass(), "order", -1650626012);
        setIntField(term3301, term3301.getClass(), "component", -2045231879);
        setIntField(term3301, term3301.getClass(), "vertex", 1678025090);
        setIntField(term3301, term3301.getClass(), "level", 714453255);
        setIntField(term3301, term3301.getClass(), "order", 2096762388);
        setIntField(term3306, term3306.getClass(), "component", -1646872343);
        setIntField(term3306, term3306.getClass(), "vertex", -140841633);
        setIntField(term3306, term3306.getClass(), "level", 1970986976);
        setIntField(term3306, term3306.getClass(), "order", 530909877);
        setField(term3306, term3306.getClass(), "parent", null);
        setField(term3301, term3301.getClass(), "parent", term3306);
        setField(term3296, term3296.getClass(), "parent", term3301);
        setField(term3291, term3291.getClass(), "parent", term3296);
        setField(term3286, term3286.getClass(), "parent", term3291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term3261;
        args[1] = term3286;
        callMethod(klass, "crossEdge", argTypes, null, args);
    }

};


