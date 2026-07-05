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

public class CreateCommentUseCaseService_create_5822205082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1446;

    public CreateCommentUseCaseService_create_5822205082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1446 = newInstance(Class.forName("com.alkemy.ong.application.service.comment.CreateCommentUseCaseService"));
        setField(term1446, term1446.getClass(), "commentRepository", null);
        setField(term1446, term1446.getClass(), "userRepository", null);
        setField(term1446, term1446.getClass(), "newsRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.comment.CreateCommentUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Comment");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "create", argTypes, term1446, args);
    }

};


