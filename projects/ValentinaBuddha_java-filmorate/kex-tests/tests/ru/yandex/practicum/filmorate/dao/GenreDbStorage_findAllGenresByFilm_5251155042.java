package ru.yandex.practicum.filmorate.dao;

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
import static ru.yandex.practicum.filmorate.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class GenreDbStorage_findAllGenresByFilm_5251155042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public GenreDbStorage_findAllGenresByFilm_5251155042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7 = new Integer(568599855);
        Integer term37 = new Integer(1162663216);
        LinkedHashMap term43 = new LinkedHashMap();
        Set<Object> term136 =  ((Map) term43).keySet();
        LinkedHashSet term42 = new LinkedHashSet((Collection<? extends Object>) term136);
        Object term6 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term33 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term6, term6.getClass(), "id", term7);
        setField(term6, term6.getClass(), "name", "PAEBtnZtTD");
        setField(term6, term6.getClass(), "description", "sjlJAEtRrb");
        setIntField(term33, term33.getClass(), "year", 2012);
        setShortField(term33, term33.getClass(), "month", (short) 8);
        setShortField(term33, term33.getClass(), "day", (short) 25);
        setField(term6, term6.getClass(), "releaseDate", term33);
        setField(term6, term6.getClass(), "duration", term37);
        setIntField(term39, term39.getClass(), "id", 1162663216);
        setField(term39, term39.getClass(), "name", "");
        setField(term6, term6.getClass(), "mpa", term39);
        setField(term6, term6.getClass(), "genres", term42);
        Integer term51 = new Integer(1484323161);
        Integer term59 = new Integer(391863371);
        LinkedHashSet term63 = new LinkedHashSet();
        Object term50 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term55 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term50, term50.getClass(), "id", term51);
        setField(term50, term50.getClass(), "name", "");
        setField(term50, term50.getClass(), "description", "");
        setIntField(term55, term55.getClass(), "year", 2016);
        setShortField(term55, term55.getClass(), "month", (short) 11);
        setShortField(term55, term55.getClass(), "day", (short) 29);
        setField(term50, term50.getClass(), "releaseDate", term55);
        setField(term50, term50.getClass(), "duration", term59);
        setIntField(term61, term61.getClass(), "id", -522618178);
        setField(term61, term61.getClass(), "name", null);
        setField(term50, term50.getClass(), "mpa", term61);
        setField(term50, term50.getClass(), "genres", term63);
        Integer term66 = new Integer(-1922583790);
        Integer term68 = new Integer(-616727354);
        Object term65 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term65, term65.getClass(), "id", term66);
        setField(term65, term65.getClass(), "name", null);
        setField(term65, term65.getClass(), "description", null);
        setField(term65, term65.getClass(), "releaseDate", null);
        setField(term65, term65.getClass(), "duration", term68);
        setField(term65, term65.getClass(), "mpa", null);
        setField(term65, term65.getClass(), "genres", null);
        term3 = new LinkedList();
        ((LinkedList) term3).add(term6);
        ((LinkedList) term3).add(term50);
        ((LinkedList) term3).add(term65);
        ((LinkedList) term3).add((Object)null);
        ((LinkedList) term3).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.dao.GenreDbStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "findAllGenresByFilm", argTypes, null, args);
    }

};


