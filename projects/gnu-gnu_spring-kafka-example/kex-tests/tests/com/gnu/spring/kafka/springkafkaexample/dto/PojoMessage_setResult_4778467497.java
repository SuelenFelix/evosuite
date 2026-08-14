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
import java.lang.Boolean;

public class PojoMessage_setResult_4778467497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;
     Object term191;

    public PojoMessage_setResult_4778467497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176 = newInstance(Class.forName("com.gnu.spring.kafka.springkafkaexample.dto.PojoMessage"));
        setLongField(term176, term176.getClass(), "id", 6811161968424632369L);
        setField(term176, term176.getClass(), "msg", "MjGYSRKTNF");
        setBooleanField(term176, term176.getClass(), "result", true);
        term191 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gnu.spring.kafka.springkafkaexample.dto.PojoMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term191;
        callMethod(klass, "setResult", argTypes, term176, args);
    }

};


