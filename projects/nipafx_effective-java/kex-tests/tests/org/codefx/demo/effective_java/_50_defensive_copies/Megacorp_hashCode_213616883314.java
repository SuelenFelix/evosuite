package org.codefx.demo.effective_java._50_defensive_copies;

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
import static org.codefx.demo.effective_java._50_defensive_copies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Megacorp_hashCode_213616883314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;

    public Megacorp_hashCode_213616883314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp"));
        setField(term543, term543.getClass(), "name", null);
        setIntField(term543, term543.getClass(), "totalRevenue", 0);
        setField(term543, term543.getClass(), "subsidiaries", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term543, args);
    }

};


