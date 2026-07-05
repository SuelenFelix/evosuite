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
import java.lang.Long;

public class CreateCommentRequest_getNewsId_4197532652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;

    public CreateCommentRequest_getNewsId_4197532652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99 = new Long(-8257434502486459194L);
        Long term101 = new Long(-8400487765614892086L);
        term98 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.comment.CreateCommentRequest"));
        setField(term98, term98.getClass(), "userId", term99);
        setField(term98, term98.getClass(), "newsId", term101);
        setField(term98, term98.getClass(), "body", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.comment.CreateCommentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewsId", argTypes, term98, args);
    }

};


