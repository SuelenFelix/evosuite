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

public class UserController_put_21247000712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term79;

    public UserController_put_21247000712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term78 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term78, term78.getClass(), "userStorage", null);
        setField(term78, term78.getClass(), "userDbStorage", null);
        setField(term77, term77.getClass(), "userService", term78);
        Long term80 = new Long(6375119433582206027L);
        term79 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term118 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term79, term79.getClass(), "id", term80);
        setField(term79, term79.getClass(), "email", "xxtlPwDYFs");
        setField(term79, term79.getClass(), "login", "jJCZpVmanW");
        setField(term79, term79.getClass(), "name", "EGtDIRbSSb");
        setIntField(term118, term118.getClass(), "year", 2016);
        setShortField(term118, term118.getClass(), "month", (short) 11);
        setShortField(term118, term118.getClass(), "day", (short) 29);
        setField(term79, term79.getClass(), "birthday", term118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term79;
        callMethod(klass, "put", argTypes, term77, args);
    }

};


