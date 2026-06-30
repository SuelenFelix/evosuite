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

public class Film_getReleaseDate_16005712755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4311;

    public Film_getReleaseDate_16005712755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4312 = new Integer(-1222614956);
        Integer term4344 = new Integer(-1870495012);
        Integer term4361 = new Integer(-1310015129);
        Object term4360 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4360, term4360.getClass(), "id", term4361);
        setField(term4360, term4360.getClass(), "name", "");
        Integer term4365 = new Integer(-2104981311);
        Object term4364 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4364, term4364.getClass(), "id", term4365);
        setField(term4364, term4364.getClass(), "name", "");
        Integer term4369 = new Integer(-571169753);
        Object term4368 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4368, term4368.getClass(), "id", term4369);
        setField(term4368, term4368.getClass(), "name", "");
        ArrayList term4358 = new ArrayList();
        ((ArrayList) term4358).add(term4360);
        ((ArrayList) term4358).add(term4364);
        ((ArrayList) term4358).add(term4368);
        term4311 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4343 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4311, term4311.getClass(), "id", term4312);
        setField(term4311, term4311.getClass(), "name", "vGiuZVPJNH");
        setField(term4311, term4311.getClass(), "description", "tlzpzIjMib");
        setIntField(term4338, term4338.getClass(), "year", 2016);
        setShortField(term4338, term4338.getClass(), "month", (short) 5);
        setShortField(term4338, term4338.getClass(), "day", (short) 28);
        setField(term4311, term4311.getClass(), "releaseDate", term4338);
        setIntField(term4311, term4311.getClass(), "duration", -344842608);
        setField(term4343, term4343.getClass(), "id", term4344);
        setField(term4343, term4343.getClass(), "name", "AZdLeSugwv");
        setField(term4311, term4311.getClass(), "mpa", term4343);
        setField(term4311, term4311.getClass(), "genres", term4358);
        setIntField(term4311, term4311.getClass(), "rate", 941650513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term4311, args);
    }

};


