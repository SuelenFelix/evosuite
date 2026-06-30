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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_getFriends_9836152128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1677;

    public User_getFriends_9836152128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1720 = new HashMap();
        Set<Object> term1780 =  ((Map) term1720).keySet();
        HashSet term1719 = new HashSet((Collection<? extends Object>) term1780);
        term1677 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1715 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1677, term1677.getClass(), "id", -4920224193275732920L);
        setField(term1677, term1677.getClass(), "email", "ieCtQFdkii");
        setField(term1677, term1677.getClass(), "login", "dEnhdmILtU");
        setField(term1677, term1677.getClass(), "name", "hoicvmsovO");
        setIntField(term1715, term1715.getClass(), "year", 2017);
        setShortField(term1715, term1715.getClass(), "month", (short) 5);
        setShortField(term1715, term1715.getClass(), "day", (short) 21);
        setField(term1677, term1677.getClass(), "birthday", term1715);
        setField(term1677, term1677.getClass(), "friends", term1719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFriends", argTypes, term1677, args);
    }

};


