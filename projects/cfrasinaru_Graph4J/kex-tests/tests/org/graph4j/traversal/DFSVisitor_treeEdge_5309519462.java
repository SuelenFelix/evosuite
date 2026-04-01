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
     Object term147676;
     Object term147701;

    public DFSVisitor_treeEdge_5309519462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147676 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147681 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147686 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147691 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147696 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147676, term147676.getClass(), "component", -1430913381);
        setIntField(term147676, term147676.getClass(), "vertex", 214932850);
        setIntField(term147676, term147676.getClass(), "level", 1757839617);
        setIntField(term147676, term147676.getClass(), "order", 691161018);
        setIntField(term147681, term147681.getClass(), "component", -330784048);
        setIntField(term147681, term147681.getClass(), "vertex", 604589819);
        setIntField(term147681, term147681.getClass(), "level", 2098939667);
        setIntField(term147681, term147681.getClass(), "order", 111288260);
        setIntField(term147686, term147686.getClass(), "component", -42355061);
        setIntField(term147686, term147686.getClass(), "vertex", 1023659601);
        setIntField(term147686, term147686.getClass(), "level", 1586333346);
        setIntField(term147686, term147686.getClass(), "order", -863931293);
        setIntField(term147691, term147691.getClass(), "component", -57161737);
        setIntField(term147691, term147691.getClass(), "vertex", 986258161);
        setIntField(term147691, term147691.getClass(), "level", 533902933);
        setIntField(term147691, term147691.getClass(), "order", -1159824938);
        setIntField(term147696, term147696.getClass(), "component", 1273916688);
        setIntField(term147696, term147696.getClass(), "vertex", 848070641);
        setIntField(term147696, term147696.getClass(), "level", -1473335774);
        setIntField(term147696, term147696.getClass(), "order", -1474912180);
        setField(term147696, term147696.getClass(), "parent", null);
        setField(term147691, term147691.getClass(), "parent", term147696);
        setField(term147686, term147686.getClass(), "parent", term147691);
        setField(term147681, term147681.getClass(), "parent", term147686);
        setField(term147676, term147676.getClass(), "parent", term147681);
        term147701 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147706 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147711 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147716 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147721 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147701, term147701.getClass(), "component", -1549710331);
        setIntField(term147701, term147701.getClass(), "vertex", -1628085500);
        setIntField(term147701, term147701.getClass(), "level", 1268527865);
        setIntField(term147701, term147701.getClass(), "order", 1672470757);
        setIntField(term147706, term147706.getClass(), "component", 1336072683);
        setIntField(term147706, term147706.getClass(), "vertex", 2087057355);
        setIntField(term147706, term147706.getClass(), "level", -1213597935);
        setIntField(term147706, term147706.getClass(), "order", 1137295659);
        setIntField(term147711, term147711.getClass(), "component", -113371480);
        setIntField(term147711, term147711.getClass(), "vertex", -1481366677);
        setIntField(term147711, term147711.getClass(), "level", 1187923863);
        setIntField(term147711, term147711.getClass(), "order", -604826271);
        setIntField(term147716, term147716.getClass(), "component", -1932039978);
        setIntField(term147716, term147716.getClass(), "vertex", -94232504);
        setIntField(term147716, term147716.getClass(), "level", -1319582125);
        setIntField(term147716, term147716.getClass(), "order", 1581726545);
        setIntField(term147721, term147721.getClass(), "component", 911574377);
        setIntField(term147721, term147721.getClass(), "vertex", 1251521608);
        setIntField(term147721, term147721.getClass(), "level", -174934999);
        setIntField(term147721, term147721.getClass(), "order", -1682191652);
        setField(term147721, term147721.getClass(), "parent", null);
        setField(term147716, term147716.getClass(), "parent", term147721);
        setField(term147711, term147711.getClass(), "parent", term147716);
        setField(term147706, term147706.getClass(), "parent", term147711);
        setField(term147701, term147701.getClass(), "parent", term147706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term147676;
        args[1] = term147701;
        callMethod(klass, "treeEdge", argTypes, null, args);
    }

};


