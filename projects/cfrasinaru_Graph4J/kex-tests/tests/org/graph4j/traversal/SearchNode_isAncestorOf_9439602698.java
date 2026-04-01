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

public class SearchNode_isAncestorOf_9439602698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143347;
     Object term143372;

    public SearchNode_isAncestorOf_9439602698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143347 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143352 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143357 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143362 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143367 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143347, term143347.getClass(), "component", -1107509246);
        setIntField(term143347, term143347.getClass(), "vertex", 1744140180);
        setIntField(term143347, term143347.getClass(), "level", -40972271);
        setIntField(term143347, term143347.getClass(), "order", -785251684);
        setIntField(term143352, term143352.getClass(), "component", 836453622);
        setIntField(term143352, term143352.getClass(), "vertex", 1923817159);
        setIntField(term143352, term143352.getClass(), "level", 1188543286);
        setIntField(term143352, term143352.getClass(), "order", -1979391350);
        setIntField(term143357, term143357.getClass(), "component", -1240006369);
        setIntField(term143357, term143357.getClass(), "vertex", -1332422917);
        setIntField(term143357, term143357.getClass(), "level", -639321209);
        setIntField(term143357, term143357.getClass(), "order", -420329719);
        setIntField(term143362, term143362.getClass(), "component", 377962642);
        setIntField(term143362, term143362.getClass(), "vertex", -1190471193);
        setIntField(term143362, term143362.getClass(), "level", -1851111045);
        setIntField(term143362, term143362.getClass(), "order", -1236636787);
        setIntField(term143367, term143367.getClass(), "component", -2108716424);
        setIntField(term143367, term143367.getClass(), "vertex", -336361673);
        setIntField(term143367, term143367.getClass(), "level", -888670168);
        setIntField(term143367, term143367.getClass(), "order", 345955140);
        setField(term143367, term143367.getClass(), "parent", null);
        setField(term143362, term143362.getClass(), "parent", term143367);
        setField(term143357, term143357.getClass(), "parent", term143362);
        setField(term143352, term143352.getClass(), "parent", term143357);
        setField(term143347, term143347.getClass(), "parent", term143352);
        term143372 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143377 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143382 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143387 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term143392 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term143372, term143372.getClass(), "component", 1451028314);
        setIntField(term143372, term143372.getClass(), "vertex", -1695166129);
        setIntField(term143372, term143372.getClass(), "level", 531351716);
        setIntField(term143372, term143372.getClass(), "order", 1907315122);
        setIntField(term143377, term143377.getClass(), "component", 1709551824);
        setIntField(term143377, term143377.getClass(), "vertex", -1536600036);
        setIntField(term143377, term143377.getClass(), "level", -2054715083);
        setIntField(term143377, term143377.getClass(), "order", -830530443);
        setIntField(term143382, term143382.getClass(), "component", -1413112183);
        setIntField(term143382, term143382.getClass(), "vertex", 1955556267);
        setIntField(term143382, term143382.getClass(), "level", 1486776860);
        setIntField(term143382, term143382.getClass(), "order", 116568850);
        setIntField(term143387, term143387.getClass(), "component", -1493940533);
        setIntField(term143387, term143387.getClass(), "vertex", 1726207026);
        setIntField(term143387, term143387.getClass(), "level", 914752391);
        setIntField(term143387, term143387.getClass(), "order", -1984902992);
        setIntField(term143392, term143392.getClass(), "component", -598191204);
        setIntField(term143392, term143392.getClass(), "vertex", -853469336);
        setIntField(term143392, term143392.getClass(), "level", -59523799);
        setIntField(term143392, term143392.getClass(), "order", 704304890);
        setField(term143392, term143392.getClass(), "parent", null);
        setField(term143387, term143387.getClass(), "parent", term143392);
        setField(term143382, term143382.getClass(), "parent", term143387);
        setField(term143377, term143377.getClass(), "parent", term143382);
        setField(term143372, term143372.getClass(), "parent", term143377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term143372;
        callMethod(klass, "isAncestorOf", argTypes, term143347, args);
    }

};


