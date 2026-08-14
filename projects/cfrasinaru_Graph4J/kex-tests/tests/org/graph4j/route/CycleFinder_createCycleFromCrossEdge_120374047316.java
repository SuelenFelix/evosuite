package org.graph4j.route;

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
import static org.graph4j.route.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CycleFinder_createCycleFromCrossEdge_120374047316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4992;
     Object term5005;
     Object term5030;

    public CycleFinder_createCycleFromCrossEdge_120374047316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5056 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term5055 = ((Class) term5056).getDeclaredField((String) "DFS");
        ((Field) term5055).setAccessible(true);
        Object enum19 = ((Field) term5055).get((Object) null);
        term4992 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term4992, term4992.getClass(), "target", 722519669);
        setIntField(term4992, term4992.getClass(), "parity", -40335961);
        setBooleanField(term4992, term4992.getClass(), "shortest", false);
        setBooleanField(term4992, term4992.getClass(), "longer", false);
        setField(term4992, term4992.getClass(), "strategy", enum19);
        setField(term4992, term4992.getClass(), "graph", null);
        setBooleanField(term4992, term4992.getClass(), "directed", false);
        term5005 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term5010 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term5015 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term5020 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term5025 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term5005, term5005.getClass(), "component", 175343605);
        setIntField(term5005, term5005.getClass(), "vertex", 1050853183);
        setIntField(term5005, term5005.getClass(), "level", 848428785);
        setIntField(term5005, term5005.getClass(), "order", -1984436481);
        setIntField(term5010, term5010.getClass(), "component", -407582855);
        setIntField(term5010, term5010.getClass(), "vertex", 1190753616);
        setIntField(term5010, term5010.getClass(), "level", -752378450);
        setIntField(term5010, term5010.getClass(), "order", 848907965);
        setIntField(term5015, term5015.getClass(), "component", 1865070548);
        setIntField(term5015, term5015.getClass(), "vertex", 1904515443);
        setIntField(term5015, term5015.getClass(), "level", 1361126430);
        setIntField(term5015, term5015.getClass(), "order", 1728588701);
        setIntField(term5020, term5020.getClass(), "component", -355769268);
        setIntField(term5020, term5020.getClass(), "vertex", -114460662);
        setIntField(term5020, term5020.getClass(), "level", -355376034);
        setIntField(term5020, term5020.getClass(), "order", 588390599);
        setIntField(term5025, term5025.getClass(), "component", -95969566);
        setIntField(term5025, term5025.getClass(), "vertex", -68615285);
        setIntField(term5025, term5025.getClass(), "level", -337504086);
        setIntField(term5025, term5025.getClass(), "order", 2074130991);
        setField(term5025, term5025.getClass(), "parent", null);
        setField(term5020, term5020.getClass(), "parent", term5025);
        setField(term5015, term5015.getClass(), "parent", term5020);
        setField(term5010, term5010.getClass(), "parent", term5015);
        setField(term5005, term5005.getClass(), "parent", term5010);
        term5030 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term5035 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term5040 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term5045 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term5050 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term5030, term5030.getClass(), "component", 953741504);
        setIntField(term5030, term5030.getClass(), "vertex", 1389452261);
        setIntField(term5030, term5030.getClass(), "level", 1615957955);
        setIntField(term5030, term5030.getClass(), "order", 1779370220);
        setIntField(term5035, term5035.getClass(), "component", -1716046610);
        setIntField(term5035, term5035.getClass(), "vertex", 65264024);
        setIntField(term5035, term5035.getClass(), "level", -252449812);
        setIntField(term5035, term5035.getClass(), "order", -1885268968);
        setIntField(term5040, term5040.getClass(), "component", 277855691);
        setIntField(term5040, term5040.getClass(), "vertex", 675891483);
        setIntField(term5040, term5040.getClass(), "level", -317900470);
        setIntField(term5040, term5040.getClass(), "order", -979568);
        setIntField(term5045, term5045.getClass(), "component", -1422131197);
        setIntField(term5045, term5045.getClass(), "vertex", -20399281);
        setIntField(term5045, term5045.getClass(), "level", -830170410);
        setIntField(term5045, term5045.getClass(), "order", -1742790308);
        setIntField(term5050, term5050.getClass(), "component", -1592093430);
        setIntField(term5050, term5050.getClass(), "vertex", 1178214545);
        setIntField(term5050, term5050.getClass(), "level", -985334541);
        setIntField(term5050, term5050.getClass(), "order", -1870004228);
        setField(term5050, term5050.getClass(), "parent", null);
        setField(term5045, term5045.getClass(), "parent", term5050);
        setField(term5040, term5040.getClass(), "parent", term5045);
        setField(term5035, term5035.getClass(), "parent", term5040);
        setField(term5030, term5030.getClass(), "parent", term5035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term5005;
        args[1] = term5030;
        callMethod(klass, "createCycleFromCrossEdge", argTypes, term4992, args);
    }

};


