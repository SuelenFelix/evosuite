package com.sacavix.mq;

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
import static com.sacavix.mq.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpringBootRabbitMqApplication_main_15035743711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;

    public SpringBootRabbitMqApplication_main_15035743711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138 = (Object[]) newArray("java.lang.String", 5);
        setElement(term138, 0, "EGtDIRbSSb");
        setElement(term138, 1, "SzjVpOQTyS");
        setElement(term138, 2, "MjGYSRKTNF");
        setElement(term138, 3, "hRNSzYYIrc");
        setElement(term138, 4, "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.mq.SpringBootRabbitMqApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term138;
        callMethod(klass, "main", argTypes, null, args);
    }

};


