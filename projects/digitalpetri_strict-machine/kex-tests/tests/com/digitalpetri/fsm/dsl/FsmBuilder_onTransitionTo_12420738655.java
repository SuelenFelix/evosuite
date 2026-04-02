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

public class FsmBuilder_onTransitionTo_12420738655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600;

    public FsmBuilder_onTransitionTo_12420738655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term601 = new ArrayList();
        LinkedList term605 = new LinkedList();
        HashMap term664 = new HashMap();
        Set<Object> term723 =  ((Map) term664).keySet();
        HashSet term663 = new HashSet((Collection<? extends Object>) term723);
        term600 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        Object term644 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term645 = (Object[]) newArray("java.lang.Object", 0);
        Object term647 = newInstance(Class.forName("java.util.concurrent.Executors$FinalizableDelegatedExecutorService"));
        Object term648 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term649 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term651 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue"));
        Object term653 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term655 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Node"));
        Object term656 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term657 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term658 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term659 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term660 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term661 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term669 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term672 = newInstance(Class.forName("java.util.concurrent.Executors$DefaultThreadFactory"));
        Object term673 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term680 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term683 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$AbortPolicy"));
        Object term688 = newInstance(Class.forName("java.lang.Object"));
        setField(term600, term600.getClass(), "transitions", term601);
        setField(term600, term600.getClass(), "transitionActions", term605);
        setField(term600, term600.getClass(), "actionProxy", null);
        setField(term600, term600.getClass(), "loggerName", "com.digitalpetri.fsm.StrictMachine");
        setField(term644, term644.getClass(), "table", term645);
        setIntField(term644, term644.getClass(), "size", 0);
        setField(term644, term644.getClass(), "keySet", null);
        setField(term644, term644.getClass(), "values", null);
        setField(term600, term600.getClass(), "mdc", term644);
        setIntField(term649, term649.getClass(), "value", -536870912);
        setField(term648, term648.getClass(), "ctl", term649);
        setIntField(term651, term651.getClass(), "capacity", 2147483647);
        setIntField(term653, term653.getClass(), "value", 0);
        setField(term651, term651.getClass(), "count", term653);
        setField(term655, term655.getClass(), "item", null);
        setField(term655, term655.getClass(), "next", null);
        setField(term651, term651.getClass(), "head", term655);
        setField(term651, term651.getClass(), "last", term655);
        setField(term656, term656.getClass(), "sync", null);
        setField(term651, term651.getClass(), "takeLock", term656);
        setField(term657, term657.getClass(), "firstWaiter", null);
        setField(term657, term657.getClass(), "lastWaiter", null);
        setField(term657, term657.getClass(), "this$0", null);
        setField(term651, term651.getClass(), "notEmpty", term657);
        setField(term658, term658.getClass(), "sync", null);
        setField(term651, term651.getClass(), "putLock", term658);
        setField(term659, term659.getClass(), "firstWaiter", null);
        setField(term659, term659.getClass(), "lastWaiter", null);
        setField(term659, term659.getClass(), "this$0", null);
        setField(term651, term651.getClass(), "notFull", term659);
        setField(term648, term648.getClass(), "workQueue", term651);
        setField(term661, term661.getClass(), "head", null);
        setField(term661, term661.getClass(), "tail", null);
        setIntField(term661, term661.getClass(), "state", 0);
        setField(term661, term661.getClass(), "exclusiveOwnerThread", null);
        setField(term660, term660.getClass(), "sync", term661);
        setField(term648, term648.getClass(), "mainLock", term660);
        setField(term648, term648.getClass(), "workers", term663);
        setField(term669, term669.getClass(), "firstWaiter", null);
        setField(term669, term669.getClass(), "lastWaiter", null);
        setField(term669, term669.getClass(), "this$0", term661);
        setField(term648, term648.getClass(), "termination", term669);
        setIntField(term648, term648.getClass(), "largestPoolSize", 0);
        setLongField(term648, term648.getClass(), "completedTaskCount", 0L);
        setField(term673, term673.getClass(), "parent", null);
        setField(term673, term673.getClass(), "name", null);
        setIntField(term673, term673.getClass(), "maxPriority", 10);
        setBooleanField(term673, term673.getClass(), "destroyed", false);
        setBooleanField(term673, term673.getClass(), "daemon", false);
        setIntField(term673, term673.getClass(), "nUnstartedThreads", 2);
        setIntField(term673, term673.getClass(), "nthreads", 15);
        setField(term673, term673.getClass(), "threads", null);
        setIntField(term673, term673.getClass(), "ngroups", 0);
        setField(term673, term673.getClass(), "groups", null);
        setField(term672, term672.getClass(), "group", term673);
        setIntField(term680, term680.getClass(), "value", 1);
        setField(term672, term672.getClass(), "threadNumber", term680);
        setField(term672, term672.getClass(), "namePrefix", "");
        setField(term648, term648.getClass(), "threadFactory", term672);
        setField(term648, term648.getClass(), "handler", term683);
        setLongField(term648, term648.getClass(), "keepAliveTime", 0L);
        setBooleanField(term648, term648.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term648, term648.getClass(), "corePoolSize", 1);
        setIntField(term648, term648.getClass(), "maximumPoolSize", 1);
        setField(term647, term647.getClass(), "e", term648);
        setField(term600, term600.getClass(), "executor", term647);
        setField(term600, term600.getClass(), "userContext", term688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Predicate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onTransitionTo", argTypes, term600, args);
    }

};


