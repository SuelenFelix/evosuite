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
     Object term743;

    public User_getLogin_3501207714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term744 = new Integer(391863371);
        term743 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term782 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term743, term743.getClass(), "id", term744);
        setField(term743, term743.getClass(), "email", "TEParAifyi");
        setField(term743, term743.getClass(), "login", "OWDIEULEFu");
        setField(term743, term743.getClass(), "name", "dWRymuLBtr");
        setIntField(term782, term782.getClass(), "year", 2020);
        setShortField(term782, term782.getClass(), "month", (short) 11);
        setShortField(term782, term782.getClass(), "day", (short) 22);
        setField(term743, term743.getClass(), "birthday", term782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term743, args);
    }

};


