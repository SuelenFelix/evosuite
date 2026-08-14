package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class BoruvkaMinimumSpanningTreeParallel_updateCheapestEdges_9863009333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;

    public BoruvkaMinimumSpanningTreeParallel_updateCheapestEdges_9863009333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1269 = new HashMap();
        Set<Object> term1295 =  ((Map) term1269).keySet();
        HashSet term1268 = new HashSet((Collection<? extends Object>) term1295);
        term1259 = newInstance(Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeParallel"));
        Object[] term1260 = (Object[]) newArray("org.graph4j.Edge", 0);
        Object term1262 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term1263 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1265 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1266 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term1281 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        Object[] term1285 = (Object[]) newArray("org.graph4j.Edge", 2);
        Object term1286 = newInstance(Class.forName("org.graph4j.Edge"));
        Object term1290 = newInstance(Class.forName("org.graph4j.Edge"));
        setField(term1259, term1259.getClass(), "allEdges", term1260);
        setIntField(term1259, term1259.getClass(), "nrThreads", 574481092);
        setIntField(term1263, term1263.getClass(), "value", 1162663216);
        setField(term1262, term1262.getClass(), "ctl", term1263);
        setField(term1262, term1262.getClass(), "workQueue", null);
        setField(term1266, term1266.getClass(), "head", null);
        setField(term1266, term1266.getClass(), "tail", null);
        setIntField(term1266, term1266.getClass(), "state", 0);
        setField(term1266, term1266.getClass(), "exclusiveOwnerThread", null);
        setField(term1265, term1265.getClass(), "sync", term1266);
        setField(term1262, term1262.getClass(), "mainLock", term1265);
        setField(term1262, term1262.getClass(), "workers", term1268);
        setField(term1262, term1262.getClass(), "termination", null);
        setIntField(term1262, term1262.getClass(), "largestPoolSize", -1015274146);
        setLongField(term1262, term1262.getClass(), "completedTaskCount", -8400487765614892086L);
        setField(term1262, term1262.getClass(), "threadFactory", null);
        setField(term1262, term1262.getClass(), "handler", null);
        setLongField(term1262, term1262.getClass(), "keepAliveTime", 0L);
        setBooleanField(term1262, term1262.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term1262, term1262.getClass(), "corePoolSize", 0);
        setIntField(term1262, term1262.getClass(), "maximumPoolSize", 0);
        setField(term1259, term1259.getClass(), "executor", term1262);
        setIntField(term1281, term1281.getClass(), "numVertices", 0);
        setBooleanField(term1281, term1281.getClass(), "pathCompression", false);
        setField(term1281, term1281.getClass(), "parent", null);
        setIntField(term1281, term1281.getClass(), "numSets", 0);
        setField(term1259, term1259.getClass(), "uf", term1281);
        setBooleanField(term1286, term1286.getClass(), "directed", false);
        setIntField(term1286, term1286.getClass(), "source", 0);
        setIntField(term1286, term1286.getClass(), "target", 0);
        setField(term1286, term1286.getClass(), "data", null);
        setField(term1286, term1286.getClass(), "label", null);
        setElement(term1285, 0, term1286);
        setBooleanField(term1290, term1290.getClass(), "directed", false);
        setIntField(term1290, term1290.getClass(), "source", 0);
        setIntField(term1290, term1290.getClass(), "target", 0);
        setField(term1290, term1290.getClass(), "data", null);
        setField(term1290, term1290.getClass(), "label", null);
        setElement(term1285, 1, term1290);
        setField(term1259, term1259.getClass(), "cheapest", term1285);
        setField(term1259, term1259.getClass(), "tree", null);
        setField(term1259, term1259.getClass(), "treeEdges", null);
        setField(term1259, term1259.getClass(), "minWeight", null);
        setField(term1259, term1259.getClass(), "graph", null);
        setBooleanField(term1259, term1259.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.BoruvkaMinimumSpanningTreeParallel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateCheapestEdges", argTypes, term1259, args);
    }

};


