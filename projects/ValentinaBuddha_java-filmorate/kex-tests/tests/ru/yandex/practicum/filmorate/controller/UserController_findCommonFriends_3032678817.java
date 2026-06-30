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

public class UserController_findCommonFriends_3032678817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term175;
     Object term177;

    public UserController_findCommonFriends_3032678817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term174 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term174, term174.getClass(), "userStorage", null);
        setField(term174, term174.getClass(), "friendStorage", null);
        setField(term173, term173.getClass(), "userService", term174);
        term175 = new Integer(-1955890973);
        term177 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term175;
        args[1] = term177;
        callMethod(klass, "findCommonFriends", argTypes, term173, args);
    }

};


