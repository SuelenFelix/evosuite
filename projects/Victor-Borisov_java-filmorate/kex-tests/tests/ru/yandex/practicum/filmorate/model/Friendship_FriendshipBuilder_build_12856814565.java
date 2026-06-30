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
import java.lang.Integer;

public class Friendship_FriendshipBuilder_build_12856814565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292;

    public Friendship_FriendshipBuilder_build_12856814565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term293 = new Integer(597278769);
        term292 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship$FriendshipBuilder"));
        setField(term292, term292.getClass(), "id", term293);
        setIntField(term292, term292.getClass(), "userId1", 597278769);
        setIntField(term292, term292.getClass(), "userId2", -1685132342);
        setIntField(term292, term292.getClass(), "statusId", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship$FriendshipBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term292, args);
    }

};


