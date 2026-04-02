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
import java.lang.Long;
import java.lang.Object;

public class UserService_put_17632726692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term76;

    public UserService_put_17632726692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term75, term75.getClass(), "userStorage", null);
        setField(term75, term75.getClass(), "userDbStorage", null);
        Long term77 = new Long(6375119433582206027L);
        term76 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term115 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term76, term76.getClass(), "id", term77);
        setField(term76, term76.getClass(), "email", "xxtlPwDYFs");
        setField(term76, term76.getClass(), "login", "jJCZpVmanW");
        setField(term76, term76.getClass(), "name", "EGtDIRbSSb");
        setIntField(term115, term115.getClass(), "year", 2016);
        setShortField(term115, term115.getClass(), "month", (short) 11);
        setShortField(term115, term115.getClass(), "day", (short) 29);
        setField(term76, term76.getClass(), "birthday", term115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term76;
        callMethod(klass, "put", argTypes, term75, args);
    }

};


