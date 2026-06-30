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

public class UserController_update_9091385411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;
     Object term78;

    public UserController_update_9091385411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term77 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term77, term77.getClass(), "userStorage", null);
        setField(term77, term77.getClass(), "friendStorage", null);
        setField(term76, term76.getClass(), "userService", term77);
        Integer term79 = new Integer(1162663216);
        term78 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term117 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term78, term78.getClass(), "id", term79);
        setField(term78, term78.getClass(), "email", "xxtlPwDYFs");
        setField(term78, term78.getClass(), "login", "jJCZpVmanW");
        setField(term78, term78.getClass(), "name", "EGtDIRbSSb");
        setIntField(term117, term117.getClass(), "year", 2016);
        setShortField(term117, term117.getClass(), "month", (short) 11);
        setShortField(term117, term117.getClass(), "day", (short) 29);
        setField(term78, term78.getClass(), "birthday", term117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term78;
        callMethod(klass, "update", argTypes, term76, args);
    }

};


