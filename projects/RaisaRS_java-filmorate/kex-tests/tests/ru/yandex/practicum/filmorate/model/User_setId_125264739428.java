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

public class User_setId_125264739428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2772;
     Object term2774;

    public User_setId_125264739428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2772 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        setLongField(term2772, term2772.getClass(), "id", 0L);
        setField(term2772, term2772.getClass(), "email", null);
        setField(term2772, term2772.getClass(), "login", null);
        setField(term2772, term2772.getClass(), "name", null);
        setField(term2772, term2772.getClass(), "birthday", null);
        setField(term2772, term2772.getClass(), "friends", null);
        term2774 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2774;
        callMethod(klass, "setId", argTypes, term2772, args);
    }

};


