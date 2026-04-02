package com.rtbhouse.kafka.workers.impl;

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
import static com.rtbhouse.kafka.workers.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ShutdownListenerThread_run_8714965451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20529;

    public ShutdownListenerThread_run_8714965451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20529 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.ShutdownListenerThread"));
        Object term20547 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term20548 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term20549 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term20550 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object[] term20563 = (Object[]) newArray("java.lang.Thread", 3);
        Object[] term20565 = (Object[]) newArray("java.lang.ThreadGroup", 4);
        Object[] term20579 = (Object[]) newArray("java.lang.Thread", 8);
        Object[] term20581 = (Object[]) newArray("java.lang.ThreadGroup", 0);
        Object[] term20595 = (Object[]) newArray("java.lang.Thread", 4);
        Object[] term20597 = (Object[]) newArray("java.lang.ThreadGroup", 1);
        Object term20598 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term20606 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term20607 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term20610 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term20611 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term20612 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term20617 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term20626 = newInstance(Class.forName("java.lang.ThreadLocal$ThreadLocalMap"));
        Object term20629 = newInstance(Class.forName("java.lang.ThreadLocal$ThreadLocalMap"));
        Object term20635 = newInstance(Class.forName("java.lang.Object"));
        Object term20636 = newInstance(Class.forName("java.lang.Object"));
        setField(term20529, term20529.getClass(), "workers", null);
        setBooleanField(term20529, term20529.getClass(), "shutdown", false);
        setField(term20529, term20529.getClass(), "name", "MLqYREekMl");
        setIntField(term20529, term20529.getClass(), "priority", 1227103734);
        setBooleanField(term20529, term20529.getClass(), "daemon", false);
        setBooleanField(term20529, term20529.getClass(), "stillborn", false);
        setLongField(term20529, term20529.getClass(), "eetop", 6967924379644551255L);
        setField(term20529, term20529.getClass(), "target", null);
        setField(term20550, term20550.getClass(), "parent", null);
        setField(term20550, term20550.getClass(), "name", null);
        setIntField(term20550, term20550.getClass(), "maxPriority", 10);
        setBooleanField(term20550, term20550.getClass(), "destroyed", true);
        setBooleanField(term20550, term20550.getClass(), "daemon", false);
        setIntField(term20550, term20550.getClass(), "nUnstartedThreads", -6029667);
        setIntField(term20550, term20550.getClass(), "nthreads", -2068769794);
        setField(term20550, term20550.getClass(), "threads", null);
        setIntField(term20550, term20550.getClass(), "ngroups", -117576464);
        setField(term20550, term20550.getClass(), "groups", null);
        setField(term20549, term20549.getClass(), "parent", term20550);
        setField(term20549, term20549.getClass(), "name", "");
        setIntField(term20549, term20549.getClass(), "maxPriority", 10);
        setBooleanField(term20549, term20549.getClass(), "destroyed", true);
        setBooleanField(term20549, term20549.getClass(), "daemon", false);
        setIntField(term20549, term20549.getClass(), "nUnstartedThreads", -1007160944);
        setIntField(term20549, term20549.getClass(), "nthreads", 1135664017);
        setField(term20549, term20549.getClass(), "threads", term20563);
        setIntField(term20549, term20549.getClass(), "ngroups", 590364439);
        setElement(term20565, 1, term20548);
        setField(term20549, term20549.getClass(), "groups", term20565);
        setField(term20548, term20548.getClass(), "parent", term20549);
        setField(term20548, term20548.getClass(), "name", "system");
        setIntField(term20548, term20548.getClass(), "maxPriority", 10);
        setBooleanField(term20548, term20548.getClass(), "destroyed", false);
        setBooleanField(term20548, term20548.getClass(), "daemon", true);
        setIntField(term20548, term20548.getClass(), "nUnstartedThreads", 865208305);
        setIntField(term20548, term20548.getClass(), "nthreads", -1275173084);
        setField(term20548, term20548.getClass(), "threads", term20579);
        setIntField(term20548, term20548.getClass(), "ngroups", -244121226);
        setField(term20548, term20548.getClass(), "groups", term20581);
        setField(term20547, term20547.getClass(), "parent", term20548);
        setField(term20547, term20547.getClass(), "name", "system");
        setIntField(term20547, term20547.getClass(), "maxPriority", 10);
        setBooleanField(term20547, term20547.getClass(), "destroyed", true);
        setBooleanField(term20547, term20547.getClass(), "daemon", false);
        setIntField(term20547, term20547.getClass(), "nUnstartedThreads", -203030934);
        setIntField(term20547, term20547.getClass(), "nthreads", -1179120542);
        setField(term20547, term20547.getClass(), "threads", term20595);
        setIntField(term20547, term20547.getClass(), "ngroups", -73683645);
        setField(term20598, term20598.getClass(), "parent", null);
        setField(term20598, term20598.getClass(), "name", "");
        setIntField(term20598, term20598.getClass(), "maxPriority", 10);
        setBooleanField(term20598, term20598.getClass(), "destroyed", false);
        setBooleanField(term20598, term20598.getClass(), "daemon", false);
        setIntField(term20598, term20598.getClass(), "nUnstartedThreads", 0);
        setIntField(term20598, term20598.getClass(), "nthreads", 0);
        setField(term20598, term20598.getClass(), "threads", null);
        setIntField(term20598, term20598.getClass(), "ngroups", 0);
        setField(term20598, term20598.getClass(), "groups", null);
        setElement(term20597, 0, term20598);
        setField(term20547, term20547.getClass(), "groups", term20597);
        setField(term20529, term20529.getClass(), "group", term20547);
        setField(term20529, term20529.getClass(), "contextClassLoader", null);
        setField(term20606, term20606.getClass(), "context", term20607);
        setBooleanField(term20606, term20606.getClass(), "isPrivileged", false);
        setBooleanField(term20606, term20606.getClass(), "isAuthorized", true);
        setField(term20612, term20612.getClass(), "codesource", null);
        setField(term20612, term20612.getClass(), "classloader", null);
        setField(term20612, term20612.getClass(), "principals", null);
        setField(term20612, term20612.getClass(), "permissions", null);
        setBooleanField(term20612, term20612.getClass(), "hasAllPerm", false);
        setBooleanField(term20612, term20612.getClass(), "staticPermissions", false);
        setField(term20612, term20612.getClass(), "key", null);
        setElement(term20611, 0, term20612);
        setField(term20610, term20610.getClass(), "context", term20611);
        setBooleanField(term20610, term20610.getClass(), "isPrivileged", true);
        setBooleanField(term20610, term20610.getClass(), "isAuthorized", true);
        setField(term20617, term20617.getClass(), "context", null);
        setBooleanField(term20617, term20617.getClass(), "isPrivileged", false);
        setBooleanField(term20617, term20617.getClass(), "isAuthorized", false);
        setField(term20617, term20617.getClass(), "privilegedContext", null);
        setField(term20617, term20617.getClass(), "combiner", null);
        setField(term20617, term20617.getClass(), "permissions", null);
        setField(term20617, term20617.getClass(), "parent", null);
        setBooleanField(term20617, term20617.getClass(), "isWrapped", false);
        setBooleanField(term20617, term20617.getClass(), "isLimited", false);
        setField(term20617, term20617.getClass(), "limitedContext", null);
        setField(term20610, term20610.getClass(), "privilegedContext", term20617);
        setField(term20610, term20610.getClass(), "combiner", null);
        setField(term20610, term20610.getClass(), "permissions", null);
        setField(term20610, term20610.getClass(), "parent", null);
        setBooleanField(term20610, term20610.getClass(), "isWrapped", false);
        setBooleanField(term20610, term20610.getClass(), "isLimited", false);
        setField(term20610, term20610.getClass(), "limitedContext", null);
        setField(term20606, term20606.getClass(), "privilegedContext", term20610);
        setField(term20606, term20606.getClass(), "combiner", null);
        setField(term20606, term20606.getClass(), "permissions", null);
        setField(term20606, term20606.getClass(), "parent", null);
        setBooleanField(term20606, term20606.getClass(), "isWrapped", false);
        setBooleanField(term20606, term20606.getClass(), "isLimited", false);
        setField(term20606, term20606.getClass(), "limitedContext", null);
        setField(term20529, term20529.getClass(), "inheritedAccessControlContext", term20606);
        setField(term20626, term20626.getClass(), "table", null);
        setIntField(term20626, term20626.getClass(), "size", 0);
        setIntField(term20626, term20626.getClass(), "threshold", 0);
        setField(term20529, term20529.getClass(), "threadLocals", term20626);
        setField(term20629, term20629.getClass(), "table", null);
        setIntField(term20629, term20629.getClass(), "size", 0);
        setIntField(term20629, term20629.getClass(), "threshold", 0);
        setField(term20529, term20529.getClass(), "inheritableThreadLocals", term20629);
        setLongField(term20529, term20529.getClass(), "stackSize", -2813493605142626659L);
        setLongField(term20529, term20529.getClass(), "tid", -8885298608300233488L);
        setIntField(term20529, term20529.getClass(), "threadStatus", 1193880199);
        setField(term20529, term20529.getClass(), "parkBlocker", term20635);
        setField(term20529, term20529.getClass(), "blocker", null);
        setField(term20529, term20529.getClass(), "blockerLock", term20636);
        setField(term20529, term20529.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term20529, term20529.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term20529, term20529.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term20529, term20529.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.ShutdownListenerThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term20529, args);
    }

};


