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

public class Friendship_setUserId2_14116137888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3829;
     Object term3835;

    public Friendship_setUserId2_14116137888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3830 = new Integer(-1731761810);
        term3829 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship"));
        setField(term3829, term3829.getClass(), "id", term3830);
        setIntField(term3829, term3829.getClass(), "userId1", 1324040357);
        setIntField(term3829, term3829.getClass(), "userId2", -1588772968);
        setIntField(term3829, term3829.getClass(), "statusId", -93135961);
        term3835 = new Integer(-112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3835;
        callMethod(klass, "setUserId2", argTypes, term3829, args);
    }

};


