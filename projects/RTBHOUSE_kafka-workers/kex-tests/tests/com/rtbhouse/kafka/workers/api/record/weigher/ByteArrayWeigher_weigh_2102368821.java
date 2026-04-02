package com.rtbhouse.kafka.workers.api.record.weigher;

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
import static com.rtbhouse.kafka.workers.api.record.weigher.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ByteArrayWeigher_weigh_2102368821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;

    public ByteArrayWeigher_weigh_2102368821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = (byte[]) newByteArray(5);
        setByteElement(term15, 0, (byte) 47);
        setByteElement(term15, 1, (byte) 48);
        setByteElement(term15, 2, (byte) 89);
        setByteElement(term15, 3, (byte) 75);
        setByteElement(term15, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.api.record.weigher.ByteArrayWeigher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15;
        callMethod(klass, "weigh", argTypes, null, args);
    }

};


