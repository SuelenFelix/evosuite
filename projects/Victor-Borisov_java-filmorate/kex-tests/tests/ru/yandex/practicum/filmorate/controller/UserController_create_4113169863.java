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

public class UserController_create_4113169863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term84;

    public UserController_create_4113169863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term83 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.user.UserService"));
        setField(term83, term83.getClass(), "userStorage", null);
        setField(term83, term83.getClass(), "friendshipStorage", null);
        setField(term82, term82.getClass(), "userService", term83);
        Integer term85 = new Integer(1484323161);
        term84 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term123 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term84, term84.getClass(), "id", term85);
        setField(term84, term84.getClass(), "email", "xxtlPwDYFs");
        setField(term84, term84.getClass(), "login", "jJCZpVmanW");
        setField(term84, term84.getClass(), "name", "EGtDIRbSSb");
        setIntField(term123, term123.getClass(), "year", 2016);
        setShortField(term123, term123.getClass(), "month", (short) 11);
        setShortField(term123, term123.getClass(), "day", (short) 29);
        setField(term84, term84.getClass(), "birthday", term123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term84;
        callMethod(klass, "create", argTypes, term82, args);
    }

};


