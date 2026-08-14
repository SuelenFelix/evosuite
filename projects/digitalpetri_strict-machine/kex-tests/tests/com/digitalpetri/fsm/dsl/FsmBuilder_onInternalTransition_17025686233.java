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

public class FsmBuilder_onInternalTransition_17025686233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;

    public FsmBuilder_onInternalTransition_17025686233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term353 = new ArrayList();
        LinkedList term357 = new LinkedList();
        HashMap term416 = new HashMap();
        Set<Object> term475 =  ((Map) term416).keySet();
        HashSet term415 = new HashSet((Collection<? extends Object>) term475);
        term352 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        Object term396 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term397 = (Object[]) newArray("java.lang.Object", 0);
        Object term399 = newInstance(Class.forName("java.util.concurrent.Executors$FinalizableDelegatedExecutorService"));
        Object term400 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term401 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term403 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue"));
        Object term405 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term407 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Node"));
        Object term408 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term409 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term410 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term411 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term412 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term413 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term421 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term424 = newInstance(Class.forName("java.util.concurrent.Executors$DefaultThreadFactory"));
        Object term425 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term432 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term435 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$AbortPolicy"));
        Object term440 = newInstance(Class.forName("java.lang.Object"));
        setField(term352, term352.getClass(), "transitions", term353);
        setField(term352, term352.getClass(), "transitionActions", term357);
        setField(term352, term352.getClass(), "actionProxy", null);
        setField(term352, term352.getClass(), "loggerName", "com.digitalpetri.fsm.StrictMachine");
        setField(term396, term396.getClass(), "table", term397);
        setIntField(term396, term396.getClass(), "size", 0);
        setField(term396, term396.getClass(), "keySet", null);
        setField(term396, term396.getClass(), "values", null);
        setField(term352, term352.getClass(), "mdc", term396);
        setIntField(term401, term401.getClass(), "value", -536870912);
        setField(term400, term400.getClass(), "ctl", term401);
        setIntField(term403, term403.getClass(), "capacity", 2147483647);
        setIntField(term405, term405.getClass(), "value", 0);
        setField(term403, term403.getClass(), "count", term405);
        setField(term407, term407.getClass(), "item", null);
        setField(term407, term407.getClass(), "next", null);
        setField(term403, term403.getClass(), "head", term407);
        setField(term403, term403.getClass(), "last", term407);
        setField(term408, term408.getClass(), "sync", null);
        setField(term403, term403.getClass(), "takeLock", term408);
        setField(term409, term409.getClass(), "firstWaiter", null);
        setField(term409, term409.getClass(), "lastWaiter", null);
        setField(term409, term409.getClass(), "this$0", null);
        setField(term403, term403.getClass(), "notEmpty", term409);
        setField(term410, term410.getClass(), "sync", null);
        setField(term403, term403.getClass(), "putLock", term410);
        setField(term411, term411.getClass(), "firstWaiter", null);
        setField(term411, term411.getClass(), "lastWaiter", null);
        setField(term411, term411.getClass(), "this$0", null);
        setField(term403, term403.getClass(), "notFull", term411);
        setField(term400, term400.getClass(), "workQueue", term403);
        setField(term413, term413.getClass(), "head", null);
        setField(term413, term413.getClass(), "tail", null);
        setIntField(term413, term413.getClass(), "state", 0);
        setField(term413, term413.getClass(), "exclusiveOwnerThread", null);
        setField(term412, term412.getClass(), "sync", term413);
        setField(term400, term400.getClass(), "mainLock", term412);
        setField(term400, term400.getClass(), "workers", term415);
        setField(term421, term421.getClass(), "firstWaiter", null);
        setField(term421, term421.getClass(), "lastWaiter", null);
        setField(term421, term421.getClass(), "this$0", term413);
        setField(term400, term400.getClass(), "termination", term421);
        setIntField(term400, term400.getClass(), "largestPoolSize", 0);
        setLongField(term400, term400.getClass(), "completedTaskCount", 0L);
        setField(term425, term425.getClass(), "parent", null);
        setField(term425, term425.getClass(), "name", null);
        setIntField(term425, term425.getClass(), "maxPriority", 10);
        setBooleanField(term425, term425.getClass(), "destroyed", false);
        setBooleanField(term425, term425.getClass(), "daemon", false);
        setIntField(term425, term425.getClass(), "nUnstartedThreads", 2);
        setIntField(term425, term425.getClass(), "nthreads", 15);
        setField(term425, term425.getClass(), "threads", null);
        setIntField(term425, term425.getClass(), "ngroups", 0);
        setField(term425, term425.getClass(), "groups", null);
        setField(term424, term424.getClass(), "group", term425);
        setIntField(term432, term432.getClass(), "value", 1);
        setField(term424, term424.getClass(), "threadNumber", term432);
        setField(term424, term424.getClass(), "namePrefix", "");
        setField(term400, term400.getClass(), "threadFactory", term424);
        setField(term400, term400.getClass(), "handler", term435);
        setLongField(term400, term400.getClass(), "keepAliveTime", 0L);
        setBooleanField(term400, term400.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term400, term400.getClass(), "corePoolSize", 1);
        setIntField(term400, term400.getClass(), "maximumPoolSize", 1);
        setField(term399, term399.getClass(), "e", term400);
        setField(term352, term352.getClass(), "executor", term399);
        setField(term352, term352.getClass(), "userContext", term440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onInternalTransition", argTypes, term352, args);
    }

};


