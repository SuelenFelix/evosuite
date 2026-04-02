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

public class StrictMachine_PollAndEvaluate_init_12133200020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3944;

    public StrictMachine_PollAndEvaluate_init_12133200020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3955 = new HashMap();
        HashMap term3961 = new HashMap();
        ArrayList term3972 = new ArrayList();
        ArrayList term3976 = new ArrayList();
        term3944 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine"));
        Object term3946 = newInstance(Class.forName("java.lang.Object"));
        Object term3947 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock"));
        Object term3948 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock"));
        Object term3949 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync"));
        Object term3950 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term3954 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock"));
        Object term3960 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term3971 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term3944, term3944.getClass(), "pollExecuted", true);
        setField(term3944, term3944.getClass(), "queueLock", term3946);
        setField(term3944, term3944.getClass(), "eventQueue", null);
        setField(term3944, term3944.getClass(), "eventShelf", null);
        setIntField(term3950, term3950.getClass(), "threadLocalHashCode", 1827272039);
        setField(term3949, term3949.getClass(), "readHolds", term3950);
        setField(term3949, term3949.getClass(), "cachedHoldCounter", null);
        setField(term3949, term3949.getClass(), "firstReader", null);
        setIntField(term3949, term3949.getClass(), "firstReaderHoldCount", 0);
        setField(term3949, term3949.getClass(), "head", null);
        setField(term3949, term3949.getClass(), "tail", null);
        setIntField(term3949, term3949.getClass(), "state", 0);
        setField(term3949, term3949.getClass(), "exclusiveOwnerThread", null);
        setField(term3948, term3948.getClass(), "sync", term3949);
        setField(term3947, term3947.getClass(), "readerLock", term3948);
        setField(term3954, term3954.getClass(), "sync", term3949);
        setField(term3947, term3947.getClass(), "writerLock", term3954);
        setField(term3947, term3947.getClass(), "sync", term3949);
        setField(term3944, term3944.getClass(), "readWriteLock", term3947);
        setField(term3944, term3944.getClass(), "contextValues", term3955);
        setField(term3960, term3960.getClass(), "value", null);
        setField(term3944, term3944.getClass(), "state", term3960);
        setField(term3944, term3944.getClass(), "logger", null);
        setField(term3944, term3944.getClass(), "mdc", term3961);
        setField(term3944, term3944.getClass(), "executor", null);
        setField(term3944, term3944.getClass(), "userContext", term3971);
        setField(term3944, term3944.getClass(), "actionProxy", null);
        setField(term3944, term3944.getClass(), "transitions", term3972);
        setField(term3944, term3944.getClass(), "transitionActions", term3976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine$PollAndEvaluate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Object[] args = new Object[1];
        args[0] = term3944;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


