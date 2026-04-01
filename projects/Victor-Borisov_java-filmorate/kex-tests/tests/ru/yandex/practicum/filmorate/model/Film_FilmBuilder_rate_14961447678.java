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

public class Film_FilmBuilder_rate_14961447678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3918;
     Object term3982;

    public Film_FilmBuilder_rate_14961447678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3919 = new Integer(-601863069);
        Integer term3951 = new Integer(663292551);
        Integer term3968 = new Integer(-1885090354);
        Object term3967 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3967, term3967.getClass(), "id", term3968);
        setField(term3967, term3967.getClass(), "name", "");
        Integer term3972 = new Integer(-2066804303);
        Object term3971 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3971, term3971.getClass(), "id", term3972);
        setField(term3971, term3971.getClass(), "name", "");
        Integer term3976 = new Integer(-1731761810);
        Object term3975 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3975, term3975.getClass(), "id", term3976);
        setField(term3975, term3975.getClass(), "name", "");
        ArrayList term3965 = new ArrayList();
        ((ArrayList) term3965).add(term3967);
        ((ArrayList) term3965).add(term3971);
        ((ArrayList) term3965).add(term3975);
        term3918 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3950 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3918, term3918.getClass(), "id", term3919);
        setField(term3918, term3918.getClass(), "name", "kVEZMHmRtR");
        setField(term3918, term3918.getClass(), "description", "ekxGuOYIwi");
        setIntField(term3945, term3945.getClass(), "year", 2011);
        setShortField(term3945, term3945.getClass(), "month", (short) 7);
        setShortField(term3945, term3945.getClass(), "day", (short) 24);
        setField(term3918, term3918.getClass(), "releaseDate", term3945);
        setIntField(term3918, term3918.getClass(), "duration", 767834723);
        setField(term3950, term3950.getClass(), "id", term3951);
        setField(term3950, term3950.getClass(), "name", "RbVQXSpxXy");
        setField(term3918, term3918.getClass(), "mpa", term3950);
        setField(term3918, term3918.getClass(), "genres", term3965);
        setIntField(term3918, term3918.getClass(), "rate", -602026508);
        term3982 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3982;
        callMethod(klass, "rate", argTypes, term3918, args);
    }

};


