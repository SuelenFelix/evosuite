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
     Object term2823;
     Object term2848;

    public SearchNode_isAncestorOf_9439602698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2823 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2828 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2833 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2838 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2843 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2823, term2823.getClass(), "component", -765890956);
        setIntField(term2823, term2823.getClass(), "vertex", -214452542);
        setIntField(term2823, term2823.getClass(), "level", -21429773);
        setIntField(term2823, term2823.getClass(), "order", 1774728742);
        setIntField(term2828, term2828.getClass(), "component", -1822211508);
        setIntField(term2828, term2828.getClass(), "vertex", -177243872);
        setIntField(term2828, term2828.getClass(), "level", 1485047282);
        setIntField(term2828, term2828.getClass(), "order", 1624190794);
        setIntField(term2833, term2833.getClass(), "component", -773608881);
        setIntField(term2833, term2833.getClass(), "vertex", -1642688455);
        setIntField(term2833, term2833.getClass(), "level", -1184558215);
        setIntField(term2833, term2833.getClass(), "order", 2123688338);
        setIntField(term2838, term2838.getClass(), "component", -1051941387);
        setIntField(term2838, term2838.getClass(), "vertex", -640763660);
        setIntField(term2838, term2838.getClass(), "level", -1189468129);
        setIntField(term2838, term2838.getClass(), "order", -1099664830);
        setIntField(term2843, term2843.getClass(), "component", 873502011);
        setIntField(term2843, term2843.getClass(), "vertex", -2004575734);
        setIntField(term2843, term2843.getClass(), "level", 1491468856);
        setIntField(term2843, term2843.getClass(), "order", 962385185);
        setField(term2843, term2843.getClass(), "parent", null);
        setField(term2838, term2838.getClass(), "parent", term2843);
        setField(term2833, term2833.getClass(), "parent", term2838);
        setField(term2828, term2828.getClass(), "parent", term2833);
        setField(term2823, term2823.getClass(), "parent", term2828);
        term2848 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2853 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2858 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2863 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2868 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2848, term2848.getClass(), "component", 1561513428);
        setIntField(term2848, term2848.getClass(), "vertex", 778959809);
        setIntField(term2848, term2848.getClass(), "level", -7504064);
        setIntField(term2848, term2848.getClass(), "order", -1464364418);
        setIntField(term2853, term2853.getClass(), "component", 1050420173);
        setIntField(term2853, term2853.getClass(), "vertex", 994300935);
        setIntField(term2853, term2853.getClass(), "level", 433954476);
        setIntField(term2853, term2853.getClass(), "order", 1780958641);
        setIntField(term2858, term2858.getClass(), "component", 1890582085);
        setIntField(term2858, term2858.getClass(), "vertex", 2146568808);
        setIntField(term2858, term2858.getClass(), "level", 245081679);
        setIntField(term2858, term2858.getClass(), "order", 1199789398);
        setIntField(term2863, term2863.getClass(), "component", -1056402285);
        setIntField(term2863, term2863.getClass(), "vertex", 1881803912);
        setIntField(term2863, term2863.getClass(), "level", -188535038);
        setIntField(term2863, term2863.getClass(), "order", 254650626);
        setIntField(term2868, term2868.getClass(), "component", -1789030917);
        setIntField(term2868, term2868.getClass(), "vertex", 912208163);
        setIntField(term2868, term2868.getClass(), "level", 909767683);
        setIntField(term2868, term2868.getClass(), "order", -639390893);
        setField(term2868, term2868.getClass(), "parent", null);
        setField(term2863, term2863.getClass(), "parent", term2868);
        setField(term2858, term2858.getClass(), "parent", term2863);
        setField(term2853, term2853.getClass(), "parent", term2858);
        setField(term2848, term2848.getClass(), "parent", term2853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term2848;
        callMethod(klass, "isAncestorOf", argTypes, term2823, args);
    }

};


