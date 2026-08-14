package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class BacktrackVertexSeparator_init_11834659404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979;

    public BacktrackVertexSeparator_init_11834659404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term1041 = new ArrayDeque();
        ((ArrayDeque) term1041).add((Object)null);
        ((ArrayDeque) term1041).add((Object)null);
        ((ArrayDeque) term1041).add((Object)null);
        ((ArrayDeque) term1041).add((Object)null);
        ((ArrayDeque) term1041).add((Object)null);
        ((ArrayDeque) term1041).add((Object)null);
        Object term1038 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator$Worker"));
        Object[] term1040 = (Object[]) newArray("[I", 0);
        Object term1049 = newInstance(Class.forName("java.lang.ThreadGroup"));
        setBooleanField(term1038, term1038.getClass(), "running", false);
        setField(term1038, term1038.getClass(), "assignQueue", term1040);
        setField(term1038, term1038.getClass(), "nodeStack", term1041);
        setField(term1038, term1038.getClass(), "this$0", null);
        setField(term1038, term1038.getClass(), "name", "");
        setIntField(term1038, term1038.getClass(), "priority", 520504102);
        setBooleanField(term1038, term1038.getClass(), "daemon", false);
        setBooleanField(term1038, term1038.getClass(), "stillborn", true);
        setLongField(term1038, term1038.getClass(), "eetop", 4044358158040652353L);
        setField(term1038, term1038.getClass(), "target", null);
        setField(term1049, term1049.getClass(), "parent", null);
        setField(term1049, term1049.getClass(), "name", null);
        setIntField(term1049, term1049.getClass(), "maxPriority", 10);
        setBooleanField(term1049, term1049.getClass(), "destroyed", false);
        setBooleanField(term1049, term1049.getClass(), "daemon", false);
        setIntField(term1049, term1049.getClass(), "nUnstartedThreads", 0);
        setIntField(term1049, term1049.getClass(), "nthreads", 0);
        setField(term1049, term1049.getClass(), "threads", null);
        setIntField(term1049, term1049.getClass(), "ngroups", 0);
        setField(term1049, term1049.getClass(), "groups", null);
        setField(term1038, term1038.getClass(), "group", term1049);
        setField(term1038, term1038.getClass(), "contextClassLoader", null);
        setField(term1038, term1038.getClass(), "inheritedAccessControlContext", null);
        setField(term1038, term1038.getClass(), "threadLocals", null);
        setField(term1038, term1038.getClass(), "inheritableThreadLocals", null);
        setLongField(term1038, term1038.getClass(), "stackSize", 0L);
        setLongField(term1038, term1038.getClass(), "tid", 0L);
        setIntField(term1038, term1038.getClass(), "threadStatus", 0);
        setField(term1038, term1038.getClass(), "parkBlocker", null);
        setField(term1038, term1038.getClass(), "blocker", null);
        setField(term1038, term1038.getClass(), "blockerLock", null);
        setField(term1038, term1038.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1038, term1038.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1038, term1038.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1038, term1038.getClass(), "threadLocalRandomSecondarySeed", 0);
        ArrayList term1036 = new ArrayList();
        ((ArrayList) term1036).add(term1038);
        term979 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term1075 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        setLongField(term979, term979.getClass(), "timeLimit", -2068172595987555756L);
        setLongField(term979, term979.getClass(), "startTime", -6292278961887936280L);
        setBooleanField(term979, term979.getClass(), "timeExpired", true);
        setField(term1075, term1075.getClass(), "graph", null);
        setField(term1075, term1075.getClass(), "separator", null);
        setField(term1075, term1075.getClass(), "leftShore", null);
        setField(term1075, term1075.getClass(), "rightShore", null);
        setIntField(term1075, term1075.getClass(), "maxShoreSize", 0);
        setField(term979, term979.getClass(), "solution", term1075);
        setField(term979, term979.getClass(), "workers", term1036);
        setLongField(term979, term979.getClass(), "nodesExplored", -4443169559037975007L);
        setIntField(term979, term979.getClass(), "minSepSize", -457396133);
        setIntField(term979, term979.getClass(), "vertexConnectivity", -1793950607);
        setIntField(term979, term979.getClass(), "greedySepSize", 1091954101);
        setIntField(term979, term979.getClass(), "LEFT", 1895143076);
        setIntField(term979, term979.getClass(), "RIGHT", 1981860404);
        setIntField(term979, term979.getClass(), "SEP", 732174235);
        setIntField(term979, term979.getClass(), "UNKNOWN", 470895808);
        setIntField(term979, term979.getClass(), "FAILURE", 1787325291);
        setIntField(term979, term979.getClass(), "POTENTIAL_SOLUTION", 1470349147);
        setIntField(term979, term979.getClass(), "maxShoreSize", -255317272);
        setField(term979, term979.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term979, args);
    }

};


