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

public class User_setName_133397527311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1722;

    public User_setName_133397527311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1723 = new Integer(597278769);
        term1722 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1761 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1722, term1722.getClass(), "id", term1723);
        setField(term1722, term1722.getClass(), "email", "uWHnvSvaPl");
        setField(term1722, term1722.getClass(), "login", "kBdSllIBVz");
        setField(term1722, term1722.getClass(), "name", "TJmVBGfTML");
        setIntField(term1761, term1761.getClass(), "year", 2024);
        setShortField(term1761, term1761.getClass(), "month", (short) 1);
        setShortField(term1761, term1761.getClass(), "day", (short) 24);
        setField(term1722, term1722.getClass(), "birthday", term1761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tPlsykYBqO";
        callMethod(klass, "setName", argTypes, term1722, args);
    }

};


