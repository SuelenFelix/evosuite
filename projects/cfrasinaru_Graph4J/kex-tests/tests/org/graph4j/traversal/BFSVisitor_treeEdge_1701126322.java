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

public class BFSVisitor_treeEdge_1701126322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105724;
     Object term105749;

    public BFSVisitor_treeEdge_1701126322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105724 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105729 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105734 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105739 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105744 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term105724, term105724.getClass(), "component", -330877175);
        setIntField(term105724, term105724.getClass(), "vertex", 924610813);
        setIntField(term105724, term105724.getClass(), "level", 326759885);
        setIntField(term105724, term105724.getClass(), "order", 1717078401);
        setIntField(term105729, term105729.getClass(), "component", 937682788);
        setIntField(term105729, term105729.getClass(), "vertex", 374255307);
        setIntField(term105729, term105729.getClass(), "level", -1684423391);
        setIntField(term105729, term105729.getClass(), "order", -377360316);
        setIntField(term105734, term105734.getClass(), "component", 1546676215);
        setIntField(term105734, term105734.getClass(), "vertex", -1338644465);
        setIntField(term105734, term105734.getClass(), "level", -2145078875);
        setIntField(term105734, term105734.getClass(), "order", -1673144446);
        setIntField(term105739, term105739.getClass(), "component", 913354499);
        setIntField(term105739, term105739.getClass(), "vertex", -1016590318);
        setIntField(term105739, term105739.getClass(), "level", -1194664404);
        setIntField(term105739, term105739.getClass(), "order", -155628991);
        setIntField(term105744, term105744.getClass(), "component", -393025707);
        setIntField(term105744, term105744.getClass(), "vertex", -2030798001);
        setIntField(term105744, term105744.getClass(), "level", 1588680079);
        setIntField(term105744, term105744.getClass(), "order", -432120908);
        setField(term105744, term105744.getClass(), "parent", null);
        setField(term105739, term105739.getClass(), "parent", term105744);
        setField(term105734, term105734.getClass(), "parent", term105739);
        setField(term105729, term105729.getClass(), "parent", term105734);
        setField(term105724, term105724.getClass(), "parent", term105729);
        term105749 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105754 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105759 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105764 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105769 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term105749, term105749.getClass(), "component", 434146400);
        setIntField(term105749, term105749.getClass(), "vertex", 97574163);
        setIntField(term105749, term105749.getClass(), "level", -971185051);
        setIntField(term105749, term105749.getClass(), "order", 399127883);
        setIntField(term105754, term105754.getClass(), "component", 764941661);
        setIntField(term105754, term105754.getClass(), "vertex", 1604092033);
        setIntField(term105754, term105754.getClass(), "level", -513324517);
        setIntField(term105754, term105754.getClass(), "order", -821870990);
        setIntField(term105759, term105759.getClass(), "component", -1162456029);
        setIntField(term105759, term105759.getClass(), "vertex", -159817281);
        setIntField(term105759, term105759.getClass(), "level", -1128287307);
        setIntField(term105759, term105759.getClass(), "order", 1885371265);
        setIntField(term105764, term105764.getClass(), "component", 225734051);
        setIntField(term105764, term105764.getClass(), "vertex", -349103263);
        setIntField(term105764, term105764.getClass(), "level", -1716968807);
        setIntField(term105764, term105764.getClass(), "order", 1180668641);
        setIntField(term105769, term105769.getClass(), "component", 1171875774);
        setIntField(term105769, term105769.getClass(), "vertex", -168001160);
        setIntField(term105769, term105769.getClass(), "level", -1132894503);
        setIntField(term105769, term105769.getClass(), "order", 420722859);
        setField(term105769, term105769.getClass(), "parent", null);
        setField(term105764, term105764.getClass(), "parent", term105769);
        setField(term105759, term105759.getClass(), "parent", term105764);
        setField(term105754, term105754.getClass(), "parent", term105759);
        setField(term105749, term105749.getClass(), "parent", term105754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term105724;
        args[1] = term105749;
        callMethod(klass, "treeEdge", argTypes, null, args);
    }

};


