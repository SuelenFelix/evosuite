package ru.yandex.practicum.filmorate.storage.film;

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
import static ru.yandex.practicum.filmorate.storage.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class FilmDbStorage_create_7854266352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public FilmDbStorage_create_7854266352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4 = new Integer(1162663216);
        Integer term36 = new Integer(1484323161);
        Integer term53 = new Integer(391863371);
        Object term52 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term52, term52.getClass(), "id", term53);
        setField(term52, term52.getClass(), "name", "");
        Integer term57 = new Integer(-1922583790);
        Object term56 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term56, term56.getClass(), "id", term57);
        setField(term56, term56.getClass(), "name", "");
        Integer term61 = new Integer(-616727354);
        Object term60 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term60, term60.getClass(), "id", term61);
        setField(term60, term60.getClass(), "name", "");
        Integer term65 = new Integer(-1955890973);
        Object term64 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term64, term64.getClass(), "id", term65);
        setField(term64, term64.getClass(), "name", "");
        Integer term69 = new Integer(-2038273078);
        Object term68 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term68, term68.getClass(), "id", term69);
        setField(term68, term68.getClass(), "name", "");
        ArrayList term50 = new ArrayList();
        ((ArrayList) term50).add(term52);
        ((ArrayList) term50).add(term56);
        ((ArrayList) term50).add(term60);
        ((ArrayList) term50).add(term64);
        ((ArrayList) term50).add(term68);
        term3 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term30 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3, term3.getClass(), "id", term4);
        setField(term3, term3.getClass(), "name", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "description", "sjlJAEtRrb");
        setIntField(term30, term30.getClass(), "year", 2012);
        setShortField(term30, term30.getClass(), "month", (short) 8);
        setShortField(term30, term30.getClass(), "day", (short) 25);
        setField(term3, term3.getClass(), "releaseDate", term30);
        setIntField(term3, term3.getClass(), "duration", 568599855);
        setField(term35, term35.getClass(), "id", term36);
        setField(term35, term35.getClass(), "name", "MuLcgQHgqz");
        setField(term3, term3.getClass(), "mpa", term35);
        setField(term3, term3.getClass(), "genres", term50);
        setIntField(term3, term3.getClass(), "rate", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.film.FilmDbStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "create", argTypes, null, args);
    }

};


