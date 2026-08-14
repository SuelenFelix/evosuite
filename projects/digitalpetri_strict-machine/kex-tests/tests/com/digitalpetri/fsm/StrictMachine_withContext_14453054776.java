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

public class StrictMachine_withContext_14453054776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2274;

    public StrictMachine_withContext_14453054776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2285 = new HashMap();
        HashMap term2291 = new HashMap();
        ArrayList term2302 = new ArrayList();
        ArrayList term2306 = new ArrayList();
        term2274 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        Object term2276 = newInstance(Class.forName("java.lang.Object"));
        Object term2277 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock"));
        Object term2278 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock"));
        Object term2279 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync"));
        Object term2280 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term2284 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock"));
        Object term2290 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2301 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term2274, term2274.getClass(), "pollExecuted", true);
        setField(term2274, term2274.getClass(), "queueLock", term2276);
        setField(term2274, term2274.getClass(), "eventQueue", null);
        setField(term2274, term2274.getClass(), "eventShelf", null);
        setIntField(term2280, term2280.getClass(), "threadLocalHashCode", -1186561530);
        setField(term2279, term2279.getClass(), "readHolds", term2280);
        setField(term2279, term2279.getClass(), "cachedHoldCounter", null);
        setField(term2279, term2279.getClass(), "firstReader", null);
        setIntField(term2279, term2279.getClass(), "firstReaderHoldCount", 0);
        setField(term2279, term2279.getClass(), "head", null);
        setField(term2279, term2279.getClass(), "tail", null);
        setIntField(term2279, term2279.getClass(), "state", 0);
        setField(term2279, term2279.getClass(), "exclusiveOwnerThread", null);
        setField(term2278, term2278.getClass(), "sync", term2279);
        setField(term2277, term2277.getClass(), "readerLock", term2278);
        setField(term2284, term2284.getClass(), "sync", term2279);
        setField(term2277, term2277.getClass(), "writerLock", term2284);
        setField(term2277, term2277.getClass(), "sync", term2279);
        setField(term2274, term2274.getClass(), "readWriteLock", term2277);
        setField(term2274, term2274.getClass(), "contextValues", term2285);
        setField(term2290, term2290.getClass(), "value", null);
        setField(term2274, term2274.getClass(), "state", term2290);
        setField(term2274, term2274.getClass(), "logger", null);
        setField(term2274, term2274.getClass(), "mdc", term2291);
        setField(term2274, term2274.getClass(), "executor", null);
        setField(term2274, term2274.getClass(), "userContext", term2301);
        setField(term2274, term2274.getClass(), "actionProxy", null);
        setField(term2274, term2274.getClass(), "transitions", term2302);
        setField(term2274, term2274.getClass(), "transitionActions", term2306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Consumer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withContext", argTypes, term2274, args);
    }

};


