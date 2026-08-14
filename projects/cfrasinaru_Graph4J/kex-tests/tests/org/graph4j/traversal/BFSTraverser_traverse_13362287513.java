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
import java.lang.Integer;

public class BFSTraverser_traverse_13362287513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;
     Object term261;

    public BFSTraverser_traverse_13362287513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term209 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term214 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term209, term209.getClass(), "component", 941650513);
        setIntField(term209, term209.getClass(), "vertex", 444029505);
        setIntField(term209, term209.getClass(), "level", -1034506028);
        setIntField(term209, term209.getClass(), "order", -1263114719);
        setIntField(term214, term214.getClass(), "component", -894662986);
        setIntField(term214, term214.getClass(), "vertex", 304775596);
        setIntField(term214, term214.getClass(), "level", -1347665717);
        setIntField(term214, term214.getClass(), "order", -1888585309);
        setField(term214, term214.getClass(), "parent", null);
        setField(term209, term209.getClass(), "parent", term214);
        Object term220 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term220, term220.getClass(), "component", 1861318859);
        setIntField(term220, term220.getClass(), "vertex", 1474524152);
        setIntField(term220, term220.getClass(), "level", 568954359);
        setIntField(term220, term220.getClass(), "order", 53410913);
        setField(term220, term220.getClass(), "parent", null);
        LinkedList term206 = new LinkedList();
        ((LinkedList) term206).add(term209);
        ((LinkedList) term206).add(term220);
        ((LinkedList) term206).add(term220);
        ((LinkedList) term206).add((Object)null);
        ((LinkedList) term206).add((Object)null);
        ((LinkedList) term206).add((Object)null);
        term204 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term247 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 7);
        Object term248 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term253 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term232 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term204, term204.getClass(), "graph", null);
        setBooleanField(term204, term204.getClass(), "directed", true);
        setField(term204, term204.getClass(), "visitor", null);
        setField(term204, term204.getClass(), "queue", term206);
        setIntField(term204, term204.getClass(), "orderIndex", -2015854073);
        setIntField(term204, term204.getClass(), "compIndex", 538259104);
        setElement(term247, 0, term214);
        setElement(term247, 1, term214);
        setIntField(term248, term248.getClass(), "component", -375014958);
        setIntField(term248, term248.getClass(), "vertex", 1107176718);
        setIntField(term248, term248.getClass(), "level", 480137250);
        setIntField(term248, term248.getClass(), "order", -341152642);
        setIntField(term253, term253.getClass(), "component", 0);
        setIntField(term253, term253.getClass(), "vertex", 0);
        setIntField(term253, term253.getClass(), "level", 0);
        setIntField(term253, term253.getClass(), "order", 0);
        setField(term253, term253.getClass(), "parent", null);
        setField(term248, term248.getClass(), "parent", term253);
        setElement(term247, 2, term248);
        setElement(term247, 3, term253);
        setElement(term247, 4, term253);
        setIntField(term232, term232.getClass(), "component", -341962980);
        setIntField(term232, term232.getClass(), "vertex", 1532716628);
        setIntField(term232, term232.getClass(), "level", -1801760683);
        setIntField(term232, term232.getClass(), "order", 1141317871);
        setField(term232, term232.getClass(), "parent", null);
        setElement(term247, 5, term232);
        setElement(term247, 6, term248);
        setField(term204, term204.getClass(), "visited", term247);
        setIntField(term204, term204.getClass(), "restartIndex", 96566506);
        setIntField(term204, term204.getClass(), "maxLevel", -343325701);
        setBooleanField(term204, term204.getClass(), "interrupted", false);
        term261 = new Integer(107945604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term261;
        callMethod(klass, "traverse", argTypes, term204, args);
    }

};


