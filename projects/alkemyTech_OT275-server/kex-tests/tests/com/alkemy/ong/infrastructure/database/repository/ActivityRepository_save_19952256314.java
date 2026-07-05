package com.alkemy.ong.infrastructure.database.repository;

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
import static com.alkemy.ong.infrastructure.database.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ActivityRepository_save_19952256314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1083;

    public ActivityRepository_save_19952256314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1084 = new Long(-2850532706972744550L);
        term1083 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term1083, term1083.getClass(), "id", term1084);
        setField(term1083, term1083.getClass(), "content", "PapWxkhEWe");
        setField(term1083, term1083.getClass(), "imageUrl", "smnHEqRFRx");
        setField(term1083, term1083.getClass(), "name", "XYtryyobou");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.repository.ActivityRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Activity");
        Object[] args = new Object[1];
        args[0] = term1083;
        callMethod(klass, "save", argTypes, null, args);
    }

};


