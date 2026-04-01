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
     Object term147776;
     Object term147801;

    public DFSVisitor_forwardEdge_5104873114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147776 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147781 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147786 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147791 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147796 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147776, term147776.getClass(), "component", -1805527709);
        setIntField(term147776, term147776.getClass(), "vertex", 18796496);
        setIntField(term147776, term147776.getClass(), "level", 2054550628);
        setIntField(term147776, term147776.getClass(), "order", 54081584);
        setIntField(term147781, term147781.getClass(), "component", -1111343693);
        setIntField(term147781, term147781.getClass(), "vertex", 736722903);
        setIntField(term147781, term147781.getClass(), "level", 1557526096);
        setIntField(term147781, term147781.getClass(), "order", 19931203);
        setIntField(term147786, term147786.getClass(), "component", 957360405);
        setIntField(term147786, term147786.getClass(), "vertex", 144553237);
        setIntField(term147786, term147786.getClass(), "level", 1888612211);
        setIntField(term147786, term147786.getClass(), "order", -879763585);
        setIntField(term147791, term147791.getClass(), "component", -2134778282);
        setIntField(term147791, term147791.getClass(), "vertex", 409507840);
        setIntField(term147791, term147791.getClass(), "level", 1184916709);
        setIntField(term147791, term147791.getClass(), "order", 70007979);
        setIntField(term147796, term147796.getClass(), "component", -584952780);
        setIntField(term147796, term147796.getClass(), "vertex", 1040185929);
        setIntField(term147796, term147796.getClass(), "level", -963939794);
        setIntField(term147796, term147796.getClass(), "order", -1499817696);
        setField(term147796, term147796.getClass(), "parent", null);
        setField(term147791, term147791.getClass(), "parent", term147796);
        setField(term147786, term147786.getClass(), "parent", term147791);
        setField(term147781, term147781.getClass(), "parent", term147786);
        setField(term147776, term147776.getClass(), "parent", term147781);
        term147801 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147806 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147811 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147816 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147821 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147801, term147801.getClass(), "component", -2028050005);
        setIntField(term147801, term147801.getClass(), "vertex", 2025229906);
        setIntField(term147801, term147801.getClass(), "level", 2111957025);
        setIntField(term147801, term147801.getClass(), "order", -112933518);
        setIntField(term147806, term147806.getClass(), "component", 1937155744);
        setIntField(term147806, term147806.getClass(), "vertex", -388385111);
        setIntField(term147806, term147806.getClass(), "level", -2054633894);
        setIntField(term147806, term147806.getClass(), "order", 710316222);
        setIntField(term147811, term147811.getClass(), "component", 1812306411);
        setIntField(term147811, term147811.getClass(), "vertex", -1705950169);
        setIntField(term147811, term147811.getClass(), "level", -1216002612);
        setIntField(term147811, term147811.getClass(), "order", -2065861103);
        setIntField(term147816, term147816.getClass(), "component", -978440695);
        setIntField(term147816, term147816.getClass(), "vertex", 525509738);
        setIntField(term147816, term147816.getClass(), "level", -168692748);
        setIntField(term147816, term147816.getClass(), "order", -97183233);
        setIntField(term147821, term147821.getClass(), "component", 1216788465);
        setIntField(term147821, term147821.getClass(), "vertex", -706246095);
        setIntField(term147821, term147821.getClass(), "level", -1818179960);
        setIntField(term147821, term147821.getClass(), "order", -107692590);
        setField(term147821, term147821.getClass(), "parent", null);
        setField(term147816, term147816.getClass(), "parent", term147821);
        setField(term147811, term147811.getClass(), "parent", term147816);
        setField(term147806, term147806.getClass(), "parent", term147811);
        setField(term147801, term147801.getClass(), "parent", term147806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term147776;
        args[1] = term147801;
        callMethod(klass, "forwardEdge", argTypes, null, args);
    }

};


