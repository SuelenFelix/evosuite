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

public class DFSVisitor_treeEdge_5309519462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3111;
     Object term3136;

    public DFSVisitor_treeEdge_5309519462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3111 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3116 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3121 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3126 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3131 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3111, term3111.getClass(), "component", -1878319299);
        setIntField(term3111, term3111.getClass(), "vertex", -690862846);
        setIntField(term3111, term3111.getClass(), "level", 805027262);
        setIntField(term3111, term3111.getClass(), "order", 717389178);
        setIntField(term3116, term3116.getClass(), "component", -1265226052);
        setIntField(term3116, term3116.getClass(), "vertex", 1970023149);
        setIntField(term3116, term3116.getClass(), "level", -336351735);
        setIntField(term3116, term3116.getClass(), "order", 1938932230);
        setIntField(term3121, term3121.getClass(), "component", 1128720609);
        setIntField(term3121, term3121.getClass(), "vertex", 216265002);
        setIntField(term3121, term3121.getClass(), "level", -97405660);
        setIntField(term3121, term3121.getClass(), "order", 872278468);
        setIntField(term3126, term3126.getClass(), "component", -1003390920);
        setIntField(term3126, term3126.getClass(), "vertex", -2052568448);
        setIntField(term3126, term3126.getClass(), "level", 664155196);
        setIntField(term3126, term3126.getClass(), "order", -1103257588);
        setIntField(term3131, term3131.getClass(), "component", 1463219831);
        setIntField(term3131, term3131.getClass(), "vertex", -1516863216);
        setIntField(term3131, term3131.getClass(), "level", 1392468004);
        setIntField(term3131, term3131.getClass(), "order", -1568339070);
        setField(term3131, term3131.getClass(), "parent", null);
        setField(term3126, term3126.getClass(), "parent", term3131);
        setField(term3121, term3121.getClass(), "parent", term3126);
        setField(term3116, term3116.getClass(), "parent", term3121);
        setField(term3111, term3111.getClass(), "parent", term3116);
        term3136 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3141 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3146 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3151 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3156 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3136, term3136.getClass(), "component", -816430246);
        setIntField(term3136, term3136.getClass(), "vertex", 1754193865);
        setIntField(term3136, term3136.getClass(), "level", 25277058);
        setIntField(term3136, term3136.getClass(), "order", -949634053);
        setIntField(term3141, term3141.getClass(), "component", 1495471055);
        setIntField(term3141, term3141.getClass(), "vertex", -583415628);
        setIntField(term3141, term3141.getClass(), "level", -1488660931);
        setIntField(term3141, term3141.getClass(), "order", 1899095931);
        setIntField(term3146, term3146.getClass(), "component", 145571200);
        setIntField(term3146, term3146.getClass(), "vertex", -81919234);
        setIntField(term3146, term3146.getClass(), "level", 41779745);
        setIntField(term3146, term3146.getClass(), "order", 908188015);
        setIntField(term3151, term3151.getClass(), "component", 1448289766);
        setIntField(term3151, term3151.getClass(), "vertex", 1377148923);
        setIntField(term3151, term3151.getClass(), "level", 540775467);
        setIntField(term3151, term3151.getClass(), "order", -2083028527);
        setIntField(term3156, term3156.getClass(), "component", 1631605263);
        setIntField(term3156, term3156.getClass(), "vertex", -1378134881);
        setIntField(term3156, term3156.getClass(), "level", -1887131478);
        setIntField(term3156, term3156.getClass(), "order", 1916020077);
        setField(term3156, term3156.getClass(), "parent", null);
        setField(term3151, term3151.getClass(), "parent", term3156);
        setField(term3146, term3146.getClass(), "parent", term3151);
        setField(term3141, term3141.getClass(), "parent", term3146);
        setField(term3136, term3136.getClass(), "parent", term3141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term3111;
        args[1] = term3136;
        callMethod(klass, "treeEdge", argTypes, null, args);
    }

};


