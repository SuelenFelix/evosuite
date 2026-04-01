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

public class AiThread_start_17789523258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1059748;

    public AiThread_start_17789523258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1059748 = newInstance(Class.forName("org.openRealmOfStars.ai.AiThread"));
        setField(term1059748, term1059748.getClass(), "view", null);
        setBooleanField(term1059748, term1059748.getClass(), "started", false);
        setBooleanField(term1059748, term1059748.getClass(), "running", false);
        setField(term1059748, term1059748.getClass(), "name", null);
        setIntField(term1059748, term1059748.getClass(), "priority", 0);
        setBooleanField(term1059748, term1059748.getClass(), "daemon", false);
        setBooleanField(term1059748, term1059748.getClass(), "stillborn", false);
        setLongField(term1059748, term1059748.getClass(), "eetop", 0L);
        setField(term1059748, term1059748.getClass(), "target", null);
        setField(term1059748, term1059748.getClass(), "group", null);
        setField(term1059748, term1059748.getClass(), "contextClassLoader", null);
        setField(term1059748, term1059748.getClass(), "inheritedAccessControlContext", null);
        setField(term1059748, term1059748.getClass(), "threadLocals", null);
        setField(term1059748, term1059748.getClass(), "inheritableThreadLocals", null);
        setLongField(term1059748, term1059748.getClass(), "stackSize", 0L);
        setLongField(term1059748, term1059748.getClass(), "tid", 0L);
        setIntField(term1059748, term1059748.getClass(), "threadStatus", 0);
        setField(term1059748, term1059748.getClass(), "parkBlocker", null);
        setField(term1059748, term1059748.getClass(), "blocker", null);
        setField(term1059748, term1059748.getClass(), "blockerLock", null);
        setField(term1059748, term1059748.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1059748, term1059748.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1059748, term1059748.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1059748, term1059748.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.AiThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term1059748, args);
    }

};


