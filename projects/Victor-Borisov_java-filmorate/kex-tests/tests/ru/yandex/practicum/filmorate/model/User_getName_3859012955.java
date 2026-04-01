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

public class User_getName_3859012955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1040;

    public User_getName_3859012955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1041 = new Integer(-1016503459);
        term1040 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1079 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1040, term1040.getClass(), "id", term1041);
        setField(term1040, term1040.getClass(), "email", "IDCWpPLRkE");
        setField(term1040, term1040.getClass(), "login", "nyiiPDVjAc");
        setField(term1040, term1040.getClass(), "name", "aKnKipADSo");
        setIntField(term1079, term1079.getClass(), "year", 2015);
        setShortField(term1079, term1079.getClass(), "month", (short) 9);
        setShortField(term1079, term1079.getClass(), "day", (short) 19);
        setField(term1040, term1040.getClass(), "birthday", term1079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1040, args);
    }

};


