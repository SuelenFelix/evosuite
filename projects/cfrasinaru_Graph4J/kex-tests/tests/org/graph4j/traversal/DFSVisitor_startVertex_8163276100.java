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

public class DFSVisitor_startVertex_8163276100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147626;

    public DFSVisitor_startVertex_8163276100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147626 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147631 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147636 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147641 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147646 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147626, term147626.getClass(), "component", -1798242383);
        setIntField(term147626, term147626.getClass(), "vertex", 724146173);
        setIntField(term147626, term147626.getClass(), "level", -229522915);
        setIntField(term147626, term147626.getClass(), "order", -320475908);
        setIntField(term147631, term147631.getClass(), "component", 1533539679);
        setIntField(term147631, term147631.getClass(), "vertex", 1537304565);
        setIntField(term147631, term147631.getClass(), "level", -1875881645);
        setIntField(term147631, term147631.getClass(), "order", -495604003);
        setIntField(term147636, term147636.getClass(), "component", 882284123);
        setIntField(term147636, term147636.getClass(), "vertex", 740252538);
        setIntField(term147636, term147636.getClass(), "level", 796241512);
        setIntField(term147636, term147636.getClass(), "order", 1584440688);
        setIntField(term147641, term147641.getClass(), "component", 1918607200);
        setIntField(term147641, term147641.getClass(), "vertex", -1185300755);
        setIntField(term147641, term147641.getClass(), "level", -108265815);
        setIntField(term147641, term147641.getClass(), "order", 1957784591);
        setIntField(term147646, term147646.getClass(), "component", -1064251673);
        setIntField(term147646, term147646.getClass(), "vertex", -1719583368);
        setIntField(term147646, term147646.getClass(), "level", 171617316);
        setIntField(term147646, term147646.getClass(), "order", 739201203);
        setField(term147646, term147646.getClass(), "parent", null);
        setField(term147641, term147641.getClass(), "parent", term147646);
        setField(term147636, term147636.getClass(), "parent", term147641);
        setField(term147631, term147631.getClass(), "parent", term147636);
        setField(term147626, term147626.getClass(), "parent", term147631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term147626;
        callMethod(klass, "startVertex", argTypes, null, args);
    }

};


