package com.alkemy.ong.infrastructure.rest.mapper.comment;

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
import static com.alkemy.ong.infrastructure.rest.mapper.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class CreateCommentMapper_toDomain_3926830051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term29;

    public CreateCommentMapper_toDomain_3926830051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.CreateCommentMapper"));
        Long term30 = new Long(6375119433582206027L);
        Long term32 = new Long(-8257434502486459194L);
        term29 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.comment.CreateCommentRequest"));
        setField(term29, term29.getClass(), "userId", term30);
        setField(term29, term29.getClass(), "newsId", term32);
        setField(term29, term29.getClass(), "body", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.CreateCommentMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.comment.CreateCommentRequest");
        Object[] args = new Object[1];
        args[0] = term29;
        callMethod(klass, "toDomain", argTypes, term28, args);
    }

};


