package ru.yandex.practicum.filmorate.model.user;

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
import static ru.yandex.practicum.filmorate.model.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_hashCode_159159614845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2389;

    public User_hashCode_159159614845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2389 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        setField(term2389, term2389.getClass(), "id", null);
        setField(term2389, term2389.getClass(), "email", null);
        setField(term2389, term2389.getClass(), "login", null);
        setField(term2389, term2389.getClass(), "name", null);
        setField(term2389, term2389.getClass(), "birthday", null);
        setField(term2389, term2389.getClass(), "friendsId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2389, args);
    }

};


