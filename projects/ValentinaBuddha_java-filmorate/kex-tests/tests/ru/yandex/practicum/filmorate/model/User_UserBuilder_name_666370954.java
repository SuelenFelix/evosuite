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

public class User_UserBuilder_name_666370954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1973;

    public User_UserBuilder_name_666370954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1974 = new Integer(-655067527);
        term1973 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2012 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1973, term1973.getClass(), "id", term1974);
        setField(term1973, term1973.getClass(), "email", "wGmYcqUkgE");
        setField(term1973, term1973.getClass(), "login", "idgaQsnJpQ");
        setField(term1973, term1973.getClass(), "name", "VgZnGoIFwQ");
        setIntField(term2012, term2012.getClass(), "year", 2024);
        setShortField(term2012, term2012.getClass(), "month", (short) 8);
        setShortField(term2012, term2012.getClass(), "day", (short) 31);
        setField(term1973, term1973.getClass(), "birthday", term2012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jUbSRrkrYZ";
        callMethod(klass, "name", argTypes, term1973, args);
    }

};


