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

public class User_UserBuilder_login_14618138933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1960;

    public User_UserBuilder_login_14618138933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1961 = new Long(5907001541142728739L);
        term1960 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term1999 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1960, term1960.getClass(), "id", term1961);
        setField(term1960, term1960.getClass(), "email", "oVgzLbrsFr");
        setField(term1960, term1960.getClass(), "login", "vQVyKLdtaz");
        setField(term1960, term1960.getClass(), "name", "OWKQODBLzb");
        setIntField(term1999, term1999.getClass(), "year", 2022);
        setShortField(term1999, term1999.getClass(), "month", (short) 11);
        setShortField(term1999, term1999.getClass(), "day", (short) 16);
        setField(term1960, term1960.getClass(), "birthday", term1999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wGmYcqUkgE";
        callMethod(klass, "login", argTypes, term1960, args);
    }

};


