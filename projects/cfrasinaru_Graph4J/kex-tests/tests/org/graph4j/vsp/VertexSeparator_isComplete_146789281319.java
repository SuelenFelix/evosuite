package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VertexSeparator_isComplete_146789281319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3717;

    public VertexSeparator_isComplete_146789281319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3717 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        setField(term3717, term3717.getClass(), "graph", null);
        setField(term3717, term3717.getClass(), "separator", null);
        setField(term3717, term3717.getClass(), "leftShore", null);
        setField(term3717, term3717.getClass(), "rightShore", null);
        setIntField(term3717, term3717.getClass(), "maxShoreSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term3717, args);
    }

};


