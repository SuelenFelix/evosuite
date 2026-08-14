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
     Object term1161;
     Object term1186;

    public BFSVisitor_treeEdge_1701126322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1161 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1166 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1171 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1176 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1181 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1161, term1161.getClass(), "component", 255145822);
        setIntField(term1161, term1161.getClass(), "vertex", -573608449);
        setIntField(term1161, term1161.getClass(), "level", -1660057757);
        setIntField(term1161, term1161.getClass(), "order", 1816273440);
        setIntField(term1166, term1166.getClass(), "component", -96541009);
        setIntField(term1166, term1166.getClass(), "vertex", -43719302);
        setIntField(term1166, term1166.getClass(), "level", 1024134939);
        setIntField(term1166, term1166.getClass(), "order", 109078154);
        setIntField(term1171, term1171.getClass(), "component", -314165467);
        setIntField(term1171, term1171.getClass(), "vertex", 963694071);
        setIntField(term1171, term1171.getClass(), "level", -995785731);
        setIntField(term1171, term1171.getClass(), "order", 1349815364);
        setIntField(term1176, term1176.getClass(), "component", 2128383340);
        setIntField(term1176, term1176.getClass(), "vertex", 1238598518);
        setIntField(term1176, term1176.getClass(), "level", -558146961);
        setIntField(term1176, term1176.getClass(), "order", 1505480070);
        setIntField(term1181, term1181.getClass(), "component", -829088844);
        setIntField(term1181, term1181.getClass(), "vertex", -31751777);
        setIntField(term1181, term1181.getClass(), "level", -246967963);
        setIntField(term1181, term1181.getClass(), "order", -1777140369);
        setField(term1181, term1181.getClass(), "parent", null);
        setField(term1176, term1176.getClass(), "parent", term1181);
        setField(term1171, term1171.getClass(), "parent", term1176);
        setField(term1166, term1166.getClass(), "parent", term1171);
        setField(term1161, term1161.getClass(), "parent", term1166);
        term1186 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1191 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1196 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1201 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1206 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1186, term1186.getClass(), "component", 1588942911);
        setIntField(term1186, term1186.getClass(), "vertex", -2129828854);
        setIntField(term1186, term1186.getClass(), "level", -47438786);
        setIntField(term1186, term1186.getClass(), "order", -1955400589);
        setIntField(term1191, term1191.getClass(), "component", 626179200);
        setIntField(term1191, term1191.getClass(), "vertex", -511077684);
        setIntField(term1191, term1191.getClass(), "level", -711507760);
        setIntField(term1191, term1191.getClass(), "order", 1053773809);
        setIntField(term1196, term1196.getClass(), "component", 924127883);
        setIntField(term1196, term1196.getClass(), "vertex", -751079123);
        setIntField(term1196, term1196.getClass(), "level", -110837188);
        setIntField(term1196, term1196.getClass(), "order", -271094506);
        setIntField(term1201, term1201.getClass(), "component", 455632030);
        setIntField(term1201, term1201.getClass(), "vertex", -1632929393);
        setIntField(term1201, term1201.getClass(), "level", -431440129);
        setIntField(term1201, term1201.getClass(), "order", -763576148);
        setIntField(term1206, term1206.getClass(), "component", 1568948514);
        setIntField(term1206, term1206.getClass(), "vertex", -1511130237);
        setIntField(term1206, term1206.getClass(), "level", 452088587);
        setIntField(term1206, term1206.getClass(), "order", -1630069454);
        setField(term1206, term1206.getClass(), "parent", null);
        setField(term1201, term1201.getClass(), "parent", term1206);
        setField(term1196, term1196.getClass(), "parent", term1201);
        setField(term1191, term1191.getClass(), "parent", term1196);
        setField(term1186, term1186.getClass(), "parent", term1191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1161;
        args[1] = term1186;
        callMethod(klass, "treeEdge", argTypes, null, args);
    }

};


