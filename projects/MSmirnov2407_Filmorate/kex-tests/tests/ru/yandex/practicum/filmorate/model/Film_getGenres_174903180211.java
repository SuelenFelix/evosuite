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

public class Film_getGenres_174903180211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2770;

    public Film_getGenres_174903180211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2803 = new HashMap();
        Set<Object> term2835 =  ((Map) term2803).keySet();
        HashSet term2802 = new HashSet((Collection<? extends Object>) term2835);
        HashMap term2809 = new HashMap();
        Set<Object> term2836 =  ((Map) term2809).keySet();
        HashSet term2808 = new HashSet((Collection<? extends Object>) term2836);
        term2770 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2795 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2800 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2770, term2770.getClass(), "name", "RMsXuyzKJV");
        setField(term2770, term2770.getClass(), "description", "FwPbDZcHmB");
        setIntField(term2795, term2795.getClass(), "year", 2014);
        setShortField(term2795, term2795.getClass(), "month", (short) 11);
        setShortField(term2795, term2795.getClass(), "day", (short) 8);
        setField(term2770, term2770.getClass(), "releaseDate", term2795);
        setLongField(term2770, term2770.getClass(), "duration", -8654565919063661957L);
        setField(term2800, term2800.getClass(), "name", null);
        setIntField(term2800, term2800.getClass(), "id", 0);
        setField(term2770, term2770.getClass(), "mpa", term2800);
        setField(term2770, term2770.getClass(), "genres", term2802);
        setField(term2770, term2770.getClass(), "likedUsers", term2808);
        setIntField(term2770, term2770.getClass(), "id", -1347665717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenres", argTypes, term2770, args);
    }

};


