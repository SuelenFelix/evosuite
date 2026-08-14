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

public class User_setEmail_20539074667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1143;

    public User_setEmail_20539074667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1143 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1180 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1143, term1143.getClass(), "login", "hxCBltsObl");
        setField(term1143, term1143.getClass(), "name", "BndsHwAFMv");
        setField(term1143, term1143.getClass(), "email", "GzFkzHGYFt");
        setIntField(term1180, term1180.getClass(), "year", 2015);
        setShortField(term1180, term1180.getClass(), "month", (short) 4);
        setShortField(term1180, term1180.getClass(), "day", (short) 14);
        setField(term1143, term1143.getClass(), "birthday", term1180);
        setLongField(term1143, term1143.getClass(), "id", -2850532706972744550L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setEmail", argTypes, term1143, args);
    }

};


