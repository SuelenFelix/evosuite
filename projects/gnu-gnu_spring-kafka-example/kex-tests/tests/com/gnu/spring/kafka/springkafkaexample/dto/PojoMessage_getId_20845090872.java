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

public class PojoMessage_getId_20845090872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public PojoMessage_getId_20845090872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("com.gnu.spring.kafka.springkafkaexample.dto.PojoMessage"));
        setLongField(term27, term27.getClass(), "id", 6375119433582206027L);
        setField(term27, term27.getClass(), "msg", "sjlJAEtRrb");
        setBooleanField(term27, term27.getClass(), "result", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gnu.spring.kafka.springkafkaexample.dto.PojoMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term27, args);
    }

};


