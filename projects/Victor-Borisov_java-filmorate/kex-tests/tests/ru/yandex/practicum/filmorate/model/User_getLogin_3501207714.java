package ru.yandex.practicum.filmorate.model;

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
import static ru.yandex.practicum.filmorate.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class User_getLogin_3501207714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term967;

    public User_getLogin_3501207714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term968 = new Integer(-817164822);
        term967 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1006 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term967, term967.getClass(), "id", term968);
        setField(term967, term967.getClass(), "email", "kuTXqwMtDB");
        setField(term967, term967.getClass(), "login", "Ghbwtircqb");
        setField(term967, term967.getClass(), "name", "xrwlQZdwCp");
        setIntField(term1006, term1006.getClass(), "year", 2020);
        setShortField(term1006, term1006.getClass(), "month", (short) 11);
        setShortField(term1006, term1006.getClass(), "day", (short) 22);
        setField(term967, term967.getClass(), "birthday", term1006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term967, args);
    }

};


