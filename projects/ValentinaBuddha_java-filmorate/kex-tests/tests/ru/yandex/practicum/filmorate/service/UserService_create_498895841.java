package ru.yandex.practicum.filmorate.service;

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
import static ru.yandex.practicum.filmorate.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class UserService_create_498895841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term3;

    public UserService_create_498895841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term2, term2.getClass(), "userStorage", null);
        setField(term2, term2.getClass(), "friendStorage", null);
        Integer term4 = new Integer(568599855);
        term3 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term42 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term3, term3.getClass(), "id", term4);
        setField(term3, term3.getClass(), "email", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "login", "sjlJAEtRrb");
        setField(term3, term3.getClass(), "name", "MuLcgQHgqz");
        setIntField(term42, term42.getClass(), "year", 2012);
        setShortField(term42, term42.getClass(), "month", (short) 8);
        setShortField(term42, term42.getClass(), "day", (short) 25);
        setField(term3, term3.getClass(), "birthday", term42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "create", argTypes, term2, args);
    }

};


