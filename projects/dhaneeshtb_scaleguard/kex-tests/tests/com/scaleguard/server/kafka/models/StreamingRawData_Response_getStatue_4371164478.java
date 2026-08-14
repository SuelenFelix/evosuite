package com.scaleguard.server.kafka.models;

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
import static com.scaleguard.server.kafka.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StreamingRawData_Response_getStatue_4371164478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563;

    public StreamingRawData_Response_getStatue_4371164478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563 = newInstance(Class.forName("com.scaleguard.server.kafka.models.StreamingRawData$Response"));
        setField(term563, term563.getClass(), "status", null);
        setField(term563, term563.getClass(), "message", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.kafka.models.StreamingRawData$Response");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatue", argTypes, term563, args);
    }

};


