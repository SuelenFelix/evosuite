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

public class FsmBuilder_onTransitionTo_8652264944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476;

    public FsmBuilder_onTransitionTo_8652264944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term477 = new ArrayList();
        LinkedList term481 = new LinkedList();
        HashMap term540 = new HashMap();
        Set<Object> term599 =  ((Map) term540).keySet();
        HashSet term539 = new HashSet((Collection<? extends Object>) term599);
        term476 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        Object term520 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term521 = (Object[]) newArray("java.lang.Object", 0);
        Object term523 = newInstance(Class.forName("java.util.concurrent.Executors$FinalizableDelegatedExecutorService"));
        Object term524 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term525 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term527 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue"));
        Object term529 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term531 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Node"));
        Object term532 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term533 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term534 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term535 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term536 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term537 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term545 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term548 = newInstance(Class.forName("java.util.concurrent.Executors$DefaultThreadFactory"));
        Object term549 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term556 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term559 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$AbortPolicy"));
        Object term564 = newInstance(Class.forName("java.lang.Object"));
        setField(term476, term476.getClass(), "transitions", term477);
        setField(term476, term476.getClass(), "transitionActions", term481);
        setField(term476, term476.getClass(), "actionProxy", null);
        setField(term476, term476.getClass(), "loggerName", "com.digitalpetri.fsm.StrictMachine");
        setField(term520, term520.getClass(), "table", term521);
        setIntField(term520, term520.getClass(), "size", 0);
        setField(term520, term520.getClass(), "keySet", null);
        setField(term520, term520.getClass(), "values", null);
        setField(term476, term476.getClass(), "mdc", term520);
        setIntField(term525, term525.getClass(), "value", -536870912);
        setField(term524, term524.getClass(), "ctl", term525);
        setIntField(term527, term527.getClass(), "capacity", 2147483647);
        setIntField(term529, term529.getClass(), "value", 0);
        setField(term527, term527.getClass(), "count", term529);
        setField(term531, term531.getClass(), "item", null);
        setField(term531, term531.getClass(), "next", null);
        setField(term527, term527.getClass(), "head", term531);
        setField(term527, term527.getClass(), "last", term531);
        setField(term532, term532.getClass(), "sync", null);
        setField(term527, term527.getClass(), "takeLock", term532);
        setField(term533, term533.getClass(), "firstWaiter", null);
        setField(term533, term533.getClass(), "lastWaiter", null);
        setField(term533, term533.getClass(), "this$0", null);
        setField(term527, term527.getClass(), "notEmpty", term533);
        setField(term534, term534.getClass(), "sync", null);
        setField(term527, term527.getClass(), "putLock", term534);
        setField(term535, term535.getClass(), "firstWaiter", null);
        setField(term535, term535.getClass(), "lastWaiter", null);
        setField(term535, term535.getClass(), "this$0", null);
        setField(term527, term527.getClass(), "notFull", term535);
        setField(term524, term524.getClass(), "workQueue", term527);
        setField(term537, term537.getClass(), "head", null);
        setField(term537, term537.getClass(), "tail", null);
        setIntField(term537, term537.getClass(), "state", 0);
        setField(term537, term537.getClass(), "exclusiveOwnerThread", null);
        setField(term536, term536.getClass(), "sync", term537);
        setField(term524, term524.getClass(), "mainLock", term536);
        setField(term524, term524.getClass(), "workers", term539);
        setField(term545, term545.getClass(), "firstWaiter", null);
        setField(term545, term545.getClass(), "lastWaiter", null);
        setField(term545, term545.getClass(), "this$0", term537);
        setField(term524, term524.getClass(), "termination", term545);
        setIntField(term524, term524.getClass(), "largestPoolSize", 0);
        setLongField(term524, term524.getClass(), "completedTaskCount", 0L);
        setField(term549, term549.getClass(), "parent", null);
        setField(term549, term549.getClass(), "name", null);
        setIntField(term549, term549.getClass(), "maxPriority", 10);
        setBooleanField(term549, term549.getClass(), "destroyed", false);
        setBooleanField(term549, term549.getClass(), "daemon", false);
        setIntField(term549, term549.getClass(), "nUnstartedThreads", 2);
        setIntField(term549, term549.getClass(), "nthreads", 15);
        setField(term549, term549.getClass(), "threads", null);
        setIntField(term549, term549.getClass(), "ngroups", 0);
        setField(term549, term549.getClass(), "groups", null);
        setField(term548, term548.getClass(), "group", term549);
        setIntField(term556, term556.getClass(), "value", 1);
        setField(term548, term548.getClass(), "threadNumber", term556);
        setField(term548, term548.getClass(), "namePrefix", "");
        setField(term524, term524.getClass(), "threadFactory", term548);
        setField(term524, term524.getClass(), "handler", term559);
        setLongField(term524, term524.getClass(), "keepAliveTime", 0L);
        setBooleanField(term524, term524.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term524, term524.getClass(), "corePoolSize", 1);
        setIntField(term524, term524.getClass(), "maximumPoolSize", 1);
        setField(term523, term523.getClass(), "e", term524);
        setField(term476, term476.getClass(), "executor", term523);
        setField(term476, term476.getClass(), "userContext", term564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onTransitionTo", argTypes, term476, args);
    }

};


