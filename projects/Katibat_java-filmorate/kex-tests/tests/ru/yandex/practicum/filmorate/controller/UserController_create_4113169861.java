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
import java.lang.Long;

public class UserController_create_4113169861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term4;

    public UserController_create_4113169861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term3 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term3, term3.getClass(), "userStorage", null);
        setField(term3, term3.getClass(), "userDbStorage", null);
        setField(term2, term2.getClass(), "userService", term3);
        Long term5 = new Long(2442117782898005296L);
        term4 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term43 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term4, term4.getClass(), "id", term5);
        setField(term4, term4.getClass(), "email", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "login", "sjlJAEtRrb");
        setField(term4, term4.getClass(), "name", "MuLcgQHgqz");
        setIntField(term43, term43.getClass(), "year", 2012);
        setShortField(term43, term43.getClass(), "month", (short) 8);
        setShortField(term43, term43.getClass(), "day", (short) 25);
        setField(term4, term4.getClass(), "birthday", term43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term4;
        callMethod(klass, "create", argTypes, term2, args);
    }

};


