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

public class StrictMachine_getFromContext_3433084405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2238;

    public StrictMachine_getFromContext_3433084405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2249 = new HashMap();
        HashMap term2255 = new HashMap();
        ArrayList term2266 = new ArrayList();
        ArrayList term2270 = new ArrayList();
        term2238 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        Object term2240 = newInstance(Class.forName("java.lang.Object"));
        Object term2241 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock"));
        Object term2242 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock"));
        Object term2243 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync"));
        Object term2244 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term2248 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock"));
        Object term2254 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2265 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term2238, term2238.getClass(), "pollExecuted", true);
        setField(term2238, term2238.getClass(), "queueLock", term2240);
        setField(term2238, term2238.getClass(), "eventQueue", null);
        setField(term2238, term2238.getClass(), "eventShelf", null);
        setIntField(term2244, term2244.getClass(), "threadLocalHashCode", -1665262186);
        setField(term2243, term2243.getClass(), "readHolds", term2244);
        setField(term2243, term2243.getClass(), "cachedHoldCounter", null);
        setField(term2243, term2243.getClass(), "firstReader", null);
        setIntField(term2243, term2243.getClass(), "firstReaderHoldCount", 0);
        setField(term2243, term2243.getClass(), "head", null);
        setField(term2243, term2243.getClass(), "tail", null);
        setIntField(term2243, term2243.getClass(), "state", 0);
        setField(term2243, term2243.getClass(), "exclusiveOwnerThread", null);
        setField(term2242, term2242.getClass(), "sync", term2243);
        setField(term2241, term2241.getClass(), "readerLock", term2242);
        setField(term2248, term2248.getClass(), "sync", term2243);
        setField(term2241, term2241.getClass(), "writerLock", term2248);
        setField(term2241, term2241.getClass(), "sync", term2243);
        setField(term2238, term2238.getClass(), "readWriteLock", term2241);
        setField(term2238, term2238.getClass(), "contextValues", term2249);
        setField(term2254, term2254.getClass(), "value", null);
        setField(term2238, term2238.getClass(), "state", term2254);
        setField(term2238, term2238.getClass(), "logger", null);
        setField(term2238, term2238.getClass(), "mdc", term2255);
        setField(term2238, term2238.getClass(), "executor", null);
        setField(term2238, term2238.getClass(), "userContext", term2265);
        setField(term2238, term2238.getClass(), "actionProxy", null);
        setField(term2238, term2238.getClass(), "transitions", term2266);
        setField(term2238, term2238.getClass(), "transitionActions", term2270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Function");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFromContext", argTypes, term2238, args);
    }

};


