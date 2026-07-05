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
import java.lang.Object;
import java.util.LinkedList;

public class ListCommentMapper_toResponse_13273655090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term967;
     Object term969;

    public ListCommentMapper_toResponse_13273655090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term967 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.ListCommentMapper"));
        Object term968 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.GetCommentMapper"));
        setField(term967, term967.getClass(), "getCommentMapper", term968);
        term969 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.ListCommentMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term969;
        callMethod(klass, "toResponse", argTypes, term967, args);
    }

};


