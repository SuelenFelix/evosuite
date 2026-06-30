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

public class Friendship_canEqual_100534731111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3852;
     Object term3858;

    public Friendship_canEqual_100534731111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3853 = new Integer(1557431527);
        term3852 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship"));
        setField(term3852, term3852.getClass(), "id", term3853);
        setIntField(term3852, term3852.getClass(), "userId1", -2027534003);
        setIntField(term3852, term3852.getClass(), "userId2", 1063420942);
        setIntField(term3852, term3852.getClass(), "statusId", 1375330971);
        term3858 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3858;
        callMethod(klass, "canEqual", argTypes, term3852, args);
    }

};


