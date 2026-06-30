package ru.yandex.practicum.filmorate.controller;

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
import static ru.yandex.practicum.filmorate.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class UserController_validateName_10903137810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;

    public UserController_validateName_10903137810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term2 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.user.UserService"));
        setField(term2, term2.getClass(), "userStorage", null);
        setField(term2, term2.getClass(), "friendshipStorage", null);
        setField(term1, term1.getClass(), "userService", term2);
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
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "validateName", argTypes, term1, args);
    }

};


