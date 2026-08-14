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

public class SearchNode_toString_119188758312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2974;

    public SearchNode_toString_119188758312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2974 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2979 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2984 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2989 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2994 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2974, term2974.getClass(), "component", 1785476260);
        setIntField(term2974, term2974.getClass(), "vertex", -655035002);
        setIntField(term2974, term2974.getClass(), "level", 1841475189);
        setIntField(term2974, term2974.getClass(), "order", -456566581);
        setIntField(term2979, term2979.getClass(), "component", 2114761003);
        setIntField(term2979, term2979.getClass(), "vertex", -1128091158);
        setIntField(term2979, term2979.getClass(), "level", 380526008);
        setIntField(term2979, term2979.getClass(), "order", -285065370);
        setIntField(term2984, term2984.getClass(), "component", -1542216721);
        setIntField(term2984, term2984.getClass(), "vertex", -311300330);
        setIntField(term2984, term2984.getClass(), "level", 1160936971);
        setIntField(term2984, term2984.getClass(), "order", 1258846008);
        setIntField(term2989, term2989.getClass(), "component", 702866958);
        setIntField(term2989, term2989.getClass(), "vertex", 622731276);
        setIntField(term2989, term2989.getClass(), "level", -1302341502);
        setIntField(term2989, term2989.getClass(), "order", 1113574554);
        setIntField(term2994, term2994.getClass(), "component", 1685800093);
        setIntField(term2994, term2994.getClass(), "vertex", -318699441);
        setIntField(term2994, term2994.getClass(), "level", 1381027809);
        setIntField(term2994, term2994.getClass(), "order", -371717995);
        setField(term2994, term2994.getClass(), "parent", null);
        setField(term2989, term2989.getClass(), "parent", term2994);
        setField(term2984, term2984.getClass(), "parent", term2989);
        setField(term2979, term2979.getClass(), "parent", term2984);
        setField(term2974, term2974.getClass(), "parent", term2979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2974, args);
    }

};


