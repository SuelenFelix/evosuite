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

public class StrictMachine_getState_8558934071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2087;

    public StrictMachine_getState_8558934071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2098 = new HashMap();
        HashMap term2104 = new HashMap();
        ArrayList term2115 = new ArrayList();
        ArrayList term2119 = new ArrayList();
        term2087 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        Object term2089 = newInstance(Class.forName("java.lang.Object"));
        Object term2090 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock"));
        Object term2091 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock"));
        Object term2092 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync"));
        Object term2093 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term2097 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock"));
        Object term2103 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2114 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term2087, term2087.getClass(), "pollExecuted", true);
        setField(term2087, term2087.getClass(), "queueLock", term2089);
        setField(term2087, term2087.getClass(), "eventQueue", null);
        setField(term2087, term2087.getClass(), "eventShelf", null);
        setIntField(term2093, term2093.getClass(), "threadLocalHashCode", 714902486);
        setField(term2092, term2092.getClass(), "readHolds", term2093);
        setField(term2092, term2092.getClass(), "cachedHoldCounter", null);
        setField(term2092, term2092.getClass(), "firstReader", null);
        setIntField(term2092, term2092.getClass(), "firstReaderHoldCount", 0);
        setField(term2092, term2092.getClass(), "head", null);
        setField(term2092, term2092.getClass(), "tail", null);
        setIntField(term2092, term2092.getClass(), "state", 0);
        setField(term2092, term2092.getClass(), "exclusiveOwnerThread", null);
        setField(term2091, term2091.getClass(), "sync", term2092);
        setField(term2090, term2090.getClass(), "readerLock", term2091);
        setField(term2097, term2097.getClass(), "sync", term2092);
        setField(term2090, term2090.getClass(), "writerLock", term2097);
        setField(term2090, term2090.getClass(), "sync", term2092);
        setField(term2087, term2087.getClass(), "readWriteLock", term2090);
        setField(term2087, term2087.getClass(), "contextValues", term2098);
        setField(term2103, term2103.getClass(), "value", null);
        setField(term2087, term2087.getClass(), "state", term2103);
        setField(term2087, term2087.getClass(), "logger", null);
        setField(term2087, term2087.getClass(), "mdc", term2104);
        setField(term2087, term2087.getClass(), "executor", null);
        setField(term2087, term2087.getClass(), "userContext", term2114);
        setField(term2087, term2087.getClass(), "actionProxy", null);
        setField(term2087, term2087.getClass(), "transitions", term2115);
        setField(term2087, term2087.getClass(), "transitionActions", term2119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term2087, args);
    }

};


