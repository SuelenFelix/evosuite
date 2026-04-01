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

public class SearchNode_nearestAncestor_1643785129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143397;
     Object term143422;

    public SearchNode_nearestAncestor_1643785129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143397 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143402 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143407 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143412 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143417 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143397, term143397.getClass(), "component", -1015830871);
        setIntField(term143397, term143397.getClass(), "vertex", 512757682);
        setIntField(term143397, term143397.getClass(), "level", -1922660438);
        setIntField(term143397, term143397.getClass(), "order", 110288749);
        setIntField(term143402, term143402.getClass(), "component", -2139204151);
        setIntField(term143402, term143402.getClass(), "vertex", 1639811317);
        setIntField(term143402, term143402.getClass(), "level", -1222745570);
        setIntField(term143402, term143402.getClass(), "order", -1305614514);
        setIntField(term143407, term143407.getClass(), "component", -1076742724);
        setIntField(term143407, term143407.getClass(), "vertex", -1789621592);
        setIntField(term143407, term143407.getClass(), "level", -1627271684);
        setIntField(term143407, term143407.getClass(), "order", -536757115);
        setIntField(term143412, term143412.getClass(), "component", -38474230);
        setIntField(term143412, term143412.getClass(), "vertex", 1538350416);
        setIntField(term143412, term143412.getClass(), "level", 1555781814);
        setIntField(term143412, term143412.getClass(), "order", -1912809409);
        setIntField(term143417, term143417.getClass(), "component", 799703968);
        setIntField(term143417, term143417.getClass(), "vertex", 74115966);
        setIntField(term143417, term143417.getClass(), "level", 495443248);
        setIntField(term143417, term143417.getClass(), "order", 1441170931);
        setField(term143417, term143417.getClass(), "parent", null);
        setField(term143412, term143412.getClass(), "parent", term143417);
        setField(term143407, term143407.getClass(), "parent", term143412);
        setField(term143402, term143402.getClass(), "parent", term143407);
        setField(term143397, term143397.getClass(), "parent", term143402);
        term143422 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143427 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143432 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143437 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143442 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143422, term143422.getClass(), "component", -1923437387);
        setIntField(term143422, term143422.getClass(), "vertex", -201543810);
        setIntField(term143422, term143422.getClass(), "level", -372154047);
        setIntField(term143422, term143422.getClass(), "order", 1863535983);
        setIntField(term143427, term143427.getClass(), "component", -1741751420);
        setIntField(term143427, term143427.getClass(), "vertex", 1584162532);
        setIntField(term143427, term143427.getClass(), "level", -49842309);
        setIntField(term143427, term143427.getClass(), "order", -1060935976);
        setIntField(term143432, term143432.getClass(), "component", -476085547);
        setIntField(term143432, term143432.getClass(), "vertex", 220634485);
        setIntField(term143432, term143432.getClass(), "level", -2134695238);
        setIntField(term143432, term143432.getClass(), "order", 1931987306);
        setIntField(term143437, term143437.getClass(), "component", -767200126);
        setIntField(term143437, term143437.getClass(), "vertex", 1366138839);
        setIntField(term143437, term143437.getClass(), "level", 692708679);
        setIntField(term143437, term143437.getClass(), "order", -1562385244);
        setIntField(term143442, term143442.getClass(), "component", 1161011830);
        setIntField(term143442, term143442.getClass(), "vertex", -994267583);
        setIntField(term143442, term143442.getClass(), "level", 1432122822);
        setIntField(term143442, term143442.getClass(), "order", -1125991653);
        setField(term143442, term143442.getClass(), "parent", null);
        setField(term143437, term143437.getClass(), "parent", term143442);
        setField(term143432, term143432.getClass(), "parent", term143437);
        setField(term143427, term143427.getClass(), "parent", term143432);
        setField(term143422, term143422.getClass(), "parent", term143427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term143397;
        args[1] = term143422;
        callMethod(klass, "nearestAncestor", argTypes, null, args);
    }

};


