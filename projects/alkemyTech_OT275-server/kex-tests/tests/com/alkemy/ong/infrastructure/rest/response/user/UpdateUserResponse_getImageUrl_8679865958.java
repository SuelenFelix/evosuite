package com.alkemy.ong.infrastructure.rest.response.user;

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
import static com.alkemy.ong.infrastructure.rest.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UpdateUserResponse_getImageUrl_8679865958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4158;

    public UpdateUserResponse_getImageUrl_8679865958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4159 = new Long(-2585684163342970173L);
        term4158 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.UpdateUserResponse"));
        setField(term4158, term4158.getClass(), "id", term4159);
        setField(term4158, term4158.getClass(), "firstName", "RbVQXSpxXy");
        setField(term4158, term4158.getClass(), "lastName", "YpJbIgJWWv");
        setField(term4158, term4158.getClass(), "imageUrl", "JppkknKVOw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.UpdateUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term4158, args);
    }

};


