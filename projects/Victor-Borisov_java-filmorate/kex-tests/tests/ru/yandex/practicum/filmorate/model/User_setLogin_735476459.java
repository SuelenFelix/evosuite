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

public class User_setLogin_735476459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1356;

    public User_setLogin_735476459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1357 = new Integer(454281060);
        term1356 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1395 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1356, term1356.getClass(), "id", term1357);
        setField(term1356, term1356.getClass(), "email", "nGKItKLYNC");
        setField(term1356, term1356.getClass(), "login", "UiUYnPrcCi");
        setField(term1356, term1356.getClass(), "name", "UoYtihxVaS");
        setIntField(term1395, term1395.getClass(), "year", 2022);
        setShortField(term1395, term1395.getClass(), "month", (short) 2);
        setShortField(term1395, term1395.getClass(), "day", (short) 25);
        setField(term1356, term1356.getClass(), "birthday", term1395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDswTTCZHV";
        callMethod(klass, "setLogin", argTypes, term1356, args);
    }

};


