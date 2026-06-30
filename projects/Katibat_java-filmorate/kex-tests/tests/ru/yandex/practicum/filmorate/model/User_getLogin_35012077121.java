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

public class User_getLogin_35012077121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1779;

    public User_getLogin_35012077121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1779 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        setField(term1779, term1779.getClass(), "id", null);
        setField(term1779, term1779.getClass(), "email", null);
        setField(term1779, term1779.getClass(), "login", null);
        setField(term1779, term1779.getClass(), "name", null);
        setField(term1779, term1779.getClass(), "birthday", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term1779, args);
    }

};


