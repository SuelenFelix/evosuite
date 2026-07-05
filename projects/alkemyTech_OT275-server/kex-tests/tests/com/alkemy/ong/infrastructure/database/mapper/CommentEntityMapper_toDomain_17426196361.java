package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;

public class CommentEntityMapper_toDomain_17426196361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1591;
     Object term1592;

    public CommentEntityMapper_toDomain_17426196361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1591 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.CommentEntityMapper"));
        setField(term1591, term1591.getClass(), "userEntityMapper", null);
        setField(term1591, term1591.getClass(), "newsEntityMapper", null);
        term1592 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.CommentEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1592;
        callMethod(klass, "toDomain", argTypes, term1591, args);
    }

};


