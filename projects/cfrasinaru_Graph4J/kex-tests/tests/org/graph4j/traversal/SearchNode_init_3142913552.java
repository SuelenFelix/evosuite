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
import java.lang.Integer;
import java.lang.Object;

public class SearchNode_init_3142913552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2665;
     Object term2667;
     Object term2669;
     Object term2671;
     Object term2673;

    public SearchNode_init_3142913552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2665 = new Integer(379523101);
        term2667 = new Integer(1017354215);
        term2669 = new Integer(695330987);
        term2671 = new Integer(-267289967);
        term2673 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2678 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2683 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2688 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2693 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2673, term2673.getClass(), "component", 773432822);
        setIntField(term2673, term2673.getClass(), "vertex", -488294922);
        setIntField(term2673, term2673.getClass(), "level", -397161164);
        setIntField(term2673, term2673.getClass(), "order", -703717191);
        setIntField(term2678, term2678.getClass(), "component", -1255535445);
        setIntField(term2678, term2678.getClass(), "vertex", -2033952124);
        setIntField(term2678, term2678.getClass(), "level", 560401653);
        setIntField(term2678, term2678.getClass(), "order", 1633691536);
        setIntField(term2683, term2683.getClass(), "component", 898165245);
        setIntField(term2683, term2683.getClass(), "vertex", 1810754549);
        setIntField(term2683, term2683.getClass(), "level", 338342107);
        setIntField(term2683, term2683.getClass(), "order", -650288950);
        setIntField(term2688, term2688.getClass(), "component", 433039357);
        setIntField(term2688, term2688.getClass(), "vertex", 1469939797);
        setIntField(term2688, term2688.getClass(), "level", 252799294);
        setIntField(term2688, term2688.getClass(), "order", -2072618022);
        setIntField(term2693, term2693.getClass(), "component", -269909549);
        setIntField(term2693, term2693.getClass(), "vertex", 686286032);
        setIntField(term2693, term2693.getClass(), "level", -1277201854);
        setIntField(term2693, term2693.getClass(), "order", 1691516034);
        setField(term2693, term2693.getClass(), "parent", null);
        setField(term2688, term2688.getClass(), "parent", term2693);
        setField(term2683, term2683.getClass(), "parent", term2688);
        setField(term2678, term2678.getClass(), "parent", term2683);
        setField(term2673, term2673.getClass(), "parent", term2678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[5];
        args[0] = term2665;
        args[1] = term2667;
        args[2] = term2669;
        args[3] = term2671;
        args[4] = term2673;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


