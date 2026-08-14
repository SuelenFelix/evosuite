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
import java.util.LinkedList;
import java.lang.Object;

public class BFSTraverser_numComponents_19944032996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383;

    public BFSTraverser_numComponents_19944032996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term388 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term393 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term388, term388.getClass(), "component", -916584829);
        setIntField(term388, term388.getClass(), "vertex", -2131181468);
        setIntField(term388, term388.getClass(), "level", 282916351);
        setIntField(term388, term388.getClass(), "order", 880977281);
        setIntField(term393, term393.getClass(), "component", 371943306);
        setIntField(term393, term393.getClass(), "vertex", 982388293);
        setIntField(term393, term393.getClass(), "level", -159494544);
        setIntField(term393, term393.getClass(), "order", -75206835);
        setField(term393, term393.getClass(), "parent", null);
        setField(term388, term388.getClass(), "parent", term393);
        Object term399 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term399, term399.getClass(), "component", -209654048);
        setIntField(term399, term399.getClass(), "vertex", 477625804);
        setIntField(term399, term399.getClass(), "level", 252575029);
        setIntField(term399, term399.getClass(), "order", 57189932);
        setField(term399, term399.getClass(), "parent", null);
        LinkedList term385 = new LinkedList();
        ((LinkedList) term385).add(term388);
        ((LinkedList) term385).add(term399);
        term383 = newInstance(Class.forName("org.graph4j.traversal.BFSTraverser"));
        Object[] term407 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 3);
        Object term408 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term413 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term418 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setField(term383, term383.getClass(), "graph", null);
        setBooleanField(term383, term383.getClass(), "directed", false);
        setField(term383, term383.getClass(), "visitor", null);
        setField(term383, term383.getClass(), "queue", term385);
        setIntField(term383, term383.getClass(), "orderIndex", 1935707624);
        setIntField(term383, term383.getClass(), "compIndex", 1507074215);
        setElement(term407, 0, term399);
        setElement(term407, 1, term388);
        setIntField(term408, term408.getClass(), "component", -1254072822);
        setIntField(term408, term408.getClass(), "vertex", -1111249833);
        setIntField(term408, term408.getClass(), "level", -1692331299);
        setIntField(term408, term408.getClass(), "order", 479531250);
        setIntField(term413, term413.getClass(), "component", 1320570890);
        setIntField(term413, term413.getClass(), "vertex", -130649791);
        setIntField(term413, term413.getClass(), "level", 534834644);
        setIntField(term413, term413.getClass(), "order", 1959097203);
        setIntField(term418, term418.getClass(), "component", 0);
        setIntField(term418, term418.getClass(), "vertex", 0);
        setIntField(term418, term418.getClass(), "level", 0);
        setIntField(term418, term418.getClass(), "order", 0);
        setField(term418, term418.getClass(), "parent", null);
        setField(term413, term413.getClass(), "parent", term418);
        setField(term408, term408.getClass(), "parent", term413);
        setElement(term407, 2, term408);
        setField(term383, term383.getClass(), "visited", term407);
        setIntField(term383, term383.getClass(), "restartIndex", -282881827);
        setIntField(term383, term383.getClass(), "maxLevel", -1183353915);
        setBooleanField(term383, term383.getClass(), "interrupted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numComponents", argTypes, term383, args);
    }

};


