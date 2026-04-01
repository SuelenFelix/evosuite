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
     Object term143189;
     Object term143191;
     Object term143193;
     Object term143195;
     Object term143197;

    public SearchNode_init_3142913552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143189 = new Integer(-507586388);
        term143191 = new Integer(1592747843);
        term143193 = new Integer(-108377203);
        term143195 = new Integer(-1398858469);
        term143197 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143202 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143207 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143212 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143217 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143197, term143197.getClass(), "component", -313543621);
        setIntField(term143197, term143197.getClass(), "vertex", 602277774);
        setIntField(term143197, term143197.getClass(), "level", -1370071987);
        setIntField(term143197, term143197.getClass(), "order", 974915000);
        setIntField(term143202, term143202.getClass(), "component", 390642257);
        setIntField(term143202, term143202.getClass(), "vertex", -1931780931);
        setIntField(term143202, term143202.getClass(), "level", 1410725129);
        setIntField(term143202, term143202.getClass(), "order", -337774942);
        setIntField(term143207, term143207.getClass(), "component", 1380772832);
        setIntField(term143207, term143207.getClass(), "vertex", 1648149467);
        setIntField(term143207, term143207.getClass(), "level", 384004370);
        setIntField(term143207, term143207.getClass(), "order", 2032801735);
        setIntField(term143212, term143212.getClass(), "component", -626099172);
        setIntField(term143212, term143212.getClass(), "vertex", 1003128235);
        setIntField(term143212, term143212.getClass(), "level", -1585225879);
        setIntField(term143212, term143212.getClass(), "order", -1267379471);
        setIntField(term143217, term143217.getClass(), "component", 69962336);
        setIntField(term143217, term143217.getClass(), "vertex", -1088039753);
        setIntField(term143217, term143217.getClass(), "level", -460347076);
        setIntField(term143217, term143217.getClass(), "order", 386814449);
        setField(term143217, term143217.getClass(), "parent", null);
        setField(term143212, term143212.getClass(), "parent", term143217);
        setField(term143207, term143207.getClass(), "parent", term143212);
        setField(term143202, term143202.getClass(), "parent", term143207);
        setField(term143197, term143197.getClass(), "parent", term143202);
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
        args[0] = term143189;
        args[1] = term143191;
        args[2] = term143193;
        args[3] = term143195;
        args[4] = term143197;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


