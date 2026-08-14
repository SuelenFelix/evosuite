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

public class BFSTraverser_isInterrupted_5706756498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;

    public BFSTraverser_isInterrupted_5706756498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term453 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term458 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term453, term453.getClass(), "component", -1533843432);
        setIntField(term453, term453.getClass(), "vertex", -123338791);
        setIntField(term453, term453.getClass(), "level", -1467089634);
        setIntField(term453, term453.getClass(), "order", 413548937);
        setIntField(term458, term458.getClass(), "component", 1901317214);
        setIntField(term458, term458.getClass(), "vertex", 1166710220);
        setIntField(term458, term458.getClass(), "level", -1070592289);
        setIntField(term458, term458.getClass(), "order", -1464172784);
        setField(term458, term458.getClass(), "parent", null);
        setField(term453, term453.getClass(), "parent", term458);
        Object term464 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term464, term464.getClass(), "component", -358526505);
        setIntField(term464, term464.getClass(), "vertex", 1843268026);
        setIntField(term464, term464.getClass(), "level", 954660603);
        setIntField(term464, term464.getClass(), "order", -1351605385);
        setField(term464, term464.getClass(), "parent", null);
        LinkedList term450 = new LinkedList();
        ((LinkedList) term450).add(term453);
        ((LinkedList) term450).add(term464);
        term448 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term472 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 8);
        Object term473 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term478 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term483 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term488 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term493 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term498 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term448, term448.getClass(), "graph", null);
        setBooleanField(term448, term448.getClass(), "directed", false);
        setField(term448, term448.getClass(), "visitor", null);
        setField(term448, term448.getClass(), "queue", term450);
        setIntField(term448, term448.getClass(), "orderIndex", 993388358);
        setIntField(term448, term448.getClass(), "compIndex", -765191335);
        setElement(term472, 0, term464);
        setElement(term472, 1, term453);
        setIntField(term473, term473.getClass(), "component", -2003192918);
        setIntField(term473, term473.getClass(), "vertex", -1362856620);
        setIntField(term473, term473.getClass(), "level", -1835839814);
        setIntField(term473, term473.getClass(), "order", -1404350380);
        setIntField(term478, term478.getClass(), "component", -2013924238);
        setIntField(term478, term478.getClass(), "vertex", 579006268);
        setIntField(term478, term478.getClass(), "level", -1694747156);
        setIntField(term478, term478.getClass(), "order", 1466373988);
        setIntField(term483, term483.getClass(), "component", 0);
        setIntField(term483, term483.getClass(), "vertex", 0);
        setIntField(term483, term483.getClass(), "level", 0);
        setIntField(term483, term483.getClass(), "order", 0);
        setField(term483, term483.getClass(), "parent", null);
        setField(term478, term478.getClass(), "parent", term483);
        setField(term473, term473.getClass(), "parent", term478);
        setElement(term472, 2, term473);
        setIntField(term488, term488.getClass(), "component", -310528004);
        setIntField(term488, term488.getClass(), "vertex", -634976996);
        setIntField(term488, term488.getClass(), "level", -1015274146);
        setIntField(term488, term488.getClass(), "order", -49052672);
        setIntField(term493, term493.getClass(), "component", 339372704);
        setIntField(term493, term493.getClass(), "vertex", -851097944);
        setIntField(term493, term493.getClass(), "level", 803925431);
        setIntField(term493, term493.getClass(), "order", 76929641);
        setField(term493, term493.getClass(), "parent", term473);
        setField(term488, term488.getClass(), "parent", term493);
        setElement(term472, 3, term488);
        setElement(term472, 4, term458);
        setElement(term472, 5, term458);
        setIntField(term498, term498.getClass(), "component", 278355793);
        setIntField(term498, term498.getClass(), "vertex", -310648604);
        setIntField(term498, term498.getClass(), "level", -648200466);
        setIntField(term498, term498.getClass(), "order", 2007134147);
        setField(term498, term498.getClass(), "parent", term483);
        setElement(term472, 6, term498);
        setElement(term472, 7, term483);
        setField(term448, term448.getClass(), "visited", term472);
        setIntField(term448, term448.getClass(), "restartIndex", -1697741155);
        setIntField(term448, term448.getClass(), "maxLevel", 1295839803);
        setBooleanField(term448, term448.getClass(), "interrupted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInterrupted", argTypes, term448, args);
    }

};


