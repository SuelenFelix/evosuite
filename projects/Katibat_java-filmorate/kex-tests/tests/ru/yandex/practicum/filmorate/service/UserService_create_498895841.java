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

public class UserService_create_498895841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public UserService_create_498895841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term1, term1.getClass(), "userStorage", null);
        setField(term1, term1.getClass(), "userDbStorage", null);
        Long term3 = new Long(2442117782898005296L);
        term2 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term41 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2, term2.getClass(), "id", term3);
        setField(term2, term2.getClass(), "email", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "login", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "name", "MuLcgQHgqz");
        setIntField(term41, term41.getClass(), "year", 2012);
        setShortField(term41, term41.getClass(), "month", (short) 8);
        setShortField(term41, term41.getClass(), "day", (short) 25);
        setField(term2, term2.getClass(), "birthday", term41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "create", argTypes, term1, args);
    }

};


