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

public class FsmBuilder_when_6898764252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228;

    public FsmBuilder_when_6898764252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term229 = new ArrayList();
        LinkedList term233 = new LinkedList();
        HashMap term292 = new HashMap();
        Set<Object> term351 =  ((Map) term292).keySet();
        HashSet term291 = new HashSet((Collection<? extends Object>) term351);
        term228 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        Object term272 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term273 = (Object[]) newArray("java.lang.Object", 0);
        Object term275 = newInstance(Class.forName("java.util.concurrent.Executors$FinalizableDelegatedExecutorService"));
        Object term276 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term277 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term279 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue"));
        Object term281 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term283 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Node"));
        Object term284 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term285 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term286 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term287 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term288 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term289 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term297 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term300 = newInstance(Class.forName("java.util.concurrent.Executors$DefaultThreadFactory"));
        Object term301 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term308 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term311 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$AbortPolicy"));
        Object term316 = newInstance(Class.forName("java.lang.Object"));
        setField(term228, term228.getClass(), "transitions", term229);
        setField(term228, term228.getClass(), "transitionActions", term233);
        setField(term228, term228.getClass(), "actionProxy", null);
        setField(term228, term228.getClass(), "loggerName", "com.digitalpetri.fsm.StrictMachine");
        setField(term272, term272.getClass(), "table", term273);
        setIntField(term272, term272.getClass(), "size", 0);
        setField(term272, term272.getClass(), "keySet", null);
        setField(term272, term272.getClass(), "values", null);
        setField(term228, term228.getClass(), "mdc", term272);
        setIntField(term277, term277.getClass(), "value", -536870912);
        setField(term276, term276.getClass(), "ctl", term277);
        setIntField(term279, term279.getClass(), "capacity", 2147483647);
        setIntField(term281, term281.getClass(), "value", 0);
        setField(term279, term279.getClass(), "count", term281);
        setField(term283, term283.getClass(), "item", null);
        setField(term283, term283.getClass(), "next", null);
        setField(term279, term279.getClass(), "head", term283);
        setField(term279, term279.getClass(), "last", term283);
        setField(term284, term284.getClass(), "sync", null);
        setField(term279, term279.getClass(), "takeLock", term284);
        setField(term285, term285.getClass(), "firstWaiter", null);
        setField(term285, term285.getClass(), "lastWaiter", null);
        setField(term285, term285.getClass(), "this$0", null);
        setField(term279, term279.getClass(), "notEmpty", term285);
        setField(term286, term286.getClass(), "sync", null);
        setField(term279, term279.getClass(), "putLock", term286);
        setField(term287, term287.getClass(), "firstWaiter", null);
        setField(term287, term287.getClass(), "lastWaiter", null);
        setField(term287, term287.getClass(), "this$0", null);
        setField(term279, term279.getClass(), "notFull", term287);
        setField(term276, term276.getClass(), "workQueue", term279);
        setField(term289, term289.getClass(), "head", null);
        setField(term289, term289.getClass(), "tail", null);
        setIntField(term289, term289.getClass(), "state", 0);
        setField(term289, term289.getClass(), "exclusiveOwnerThread", null);
        setField(term288, term288.getClass(), "sync", term289);
        setField(term276, term276.getClass(), "mainLock", term288);
        setField(term276, term276.getClass(), "workers", term291);
        setField(term297, term297.getClass(), "firstWaiter", null);
        setField(term297, term297.getClass(), "lastWaiter", null);
        setField(term297, term297.getClass(), "this$0", term289);
        setField(term276, term276.getClass(), "termination", term297);
        setIntField(term276, term276.getClass(), "largestPoolSize", 0);
        setLongField(term276, term276.getClass(), "completedTaskCount", 0L);
        setField(term301, term301.getClass(), "parent", null);
        setField(term301, term301.getClass(), "name", null);
        setIntField(term301, term301.getClass(), "maxPriority", 10);
        setBooleanField(term301, term301.getClass(), "destroyed", false);
        setBooleanField(term301, term301.getClass(), "daemon", false);
        setIntField(term301, term301.getClass(), "nUnstartedThreads", 2);
        setIntField(term301, term301.getClass(), "nthreads", 15);
        setField(term301, term301.getClass(), "threads", null);
        setIntField(term301, term301.getClass(), "ngroups", 0);
        setField(term301, term301.getClass(), "groups", null);
        setField(term300, term300.getClass(), "group", term301);
        setIntField(term308, term308.getClass(), "value", 1);
        setField(term300, term300.getClass(), "threadNumber", term308);
        setField(term300, term300.getClass(), "namePrefix", "");
        setField(term276, term276.getClass(), "threadFactory", term300);
        setField(term276, term276.getClass(), "handler", term311);
        setLongField(term276, term276.getClass(), "keepAliveTime", 0L);
        setBooleanField(term276, term276.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term276, term276.getClass(), "corePoolSize", 1);
        setIntField(term276, term276.getClass(), "maximumPoolSize", 1);
        setField(term275, term275.getClass(), "e", term276);
        setField(term228, term228.getClass(), "executor", term275);
        setField(term228, term228.getClass(), "userContext", term316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "when", argTypes, term228, args);
    }

};


