package com.sacavix.mq.consumer;

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
import static com.sacavix.mq.consumer.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Consumer_receive_12059818161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public Consumer_receive_12059818161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.sacavix.mq.consumer.Consumer"));
        term2 = newInstance(Class.forName("com.sacavix.mq.dummy.Data"));
        setLongField(term2, term2.getClass(), "id", 2442117782898005296L);
        setField(term2, term2.getClass(), "message", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.mq.consumer.Consumer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sacavix.mq.dummy.Data");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "receive", argTypes, term1, args);
    }

};


