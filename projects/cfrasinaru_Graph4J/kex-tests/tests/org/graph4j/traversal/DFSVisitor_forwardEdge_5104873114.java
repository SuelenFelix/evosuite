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

public class DFSVisitor_forwardEdge_5104873114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3211;
     Object term3236;

    public DFSVisitor_forwardEdge_5104873114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3211 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3216 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3221 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3226 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3231 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3211, term3211.getClass(), "component", -1570350431);
        setIntField(term3211, term3211.getClass(), "vertex", -1378803474);
        setIntField(term3211, term3211.getClass(), "level", 699225584);
        setIntField(term3211, term3211.getClass(), "order", -577432675);
        setIntField(term3216, term3216.getClass(), "component", -953072528);
        setIntField(term3216, term3216.getClass(), "vertex", 2011046892);
        setIntField(term3216, term3216.getClass(), "level", 466007219);
        setIntField(term3216, term3216.getClass(), "order", -2142979104);
        setIntField(term3221, term3221.getClass(), "component", -1983330479);
        setIntField(term3221, term3221.getClass(), "vertex", 1929952462);
        setIntField(term3221, term3221.getClass(), "level", 701114540);
        setIntField(term3221, term3221.getClass(), "order", -1284079635);
        setIntField(term3226, term3226.getClass(), "component", -2130090775);
        setIntField(term3226, term3226.getClass(), "vertex", -1455026066);
        setIntField(term3226, term3226.getClass(), "level", -169160528);
        setIntField(term3226, term3226.getClass(), "order", 951748736);
        setIntField(term3231, term3231.getClass(), "component", 787260842);
        setIntField(term3231, term3231.getClass(), "vertex", -137516512);
        setIntField(term3231, term3231.getClass(), "level", -585134115);
        setIntField(term3231, term3231.getClass(), "order", 1435872700);
        setField(term3231, term3231.getClass(), "parent", null);
        setField(term3226, term3226.getClass(), "parent", term3231);
        setField(term3221, term3221.getClass(), "parent", term3226);
        setField(term3216, term3216.getClass(), "parent", term3221);
        setField(term3211, term3211.getClass(), "parent", term3216);
        term3236 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3241 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3246 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3251 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3256 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3236, term3236.getClass(), "component", -508560324);
        setIntField(term3236, term3236.getClass(), "vertex", -1700781575);
        setIntField(term3236, term3236.getClass(), "level", -2042022388);
        setIntField(term3236, term3236.getClass(), "order", 390228535);
        setIntField(term3241, term3241.getClass(), "component", -667505209);
        setIntField(term3241, term3241.getClass(), "vertex", 1997285343);
        setIntField(term3241, term3241.getClass(), "level", -1814671855);
        setIntField(term3241, term3241.getClass(), "order", -614200166);
        setIntField(term3246, term3246.getClass(), "component", 1243129119);
        setIntField(term3246, term3246.getClass(), "vertex", 346014220);
        setIntField(term3246, term3246.getClass(), "level", 1379438950);
        setIntField(term3246, term3246.getClass(), "order", 1932258686);
        setIntField(term3251, term3251.getClass(), "component", -261366507);
        setIntField(term3251, term3251.getClass(), "vertex", 1015444772);
        setIntField(term3251, term3251.getClass(), "level", -815684619);
        setIntField(term3251, term3251.getClass(), "order", -471499395);
        setIntField(term3256, term3256.getClass(), "component", -663671886);
        setIntField(term3256, term3256.getClass(), "vertex", -1295577968);
        setIntField(term3256, term3256.getClass(), "level", 1006574741);
        setIntField(term3256, term3256.getClass(), "order", -1471698394);
        setField(term3256, term3256.getClass(), "parent", null);
        setField(term3251, term3251.getClass(), "parent", term3256);
        setField(term3246, term3246.getClass(), "parent", term3251);
        setField(term3241, term3241.getClass(), "parent", term3246);
        setField(term3236, term3236.getClass(), "parent", term3241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term3211;
        args[1] = term3236;
        callMethod(klass, "forwardEdge", argTypes, null, args);
    }

};


