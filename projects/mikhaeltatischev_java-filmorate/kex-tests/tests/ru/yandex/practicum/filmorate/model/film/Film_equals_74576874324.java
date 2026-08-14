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

public class Film_equals_74576874324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2770;
     Object term2858;

    public Film_equals_74576874324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2771 = new Long(-8019730974733786399L);
        Integer term2801 = new Integer(-461771056);
        Integer term2804 = new Integer(-243422082);
        HashMap term2819 = new HashMap();
        Set<Object> term2889 =  ((Map) term2819).keySet();
        HashSet term2818 = new HashSet((Collection<? extends Object>) term2889);
        HashMap term2836 = new HashMap();
        Set<Object> term2890 =  ((Map) term2836).keySet();
        HashSet term2835 = new HashSet((Collection<? extends Object>) term2890);
        Integer term2856 = new Integer(663292551);
        term2770 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term2797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2803 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term2770, term2770.getClass(), "id", term2771);
        setField(term2770, term2770.getClass(), "name", "PapWxkhEWe");
        setField(term2770, term2770.getClass(), "description", "smnHEqRFRx");
        setIntField(term2797, term2797.getClass(), "year", 2017);
        setShortField(term2797, term2797.getClass(), "month", (short) 8);
        setShortField(term2797, term2797.getClass(), "day", (short) 7);
        setField(term2770, term2770.getClass(), "releaseDate", term2797);
        setField(term2770, term2770.getClass(), "duration", term2801);
        setField(term2803, term2803.getClass(), "id", term2804);
        setField(term2803, term2803.getClass(), "name", "XYtryyobou");
        setField(term2770, term2770.getClass(), "mpa", term2803);
        setField(term2770, term2770.getClass(), "genres", term2818);
        setField(term2770, term2770.getClass(), "likes", term2835);
        setField(term2770, term2770.getClass(), "rate", term2856);
        term2858 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2858;
        callMethod(klass, "equals", argTypes, term2770, args);
    }

};


