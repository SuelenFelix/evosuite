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

public class LikeService_delete_8140210193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term30;
     Object term32;

    public LikeService_delete_8140210193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.like.LikeService"));
        setField(term29, term29.getClass(), "likeStorageDao", null);
        term30 = new Long(-8257434502486459194L);
        term32 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.like.LikeService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term30;
        args[1] = term32;
        callMethod(klass, "delete", argTypes, term29, args);
    }

};


