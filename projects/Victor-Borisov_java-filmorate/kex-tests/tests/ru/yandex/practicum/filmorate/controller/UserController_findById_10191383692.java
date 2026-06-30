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

public class UserController_findById_10191383692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term80;

    public UserController_findById_10191383692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term79 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.user.UserService"));
        setField(term79, term79.getClass(), "userStorage", null);
        setField(term79, term79.getClass(), "friendshipStorage", null);
        setField(term78, term78.getClass(), "userService", term79);
        term80 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term80;
        callMethod(klass, "findById", argTypes, term78, args);
    }

};


