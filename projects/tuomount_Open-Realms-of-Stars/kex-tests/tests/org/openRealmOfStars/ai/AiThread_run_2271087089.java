package org.openRealmOfStars.ai;

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
import static org.openRealmOfStars.ai.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AiThread_run_2271087089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1059761;

    public AiThread_run_2271087089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1059761 = newInstance(Class.forName("org.openRealmOfStars.ai.AiThread"));
        setField(term1059761, term1059761.getClass(), "view", null);
        setBooleanField(term1059761, term1059761.getClass(), "started", false);
        setBooleanField(term1059761, term1059761.getClass(), "running", false);
        setField(term1059761, term1059761.getClass(), "name", null);
        setIntField(term1059761, term1059761.getClass(), "priority", 0);
        setBooleanField(term1059761, term1059761.getClass(), "daemon", false);
        setBooleanField(term1059761, term1059761.getClass(), "stillborn", false);
        setLongField(term1059761, term1059761.getClass(), "eetop", 0L);
        setField(term1059761, term1059761.getClass(), "target", null);
        setField(term1059761, term1059761.getClass(), "group", null);
        setField(term1059761, term1059761.getClass(), "contextClassLoader", null);
        setField(term1059761, term1059761.getClass(), "inheritedAccessControlContext", null);
        setField(term1059761, term1059761.getClass(), "threadLocals", null);
        setField(term1059761, term1059761.getClass(), "inheritableThreadLocals", null);
        setLongField(term1059761, term1059761.getClass(), "stackSize", 0L);
        setLongField(term1059761, term1059761.getClass(), "tid", 0L);
        setIntField(term1059761, term1059761.getClass(), "threadStatus", 0);
        setField(term1059761, term1059761.getClass(), "parkBlocker", null);
        setField(term1059761, term1059761.getClass(), "blocker", null);
        setField(term1059761, term1059761.getClass(), "blockerLock", null);
        setField(term1059761, term1059761.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1059761, term1059761.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1059761, term1059761.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1059761, term1059761.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.AiThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term1059761, args);
    }

};


