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
import java.lang.Long;
import java.lang.Object;

public class User_getBirthday_19940840666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term971;

    public User_getBirthday_19940840666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term972 = new Long(7009926388951271268L);
        term971 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1010 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term971, term971.getClass(), "id", term972);
        setField(term971, term971.getClass(), "email", "xrwlQZdwCp");
        setField(term971, term971.getClass(), "login", "IDCWpPLRkE");
        setField(term971, term971.getClass(), "name", "nyiiPDVjAc");
        setIntField(term1010, term1010.getClass(), "year", 2018);
        setShortField(term1010, term1010.getClass(), "month", (short) 1);
        setShortField(term1010, term1010.getClass(), "day", (short) 13);
        setField(term971, term971.getClass(), "birthday", term1010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthday", argTypes, term971, args);
    }

};


