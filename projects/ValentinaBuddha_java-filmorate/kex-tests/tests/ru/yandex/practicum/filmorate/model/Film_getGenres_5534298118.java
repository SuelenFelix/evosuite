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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Film_getGenres_5534298118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3662;

    public Film_getGenres_5534298118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3663 = new Integer(458147407);
        Integer term3693 = new Integer(-184153539);
        LinkedHashMap term3710 = new LinkedHashMap();
        Set<Object> term3754 =  ((Map) term3710).keySet();
        LinkedHashSet term3709 = new LinkedHashSet((Collection<? extends Object>) term3754);
        term3662 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3695 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3662, term3662.getClass(), "id", term3663);
        setField(term3662, term3662.getClass(), "name", "DbiCVtPPCT");
        setField(term3662, term3662.getClass(), "description", "WzFopsaDuG");
        setIntField(term3689, term3689.getClass(), "year", 2014);
        setShortField(term3689, term3689.getClass(), "month", (short) 7);
        setShortField(term3689, term3689.getClass(), "day", (short) 13);
        setField(term3662, term3662.getClass(), "releaseDate", term3689);
        setField(term3662, term3662.getClass(), "duration", term3693);
        setIntField(term3695, term3695.getClass(), "id", 1328271830);
        setField(term3695, term3695.getClass(), "name", "PapWxkhEWe");
        setField(term3662, term3662.getClass(), "mpa", term3695);
        setField(term3662, term3662.getClass(), "genres", term3709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenres", argTypes, term3662, args);
    }

};


