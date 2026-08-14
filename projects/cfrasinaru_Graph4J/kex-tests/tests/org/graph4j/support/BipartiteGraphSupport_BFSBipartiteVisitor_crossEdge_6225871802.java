package org.graph4j.support;

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
import static org.graph4j.support.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BipartiteGraphSupport_BFSBipartiteVisitor_crossEdge_6225871802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6110;
     Object term6111;
     Object term6136;

    public BipartiteGraphSupport_BFSBipartiteVisitor_crossEdge_6225871802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6110 = newInstance(Class.forName("org.graph4j.support.BipartiteGraphSupport$BFSBipartiteVisitor"));
        setField(term6110, term6110.getClass(), "this$0", null);
        term6111 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6116 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6121 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6126 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6131 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term6111, term6111.getClass(), "component", 2025698852);
        setIntField(term6111, term6111.getClass(), "vertex", 113961338);
        setIntField(term6111, term6111.getClass(), "level", 1869277085);
        setIntField(term6111, term6111.getClass(), "order", 498801287);
        setIntField(term6116, term6116.getClass(), "component", 969573395);
        setIntField(term6116, term6116.getClass(), "vertex", -899109027);
        setIntField(term6116, term6116.getClass(), "level", -694297070);
        setIntField(term6116, term6116.getClass(), "order", 786551253);
        setIntField(term6121, term6121.getClass(), "component", -104779523);
        setIntField(term6121, term6121.getClass(), "vertex", 749289511);
        setIntField(term6121, term6121.getClass(), "level", -414437174);
        setIntField(term6121, term6121.getClass(), "order", -860227615);
        setIntField(term6126, term6126.getClass(), "component", -1696192372);
        setIntField(term6126, term6126.getClass(), "vertex", 1239525687);
        setIntField(term6126, term6126.getClass(), "level", 1496590861);
        setIntField(term6126, term6126.getClass(), "order", 1046957508);
        setIntField(term6131, term6131.getClass(), "component", -553500478);
        setIntField(term6131, term6131.getClass(), "vertex", 841910530);
        setIntField(term6131, term6131.getClass(), "level", -1415371559);
        setIntField(term6131, term6131.getClass(), "order", -2083858949);
        setField(term6131, term6131.getClass(), "parent", null);
        setField(term6126, term6126.getClass(), "parent", term6131);
        setField(term6121, term6121.getClass(), "parent", term6126);
        setField(term6116, term6116.getClass(), "parent", term6121);
        setField(term6111, term6111.getClass(), "parent", term6116);
        term6136 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6141 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6146 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6151 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term6156 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term6136, term6136.getClass(), "component", -1427059961);
        setIntField(term6136, term6136.getClass(), "vertex", 1120685189);
        setIntField(term6136, term6136.getClass(), "level", 654585209);
        setIntField(term6136, term6136.getClass(), "order", -1661685401);
        setIntField(term6141, term6141.getClass(), "component", 1427434947);
        setIntField(term6141, term6141.getClass(), "vertex", 2130990985);
        setIntField(term6141, term6141.getClass(), "level", 523197189);
        setIntField(term6141, term6141.getClass(), "order", 658684460);
        setIntField(term6146, term6146.getClass(), "component", 2073367039);
        setIntField(term6146, term6146.getClass(), "vertex", -365877126);
        setIntField(term6146, term6146.getClass(), "level", 251018856);
        setIntField(term6146, term6146.getClass(), "order", -1965331640);
        setIntField(term6151, term6151.getClass(), "component", -514392629);
        setIntField(term6151, term6151.getClass(), "vertex", -166633123);
        setIntField(term6151, term6151.getClass(), "level", 373110517);
        setIntField(term6151, term6151.getClass(), "order", -1632703926);
        setIntField(term6156, term6156.getClass(), "component", -1031499401);
        setIntField(term6156, term6156.getClass(), "vertex", 280202002);
        setIntField(term6156, term6156.getClass(), "level", -1074402599);
        setIntField(term6156, term6156.getClass(), "order", -1867539151);
        setField(term6156, term6156.getClass(), "parent", null);
        setField(term6151, term6151.getClass(), "parent", term6156);
        setField(term6146, term6146.getClass(), "parent", term6151);
        setField(term6141, term6141.getClass(), "parent", term6146);
        setField(term6136, term6136.getClass(), "parent", term6141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.BipartiteGraphSupport$BFSBipartiteVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term6111;
        args[1] = term6136;
        callMethod(klass, "crossEdge", argTypes, term6110, args);
    }

};


