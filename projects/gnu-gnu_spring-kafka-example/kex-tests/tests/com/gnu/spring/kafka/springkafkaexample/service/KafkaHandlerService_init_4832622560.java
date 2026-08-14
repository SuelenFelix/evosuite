package com.gnu.spring.kafka.springkafkaexample.service;

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
import static com.gnu.spring.kafka.springkafkaexample.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KafkaHandlerService_init_4832622560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public KafkaHandlerService_init_4832622560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gnu.spring.kafka.springkafkaexample.service.KafkaHandlerService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
    }

};


