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

public class Film_FilmBuilder_description_1416698003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3604;

    public Film_FilmBuilder_description_1416698003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3604 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3635 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term3604, term3604.getClass(), "id", -6292278961887936280L);
        setField(term3604, term3604.getClass(), "name", "SdCKLMIYnX");
        setField(term3604, term3604.getClass(), "description", "OJJtVNPyKZ");
        setIntField(term3630, term3630.getClass(), "year", 2012);
        setShortField(term3630, term3630.getClass(), "month", (short) 4);
        setShortField(term3630, term3630.getClass(), "day", (short) 19);
        setField(term3604, term3604.getClass(), "releaseDate", term3630);
        setIntField(term3604, term3604.getClass(), "duration", -1179120542);
        setIntField(term3635, term3635.getClass(), "id", -73683645);
        setField(term3635, term3635.getClass(), "name", "AKNapTAfmD");
        setField(term3635, term3635.getClass(), "description", "xJgPlLxpgC");
        setField(term3604, term3604.getClass(), "mpa", term3635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EYtfuJaxiM";
        callMethod(klass, "description", argTypes, term3604, args);
    }

};


