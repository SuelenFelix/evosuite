package ru.yandex.practicum.filmorate.model.film;

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
import static ru.yandex.practicum.filmorate.model.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Film_addGenre_1439418592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192;
     Object term270;

    public Film_addGenre_1439418592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term193 = new Long(-8885298608300233488L);
        Integer term223 = new Integer(1725571209);
        Integer term226 = new Integer(-522618178);
        HashMap term241 = new HashMap();
        Set<Object> term315 =  ((Map) term241).keySet();
        HashSet term240 = new HashSet((Collection<? extends Object>) term315);
        HashMap term254 = new HashMap();
        Set<Object> term316 =  ((Map) term254).keySet();
        HashSet term253 = new HashSet((Collection<? extends Object>) term316);
        Integer term268 = new Integer(597278769);
        term192 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term192, term192.getClass(), "id", term193);
        setField(term192, term192.getClass(), "name", "uuaPigETmJ");
        setField(term192, term192.getClass(), "description", "MxlszYVzRf");
        setIntField(term219, term219.getClass(), "year", 2021);
        setShortField(term219, term219.getClass(), "month", (short) 1);
        setShortField(term219, term219.getClass(), "day", (short) 18);
        setField(term192, term192.getClass(), "releaseDate", term219);
        setField(term192, term192.getClass(), "duration", term223);
        setField(term225, term225.getClass(), "id", term226);
        setField(term225, term225.getClass(), "name", "LQFpaHEwXR");
        setField(term192, term192.getClass(), "mpa", term225);
        setField(term192, term192.getClass(), "genres", term240);
        setField(term192, term192.getClass(), "likes", term253);
        setField(term192, term192.getClass(), "rate", term268);
        Integer term271 = new Integer(-1685132342);
        term270 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.genre.Genre"));
        setField(term270, term270.getClass(), "id", term271);
        setField(term270, term270.getClass(), "name", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.genre.Genre");
        Object[] args = new Object[1];
        args[0] = term270;
        callMethod(klass, "addGenre", argTypes, term192, args);
    }

};


