package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class VertexHeap_init_32102240622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60378;

    public VertexHeap_init_32102240622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60378 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("org.graph4j.util.IntComparator");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term60378;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


