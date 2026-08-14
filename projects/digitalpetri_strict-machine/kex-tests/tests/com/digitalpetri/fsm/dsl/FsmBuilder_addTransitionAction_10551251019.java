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

public class FsmBuilder_addTransitionAction_10551251019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1096;

    public FsmBuilder_addTransitionAction_10551251019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1097 = new ArrayList();
        LinkedList term1101 = new LinkedList();
        HashMap term1160 = new HashMap();
        Set<Object> term1219 =  ((Map) term1160).keySet();
        HashSet term1159 = new HashSet((Collection<? extends Object>) term1219);
        term1096 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        Object term1140 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term1141 = (Object[]) newArray("java.lang.Object", 0);
        Object term1143 = newInstance(Class.forName("java.util.concurrent.Executors$FinalizableDelegatedExecutorService"));
        Object term1144 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term1145 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1147 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue"));
        Object term1149 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1151 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Node"));
        Object term1152 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1153 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1154 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1155 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1156 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1157 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term1165 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1168 = newInstance(Class.forName("java.util.concurrent.Executors$DefaultThreadFactory"));
        Object term1169 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term1176 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1179 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$AbortPolicy"));
        Object term1184 = newInstance(Class.forName("java.lang.Object"));
        setField(term1096, term1096.getClass(), "transitions", term1097);
        setField(term1096, term1096.getClass(), "transitionActions", term1101);
        setField(term1096, term1096.getClass(), "actionProxy", null);
        setField(term1096, term1096.getClass(), "loggerName", "com.digitalpetri.fsm.StrictMachine");
        setField(term1140, term1140.getClass(), "table", term1141);
        setIntField(term1140, term1140.getClass(), "size", 0);
        setField(term1140, term1140.getClass(), "keySet", null);
        setField(term1140, term1140.getClass(), "values", null);
        setField(term1096, term1096.getClass(), "mdc", term1140);
        setIntField(term1145, term1145.getClass(), "value", -536870912);
        setField(term1144, term1144.getClass(), "ctl", term1145);
        setIntField(term1147, term1147.getClass(), "capacity", 2147483647);
        setIntField(term1149, term1149.getClass(), "value", 0);
        setField(term1147, term1147.getClass(), "count", term1149);
        setField(term1151, term1151.getClass(), "item", null);
        setField(term1151, term1151.getClass(), "next", null);
        setField(term1147, term1147.getClass(), "head", term1151);
        setField(term1147, term1147.getClass(), "last", term1151);
        setField(term1152, term1152.getClass(), "sync", null);
        setField(term1147, term1147.getClass(), "takeLock", term1152);
        setField(term1153, term1153.getClass(), "firstWaiter", null);
        setField(term1153, term1153.getClass(), "lastWaiter", null);
        setField(term1153, term1153.getClass(), "this$0", null);
        setField(term1147, term1147.getClass(), "notEmpty", term1153);
        setField(term1154, term1154.getClass(), "sync", null);
        setField(term1147, term1147.getClass(), "putLock", term1154);
        setField(term1155, term1155.getClass(), "firstWaiter", null);
        setField(term1155, term1155.getClass(), "lastWaiter", null);
        setField(term1155, term1155.getClass(), "this$0", null);
        setField(term1147, term1147.getClass(), "notFull", term1155);
        setField(term1144, term1144.getClass(), "workQueue", term1147);
        setField(term1157, term1157.getClass(), "head", null);
        setField(term1157, term1157.getClass(), "tail", null);
        setIntField(term1157, term1157.getClass(), "state", 0);
        setField(term1157, term1157.getClass(), "exclusiveOwnerThread", null);
        setField(term1156, term1156.getClass(), "sync", term1157);
        setField(term1144, term1144.getClass(), "mainLock", term1156);
        setField(term1144, term1144.getClass(), "workers", term1159);
        setField(term1165, term1165.getClass(), "firstWaiter", null);
        setField(term1165, term1165.getClass(), "lastWaiter", null);
        setField(term1165, term1165.getClass(), "this$0", term1157);
        setField(term1144, term1144.getClass(), "termination", term1165);
        setIntField(term1144, term1144.getClass(), "largestPoolSize", 0);
        setLongField(term1144, term1144.getClass(), "completedTaskCount", 0L);
        setField(term1169, term1169.getClass(), "parent", null);
        setField(term1169, term1169.getClass(), "name", null);
        setIntField(term1169, term1169.getClass(), "maxPriority", 10);
        setBooleanField(term1169, term1169.getClass(), "destroyed", false);
        setBooleanField(term1169, term1169.getClass(), "daemon", false);
        setIntField(term1169, term1169.getClass(), "nUnstartedThreads", 2);
        setIntField(term1169, term1169.getClass(), "nthreads", 15);
        setField(term1169, term1169.getClass(), "threads", null);
        setIntField(term1169, term1169.getClass(), "ngroups", 0);
        setField(term1169, term1169.getClass(), "groups", null);
        setField(term1168, term1168.getClass(), "group", term1169);
        setIntField(term1176, term1176.getClass(), "value", 1);
        setField(term1168, term1168.getClass(), "threadNumber", term1176);
        setField(term1168, term1168.getClass(), "namePrefix", "");
        setField(term1144, term1144.getClass(), "threadFactory", term1168);
        setField(term1144, term1144.getClass(), "handler", term1179);
        setLongField(term1144, term1144.getClass(), "keepAliveTime", 0L);
        setBooleanField(term1144, term1144.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term1144, term1144.getClass(), "corePoolSize", 1);
        setIntField(term1144, term1144.getClass(), "maximumPoolSize", 1);
        setField(term1143, term1143.getClass(), "e", term1144);
        setField(term1096, term1096.getClass(), "executor", term1143);
        setField(term1096, term1096.getClass(), "userContext", term1184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.dsl.TransitionAction");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addTransitionAction", argTypes, term1096, args);
    }

};


