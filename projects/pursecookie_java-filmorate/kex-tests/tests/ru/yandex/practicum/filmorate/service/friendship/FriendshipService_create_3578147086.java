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

public class FriendshipService_create_3578147086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;
     Object term20;
     Object term22;

    public FriendshipService_create_3578147086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.friendship.FriendshipService"));
        setField(term19, term19.getClass(), "friendshipStorageDao", null);
        term20 = new Long(0L);
        term22 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.friendship.FriendshipService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term20;
        args[1] = term22;
        callMethod(klass, "create", argTypes, term19, args);
    }

};


