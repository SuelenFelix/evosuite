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

public class FullCommentResponse_getBody_153924108513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793;

    public FullCommentResponse_getBody_153924108513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term793 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse"));
        setField(term793, term793.getClass(), "id", null);
        setField(term793, term793.getClass(), "body", null);
        setField(term793, term793.getClass(), "createdBy", null);
        setField(term793, term793.getClass(), "associatedNews", null);
        setField(term793, term793.getClass(), "createTimestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term793, args);
    }

};


