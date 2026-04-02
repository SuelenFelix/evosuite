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

public class FsmBuilder_setActionProxy_64413652010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1220;

    public FsmBuilder_setActionProxy_64413652010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1221 = new ArrayList();
        LinkedList term1225 = new LinkedList();
        HashMap term1284 = new HashMap();
        Set<Object> term1343 =  ((Map) term1284).keySet();
        HashSet term1283 = new HashSet((Collection<? extends Object>) term1343);
        term1220 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        Object term1264 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term1265 = (Object[]) newArray("java.lang.Object", 0);
        Object term1267 = newInstance(Class.forName("java.util.concurrent.Executors$FinalizableDelegatedExecutorService"));
        Object term1268 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term1269 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1271 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue"));
        Object term1273 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1275 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Node"));
        Object term1276 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1277 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1278 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1279 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1280 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1281 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term1289 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term1292 = newInstance(Class.forName("java.util.concurrent.Executors$DefaultThreadFactory"));
        Object term1293 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term1300 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1303 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$AbortPolicy"));
        Object term1308 = newInstance(Class.forName("java.lang.Object"));
        setField(term1220, term1220.getClass(), "transitions", term1221);
        setField(term1220, term1220.getClass(), "transitionActions", term1225);
        setField(term1220, term1220.getClass(), "actionProxy", null);
        setField(term1220, term1220.getClass(), "loggerName", "com.digitalpetri.fsm.StrictMachine");
        setField(term1264, term1264.getClass(), "table", term1265);
        setIntField(term1264, term1264.getClass(), "size", 0);
        setField(term1264, term1264.getClass(), "keySet", null);
        setField(term1264, term1264.getClass(), "values", null);
        setField(term1220, term1220.getClass(), "mdc", term1264);
        setIntField(term1269, term1269.getClass(), "value", -536870912);
        setField(term1268, term1268.getClass(), "ctl", term1269);
        setIntField(term1271, term1271.getClass(), "capacity", 2147483647);
        setIntField(term1273, term1273.getClass(), "value", 0);
        setField(term1271, term1271.getClass(), "count", term1273);
        setField(term1275, term1275.getClass(), "item", null);
        setField(term1275, term1275.getClass(), "next", null);
        setField(term1271, term1271.getClass(), "head", term1275);
        setField(term1271, term1271.getClass(), "last", term1275);
        setField(term1276, term1276.getClass(), "sync", null);
        setField(term1271, term1271.getClass(), "takeLock", term1276);
        setField(term1277, term1277.getClass(), "firstWaiter", null);
        setField(term1277, term1277.getClass(), "lastWaiter", null);
        setField(term1277, term1277.getClass(), "this$0", null);
        setField(term1271, term1271.getClass(), "notEmpty", term1277);
        setField(term1278, term1278.getClass(), "sync", null);
        setField(term1271, term1271.getClass(), "putLock", term1278);
        setField(term1279, term1279.getClass(), "firstWaiter", null);
        setField(term1279, term1279.getClass(), "lastWaiter", null);
        setField(term1279, term1279.getClass(), "this$0", null);
        setField(term1271, term1271.getClass(), "notFull", term1279);
        setField(term1268, term1268.getClass(), "workQueue", term1271);
        setField(term1281, term1281.getClass(), "head", null);
        setField(term1281, term1281.getClass(), "tail", null);
        setIntField(term1281, term1281.getClass(), "state", 0);
        setField(term1281, term1281.getClass(), "exclusiveOwnerThread", null);
        setField(term1280, term1280.getClass(), "sync", term1281);
        setField(term1268, term1268.getClass(), "mainLock", term1280);
        setField(term1268, term1268.getClass(), "workers", term1283);
        setField(term1289, term1289.getClass(), "firstWaiter", null);
        setField(term1289, term1289.getClass(), "lastWaiter", null);
        setField(term1289, term1289.getClass(), "this$0", term1281);
        setField(term1268, term1268.getClass(), "termination", term1289);
        setIntField(term1268, term1268.getClass(), "largestPoolSize", 0);
        setLongField(term1268, term1268.getClass(), "completedTaskCount", 0L);
        setField(term1293, term1293.getClass(), "parent", null);
        setField(term1293, term1293.getClass(), "name", null);
        setIntField(term1293, term1293.getClass(), "maxPriority", 10);
        setBooleanField(term1293, term1293.getClass(), "destroyed", false);
        setBooleanField(term1293, term1293.getClass(), "daemon", false);
        setIntField(term1293, term1293.getClass(), "nUnstartedThreads", 2);
        setIntField(term1293, term1293.getClass(), "nthreads", 15);
        setField(term1293, term1293.getClass(), "threads", null);
        setIntField(term1293, term1293.getClass(), "ngroups", 0);
        setField(term1293, term1293.getClass(), "groups", null);
        setField(term1292, term1292.getClass(), "group", term1293);
        setIntField(term1300, term1300.getClass(), "value", 1);
        setField(term1292, term1292.getClass(), "threadNumber", term1300);
        setField(term1292, term1292.getClass(), "namePrefix", "");
        setField(term1268, term1268.getClass(), "threadFactory", term1292);
        setField(term1268, term1268.getClass(), "handler", term1303);
        setLongField(term1268, term1268.getClass(), "keepAliveTime", 0L);
        setBooleanField(term1268, term1268.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term1268, term1268.getClass(), "corePoolSize", 1);
        setIntField(term1268, term1268.getClass(), "maximumPoolSize", 1);
        setField(term1267, term1267.getClass(), "e", term1268);
        setField(term1220, term1220.getClass(), "executor", term1267);
        setField(term1220, term1220.getClass(), "userContext", term1308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.dsl.ActionProxy");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setActionProxy", argTypes, term1220, args);
    }

};


