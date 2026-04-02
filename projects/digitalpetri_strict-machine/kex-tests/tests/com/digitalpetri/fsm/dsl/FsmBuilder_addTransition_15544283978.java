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

public class FsmBuilder_addTransition_15544283978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term972;

    public FsmBuilder_addTransition_15544283978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term973 = new ArrayList();
        LinkedList term977 = new LinkedList();
        HashMap term1036 = new HashMap();
        Set<Object> term1095 =  ((Map) term1036).keySet();
        HashSet term1035 = new HashSet((Collection<? extends Object>) term1095);
        term972 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        Object term1016 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term1017 = (Object[]) newArray("java.lang.Object", 0);
        Object term1019 = newInstance(Class.forName("java.util.concurrent.Executors$FinalizableDelegatedExecutorService"));
        Object term1020 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term1021 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1023 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue"));
        Object term1025 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1027 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Node"));
        Object term1028 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1029 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1030 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1031 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1032 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1033 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term1041 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1044 = newInstance(Class.forName("java.util.concurrent.Executors$DefaultThreadFactory"));
        Object term1045 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term1052 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1055 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$AbortPolicy"));
        Object term1060 = newInstance(Class.forName("java.lang.Object"));
        setField(term972, term972.getClass(), "transitions", term973);
        setField(term972, term972.getClass(), "transitionActions", term977);
        setField(term972, term972.getClass(), "actionProxy", null);
        setField(term972, term972.getClass(), "loggerName", "com.digitalpetri.fsm.StrictMachine");
        setField(term1016, term1016.getClass(), "table", term1017);
        setIntField(term1016, term1016.getClass(), "size", 0);
        setField(term1016, term1016.getClass(), "keySet", null);
        setField(term1016, term1016.getClass(), "values", null);
        setField(term972, term972.getClass(), "mdc", term1016);
        setIntField(term1021, term1021.getClass(), "value", -536870912);
        setField(term1020, term1020.getClass(), "ctl", term1021);
        setIntField(term1023, term1023.getClass(), "capacity", 2147483647);
        setIntField(term1025, term1025.getClass(), "value", 0);
        setField(term1023, term1023.getClass(), "count", term1025);
        setField(term1027, term1027.getClass(), "item", null);
        setField(term1027, term1027.getClass(), "next", null);
        setField(term1023, term1023.getClass(), "head", term1027);
        setField(term1023, term1023.getClass(), "last", term1027);
        setField(term1028, term1028.getClass(), "sync", null);
        setField(term1023, term1023.getClass(), "takeLock", term1028);
        setField(term1029, term1029.getClass(), "firstWaiter", null);
        setField(term1029, term1029.getClass(), "lastWaiter", null);
        setField(term1029, term1029.getClass(), "this$0", null);
        setField(term1023, term1023.getClass(), "notEmpty", term1029);
        setField(term1030, term1030.getClass(), "sync", null);
        setField(term1023, term1023.getClass(), "putLock", term1030);
        setField(term1031, term1031.getClass(), "firstWaiter", null);
        setField(term1031, term1031.getClass(), "lastWaiter", null);
        setField(term1031, term1031.getClass(), "this$0", null);
        setField(term1023, term1023.getClass(), "notFull", term1031);
        setField(term1020, term1020.getClass(), "workQueue", term1023);
        setField(term1033, term1033.getClass(), "head", null);
        setField(term1033, term1033.getClass(), "tail", null);
        setIntField(term1033, term1033.getClass(), "state", 0);
        setField(term1033, term1033.getClass(), "exclusiveOwnerThread", null);
        setField(term1032, term1032.getClass(), "sync", term1033);
        setField(term1020, term1020.getClass(), "mainLock", term1032);
        setField(term1020, term1020.getClass(), "workers", term1035);
        setField(term1041, term1041.getClass(), "firstWaiter", null);
        setField(term1041, term1041.getClass(), "lastWaiter", null);
        setField(term1041, term1041.getClass(), "this$0", term1033);
        setField(term1020, term1020.getClass(), "termination", term1041);
        setIntField(term1020, term1020.getClass(), "largestPoolSize", 0);
        setLongField(term1020, term1020.getClass(), "completedTaskCount", 0L);
        setField(term1045, term1045.getClass(), "parent", null);
        setField(term1045, term1045.getClass(), "name", null);
        setIntField(term1045, term1045.getClass(), "maxPriority", 10);
        setBooleanField(term1045, term1045.getClass(), "destroyed", false);
        setBooleanField(term1045, term1045.getClass(), "daemon", false);
        setIntField(term1045, term1045.getClass(), "nUnstartedThreads", 2);
        setIntField(term1045, term1045.getClass(), "nthreads", 15);
        setField(term1045, term1045.getClass(), "threads", null);
        setIntField(term1045, term1045.getClass(), "ngroups", 0);
        setField(term1045, term1045.getClass(), "groups", null);
        setField(term1044, term1044.getClass(), "group", term1045);
        setIntField(term1052, term1052.getClass(), "value", 1);
        setField(term1044, term1044.getClass(), "threadNumber", term1052);
        setField(term1044, term1044.getClass(), "namePrefix", "");
        setField(term1020, term1020.getClass(), "threadFactory", term1044);
        setField(term1020, term1020.getClass(), "handler", term1055);
        setLongField(term1020, term1020.getClass(), "keepAliveTime", 0L);
        setBooleanField(term1020, term1020.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term1020, term1020.getClass(), "corePoolSize", 1);
        setIntField(term1020, term1020.getClass(), "maximumPoolSize", 1);
        setField(term1019, term1019.getClass(), "e", term1020);
        setField(term972, term972.getClass(), "executor", term1019);
        setField(term972, term972.getClass(), "userContext", term1060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.dsl.Transition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addTransition", argTypes, term972, args);
    }

};


