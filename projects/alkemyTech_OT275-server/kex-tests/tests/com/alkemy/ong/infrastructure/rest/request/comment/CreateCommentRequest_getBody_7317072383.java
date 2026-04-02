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

public class CreateCommentRequest_getBody_7317072383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;

    public CreateCommentRequest_getBody_7317072383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126 = new Long(5270370404989704783L);
        Long term128 = new Long(7411271909051562686L);
        term125 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.comment.CreateCommentRequest"));
        setField(term125, term125.getClass(), "userId", term126);
        setField(term125, term125.getClass(), "newsId", term128);
        setField(term125, term125.getClass(), "body", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.comment.CreateCommentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term125, args);
    }

};


