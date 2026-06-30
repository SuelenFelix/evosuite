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

public class Friendship_FriendshipBuilder_userId1_2758933642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;
     Object term274;

    public Friendship_FriendshipBuilder_userId1_2758933642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term269 = new Integer(1134449235);
        term268 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship$FriendshipBuilder"));
        setField(term268, term268.getClass(), "id", term269);
        setIntField(term268, term268.getClass(), "userId1", 391863371);
        setIntField(term268, term268.getClass(), "userId2", -1922583790);
        setIntField(term268, term268.getClass(), "statusId", -616727354);
        term274 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship$FriendshipBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term274;
        callMethod(klass, "userId1", argTypes, term268, args);
    }

};


