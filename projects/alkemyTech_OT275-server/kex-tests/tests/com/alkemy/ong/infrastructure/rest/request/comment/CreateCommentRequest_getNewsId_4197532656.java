package com.alkemy.ong.infrastructure.rest.request.comment;

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
import static com.alkemy.ong.infrastructure.rest.request.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateCommentRequest_getNewsId_4197532656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;

    public CreateCommentRequest_getNewsId_4197532656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.comment.CreateCommentRequest"));
        setField(term153, term153.getClass(), "userId", null);
        setField(term153, term153.getClass(), "newsId", null);
        setField(term153, term153.getClass(), "body", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.comment.CreateCommentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewsId", argTypes, term153, args);
    }

};


