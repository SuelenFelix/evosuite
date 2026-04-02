package com.digitalpetri.fsm.dsl;

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
import static com.digitalpetri.fsm.dsl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FsmBuilder_build_130742170511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1344;

    public FsmBuilder_build_130742170511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1345 = new ArrayList();
        LinkedList term1349 = new LinkedList();
        HashMap term1408 = new HashMap();
        Set<Object> term1467 =  ((Map) term1408).keySet();
        HashSet term1407 = new HashSet((Collection<? extends Object>) term1467);
        term1344 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        Object term1388 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term1389 = (Object[]) newArray("java.lang.Object", 0);
        Object term1391 = newInstance(Class.forName("java.util.concurrent.Executors$FinalizableDelegatedExecutorService"));
        Object term1392 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term1393 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1395 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue"));
        Object term1397 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1399 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Node"));
        Object term1400 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1401 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1402 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1403 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1404 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1405 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term1413 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1416 = newInstance(Class.forName("java.util.concurrent.Executors$DefaultThreadFactory"));
        Object term1417 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term1424 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1427 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$AbortPolicy"));
        Object term1432 = newInstance(Class.forName("java.lang.Object"));
        setField(term1344, term1344.getClass(), "transitions", term1345);
        setField(term1344, term1344.getClass(), "transitionActions", term1349);
        setField(term1344, term1344.getClass(), "actionProxy", null);
        setField(term1344, term1344.getClass(), "loggerName", "com.digitalpetri.fsm.StrictMachine");
        setField(term1388, term1388.getClass(), "table", term1389);
        setIntField(term1388, term1388.getClass(), "size", 0);
        setField(term1388, term1388.getClass(), "keySet", null);
        setField(term1388, term1388.getClass(), "values", null);
        setField(term1344, term1344.getClass(), "mdc", term1388);
        setIntField(term1393, term1393.getClass(), "value", -536870912);
        setField(term1392, term1392.getClass(), "ctl", term1393);
        setIntField(term1395, term1395.getClass(), "capacity", 2147483647);
        setIntField(term1397, term1397.getClass(), "value", 0);
        setField(term1395, term1395.getClass(), "count", term1397);
        setField(term1399, term1399.getClass(), "item", null);
        setField(term1399, term1399.getClass(), "next", null);
        setField(term1395, term1395.getClass(), "head", term1399);
        setField(term1395, term1395.getClass(), "last", term1399);
        setField(term1400, term1400.getClass(), "sync", null);
        setField(term1395, term1395.getClass(), "takeLock", term1400);
        setField(term1401, term1401.getClass(), "firstWaiter", null);
        setField(term1401, term1401.getClass(), "lastWaiter", null);
        setField(term1401, term1401.getClass(), "this$0", null);
        setField(term1395, term1395.getClass(), "notEmpty", term1401);
        setField(term1402, term1402.getClass(), "sync", null);
        setField(term1395, term1395.getClass(), "putLock", term1402);
        setField(term1403, term1403.getClass(), "firstWaiter", null);
        setField(term1403, term1403.getClass(), "lastWaiter", null);
        setField(term1403, term1403.getClass(), "this$0", null);
        setField(term1395, term1395.getClass(), "notFull", term1403);
        setField(term1392, term1392.getClass(), "workQueue", term1395);
        setField(term1405, term1405.getClass(), "head", null);
        setField(term1405, term1405.getClass(), "tail", null);
        setIntField(term1405, term1405.getClass(), "state", 0);
        setField(term1405, term1405.getClass(), "exclusiveOwnerThread", null);
        setField(term1404, term1404.getClass(), "sync", term1405);
        setField(term1392, term1392.getClass(), "mainLock", term1404);
        setField(term1392, term1392.getClass(), "workers", term1407);
        setField(term1413, term1413.getClass(), "firstWaiter", null);
        setField(term1413, term1413.getClass(), "lastWaiter", null);
        setField(term1413, term1413.getClass(), "this$0", term1405);
        setField(term1392, term1392.getClass(), "termination", term1413);
        setIntField(term1392, term1392.getClass(), "largestPoolSize", 0);
        setLongField(term1392, term1392.getClass(), "completedTaskCount", 0L);
        setField(term1417, term1417.getClass(), "parent", null);
        setField(term1417, term1417.getClass(), "name", null);
        setIntField(term1417, term1417.getClass(), "maxPriority", 10);
        setBooleanField(term1417, term1417.getClass(), "destroyed", false);
        setBooleanField(term1417, term1417.getClass(), "daemon", false);
        setIntField(term1417, term1417.getClass(), "nUnstartedThreads", 2);
        setIntField(term1417, term1417.getClass(), "nthreads", 15);
        setField(term1417, term1417.getClass(), "threads", null);
        setIntField(term1417, term1417.getClass(), "ngroups", 0);
        setField(term1417, term1417.getClass(), "groups", null);
        setField(term1416, term1416.getClass(), "group", term1417);
        setIntField(term1424, term1424.getClass(), "value", 1);
        setField(term1416, term1416.getClass(), "threadNumber", term1424);
        setField(term1416, term1416.getClass(), "namePrefix", "");
        setField(term1392, term1392.getClass(), "threadFactory", term1416);
        setField(term1392, term1392.getClass(), "handler", term1427);
        setLongField(term1392, term1392.getClass(), "keepAliveTime", 0L);
        setBooleanField(term1392, term1392.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term1392, term1392.getClass(), "corePoolSize", 1);
        setIntField(term1392, term1392.getClass(), "maximumPoolSize", 1);
        setField(term1391, term1391.getClass(), "e", term1392);
        setField(term1344, term1344.getClass(), "executor", term1391);
        setField(term1344, term1344.getClass(), "userContext", term1432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "build", argTypes, term1344, args);
    }

};


