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

public class StrictMachine_fireEvent_5598367942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2123;
     Object term2159;

    public StrictMachine_fireEvent_5598367942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2134 = new HashMap();
        HashMap term2140 = new HashMap();
        ArrayList term2151 = new ArrayList();
        ArrayList term2155 = new ArrayList();
        term2123 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        Object term2125 = newInstance(Class.forName("java.lang.Object"));
        Object term2126 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock"));
        Object term2127 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock"));
        Object term2128 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync"));
        Object term2129 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term2133 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock"));
        Object term2139 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2150 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term2123, term2123.getClass(), "pollExecuted", true);
        setField(term2123, term2123.getClass(), "queueLock", term2125);
        setField(term2123, term2123.getClass(), "eventQueue", null);
        setField(term2123, term2123.getClass(), "eventShelf", null);
        setIntField(term2129, term2129.getClass(), "threadLocalHashCode", 1193603142);
        setField(term2128, term2128.getClass(), "readHolds", term2129);
        setField(term2128, term2128.getClass(), "cachedHoldCounter", null);
        setField(term2128, term2128.getClass(), "firstReader", null);
        setIntField(term2128, term2128.getClass(), "firstReaderHoldCount", 0);
        setField(term2128, term2128.getClass(), "head", null);
        setField(term2128, term2128.getClass(), "tail", null);
        setIntField(term2128, term2128.getClass(), "state", 0);
        setField(term2128, term2128.getClass(), "exclusiveOwnerThread", null);
        setField(term2127, term2127.getClass(), "sync", term2128);
        setField(term2126, term2126.getClass(), "readerLock", term2127);
        setField(term2133, term2133.getClass(), "sync", term2128);
        setField(term2126, term2126.getClass(), "writerLock", term2133);
        setField(term2126, term2126.getClass(), "sync", term2128);
        setField(term2123, term2123.getClass(), "readWriteLock", term2126);
        setField(term2123, term2123.getClass(), "contextValues", term2134);
        setField(term2139, term2139.getClass(), "value", null);
        setField(term2123, term2123.getClass(), "state", term2139);
        setField(term2123, term2123.getClass(), "logger", null);
        setField(term2123, term2123.getClass(), "mdc", term2140);
        setField(term2123, term2123.getClass(), "executor", null);
        setField(term2123, term2123.getClass(), "userContext", term2150);
        setField(term2123, term2123.getClass(), "actionProxy", null);
        setField(term2123, term2123.getClass(), "transitions", term2151);
        setField(term2123, term2123.getClass(), "transitionActions", term2155);
        term2159 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2159;
        callMethod(klass, "fireEvent", argTypes, term2123, args);
    }

};


