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

public class KafkaHandlerService_pojoHandler_14125451732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term25;

    public KafkaHandlerService_pojoHandler_14125451732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("com.gnu.spring.kafka.springkafkaexample.service.KafkaHandlerService"));
        term25 = newInstance(Class.forName("com.gnu.spring.kafka.springkafkaexample.dto.PojoMessage"));
        setLongField(term25, term25.getClass(), "id", 2442117782898005296L);
        setField(term25, term25.getClass(), "msg", "sjlJAEtRrb");
        setBooleanField(term25, term25.getClass(), "result", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gnu.spring.kafka.springkafkaexample.service.KafkaHandlerService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.gnu.spring.kafka.springkafkaexample.dto.PojoMessage");
        Object[] args = new Object[1];
        args[0] = term25;
        callMethod(klass, "pojoHandler", argTypes, term24, args);
    }

};


