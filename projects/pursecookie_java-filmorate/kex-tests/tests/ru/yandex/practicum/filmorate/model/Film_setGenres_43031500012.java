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

public class Film_setGenres_43031500012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2811;
     Object term2862;

    public Film_setGenres_43031500012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2856 = new HashMap();
        Set<Object> term2904 =  ((Map) term2856).keySet();
        HashSet term2855 = new HashSet((Collection<? extends Object>) term2904);
        term2811 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2841 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2811, term2811.getClass(), "name", "eVpkWxjuki");
        setField(term2811, term2811.getClass(), "description", "SJiQaLvSKv");
        setIntField(term2836, term2836.getClass(), "year", 2017);
        setShortField(term2836, term2836.getClass(), "month", (short) 8);
        setShortField(term2836, term2836.getClass(), "day", (short) 7);
        setField(term2811, term2811.getClass(), "releaseDate", term2836);
        setLongField(term2811, term2811.getClass(), "duration", 6843866297465638866L);
        setField(term2841, term2841.getClass(), "name", "OEXDRUKcFl");
        setLongField(term2841, term2841.getClass(), "id", -4023935540989049732L);
        setField(term2811, term2811.getClass(), "mpa", term2841);
        setField(term2811, term2811.getClass(), "genres", term2855);
        setLongField(term2811, term2811.getClass(), "id", 855932984568615096L);
        HashMap term2863 = new HashMap();
        Set<Object> term2905 =  ((Map) term2863).keySet();
        term2862 = new HashSet((Collection<? extends Object>) term2905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2862;
        callMethod(klass, "setGenres", argTypes, term2811, args);
    }

};


