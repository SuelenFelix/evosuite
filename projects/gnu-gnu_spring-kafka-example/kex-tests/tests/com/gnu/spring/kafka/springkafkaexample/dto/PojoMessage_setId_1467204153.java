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
import java.lang.Long;

public class PojoMessage_setId_1467204153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;
     Object term67;

    public PojoMessage_setId_1467204153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52 = newInstance(Class.forName("com.gnu.spring.kafka.springkafkaexample.dto.PojoMessage"));
        setLongField(term52, term52.getClass(), "id", -8257434502486459194L);
        setField(term52, term52.getClass(), "msg", "MuLcgQHgqz");
        setBooleanField(term52, term52.getClass(), "result", false);
        term67 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gnu.spring.kafka.springkafkaexample.dto.PojoMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term67;
        callMethod(klass, "setId", argTypes, term52, args);
    }

};


