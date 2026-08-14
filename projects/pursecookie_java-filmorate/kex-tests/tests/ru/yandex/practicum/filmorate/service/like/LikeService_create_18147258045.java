package ru.yandex.practicum.filmorate.service.like;

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
import static ru.yandex.practicum.filmorate.service.like.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class LikeService_create_18147258045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term35;
     Object term37;

    public LikeService_create_18147258045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.like.LikeService"));
        setField(term34, term34.getClass(), "likeStorageDao", null);
        term35 = new Long(0L);
        term37 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.like.LikeService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term35;
        args[1] = term37;
        callMethod(klass, "create", argTypes, term34, args);
    }

};


