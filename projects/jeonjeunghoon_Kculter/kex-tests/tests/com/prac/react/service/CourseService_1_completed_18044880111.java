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
import java.util.ArrayList;

public class CourseService_1_completed_18044880111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2244;
     Object term2256;
     Object term2299;

    public CourseService_1_completed_18044880111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2252 = new ArrayList();
        term2244 = newInstance(Class.forName("com.prac.react.service.CourseService$1"));
        Object term2245 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term2246 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term2247 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term2249 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setIntField(term2247, term2247.getClass(), "waitStatus", 0);
        setField(term2247, term2247.getClass(), "prev", null);
        setField(term2247, term2247.getClass(), "next", null);
        setField(term2247, term2247.getClass(), "thread", null);
        setField(term2247, term2247.getClass(), "nextWaiter", null);
        setField(term2246, term2246.getClass(), "head", term2247);
        setIntField(term2249, term2249.getClass(), "waitStatus", 0);
        setField(term2249, term2249.getClass(), "prev", null);
        setField(term2249, term2249.getClass(), "next", null);
        setField(term2249, term2249.getClass(), "thread", null);
        setField(term2249, term2249.getClass(), "nextWaiter", null);
        setField(term2246, term2246.getClass(), "tail", term2249);
        setIntField(term2246, term2246.getClass(), "state", -1968847291);
        setField(term2246, term2246.getClass(), "exclusiveOwnerThread", null);
        setField(term2245, term2245.getClass(), "sync", term2246);
        setField(term2244, term2244.getClass(), "val$cdl", term2245);
        setField(term2244, term2244.getClass(), "val$memberCourseList", term2252);
        setField(term2244, term2244.getClass(), "this$0", null);
        ArrayList term2257 = new ArrayList();
        term2256 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term2256, term2256.getClass(), "course", term2257);
        setField(term2256, term2256.getClass(), "courseName", "jUbSRrkrYZ");
        setIntField(term2256, term2256.getClass(), "memberNum", 579005622);
        setField(term2256, term2256.getClass(), "memberHash", "bWWfajKbEX");
        setIntField(term2256, term2256.getClass(), "courseNum", -14890619);
        setField(term2256, term2256.getClass(), "courseHash", "cAPeiZHKGJ");
        term2299 = newInstance(Class.forName("java.lang.Void"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.CourseService$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.prac.react.model.dto.CourseWrapper");
        argTypes[1] = Class.forName("java.lang.Void");
        Object[] args = new Object[2];
        args[0] = term2256;
        args[1] = term2299;
        callMethod(klass, "completed", argTypes, term2244, args);
    }

};


