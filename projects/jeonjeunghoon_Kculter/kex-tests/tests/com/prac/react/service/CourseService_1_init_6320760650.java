package com.prac.react.service;

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
import static com.prac.react.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class CourseService_1_init_6320760650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2224;
     Object term2225;
     Object term2232;

    public CourseService_1_init_6320760650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2224 = newInstance(Class.forName("com.prac.react.service.CourseService"));
        setField(term2224, term2224.getClass(), "logger", null);
        setField(term2224, term2224.getClass(), "cd", null);
        term2225 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term2226 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term2227 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term2229 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setIntField(term2227, term2227.getClass(), "waitStatus", 0);
        setField(term2227, term2227.getClass(), "prev", null);
        setField(term2227, term2227.getClass(), "next", null);
        setField(term2227, term2227.getClass(), "thread", null);
        setField(term2227, term2227.getClass(), "nextWaiter", null);
        setField(term2226, term2226.getClass(), "head", term2227);
        setIntField(term2229, term2229.getClass(), "waitStatus", 0);
        setField(term2229, term2229.getClass(), "prev", null);
        setField(term2229, term2229.getClass(), "next", null);
        setField(term2229, term2229.getClass(), "thread", null);
        setField(term2229, term2229.getClass(), "nextWaiter", null);
        setField(term2226, term2226.getClass(), "tail", term2229);
        setIntField(term2226, term2226.getClass(), "state", -1016503459);
        setField(term2226, term2226.getClass(), "exclusiveOwnerThread", null);
        setField(term2225, term2225.getClass(), "sync", term2226);
        Object term2235 = newInstance(Class.forName("java.lang.Object"));
        Object term2237 = newInstance(Class.forName("java.lang.Object"));
        Object term2239 = newInstance(Class.forName("java.lang.Object"));
        term2232 = new LinkedList();
        ((LinkedList) term2232).add(term2235);
        ((LinkedList) term2232).add(term2237);
        ((LinkedList) term2232).add(term2239);
        ((LinkedList) term2232).add((Object)null);
        ((LinkedList) term2232).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.CourseService$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.prac.react.service.CourseService");
        argTypes[1] = Class.forName("java.util.concurrent.CountDownLatch");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term2224;
        args[1] = term2225;
        args[2] = term2232;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


