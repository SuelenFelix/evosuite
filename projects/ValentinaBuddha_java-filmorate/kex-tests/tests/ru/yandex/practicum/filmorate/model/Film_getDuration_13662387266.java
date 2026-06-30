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

public class Film_getDuration_13662387266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3468;

    public Film_getDuration_13662387266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3469 = new Integer(-1786399638);
        Integer term3499 = new Integer(2055867847);
        LinkedHashMap term3516 = new LinkedHashMap();
        Set<Object> term3558 =  ((Map) term3516).keySet();
        LinkedHashSet term3515 = new LinkedHashSet((Collection<? extends Object>) term3558);
        term3468 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3501 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3468, term3468.getClass(), "id", term3469);
        setField(term3468, term3468.getClass(), "name", "jwsfVjMoJT");
        setField(term3468, term3468.getClass(), "description", "ZfdXfCCFDf");
        setIntField(term3495, term3495.getClass(), "year", 2020);
        setShortField(term3495, term3495.getClass(), "month", (short) 7);
        setShortField(term3495, term3495.getClass(), "day", (short) 23);
        setField(term3468, term3468.getClass(), "releaseDate", term3495);
        setField(term3468, term3468.getClass(), "duration", term3499);
        setIntField(term3501, term3501.getClass(), "id", 1632125673);
        setField(term3501, term3501.getClass(), "name", "MwwjNtdOFT");
        setField(term3468, term3468.getClass(), "mpa", term3501);
        setField(term3468, term3468.getClass(), "genres", term3515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term3468, args);
    }

};


