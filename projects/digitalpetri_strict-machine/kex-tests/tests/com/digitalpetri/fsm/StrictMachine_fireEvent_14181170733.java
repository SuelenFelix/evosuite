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
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.ArrayList;

public class StrictMachine_fireEvent_14181170733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2160;
     Object term2200;

    public StrictMachine_fireEvent_14181170733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2163 = new ArrayDeque();
        HashMap term2175 = new HashMap();
        HashMap term2181 = new HashMap();
        ArrayList term2192 = new ArrayList();
        ArrayList term2196 = new ArrayList();
        term2160 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        Object term2162 = newInstance(Class.forName("java.lang.Object"));
        Object term2167 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock"));
        Object term2168 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock"));
        Object term2169 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync"));
        Object term2170 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term2174 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock"));
        Object term2180 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2191 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term2160, term2160.getClass(), "pollExecuted", false);
        setField(term2160, term2160.getClass(), "queueLock", term2162);
        setField(term2160, term2160.getClass(), "eventQueue", null);
        setField(term2160, term2160.getClass(), "eventShelf", term2163);
        setIntField(term2170, term2170.getClass(), "threadLocalHashCode", 1672303798);
        setField(term2169, term2169.getClass(), "readHolds", term2170);
        setField(term2169, term2169.getClass(), "cachedHoldCounter", null);
        setField(term2169, term2169.getClass(), "firstReader", null);
        setIntField(term2169, term2169.getClass(), "firstReaderHoldCount", 0);
        setField(term2169, term2169.getClass(), "head", null);
        setField(term2169, term2169.getClass(), "tail", null);
        setIntField(term2169, term2169.getClass(), "state", 0);
        setField(term2169, term2169.getClass(), "exclusiveOwnerThread", null);
        setField(term2168, term2168.getClass(), "sync", term2169);
        setField(term2167, term2167.getClass(), "readerLock", term2168);
        setField(term2174, term2174.getClass(), "sync", term2169);
        setField(term2167, term2167.getClass(), "writerLock", term2174);
        setField(term2167, term2167.getClass(), "sync", term2169);
        setField(term2160, term2160.getClass(), "readWriteLock", term2167);
        setField(term2160, term2160.getClass(), "contextValues", term2175);
        setField(term2180, term2180.getClass(), "value", null);
        setField(term2160, term2160.getClass(), "state", term2180);
        setField(term2160, term2160.getClass(), "logger", null);
        setField(term2160, term2160.getClass(), "mdc", term2181);
        setField(term2160, term2160.getClass(), "executor", null);
        setField(term2160, term2160.getClass(), "userContext", term2191);
        setField(term2160, term2160.getClass(), "actionProxy", null);
        setField(term2160, term2160.getClass(), "transitions", term2192);
        setField(term2160, term2160.getClass(), "transitionActions", term2196);
        term2200 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.function.Consumer");
        Object[] args = new Object[2];
        args[0] = term2200;
        args[1] = null;
        callMethod(klass, "fireEvent", argTypes, term2160, args);
    }

};


