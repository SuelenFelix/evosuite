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

public class SearchNode_order_2929583006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2773;

    public SearchNode_order_2929583006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2773 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2778 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2783 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2788 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2793 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2773, term2773.getClass(), "component", 996017434);
        setIntField(term2773, term2773.getClass(), "vertex", -983870300);
        setIntField(term2773, term2773.getClass(), "level", 360715062);
        setIntField(term2773, term2773.getClass(), "order", 1047409266);
        setIntField(term2778, term2778.getClass(), "component", 1427248961);
        setIntField(term2778, term2778.getClass(), "vertex", 1445291866);
        setIntField(term2778, term2778.getClass(), "level", -139927812);
        setIntField(term2778, term2778.getClass(), "order", -2065157320);
        setIntField(term2783, term2783.getClass(), "component", 1782011477);
        setIntField(term2783, term2783.getClass(), "vertex", 2129957018);
        setIntField(term2783, term2783.getClass(), "level", 691663312);
        setIntField(term2783, term2783.getClass(), "order", -1236696275);
        setIntField(term2788, term2788.getClass(), "component", 575249858);
        setIntField(term2788, term2788.getClass(), "vertex", -297957951);
        setIntField(term2788, term2788.getClass(), "level", -1816920588);
        setIntField(term2788, term2788.getClass(), "order", 1674165862);
        setIntField(term2793, term2793.getClass(), "component", 1875252647);
        setIntField(term2793, term2793.getClass(), "vertex", -1298688401);
        setIntField(term2793, term2793.getClass(), "level", 1907832341);
        setIntField(term2793, term2793.getClass(), "order", 932199784);
        setField(term2793, term2793.getClass(), "parent", null);
        setField(term2788, term2788.getClass(), "parent", term2793);
        setField(term2783, term2783.getClass(), "parent", term2788);
        setField(term2778, term2778.getClass(), "parent", term2783);
        setField(term2773, term2773.getClass(), "parent", term2778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.SearchNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "order", argTypes, term2773, args);
    }

};


