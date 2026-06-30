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

public class Friendship_setId_1116402196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3813;
     Object term3819;

    public Friendship_setId_1116402196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3814 = new Integer(663292551);
        term3813 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship"));
        setField(term3813, term3813.getClass(), "id", term3814);
        setIntField(term3813, term3813.getClass(), "userId1", 493620644);
        setIntField(term3813, term3813.getClass(), "userId2", 1328271830);
        setIntField(term3813, term3813.getClass(), "statusId", 1596070772);
        term3819 = new Integer(-1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3819;
        callMethod(klass, "setId", argTypes, term3813, args);
    }

};


