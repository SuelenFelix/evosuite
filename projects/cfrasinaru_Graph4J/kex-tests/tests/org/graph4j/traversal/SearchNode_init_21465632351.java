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

public class SearchNode_init_21465632351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143162;
     Object term143164;

    public SearchNode_init_21465632351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143162 = new Integer(1258279823);
        term143164 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143169 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143174 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143179 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143184 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143164, term143164.getClass(), "component", -1774136613);
        setIntField(term143164, term143164.getClass(), "vertex", 538341726);
        setIntField(term143164, term143164.getClass(), "level", -352570199);
        setIntField(term143164, term143164.getClass(), "order", 283735063);
        setIntField(term143169, term143169.getClass(), "component", 2121778076);
        setIntField(term143169, term143169.getClass(), "vertex", -2086046185);
        setIntField(term143169, term143169.getClass(), "level", -1670318441);
        setIntField(term143169, term143169.getClass(), "order", -77814214);
        setIntField(term143174, term143174.getClass(), "component", -556152200);
        setIntField(term143174, term143174.getClass(), "vertex", 2088464823);
        setIntField(term143174, term143174.getClass(), "level", -128932205);
        setIntField(term143174, term143174.getClass(), "order", 1468076431);
        setIntField(term143179, term143179.getClass(), "component", 443915973);
        setIntField(term143179, term143179.getClass(), "vertex", 558340992);
        setIntField(term143179, term143179.getClass(), "level", 1075013267);
        setIntField(term143179, term143179.getClass(), "order", -538932788);
        setIntField(term143184, term143184.getClass(), "component", -446285065);
        setIntField(term143184, term143184.getClass(), "vertex", -285322651);
        setIntField(term143184, term143184.getClass(), "level", 212853966);
        setIntField(term143184, term143184.getClass(), "order", 5696820);
        setField(term143184, term143184.getClass(), "parent", null);
        setField(term143179, term143179.getClass(), "parent", term143184);
        setField(term143174, term143174.getClass(), "parent", term143179);
        setField(term143169, term143169.getClass(), "parent", term143174);
        setField(term143164, term143164.getClass(), "parent", term143169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term143162;
        args[1] = term143164;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


