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

public class Film_getGenres_5150639268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4573;

    public Film_getGenres_5150639268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4574 = new Integer(-749861210);
        Integer term4606 = new Integer(1694224101);
        Integer term4623 = new Integer(937859191);
        Object term4622 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4622, term4622.getClass(), "id", term4623);
        setField(term4622, term4622.getClass(), "name", "");
        Integer term4627 = new Integer(-916584829);
        Object term4626 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4626, term4626.getClass(), "id", term4627);
        setField(term4626, term4626.getClass(), "name", "");
        ArrayList term4620 = new ArrayList();
        ((ArrayList) term4620).add(term4622);
        ((ArrayList) term4620).add(term4626);
        term4573 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4605 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4573, term4573.getClass(), "id", term4574);
        setField(term4573, term4573.getClass(), "name", "CFyoseFGLF");
        setField(term4573, term4573.getClass(), "description", "SFqCrhEWLm");
        setIntField(term4600, term4600.getClass(), "year", 2023);
        setShortField(term4600, term4600.getClass(), "month", (short) 3);
        setShortField(term4600, term4600.getClass(), "day", (short) 7);
        setField(term4573, term4573.getClass(), "releaseDate", term4600);
        setIntField(term4573, term4573.getClass(), "duration", 304775596);
        setField(term4605, term4605.getClass(), "id", term4606);
        setField(term4605, term4605.getClass(), "name", "GZdcJyZntS");
        setField(term4573, term4573.getClass(), "mpa", term4605);
        setField(term4573, term4573.getClass(), "genres", term4620);
        setIntField(term4573, term4573.getClass(), "rate", -1347665717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenres", argTypes, term4573, args);
    }

};


