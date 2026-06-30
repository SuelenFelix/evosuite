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

public class Film_FilmBuilder_releaseDate_1450949264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2575;
     Object term2622;

    public Film_FilmBuilder_releaseDate_1450949264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2576 = new Integer(-1179120542);
        Integer term2606 = new Integer(-73683645);
        term2575 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2608 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2575, term2575.getClass(), "id", term2576);
        setField(term2575, term2575.getClass(), "name", "vjxIhXHxGR");
        setField(term2575, term2575.getClass(), "description", "QXzGXbEXMu");
        setIntField(term2602, term2602.getClass(), "year", 2025);
        setShortField(term2602, term2602.getClass(), "month", (short) 2);
        setShortField(term2602, term2602.getClass(), "day", (short) 13);
        setField(term2575, term2575.getClass(), "releaseDate", term2602);
        setField(term2575, term2575.getClass(), "duration", term2606);
        setIntField(term2608, term2608.getClass(), "id", -117576464);
        setField(term2608, term2608.getClass(), "name", "qxSDVejjiY");
        setField(term2575, term2575.getClass(), "mpa", term2608);
        term2622 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2622, term2622.getClass(), "year", 2012);
        setShortField(term2622, term2622.getClass(), "month", (short) 2);
        setShortField(term2622, term2622.getClass(), "day", (short) 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2622;
        callMethod(klass, "releaseDate", argTypes, term2575, args);
    }

};


