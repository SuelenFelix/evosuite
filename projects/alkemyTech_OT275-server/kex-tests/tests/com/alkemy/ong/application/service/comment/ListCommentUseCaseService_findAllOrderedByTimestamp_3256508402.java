package com.alkemy.ong.application.service.comment;

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
import static com.alkemy.ong.application.service.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ListCommentUseCaseService_findAllOrderedByTimestamp_3256508402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1448;

    public ListCommentUseCaseService_findAllOrderedByTimestamp_3256508402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1448 = newInstance(Class.forName("com.alkemy.ong.application.service.comment.ListCommentUseCaseService"));
        setField(term1448, term1448.getClass(), "commentRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.comment.ListCommentUseCaseService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findAllOrderedByTimestamp", argTypes, term1448, args);
    }

};


