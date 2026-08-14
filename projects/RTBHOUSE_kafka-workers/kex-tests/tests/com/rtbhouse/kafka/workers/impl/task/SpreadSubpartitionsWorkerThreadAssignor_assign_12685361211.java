package com.rtbhouse.kafka.workers.impl.task;

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
import static com.rtbhouse.kafka.workers.impl.task.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpreadSubpartitionsWorkerThreadAssignor_assign_12685361211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2691;

    public SpreadSubpartitionsWorkerThreadAssignor_assign_12685361211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2691 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.task.SpreadSubpartitionsWorkerThreadAssignor"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.task.SpreadSubpartitionsWorkerThreadAssignor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "assign", argTypes, term2691, args);
    }

};


