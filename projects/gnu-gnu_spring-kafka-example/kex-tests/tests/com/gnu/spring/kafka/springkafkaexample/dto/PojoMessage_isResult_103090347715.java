package com.gnu.spring.kafka.springkafkaexample.dto;

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
import static com.gnu.spring.kafka.springkafkaexample.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PojoMessage_isResult_103090347715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246;

    public PojoMessage_isResult_103090347715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246 = newInstance(Class.forName("com.gnu.spring.kafka.springkafkaexample.dto.PojoMessage"));
        setLongField(term246, term246.getClass(), "id", 0L);
        setField(term246, term246.getClass(), "msg", null);
        setBooleanField(term246, term246.getClass(), "result", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gnu.spring.kafka.springkafkaexample.dto.PojoMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isResult", argTypes, term246, args);
    }

};


