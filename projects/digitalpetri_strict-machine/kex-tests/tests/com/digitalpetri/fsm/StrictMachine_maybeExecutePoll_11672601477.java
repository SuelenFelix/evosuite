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

public class StrictMachine_maybeExecutePoll_11672601477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2310;

    public StrictMachine_maybeExecutePoll_11672601477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2321 = new HashMap();
        HashMap term2327 = new HashMap();
        ArrayList term2338 = new ArrayList();
        ArrayList term2342 = new ArrayList();
        term2310 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        Object term2312 = newInstance(Class.forName("java.lang.Object"));
        Object term2313 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock"));
        Object term2314 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock"));
        Object term2315 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync"));
        Object term2316 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term2320 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock"));
        Object term2326 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2337 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term2310, term2310.getClass(), "pollExecuted", true);
        setField(term2310, term2310.getClass(), "queueLock", term2312);
        setField(term2310, term2310.getClass(), "eventQueue", null);
        setField(term2310, term2310.getClass(), "eventShelf", null);
        setIntField(term2316, term2316.getClass(), "threadLocalHashCode", -707860874);
        setField(term2315, term2315.getClass(), "readHolds", term2316);
        setField(term2315, term2315.getClass(), "cachedHoldCounter", null);
        setField(term2315, term2315.getClass(), "firstReader", null);
        setIntField(term2315, term2315.getClass(), "firstReaderHoldCount", 0);
        setField(term2315, term2315.getClass(), "head", null);
        setField(term2315, term2315.getClass(), "tail", null);
        setIntField(term2315, term2315.getClass(), "state", 0);
        setField(term2315, term2315.getClass(), "exclusiveOwnerThread", null);
        setField(term2314, term2314.getClass(), "sync", term2315);
        setField(term2313, term2313.getClass(), "readerLock", term2314);
        setField(term2320, term2320.getClass(), "sync", term2315);
        setField(term2313, term2313.getClass(), "writerLock", term2320);
        setField(term2313, term2313.getClass(), "sync", term2315);
        setField(term2310, term2310.getClass(), "readWriteLock", term2313);
        setField(term2310, term2310.getClass(), "contextValues", term2321);
        setField(term2326, term2326.getClass(), "value", null);
        setField(term2310, term2310.getClass(), "state", term2326);
        setField(term2310, term2310.getClass(), "logger", null);
        setField(term2310, term2310.getClass(), "mdc", term2327);
        setField(term2310, term2310.getClass(), "executor", null);
        setField(term2310, term2310.getClass(), "userContext", term2337);
        setField(term2310, term2310.getClass(), "actionProxy", null);
        setField(term2310, term2310.getClass(), "transitions", term2338);
        setField(term2310, term2310.getClass(), "transitionActions", term2342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maybeExecutePoll", argTypes, term2310, args);
    }

};


