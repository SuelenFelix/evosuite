package com.meteergin.medium.stream;

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
import static com.meteergin.medium.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class User_setAge_13028786358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599;
     Object term638;

    public User_setAge_13028786358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term599, term599.getClass(), "id", 6967924379644551255L);
        setField(term599, term599.getClass(), "firstName", "flxyYxBRtu");
        setField(term599, term599.getClass(), "lastName", "OclPbYPkcH");
        setIntField(term599, term599.getClass(), "age", 1227103734);
        setField(term599, term599.getClass(), "nationality", "IoAlmYsBwc");
        term638 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term638;
        callMethod(klass, "setAge", argTypes, term599, args);
    }

};


