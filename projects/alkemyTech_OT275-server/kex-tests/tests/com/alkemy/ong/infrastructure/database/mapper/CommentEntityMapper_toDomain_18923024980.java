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

public class CommentEntityMapper_toDomain_18923024980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1590;

    public CommentEntityMapper_toDomain_18923024980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1590 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.CommentEntityMapper"));
        setField(term1590, term1590.getClass(), "userEntityMapper", null);
        setField(term1590, term1590.getClass(), "newsEntityMapper", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.CommentEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.database.entity.CommentEntity");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toDomain", argTypes, term1590, args);
    }

};


