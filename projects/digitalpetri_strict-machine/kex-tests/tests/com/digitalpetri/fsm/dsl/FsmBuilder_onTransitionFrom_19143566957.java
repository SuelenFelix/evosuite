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

public class FsmBuilder_onTransitionFrom_19143566957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848;

    public FsmBuilder_onTransitionFrom_19143566957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term849 = new ArrayList();
        LinkedList term853 = new LinkedList();
        HashMap term912 = new HashMap();
        Set<Object> term971 =  ((Map) term912).keySet();
        HashSet term911 = new HashSet((Collection<? extends Object>) term971);
        term848 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        Object term892 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term893 = (Object[]) newArray("java.lang.Object", 0);
        Object term895 = newInstance(Class.forName("java.util.concurrent.Executors$FinalizableDelegatedExecutorService"));
        Object term896 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term897 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term899 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue"));
        Object term901 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term903 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Node"));
        Object term904 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term905 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term906 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term907 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term908 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term909 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term917 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term920 = newInstance(Class.forName("java.util.concurrent.Executors$DefaultThreadFactory"));
        Object term921 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term928 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term931 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$AbortPolicy"));
        Object term936 = newInstance(Class.forName("java.lang.Object"));
        setField(term848, term848.getClass(), "transitions", term849);
        setField(term848, term848.getClass(), "transitionActions", term853);
        setField(term848, term848.getClass(), "actionProxy", null);
        setField(term848, term848.getClass(), "loggerName", "com.digitalpetri.fsm.StrictMachine");
        setField(term892, term892.getClass(), "table", term893);
        setIntField(term892, term892.getClass(), "size", 0);
        setField(term892, term892.getClass(), "keySet", null);
        setField(term892, term892.getClass(), "values", null);
        setField(term848, term848.getClass(), "mdc", term892);
        setIntField(term897, term897.getClass(), "value", -536870912);
        setField(term896, term896.getClass(), "ctl", term897);
        setIntField(term899, term899.getClass(), "capacity", 2147483647);
        setIntField(term901, term901.getClass(), "value", 0);
        setField(term899, term899.getClass(), "count", term901);
        setField(term903, term903.getClass(), "item", null);
        setField(term903, term903.getClass(), "next", null);
        setField(term899, term899.getClass(), "head", term903);
        setField(term899, term899.getClass(), "last", term903);
        setField(term904, term904.getClass(), "sync", null);
        setField(term899, term899.getClass(), "takeLock", term904);
        setField(term905, term905.getClass(), "firstWaiter", null);
        setField(term905, term905.getClass(), "lastWaiter", null);
        setField(term905, term905.getClass(), "this$0", null);
        setField(term899, term899.getClass(), "notEmpty", term905);
        setField(term906, term906.getClass(), "sync", null);
        setField(term899, term899.getClass(), "putLock", term906);
        setField(term907, term907.getClass(), "firstWaiter", null);
        setField(term907, term907.getClass(), "lastWaiter", null);
        setField(term907, term907.getClass(), "this$0", null);
        setField(term899, term899.getClass(), "notFull", term907);
        setField(term896, term896.getClass(), "workQueue", term899);
        setField(term909, term909.getClass(), "head", null);
        setField(term909, term909.getClass(), "tail", null);
        setIntField(term909, term909.getClass(), "state", 0);
        setField(term909, term909.getClass(), "exclusiveOwnerThread", null);
        setField(term908, term908.getClass(), "sync", term909);
        setField(term896, term896.getClass(), "mainLock", term908);
        setField(term896, term896.getClass(), "workers", term911);
        setField(term917, term917.getClass(), "firstWaiter", null);
        setField(term917, term917.getClass(), "lastWaiter", null);
        setField(term917, term917.getClass(), "this$0", term909);
        setField(term896, term896.getClass(), "termination", term917);
        setIntField(term896, term896.getClass(), "largestPoolSize", 0);
        setLongField(term896, term896.getClass(), "completedTaskCount", 0L);
        setField(term921, term921.getClass(), "parent", null);
        setField(term921, term921.getClass(), "name", null);
        setIntField(term921, term921.getClass(), "maxPriority", 10);
        setBooleanField(term921, term921.getClass(), "destroyed", false);
        setBooleanField(term921, term921.getClass(), "daemon", false);
        setIntField(term921, term921.getClass(), "nUnstartedThreads", 2);
        setIntField(term921, term921.getClass(), "nthreads", 15);
        setField(term921, term921.getClass(), "threads", null);
        setIntField(term921, term921.getClass(), "ngroups", 0);
        setField(term921, term921.getClass(), "groups", null);
        setField(term920, term920.getClass(), "group", term921);
        setIntField(term928, term928.getClass(), "value", 1);
        setField(term920, term920.getClass(), "threadNumber", term928);
        setField(term920, term920.getClass(), "namePrefix", "");
        setField(term896, term896.getClass(), "threadFactory", term920);
        setField(term896, term896.getClass(), "handler", term931);
        setLongField(term896, term896.getClass(), "keepAliveTime", 0L);
        setBooleanField(term896, term896.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term896, term896.getClass(), "corePoolSize", 1);
        setIntField(term896, term896.getClass(), "maximumPoolSize", 1);
        setField(term895, term895.getClass(), "e", term896);
        setField(term848, term848.getClass(), "executor", term895);
        setField(term848, term848.getClass(), "userContext", term936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Predicate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onTransitionFrom", argTypes, term848, args);
    }

};


