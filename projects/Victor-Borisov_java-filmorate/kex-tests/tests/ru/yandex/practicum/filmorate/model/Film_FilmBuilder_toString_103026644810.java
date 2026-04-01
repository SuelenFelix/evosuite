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
import java.util.ArrayList;

public class Film_FilmBuilder_toString_103026644810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4124;

    public Film_FilmBuilder_toString_103026644810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4125 = new Integer(-1896376975);
        Integer term4157 = new Integer(729658803);
        ArrayList term4171 = new ArrayList();
        term4124 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term4151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4156 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4124, term4124.getClass(), "id", term4125);
        setField(term4124, term4124.getClass(), "name", "XJJNClzHRf");
        setField(term4124, term4124.getClass(), "description", "HDaezxQfQR");
        setIntField(term4151, term4151.getClass(), "year", 2016);
        setShortField(term4151, term4151.getClass(), "month", (short) 5);
        setShortField(term4151, term4151.getClass(), "day", (short) 28);
        setField(term4124, term4124.getClass(), "releaseDate", term4151);
        setIntField(term4124, term4124.getClass(), "duration", -1016503459);
        setField(term4156, term4156.getClass(), "id", term4157);
        setField(term4156, term4156.getClass(), "name", "iikZEapDlu");
        setField(term4124, term4124.getClass(), "mpa", term4156);
        setField(term4124, term4124.getClass(), "genres", term4171);
        setIntField(term4124, term4124.getClass(), "rate", -1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4124, args);
    }

};


