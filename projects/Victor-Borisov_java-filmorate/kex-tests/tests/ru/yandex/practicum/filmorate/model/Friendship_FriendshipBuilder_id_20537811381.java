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

public class Friendship_FriendshipBuilder_id_20537811381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;
     Object term266;

    public Friendship_FriendshipBuilder_id_20537811381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term261 = new Integer(1725571209);
        term260 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship$FriendshipBuilder"));
        setField(term260, term260.getClass(), "id", term261);
        setIntField(term260, term260.getClass(), "userId1", 568599855);
        setIntField(term260, term260.getClass(), "userId2", 1162663216);
        setIntField(term260, term260.getClass(), "statusId", 1484323161);
        term266 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship$FriendshipBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term266;
        callMethod(klass, "id", argTypes, term260, args);
    }

};


