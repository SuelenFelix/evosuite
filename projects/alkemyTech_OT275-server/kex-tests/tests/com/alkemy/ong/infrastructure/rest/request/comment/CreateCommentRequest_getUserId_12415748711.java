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

public class CreateCommentRequest_getUserId_12415748711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;

    public CreateCommentRequest_getUserId_12415748711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term72 = new Long(2442117782898005296L);
        Long term74 = new Long(6375119433582206027L);
        term71 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.comment.CreateCommentRequest"));
        setField(term71, term71.getClass(), "userId", term72);
        setField(term71, term71.getClass(), "newsId", term74);
        setField(term71, term71.getClass(), "body", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.comment.CreateCommentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term71, args);
    }

};


