package ru.yandex.practicum.filmorate.service;

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
import static ru.yandex.practicum.filmorate.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class UserService_update_5477111392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;
     Object term77;

    public UserService_update_5477111392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term76, term76.getClass(), "userStorage", null);
        setField(term76, term76.getClass(), "friendStorage", null);
        Integer term78 = new Integer(1162663216);
        term77 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term116 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term77, term77.getClass(), "id", term78);
        setField(term77, term77.getClass(), "email", "xxtlPwDYFs");
        setField(term77, term77.getClass(), "login", "jJCZpVmanW");
        setField(term77, term77.getClass(), "name", "EGtDIRbSSb");
        setIntField(term116, term116.getClass(), "year", 2016);
        setShortField(term116, term116.getClass(), "month", (short) 11);
        setShortField(term116, term116.getClass(), "day", (short) 29);
        setField(term77, term77.getClass(), "birthday", term116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term77;
        callMethod(klass, "update", argTypes, term76, args);
    }

};


