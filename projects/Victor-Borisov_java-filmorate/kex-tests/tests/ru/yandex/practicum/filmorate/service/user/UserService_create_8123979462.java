package ru.yandex.practicum.filmorate.service.user;

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
import static ru.yandex.practicum.filmorate.service.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class UserService_create_8123979462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term6;

    public UserService_create_8123979462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.user.UserService"));
        setField(term5, term5.getClass(), "userStorage", null);
        setField(term5, term5.getClass(), "friendshipStorage", null);
        Integer term7 = new Integer(1162663216);
        term6 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term45 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term6, term6.getClass(), "id", term7);
        setField(term6, term6.getClass(), "email", "PAEBtnZtTD");
        setField(term6, term6.getClass(), "login", "sjlJAEtRrb");
        setField(term6, term6.getClass(), "name", "MuLcgQHgqz");
        setIntField(term45, term45.getClass(), "year", 2012);
        setShortField(term45, term45.getClass(), "month", (short) 8);
        setShortField(term45, term45.getClass(), "day", (short) 25);
        setField(term6, term6.getClass(), "birthday", term45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.user.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term6;
        callMethod(klass, "create", argTypes, term5, args);
    }

};


