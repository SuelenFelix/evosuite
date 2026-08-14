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

public class Film_getName_13454353616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658;

    public Film_getName_13454353616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term659 = new Long(2936323121573284007L);
        Integer term689 = new Integer(-1530420153);
        Integer term692 = new Integer(-469968304);
        HashMap term707 = new HashMap();
        Set<Object> term768 =  ((Map) term707).keySet();
        HashSet term706 = new HashSet((Collection<? extends Object>) term768);
        HashMap term722 = new HashMap();
        Set<Object> term769 =  ((Map) term722).keySet();
        HashSet term721 = new HashSet((Collection<? extends Object>) term769);
        Integer term736 = new Integer(1876565163);
        term658 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term691 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term658, term658.getClass(), "id", term659);
        setField(term658, term658.getClass(), "name", "IDCWpPLRkE");
        setField(term658, term658.getClass(), "description", "nyiiPDVjAc");
        setIntField(term685, term685.getClass(), "year", 2015);
        setShortField(term685, term685.getClass(), "month", (short) 4);
        setShortField(term685, term685.getClass(), "day", (short) 14);
        setField(term658, term658.getClass(), "releaseDate", term685);
        setField(term658, term658.getClass(), "duration", term689);
        setField(term691, term691.getClass(), "id", term692);
        setField(term691, term691.getClass(), "name", "aKnKipADSo");
        setField(term658, term658.getClass(), "mpa", term691);
        setField(term658, term658.getClass(), "genres", term706);
        setField(term658, term658.getClass(), "likes", term721);
        setField(term658, term658.getClass(), "rate", term736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term658, args);
    }

};


