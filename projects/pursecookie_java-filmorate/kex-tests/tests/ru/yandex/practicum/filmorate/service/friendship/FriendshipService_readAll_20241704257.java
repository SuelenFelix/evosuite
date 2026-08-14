package ru.yandex.practicum.filmorate.service.friendship;

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
import static ru.yandex.practicum.filmorate.service.friendship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class FriendshipService_readAll_20241704257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term25;

    public FriendshipService_readAll_20241704257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.friendship.FriendshipService"));
        setField(term24, term24.getClass(), "friendshipStorageDao", null);
        term25 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.friendship.FriendshipService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term25;
        callMethod(klass, "readAll", argTypes, term24, args);
    }

};


