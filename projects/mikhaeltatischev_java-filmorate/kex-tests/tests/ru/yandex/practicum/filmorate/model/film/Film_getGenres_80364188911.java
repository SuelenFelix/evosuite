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

public class Film_getGenres_80364188911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1199;

    public Film_getGenres_80364188911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1200 = new Long(-8876856890348836498L);
        Integer term1230 = new Integer(1265463001);
        Integer term1233 = new Integer(335112684);
        HashMap term1248 = new HashMap();
        Set<Object> term1299 =  ((Map) term1248).keySet();
        HashSet term1247 = new HashSet((Collection<? extends Object>) term1299);
        HashMap term1259 = new HashMap();
        Set<Object> term1300 =  ((Map) term1259).keySet();
        HashSet term1258 = new HashSet((Collection<? extends Object>) term1300);
        Integer term1267 = new Integer(1063420942);
        term1199 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term1226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1232 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term1199, term1199.getClass(), "id", term1200);
        setField(term1199, term1199.getClass(), "name", "HqBOwkVqjD");
        setField(term1199, term1199.getClass(), "description", "MAcUBcBckh");
        setIntField(term1226, term1226.getClass(), "year", 2020);
        setShortField(term1226, term1226.getClass(), "month", (short) 5);
        setShortField(term1226, term1226.getClass(), "day", (short) 14);
        setField(term1199, term1199.getClass(), "releaseDate", term1226);
        setField(term1199, term1199.getClass(), "duration", term1230);
        setField(term1232, term1232.getClass(), "id", term1233);
        setField(term1232, term1232.getClass(), "name", "oVgzLbrsFr");
        setField(term1199, term1199.getClass(), "mpa", term1232);
        setField(term1199, term1199.getClass(), "genres", term1247);
        setField(term1199, term1199.getClass(), "likes", term1258);
        setField(term1199, term1199.getClass(), "rate", term1267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenres", argTypes, term1199, args);
    }

};


