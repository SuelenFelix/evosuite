package ru.yandex.practicum.filmorate.storage;

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
import static ru.yandex.practicum.filmorate.storage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Integer;

public class InMemoryUserStorage_getFriendsByUserId_14088291323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;
     Object term744;

    public InMemoryUserStorage_getFriendsByUserId_14088291323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term738 = new HashMap();
        term737 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage"));
        setField(term737, term737.getClass(), "storagedData", term738);
        setIntField(term737, term737.getClass(), "id", -469968304);
        term744 = new Integer(-1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term744;
        callMethod(klass, "getFriendsByUserId", argTypes, term737, args);
    }

};


