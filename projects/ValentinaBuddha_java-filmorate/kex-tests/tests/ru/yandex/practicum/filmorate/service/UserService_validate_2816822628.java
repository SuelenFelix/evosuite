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

public class UserService_validate_2816822628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171;
     Object term172;

    public UserService_validate_2816822628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term171, term171.getClass(), "userStorage", null);
        setField(term171, term171.getClass(), "friendStorage", null);
        Integer term173 = new Integer(1484323161);
        term172 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term211 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term172, term172.getClass(), "id", term173);
        setField(term172, term172.getClass(), "email", "SzjVpOQTyS");
        setField(term172, term172.getClass(), "login", "MjGYSRKTNF");
        setField(term172, term172.getClass(), "name", "hRNSzYYIrc");
        setIntField(term211, term211.getClass(), "year", 2021);
        setShortField(term211, term211.getClass(), "month", (short) 1);
        setShortField(term211, term211.getClass(), "day", (short) 18);
        setField(term172, term172.getClass(), "birthday", term211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term172;
        callMethod(klass, "validate", argTypes, term171, args);
    }

};


