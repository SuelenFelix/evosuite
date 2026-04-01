package ru.yandex.practicum.filmorate.storage.frienship;

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
import static ru.yandex.practicum.filmorate.storage.frienship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FriendshipDbStorage_create_481313901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;

    public FriendshipDbStorage_create_481313901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6 = new Integer(1484323161);
        term5 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Friendship"));
        setField(term5, term5.getClass(), "id", term6);
        setIntField(term5, term5.getClass(), "userId1", 568599855);
        setIntField(term5, term5.getClass(), "userId2", 1162663216);
        setIntField(term5, term5.getClass(), "statusId", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.frienship.FriendshipDbStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Friendship");
        Object[] args = new Object[1];
        args[0] = term5;
        callMethod(klass, "create", argTypes, null, args);
    }

};


