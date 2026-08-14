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

public class User_hashCode_125661613415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2042;

    public User_hashCode_125661613415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2043 = new Integer(1048535127);
        term2042 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term2081 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2042, term2042.getClass(), "id", term2043);
        setField(term2042, term2042.getClass(), "email", "OWKQODBLzb");
        setField(term2042, term2042.getClass(), "login", "wGmYcqUkgE");
        setField(term2042, term2042.getClass(), "name", "idgaQsnJpQ");
        setIntField(term2081, term2081.getClass(), "year", 2024);
        setShortField(term2081, term2081.getClass(), "month", (short) 8);
        setShortField(term2081, term2081.getClass(), "day", (short) 31);
        setField(term2042, term2042.getClass(), "birthday", term2081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2042, args);
    }

};


