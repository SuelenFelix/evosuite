package com.alkemy.ong.infrastructure.rest.request.activity;

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
import static com.alkemy.ong.infrastructure.rest.request.activity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpdateActivityRequest_getImageUrl_21137187352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542;

    public UpdateActivityRequest_getImageUrl_21137187352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term542 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.activity.UpdateActivityRequest"));
        setField(term542, term542.getClass(), "content", "BYqFIqCKAV");
        setField(term542, term542.getClass(), "imageUrl", "vrQLuWIDJX");
        setField(term542, term542.getClass(), "name", "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.activity.UpdateActivityRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term542, args);
    }

};


