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

public class User_setId_13924779087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1186;
     Object term1229;

    public User_setId_13924779087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1187 = new Integer(579005622);
        term1186 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1225 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1186, term1186.getClass(), "id", term1187);
        setField(term1186, term1186.getClass(), "email", "hxCBltsObl");
        setField(term1186, term1186.getClass(), "login", "BndsHwAFMv");
        setField(term1186, term1186.getClass(), "name", "GzFkzHGYFt");
        setIntField(term1225, term1225.getClass(), "year", 2015);
        setShortField(term1225, term1225.getClass(), "month", (short) 4);
        setShortField(term1225, term1225.getClass(), "day", (short) 14);
        setField(term1186, term1186.getClass(), "birthday", term1225);
        term1229 = new Integer(-14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1229;
        callMethod(klass, "setId", argTypes, term1186, args);
    }

};


