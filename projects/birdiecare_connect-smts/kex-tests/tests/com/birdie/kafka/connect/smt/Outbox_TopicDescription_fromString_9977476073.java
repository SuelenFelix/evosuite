package com.birdie.kafka.connect.smt;

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
import static com.birdie.kafka.connect.smt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Outbox_TopicDescription_fromString_9977476073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724;

    public Outbox_TopicDescription_fromString_9977476073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term724 = newInstance(Class.forName("com.birdie.kafka.connect.smt.Outbox$TopicDescription"));
        setField(term724, term724.getClass(), "topic", null);
        setField(term724, term724.getClass(), "numberOfPartitions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.birdie.kafka.connect.smt.Outbox$TopicDescription");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fromString", argTypes, term724, args);
    }

};


