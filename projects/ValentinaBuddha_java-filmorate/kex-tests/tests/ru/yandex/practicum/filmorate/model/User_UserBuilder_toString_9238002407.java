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
import java.lang.Object;

public class User_UserBuilder_toString_9238002407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2218;

    public User_UserBuilder_toString_9238002407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2219 = new Integer(-117576464);
        term2218 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2257 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2218, term2218.getClass(), "id", term2219);
        setField(term2218, term2218.getClass(), "email", "jSpAteRute");
        setField(term2218, term2218.getClass(), "login", "swZVeJAxjt");
        setField(term2218, term2218.getClass(), "name", "xOcJIiQQDu");
        setIntField(term2257, term2257.getClass(), "year", 2025);
        setShortField(term2257, term2257.getClass(), "month", (short) 4);
        setShortField(term2257, term2257.getClass(), "day", (short) 8);
        setField(term2218, term2218.getClass(), "birthday", term2257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2218, args);
    }

};


