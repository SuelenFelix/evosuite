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

public class Friendship_setStatusId_2776039379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3837;
     Object term3843;

    public Friendship_setStatusId_2776039379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3838 = new Integer(197109649);
        term3837 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship"));
        setField(term3837, term3837.getClass(), "id", term3838);
        setIntField(term3837, term3837.getClass(), "userId1", 933028652);
        setIntField(term3837, term3837.getClass(), "userId2", 287287233);
        setIntField(term3837, term3837.getClass(), "statusId", 962840079);
        term3843 = new Integer(1540719661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3843;
        callMethod(klass, "setStatusId", argTypes, term3837, args);
    }

};


