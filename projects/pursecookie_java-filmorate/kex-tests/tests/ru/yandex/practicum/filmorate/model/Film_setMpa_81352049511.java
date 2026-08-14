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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Film_setMpa_81352049511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2705;
     Object term2756;

    public Film_setMpa_81352049511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2750 = new HashMap();
        Set<Object> term2800 =  ((Map) term2750).keySet();
        HashSet term2749 = new HashSet((Collection<? extends Object>) term2800);
        term2705 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2735 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2705, term2705.getClass(), "name", "xBsXSDjXYK");
        setField(term2705, term2705.getClass(), "description", "sEnIVFtZuQ");
        setIntField(term2730, term2730.getClass(), "year", 2012);
        setShortField(term2730, term2730.getClass(), "month", (short) 9);
        setShortField(term2730, term2730.getClass(), "day", (short) 11);
        setField(term2705, term2705.getClass(), "releaseDate", term2730);
        setLongField(term2705, term2705.getClass(), "duration", -6432617521836576658L);
        setField(term2735, term2735.getClass(), "name", "ZVecLZMLHF");
        setLongField(term2735, term2735.getClass(), "id", -2255965562447970862L);
        setField(term2705, term2705.getClass(), "mpa", term2735);
        setField(term2705, term2705.getClass(), "genres", term2749);
        setLongField(term2705, term2705.getClass(), "id", 148047808219672941L);
        term2756 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2756, term2756.getClass(), "name", "fztQhjqwdP");
        setLongField(term2756, term2756.getClass(), "id", 7489064039921396098L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term2756;
        callMethod(klass, "setMpa", argTypes, term2705, args);
    }

};


