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

public class Film_FilmBuilder_build_596316547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2836;

    public Film_FilmBuilder_build_596316547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2837 = new Integer(-1145578966);
        Integer term2867 = new Integer(679763016);
        term2836 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2863 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2869 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2836, term2836.getClass(), "id", term2837);
        setField(term2836, term2836.getClass(), "name", "RYdKCNNMBR");
        setField(term2836, term2836.getClass(), "description", "yGtHPyvYiQ");
        setIntField(term2863, term2863.getClass(), "year", 2023);
        setShortField(term2863, term2863.getClass(), "month", (short) 8);
        setShortField(term2863, term2863.getClass(), "day", (short) 12);
        setField(term2836, term2836.getClass(), "releaseDate", term2863);
        setField(term2836, term2836.getClass(), "duration", term2867);
        setIntField(term2869, term2869.getClass(), "id", 865208305);
        setField(term2869, term2869.getClass(), "name", "MvRIxilFMJ");
        setField(term2836, term2836.getClass(), "mpa", term2869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2836, args);
    }

};


