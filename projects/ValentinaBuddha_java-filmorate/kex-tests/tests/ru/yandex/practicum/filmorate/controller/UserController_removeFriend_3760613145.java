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

public class UserController_removeFriend_3760613145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term165;
     Object term167;

    public UserController_removeFriend_3760613145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term164 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term164, term164.getClass(), "userStorage", null);
        setField(term164, term164.getClass(), "friendStorage", null);
        setField(term163, term163.getClass(), "userService", term164);
        term165 = new Integer(391863371);
        term167 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term165;
        args[1] = term167;
        callMethod(klass, "removeFriend", argTypes, term163, args);
    }

};


