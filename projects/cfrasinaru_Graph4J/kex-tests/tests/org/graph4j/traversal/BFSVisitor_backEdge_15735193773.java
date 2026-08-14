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

public class BFSVisitor_backEdge_15735193773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1211;
     Object term1236;

    public BFSVisitor_backEdge_15735193773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1211 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1216 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1221 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1226 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1231 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1211, term1211.getClass(), "component", -814977075);
        setIntField(term1211, term1211.getClass(), "vertex", 808614267);
        setIntField(term1211, term1211.getClass(), "level", 1611734632);
        setIntField(term1211, term1211.getClass(), "order", 868908117);
        setIntField(term1216, term1216.getClass(), "component", 1789351397);
        setIntField(term1216, term1216.getClass(), "vertex", 2145528170);
        setIntField(term1216, term1216.getClass(), "level", -585773976);
        setIntField(term1216, term1216.getClass(), "order", 852806940);
        setIntField(term1221, term1221.getClass(), "component", 698551724);
        setIntField(term1221, term1221.getClass(), "vertex", -1631048635);
        setIntField(term1221, term1221.getClass(), "level", 1342808731);
        setIntField(term1221, term1221.getClass(), "order", -64893740);
        setIntField(term1226, term1226.getClass(), "component", -222012928);
        setIntField(term1226, term1226.getClass(), "vertex", -146564963);
        setIntField(term1226, term1226.getClass(), "level", -83178716);
        setIntField(term1226, term1226.getClass(), "order", -1292704466);
        setIntField(term1231, term1231.getClass(), "component", 1991858584);
        setIntField(term1231, term1231.getClass(), "vertex", -1300947782);
        setIntField(term1231, term1231.getClass(), "level", 188512644);
        setIntField(term1231, term1231.getClass(), "order", 1851127634);
        setField(term1231, term1231.getClass(), "parent", null);
        setField(term1226, term1226.getClass(), "parent", term1231);
        setField(term1221, term1221.getClass(), "parent", term1226);
        setField(term1216, term1216.getClass(), "parent", term1221);
        setField(term1211, term1211.getClass(), "parent", term1216);
        term1236 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1241 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1246 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1251 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1256 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1236, term1236.getClass(), "component", -1150062870);
        setIntField(term1236, term1236.getClass(), "vertex", -886200503);
        setIntField(term1236, term1236.getClass(), "level", 1136393691);
        setIntField(term1236, term1236.getClass(), "order", -1288536479);
        setIntField(term1241, term1241.getClass(), "component", 1092038167);
        setIntField(term1241, term1241.getClass(), "vertex", 1879729823);
        setIntField(term1241, term1241.getClass(), "level", 1443855558);
        setIntField(term1241, term1241.getClass(), "order", -1933419449);
        setIntField(term1246, term1246.getClass(), "component", -1804322375);
        setIntField(term1246, term1246.getClass(), "vertex", 1595814906);
        setIntField(term1246, term1246.getClass(), "level", -834193529);
        setIntField(term1246, term1246.getClass(), "order", 335780735);
        setIntField(term1251, term1251.getClass(), "component", -1541981599);
        setIntField(term1251, term1251.getClass(), "vertex", 1605456363);
        setIntField(term1251, term1251.getClass(), "level", 2059896693);
        setIntField(term1251, term1251.getClass(), "order", 2109912812);
        setIntField(term1256, term1256.getClass(), "component", 1841286431);
        setIntField(term1256, term1256.getClass(), "vertex", -1723168189);
        setIntField(term1256, term1256.getClass(), "level", -675283917);
        setIntField(term1256, term1256.getClass(), "order", -2093862988);
        setField(term1256, term1256.getClass(), "parent", null);
        setField(term1251, term1251.getClass(), "parent", term1256);
        setField(term1246, term1246.getClass(), "parent", term1251);
        setField(term1241, term1241.getClass(), "parent", term1246);
        setField(term1236, term1236.getClass(), "parent", term1241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1211;
        args[1] = term1236;
        callMethod(klass, "backEdge", argTypes, null, args);
    }

};


