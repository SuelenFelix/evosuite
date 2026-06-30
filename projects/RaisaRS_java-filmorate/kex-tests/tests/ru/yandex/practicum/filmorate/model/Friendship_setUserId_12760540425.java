package ru.yandex.practicum.filmorate.model;

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
import static ru.yandex.practicum.filmorate.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Friendship_setUserId_12760540425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4442;
     Object term4446;

    public Friendship_setUserId_12760540425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4442 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship"));
        setLongField(term4442, term4442.getClass(), "userId", -7738503207562305297L);
        setLongField(term4442, term4442.getClass(), "friendId", 3825396310311739952L);
        setBooleanField(term4442, term4442.getClass(), "status", false);
        term4446 = new Long(-3838084482494604218L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4446;
        callMethod(klass, "setUserId", argTypes, term4442, args);
    }

};


