package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NegativeCycleException_getCycle_2359127462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6316;

    public NegativeCycleException_getCycle_2359127462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6316 = newInstance(Class.forName("org.graph4j.shortestpath.NegativeCycleException"));
        setField(term6316, term6316.getClass(), "cycle", null);
        setField(term6316, term6316.getClass(), "backtrace", null);
        setField(term6316, term6316.getClass(), "detailMessage", null);
        setField(term6316, term6316.getClass(), "cause", null);
        setField(term6316, term6316.getClass(), "stackTrace", null);
        setIntField(term6316, term6316.getClass(), "depth", 0);
        setField(term6316, term6316.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.NegativeCycleException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCycle", argTypes, term6316, args);
    }

};


