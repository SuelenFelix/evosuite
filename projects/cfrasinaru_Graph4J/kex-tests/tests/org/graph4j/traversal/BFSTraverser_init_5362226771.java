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
import java.util.LinkedList;
import java.lang.Object;

public class BFSTraverser_init_5362226771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86939;

    public BFSTraverser_init_5362226771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86944 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term86949 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term86944, term86944.getClass(), "component", -1984046630);
        setIntField(term86944, term86944.getClass(), "vertex", -1548385276);
        setIntField(term86944, term86944.getClass(), "level", 565549934);
        setIntField(term86944, term86944.getClass(), "order", 1177281465);
        setIntField(term86949, term86949.getClass(), "component", -1236004824);
        setIntField(term86949, term86949.getClass(), "vertex", -311539591);
        setIntField(term86949, term86949.getClass(), "level", -1770831459);
        setIntField(term86949, term86949.getClass(), "order", -502669627);
        setField(term86949, term86949.getClass(), "parent", null);
        setField(term86944, term86944.getClass(), "parent", term86949);
        Object term86955 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term86955, term86955.getClass(), "component", 1399097502);
        setIntField(term86955, term86955.getClass(), "vertex", 1779069426);
        setIntField(term86955, term86955.getClass(), "level", 1157660501);
        setIntField(term86955, term86955.getClass(), "order", 490025473);
        setField(term86955, term86955.getClass(), "parent", null);
        LinkedList term86941 = new LinkedList();
        ((LinkedList) term86941).add(term86944);
        ((LinkedList) term86941).add(term86955);
        term86939 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term86963 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 7);
        Object term86964 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term86969 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term86974 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term86979 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term86984 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term86989 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term86939, term86939.getClass(), "graph", null);
        setBooleanField(term86939, term86939.getClass(), "directed", true);
        setField(term86939, term86939.getClass(), "visitor", null);
        setField(term86939, term86939.getClass(), "queue", term86941);
        setIntField(term86939, term86939.getClass(), "orderIndex", -702583600);
        setIntField(term86939, term86939.getClass(), "compIndex", 1234272864);
        setElement(term86963, 0, term86955);
        setElement(term86963, 1, term86944);
        setIntField(term86964, term86964.getClass(), "component", -1194320522);
        setIntField(term86964, term86964.getClass(), "vertex", 513650910);
        setIntField(term86964, term86964.getClass(), "level", -1964199429);
        setIntField(term86964, term86964.getClass(), "order", 628292358);
        setIntField(term86969, term86969.getClass(), "component", -169146602);
        setIntField(term86969, term86969.getClass(), "vertex", 899306663);
        setIntField(term86969, term86969.getClass(), "level", 708799864);
        setIntField(term86969, term86969.getClass(), "order", -851159365);
        setIntField(term86974, term86974.getClass(), "component", 0);
        setIntField(term86974, term86974.getClass(), "vertex", 0);
        setIntField(term86974, term86974.getClass(), "level", 0);
        setIntField(term86974, term86974.getClass(), "order", 0);
        setField(term86974, term86974.getClass(), "parent", null);
        setField(term86969, term86969.getClass(), "parent", term86974);
        setField(term86964, term86964.getClass(), "parent", term86969);
        setElement(term86963, 2, term86964);
        setIntField(term86979, term86979.getClass(), "component", -279431300);
        setIntField(term86979, term86979.getClass(), "vertex", 1136629984);
        setIntField(term86979, term86979.getClass(), "level", -1618661197);
        setIntField(term86979, term86979.getClass(), "order", 38755177);
        setIntField(term86984, term86984.getClass(), "component", 164361364);
        setIntField(term86984, term86984.getClass(), "vertex", -1933122225);
        setIntField(term86984, term86984.getClass(), "level", 6941292);
        setIntField(term86984, term86984.getClass(), "order", -1894535169);
        setField(term86984, term86984.getClass(), "parent", term86964);
        setField(term86979, term86979.getClass(), "parent", term86984);
        setElement(term86963, 3, term86979);
        setElement(term86963, 4, term86949);
        setElement(term86963, 5, term86949);
        setIntField(term86989, term86989.getClass(), "component", 966189442);
        setIntField(term86989, term86989.getClass(), "vertex", -322248521);
        setIntField(term86989, term86989.getClass(), "level", 1676012683);
        setIntField(term86989, term86989.getClass(), "order", 1173048453);
        setField(term86989, term86989.getClass(), "parent", term86974);
        setElement(term86963, 6, term86989);
        setField(term86939, term86939.getClass(), "visited", term86963);
        setIntField(term86939, term86939.getClass(), "restartIndex", -2093469163);
        setIntField(term86939, term86939.getClass(), "maxLevel", 2114441505);
        setBooleanField(term86939, term86939.getClass(), "interrupted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term86939, args);
    }

};


