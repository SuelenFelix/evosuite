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

public class User_getId_3711720702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821;

    public User_getId_3711720702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term822 = new Integer(-157887805);
        term821 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term860 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term821, term821.getClass(), "id", term822);
        setField(term821, term821.getClass(), "email", "IoAlmYsBwc");
        setField(term821, term821.getClass(), "login", "TEParAifyi");
        setField(term821, term821.getClass(), "name", "OWDIEULEFu");
        setIntField(term860, term860.getClass(), "year", 2016);
        setShortField(term860, term860.getClass(), "month", (short) 11);
        setShortField(term860, term860.getClass(), "day", (short) 29);
        setField(term821, term821.getClass(), "birthday", term860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term821, args);
    }

};


