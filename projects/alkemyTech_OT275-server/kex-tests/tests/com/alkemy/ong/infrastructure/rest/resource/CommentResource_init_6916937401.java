package com.alkemy.ong.infrastructure.rest.resource;

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
import static com.alkemy.ong.infrastructure.rest.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CommentResource_init_6916937401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public CommentResource_init_6916937401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.CommentResource");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.comment.usecase.IDeleteCommentUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.application.service.comment.usecase.IListCommentUseCase");
        argTypes[2] = Class.forName("com.alkemy.ong.application.service.comment.usecase.ICreateCommentUseCase");
        argTypes[3] = Class.forName("com.alkemy.ong.application.service.comment.usecase.IUpdateCommentUseCase");
        argTypes[4] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.UpdateCommentMapper");
        argTypes[5] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.ListCommentMapper");
        argTypes[6] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.CreateCommentMapper");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


