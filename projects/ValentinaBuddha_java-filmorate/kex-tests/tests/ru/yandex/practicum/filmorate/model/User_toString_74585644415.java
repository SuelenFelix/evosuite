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

public class User_toString_74585644415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1620;

    public User_toString_74585644415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1621 = new Integer(597278769);
        term1620 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1659 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1620, term1620.getClass(), "id", term1621);
        setField(term1620, term1620.getClass(), "email", "uWHnvSvaPl");
        setField(term1620, term1620.getClass(), "login", "kBdSllIBVz");
        setField(term1620, term1620.getClass(), "name", "TJmVBGfTML");
        setIntField(term1659, term1659.getClass(), "year", 2029);
        setShortField(term1659, term1659.getClass(), "month", (short) 1);
        setShortField(term1659, term1659.getClass(), "day", (short) 20);
        setField(term1620, term1620.getClass(), "birthday", term1659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1620, args);
    }

};


