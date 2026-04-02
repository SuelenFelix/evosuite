package com.digitalpetri.fsm;

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
import static com.digitalpetri.fsm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class StrictMachine_FsmContextImpl_init_7230600120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2419;

    public StrictMachine_FsmContextImpl_init_7230600120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2430 = new HashMap();
        HashMap term2436 = new HashMap();
        ArrayList term2447 = new ArrayList();
        ArrayList term2451 = new ArrayList();
        term2419 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        Object term2421 = newInstance(Class.forName("java.lang.Object"));
        Object term2422 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock"));
        Object term2423 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock"));
        Object term2424 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync"));
        Object term2425 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term2429 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock"));
        Object term2435 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2446 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term2419, term2419.getClass(), "pollExecuted", true);
        setField(term2419, term2419.getClass(), "queueLock", term2421);
        setField(term2419, term2419.getClass(), "eventQueue", null);
        setField(term2419, term2419.getClass(), "eventShelf", null);
        setIntField(term2425, term2425.getClass(), "threadLocalHashCode", 415900730);
        setField(term2424, term2424.getClass(), "readHolds", term2425);
        setField(term2424, term2424.getClass(), "cachedHoldCounter", null);
        setField(term2424, term2424.getClass(), "firstReader", null);
        setIntField(term2424, term2424.getClass(), "firstReaderHoldCount", 0);
        setField(term2424, term2424.getClass(), "head", null);
        setField(term2424, term2424.getClass(), "tail", null);
        setIntField(term2424, term2424.getClass(), "state", 0);
        setField(term2424, term2424.getClass(), "exclusiveOwnerThread", null);
        setField(term2423, term2423.getClass(), "sync", term2424);
        setField(term2422, term2422.getClass(), "readerLock", term2423);
        setField(term2429, term2429.getClass(), "sync", term2424);
        setField(term2422, term2422.getClass(), "writerLock", term2429);
        setField(term2422, term2422.getClass(), "sync", term2424);
        setField(term2419, term2419.getClass(), "readWriteLock", term2422);
        setField(term2419, term2419.getClass(), "contextValues", term2430);
        setField(term2435, term2435.getClass(), "value", null);
        setField(term2419, term2419.getClass(), "state", term2435);
        setField(term2419, term2419.getClass(), "logger", null);
        setField(term2419, term2419.getClass(), "mdc", term2436);
        setField(term2419, term2419.getClass(), "executor", null);
        setField(term2419, term2419.getClass(), "userContext", term2446);
        setField(term2419, term2419.getClass(), "actionProxy", null);
        setField(term2419, term2419.getClass(), "transitions", term2447);
        setField(term2419, term2419.getClass(), "transitionActions", term2451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine$FsmContextImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Object[] args = new Object[1];
        args[0] = term2419;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


