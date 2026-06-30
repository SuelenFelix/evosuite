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
import java.lang.Integer;

public class Film_FilmBuilder_duration_6734664215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3824;
     Object term3881;

    public Film_FilmBuilder_duration_6734664215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3824 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3855 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term3824, term3824.getClass(), "id", 4784595517102746672L);
        setField(term3824, term3824.getClass(), "name", "PznxWXsZME");
        setField(term3824, term3824.getClass(), "description", "ZzIujlwVsw");
        setIntField(term3850, term3850.getClass(), "year", 2015);
        setShortField(term3850, term3850.getClass(), "month", (short) 9);
        setShortField(term3850, term3850.getClass(), "day", (short) 15);
        setField(term3824, term3824.getClass(), "releaseDate", term3850);
        setIntField(term3824, term3824.getClass(), "duration", -1087774327);
        setIntField(term3855, term3855.getClass(), "id", -1530420153);
        setField(term3855, term3855.getClass(), "name", "LWyEaeIyAo");
        setField(term3855, term3855.getClass(), "description", "yVMkkQhvmN");
        setField(term3824, term3824.getClass(), "mpa", term3855);
        term3881 = new Integer(-469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3881;
        callMethod(klass, "duration", argTypes, term3824, args);
    }

};


