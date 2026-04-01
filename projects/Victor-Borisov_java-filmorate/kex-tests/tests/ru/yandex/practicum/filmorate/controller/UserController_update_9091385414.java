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

public class UserController_update_9091385414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;
     Object term159;

    public UserController_update_9091385414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term158 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.user.UserService"));
        setField(term158, term158.getClass(), "userStorage", null);
        setField(term158, term158.getClass(), "friendshipStorage", null);
        setField(term157, term157.getClass(), "userService", term158);
        Integer term160 = new Integer(391863371);
        term159 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term198 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term159, term159.getClass(), "id", term160);
        setField(term159, term159.getClass(), "email", "SzjVpOQTyS");
        setField(term159, term159.getClass(), "login", "MjGYSRKTNF");
        setField(term159, term159.getClass(), "name", "hRNSzYYIrc");
        setIntField(term198, term198.getClass(), "year", 2021);
        setShortField(term198, term198.getClass(), "month", (short) 1);
        setShortField(term198, term198.getClass(), "day", (short) 18);
        setField(term159, term159.getClass(), "birthday", term198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term159;
        callMethod(klass, "update", argTypes, term157, args);
    }

};


