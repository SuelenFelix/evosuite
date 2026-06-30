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

public class Friendship_setFriendId_17270745796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4448;
     Object term4452;

    public Friendship_setFriendId_17270745796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4448 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship"));
        setLongField(term4448, term4448.getClass(), "userId", 3892018155439224435L);
        setLongField(term4448, term4448.getClass(), "friendId", 5953383087795962419L);
        setBooleanField(term4448, term4448.getClass(), "status", true);
        term4452 = new Long(7994303628307559416L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4452;
        callMethod(klass, "setFriendId", argTypes, term4448, args);
    }

};


