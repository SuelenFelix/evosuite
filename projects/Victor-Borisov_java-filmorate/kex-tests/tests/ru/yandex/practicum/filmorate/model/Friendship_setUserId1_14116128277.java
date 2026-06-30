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

public class Friendship_setUserId1_14116128277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3821;
     Object term3827;

    public Friendship_setUserId1_14116128277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3822 = new Integer(-2066804303);
        term3821 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship"));
        setField(term3821, term3821.getClass(), "id", term3822);
        setIntField(term3821, term3821.getClass(), "userId1", 97029295);
        setIntField(term3821, term3821.getClass(), "userId2", -1371869594);
        setIntField(term3821, term3821.getClass(), "statusId", -2095575670);
        term3827 = new Integer(1225272962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Friendship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3827;
        callMethod(klass, "setUserId1", argTypes, term3821, args);
    }

};


