package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ContactEntity_init_92433884313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9095;
     Object term9145;

    public ContactEntity_init_92433884313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9095 = new Long(-9040825890007374809L);
        term9145 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term9145, term9145.getClass(), "year", 2012);
        setShortField(term9145, term9145.getClass(), "month", (short) 10);
        setShortField(term9145, term9145.getClass(), "day", (short) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[6];
        args[0] = term9095;
        args[1] = "dtGZCsKXbW";
        args[2] = "bdyhHbDAmJ";
        args[3] = "BBXiTNHqGE";
        args[4] = "IEYhJmgCVd";
        args[5] = term9145;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


