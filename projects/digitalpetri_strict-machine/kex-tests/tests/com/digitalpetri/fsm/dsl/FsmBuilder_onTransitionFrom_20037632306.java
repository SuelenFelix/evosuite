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

public class FsmBuilder_onTransitionFrom_20037632306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724;

    public FsmBuilder_onTransitionFrom_20037632306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term725 = new ArrayList();
        LinkedList term729 = new LinkedList();
        HashMap term788 = new HashMap();
        Set<Object> term847 =  ((Map) term788).keySet();
        HashSet term787 = new HashSet((Collection<? extends Object>) term847);
        term724 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder"));
        Object term768 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term769 = (Object[]) newArray("java.lang.Object", 0);
        Object term771 = newInstance(Class.forName("java.util.concurrent.Executors$FinalizableDelegatedExecutorService"));
        Object term772 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor"));
        Object term773 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term775 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue"));
        Object term777 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term779 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Node"));
        Object term780 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term781 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term782 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term783 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term784 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term785 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term793 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        Object term796 = newInstance(Class.forName("java.util.concurrent.Executors$DefaultThreadFactory"));
        Object term797 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term804 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term807 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$AbortPolicy"));
        Object term812 = newInstance(Class.forName("java.lang.Object"));
        setField(term724, term724.getClass(), "transitions", term725);
        setField(term724, term724.getClass(), "transitionActions", term729);
        setField(term724, term724.getClass(), "actionProxy", null);
        setField(term724, term724.getClass(), "loggerName", "com.digitalpetri.fsm.StrictMachine");
        setField(term768, term768.getClass(), "table", term769);
        setIntField(term768, term768.getClass(), "size", 0);
        setField(term768, term768.getClass(), "keySet", null);
        setField(term768, term768.getClass(), "values", null);
        setField(term724, term724.getClass(), "mdc", term768);
        setIntField(term773, term773.getClass(), "value", -536870912);
        setField(term772, term772.getClass(), "ctl", term773);
        setIntField(term775, term775.getClass(), "capacity", 2147483647);
        setIntField(term777, term777.getClass(), "value", 0);
        setField(term775, term775.getClass(), "count", term777);
        setField(term779, term779.getClass(), "item", null);
        setField(term779, term779.getClass(), "next", null);
        setField(term775, term775.getClass(), "head", term779);
        setField(term775, term775.getClass(), "last", term779);
        setField(term780, term780.getClass(), "sync", null);
        setField(term775, term775.getClass(), "takeLock", term780);
        setField(term781, term781.getClass(), "firstWaiter", null);
        setField(term781, term781.getClass(), "lastWaiter", null);
        setField(term781, term781.getClass(), "this$0", null);
        setField(term775, term775.getClass(), "notEmpty", term781);
        setField(term782, term782.getClass(), "sync", null);
        setField(term775, term775.getClass(), "putLock", term782);
        setField(term783, term783.getClass(), "firstWaiter", null);
        setField(term783, term783.getClass(), "lastWaiter", null);
        setField(term783, term783.getClass(), "this$0", null);
        setField(term775, term775.getClass(), "notFull", term783);
        setField(term772, term772.getClass(), "workQueue", term775);
        setField(term785, term785.getClass(), "head", null);
        setField(term785, term785.getClass(), "tail", null);
        setIntField(term785, term785.getClass(), "state", 0);
        setField(term785, term785.getClass(), "exclusiveOwnerThread", null);
        setField(term784, term784.getClass(), "sync", term785);
        setField(term772, term772.getClass(), "mainLock", term784);
        setField(term772, term772.getClass(), "workers", term787);
        setField(term793, term793.getClass(), "firstWaiter", null);
        setField(term793, term793.getClass(), "lastWaiter", null);
        setField(term793, term793.getClass(), "this$0", term785);
        setField(term772, term772.getClass(), "termination", term793);
        setIntField(term772, term772.getClass(), "largestPoolSize", 0);
        setLongField(term772, term772.getClass(), "completedTaskCount", 0L);
        setField(term797, term797.getClass(), "parent", null);
        setField(term797, term797.getClass(), "name", null);
        setIntField(term797, term797.getClass(), "maxPriority", 10);
        setBooleanField(term797, term797.getClass(), "destroyed", false);
        setBooleanField(term797, term797.getClass(), "daemon", false);
        setIntField(term797, term797.getClass(), "nUnstartedThreads", 2);
        setIntField(term797, term797.getClass(), "nthreads", 15);
        setField(term797, term797.getClass(), "threads", null);
        setIntField(term797, term797.getClass(), "ngroups", 0);
        setField(term797, term797.getClass(), "groups", null);
        setField(term796, term796.getClass(), "group", term797);
        setIntField(term804, term804.getClass(), "value", 1);
        setField(term796, term796.getClass(), "threadNumber", term804);
        setField(term796, term796.getClass(), "namePrefix", "");
        setField(term772, term772.getClass(), "threadFactory", term796);
        setField(term772, term772.getClass(), "handler", term807);
        setLongField(term772, term772.getClass(), "keepAliveTime", 0L);
        setBooleanField(term772, term772.getClass(), "allowCoreThreadTimeOut", false);
        setIntField(term772, term772.getClass(), "corePoolSize", 1);
        setIntField(term772, term772.getClass(), "maximumPoolSize", 1);
        setField(term771, term771.getClass(), "e", term772);
        setField(term724, term724.getClass(), "executor", term771);
        setField(term724, term724.getClass(), "userContext", term812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.FsmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onTransitionFrom", argTypes, term724, args);
    }

};


