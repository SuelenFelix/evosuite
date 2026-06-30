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

public class UserController_getCommonFriends_957796866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168;
     Object term170;
     Object term172;

    public UserController_getCommonFriends_957796866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term169 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term169, term169.getClass(), "userStorage", null);
        setField(term169, term169.getClass(), "userDbStorage", null);
        setField(term168, term168.getClass(), "userService", term169);
        term170 = new Long(6811161968424632369L);
        term172 = new Long(-7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        Object[] args = new Object[2];
        args[0] = term170;
        args[1] = term172;
        callMethod(klass, "getCommonFriends", argTypes, term168, args);
    }

};


