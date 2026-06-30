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

public class UserController_addFriend_2441107474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;
     Object term159;
     Object term161;

    public UserController_addFriend_2441107474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term158 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term158, term158.getClass(), "userStorage", null);
        setField(term158, term158.getClass(), "friendStorage", null);
        setField(term157, term157.getClass(), "userService", term158);
        term159 = new Integer(1162663216);
        term161 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term159;
        args[1] = term161;
        callMethod(klass, "addFriend", argTypes, term157, args);
    }

};


