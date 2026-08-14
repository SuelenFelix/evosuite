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
import java.lang.Object;

public class User_setLogin_735476455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955;

    public User_setLogin_735476455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term955 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term992 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term955, term955.getClass(), "login", "Ghbwtircqb");
        setField(term955, term955.getClass(), "name", "xrwlQZdwCp");
        setField(term955, term955.getClass(), "email", "IDCWpPLRkE");
        setIntField(term992, term992.getClass(), "year", 2015);
        setShortField(term992, term992.getClass(), "month", (short) 9);
        setShortField(term992, term992.getClass(), "day", (short) 19);
        setField(term955, term955.getClass(), "birthday", term992);
        setLongField(term955, term955.getClass(), "id", 2936323121573284007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nyiiPDVjAc";
        callMethod(klass, "setLogin", argTypes, term955, args);
    }

};


