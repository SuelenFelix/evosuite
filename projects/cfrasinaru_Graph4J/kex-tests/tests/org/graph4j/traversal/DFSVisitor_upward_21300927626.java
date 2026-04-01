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

public class DFSVisitor_upward_21300927626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147876;
     Object term147901;

    public DFSVisitor_upward_21300927626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147876 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147881 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147886 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147891 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147896 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147876, term147876.getClass(), "component", 763497280);
        setIntField(term147876, term147876.getClass(), "vertex", -84479766);
        setIntField(term147876, term147876.getClass(), "level", 1487222640);
        setIntField(term147876, term147876.getClass(), "order", -1749847652);
        setIntField(term147881, term147881.getClass(), "component", 1501733415);
        setIntField(term147881, term147881.getClass(), "vertex", 1104299177);
        setIntField(term147881, term147881.getClass(), "level", 342295676);
        setIntField(term147881, term147881.getClass(), "order", 945842202);
        setIntField(term147886, term147886.getClass(), "component", -2065245570);
        setIntField(term147886, term147886.getClass(), "vertex", -1244246120);
        setIntField(term147886, term147886.getClass(), "level", -315435576);
        setIntField(term147886, term147886.getClass(), "order", -328108701);
        setIntField(term147891, term147891.getClass(), "component", 1098944689);
        setIntField(term147891, term147891.getClass(), "vertex", 2146860071);
        setIntField(term147891, term147891.getClass(), "level", -1591221283);
        setIntField(term147891, term147891.getClass(), "order", 1784624073);
        setIntField(term147896, term147896.getClass(), "component", 1729022273);
        setIntField(term147896, term147896.getClass(), "vertex", -964246621);
        setIntField(term147896, term147896.getClass(), "level", 129204952);
        setIntField(term147896, term147896.getClass(), "order", -1192671537);
        setField(term147896, term147896.getClass(), "parent", null);
        setField(term147891, term147891.getClass(), "parent", term147896);
        setField(term147886, term147886.getClass(), "parent", term147891);
        setField(term147881, term147881.getClass(), "parent", term147886);
        setField(term147876, term147876.getClass(), "parent", term147881);
        term147901 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147906 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147911 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147916 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147921 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147901, term147901.getClass(), "component", -2075447848);
        setIntField(term147901, term147901.getClass(), "vertex", -1903788058);
        setIntField(term147901, term147901.getClass(), "level", 1384263349);
        setIntField(term147901, term147901.getClass(), "order", -1134707056);
        setIntField(term147906, term147906.getClass(), "component", -1264825992);
        setIntField(term147906, term147906.getClass(), "vertex", -554856538);
        setIntField(term147906, term147906.getClass(), "level", 134467698);
        setIntField(term147906, term147906.getClass(), "order", -1045867805);
        setIntField(term147911, term147911.getClass(), "component", -1819582530);
        setIntField(term147911, term147911.getClass(), "vertex", 1939773291);
        setIntField(term147911, term147911.getClass(), "level", -2123548281);
        setIntField(term147911, term147911.getClass(), "order", -1501829531);
        setIntField(term147916, term147916.getClass(), "component", 1265556490);
        setIntField(term147916, term147916.getClass(), "vertex", 1394602253);
        setIntField(term147916, term147916.getClass(), "level", -318658528);
        setIntField(term147916, term147916.getClass(), "order", -1738783376);
        setIntField(term147921, term147921.getClass(), "component", -491487149);
        setIntField(term147921, term147921.getClass(), "vertex", 746358052);
        setIntField(term147921, term147921.getClass(), "level", -495920186);
        setIntField(term147921, term147921.getClass(), "order", -975483972);
        setField(term147921, term147921.getClass(), "parent", null);
        setField(term147916, term147916.getClass(), "parent", term147921);
        setField(term147911, term147911.getClass(), "parent", term147916);
        setField(term147906, term147906.getClass(), "parent", term147911);
        setField(term147901, term147901.getClass(), "parent", term147906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term147876;
        args[1] = term147901;
        callMethod(klass, "upward", argTypes, null, args);
    }

};


