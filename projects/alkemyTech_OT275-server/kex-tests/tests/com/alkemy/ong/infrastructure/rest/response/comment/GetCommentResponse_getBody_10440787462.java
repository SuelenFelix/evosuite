package com.alkemy.ong.infrastructure.rest.response.comment;

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
import static com.alkemy.ong.infrastructure.rest.response.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetCommentResponse_getBody_10440787462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824;

    public GetCommentResponse_getBody_10440787462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term824 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term824, term824.getClass(), "body", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term824, args);
    }

};


