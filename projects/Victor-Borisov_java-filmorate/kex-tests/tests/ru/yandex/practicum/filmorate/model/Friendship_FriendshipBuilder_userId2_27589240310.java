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

public class Friendship_FriendshipBuilder_userId2_27589240310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314;
     Object term318;

    public Friendship_FriendshipBuilder_userId2_27589240310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship$FriendshipBuilder"));
        setField(term314, term314.getClass(), "id", null);
        setIntField(term314, term314.getClass(), "userId1", 0);
        setIntField(term314, term314.getClass(), "userId2", 0);
        setIntField(term314, term314.getClass(), "statusId", 0);
        term318 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship$FriendshipBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term318;
        callMethod(klass, "userId2", argTypes, term314, args);
    }

};


