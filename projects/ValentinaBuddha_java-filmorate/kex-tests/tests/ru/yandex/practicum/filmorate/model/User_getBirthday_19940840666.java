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

public class User_getBirthday_19940840666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889;

    public User_getBirthday_19940840666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term890 = new Integer(-616727354);
        term889 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term928 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term889, term889.getClass(), "id", term890);
        setField(term889, term889.getClass(), "email", "Ghbwtircqb");
        setField(term889, term889.getClass(), "login", "xrwlQZdwCp");
        setField(term889, term889.getClass(), "name", "IDCWpPLRkE");
        setIntField(term928, term928.getClass(), "year", 2018);
        setShortField(term928, term928.getClass(), "month", (short) 1);
        setShortField(term928, term928.getClass(), "day", (short) 13);
        setField(term889, term889.getClass(), "birthday", term928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthday", argTypes, term889, args);
    }

};


