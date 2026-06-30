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

public class User_setEmail_20539074668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1261;

    public User_setEmail_20539074668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1262 = new Integer(1632125673);
        term1261 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1300 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1261, term1261.getClass(), "id", term1262);
        setField(term1261, term1261.getClass(), "email", "tShwQLRGNe");
        setField(term1261, term1261.getClass(), "login", "LvtrsXUliU");
        setField(term1261, term1261.getClass(), "name", "xLbjWUgOIL");
        setIntField(term1300, term1300.getClass(), "year", 2017);
        setShortField(term1300, term1300.getClass(), "month", (short) 5);
        setShortField(term1300, term1300.getClass(), "day", (short) 21);
        setField(term1261, term1261.getClass(), "birthday", term1300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jDtqGUpnZN";
        callMethod(klass, "setEmail", argTypes, term1261, args);
    }

};


