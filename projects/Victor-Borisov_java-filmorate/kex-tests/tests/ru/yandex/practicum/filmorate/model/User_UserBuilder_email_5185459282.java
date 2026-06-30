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

public class User_UserBuilder_email_5185459282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2007;

    public User_UserBuilder_email_5185459282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2008 = new Integer(1596070772);
        term2007 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2046 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2007, term2007.getClass(), "id", term2008);
        setField(term2007, term2007.getClass(), "email", "oVgzLbrsFr");
        setField(term2007, term2007.getClass(), "login", "vQVyKLdtaz");
        setField(term2007, term2007.getClass(), "name", "OWKQODBLzb");
        setIntField(term2046, term2046.getClass(), "year", 2015);
        setShortField(term2046, term2046.getClass(), "month", (short) 7);
        setShortField(term2046, term2046.getClass(), "day", (short) 24);
        setField(term2007, term2007.getClass(), "birthday", term2046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wGmYcqUkgE";
        callMethod(klass, "email", argTypes, term2007, args);
    }

};


