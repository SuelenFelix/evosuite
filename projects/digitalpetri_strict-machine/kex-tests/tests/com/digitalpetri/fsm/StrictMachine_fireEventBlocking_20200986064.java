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

public class StrictMachine_fireEventBlocking_20200986064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2201;
     Object term2237;

    public StrictMachine_fireEventBlocking_20200986064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2212 = new HashMap();
        HashMap term2218 = new HashMap();
        ArrayList term2229 = new ArrayList();
        ArrayList term2233 = new ArrayList();
        term2201 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        Object term2203 = newInstance(Class.forName("java.lang.Object"));
        Object term2204 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock"));
        Object term2205 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock"));
        Object term2206 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync"));
        Object term2207 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term2211 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock"));
        Object term2217 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2228 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term2201, term2201.getClass(), "pollExecuted", false);
        setField(term2201, term2201.getClass(), "queueLock", term2203);
        setField(term2201, term2201.getClass(), "eventQueue", null);
        setField(term2201, term2201.getClass(), "eventShelf", null);
        setIntField(term2207, term2207.getClass(), "threadLocalHashCode", -2143962842);
        setField(term2206, term2206.getClass(), "readHolds", term2207);
        setField(term2206, term2206.getClass(), "cachedHoldCounter", null);
        setField(term2206, term2206.getClass(), "firstReader", null);
        setIntField(term2206, term2206.getClass(), "firstReaderHoldCount", 0);
        setField(term2206, term2206.getClass(), "head", null);
        setField(term2206, term2206.getClass(), "tail", null);
        setIntField(term2206, term2206.getClass(), "state", 0);
        setField(term2206, term2206.getClass(), "exclusiveOwnerThread", null);
        setField(term2205, term2205.getClass(), "sync", term2206);
        setField(term2204, term2204.getClass(), "readerLock", term2205);
        setField(term2211, term2211.getClass(), "sync", term2206);
        setField(term2204, term2204.getClass(), "writerLock", term2211);
        setField(term2204, term2204.getClass(), "sync", term2206);
        setField(term2201, term2201.getClass(), "readWriteLock", term2204);
        setField(term2201, term2201.getClass(), "contextValues", term2212);
        setField(term2217, term2217.getClass(), "value", null);
        setField(term2201, term2201.getClass(), "state", term2217);
        setField(term2201, term2201.getClass(), "logger", null);
        setField(term2201, term2201.getClass(), "mdc", term2218);
        setField(term2201, term2201.getClass(), "executor", null);
        setField(term2201, term2201.getClass(), "userContext", term2228);
        setField(term2201, term2201.getClass(), "actionProxy", null);
        setField(term2201, term2201.getClass(), "transitions", term2229);
        setField(term2201, term2201.getClass(), "transitionActions", term2233);
        term2237 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2237;
        callMethod(klass, "fireEventBlocking", argTypes, term2201, args);
    }

};


