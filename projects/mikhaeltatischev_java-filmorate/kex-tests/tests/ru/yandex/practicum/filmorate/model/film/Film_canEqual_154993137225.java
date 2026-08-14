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

public class Film_canEqual_154993137225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2891;
     Object term2973;

    public Film_canEqual_154993137225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2892 = new Long(1860789353508856614L);
        Integer term2922 = new Integer(-1885090354);
        Integer term2925 = new Integer(-2066804303);
        HashMap term2940 = new HashMap();
        Set<Object> term3004 =  ((Map) term2940).keySet();
        HashSet term2939 = new HashSet((Collection<? extends Object>) term3004);
        HashMap term2959 = new HashMap();
        Set<Object> term3005 =  ((Map) term2959).keySet();
        HashSet term2958 = new HashSet((Collection<? extends Object>) term3005);
        Integer term2971 = new Integer(-506958186);
        term2891 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term2918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2924 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term2891, term2891.getClass(), "id", term2892);
        setField(term2891, term2891.getClass(), "name", "lihXWlGDxk");
        setField(term2891, term2891.getClass(), "description", "JmcmxoGhIK");
        setIntField(term2918, term2918.getClass(), "year", 2021);
        setShortField(term2918, term2918.getClass(), "month", (short) 9);
        setShortField(term2918, term2918.getClass(), "day", (short) 6);
        setField(term2891, term2891.getClass(), "releaseDate", term2918);
        setField(term2891, term2891.getClass(), "duration", term2922);
        setField(term2924, term2924.getClass(), "id", term2925);
        setField(term2924, term2924.getClass(), "name", "jXzmYyrnnT");
        setField(term2891, term2891.getClass(), "mpa", term2924);
        setField(term2891, term2891.getClass(), "genres", term2939);
        setField(term2891, term2891.getClass(), "likes", term2958);
        setField(term2891, term2891.getClass(), "rate", term2971);
        term2973 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2973;
        callMethod(klass, "canEqual", argTypes, term2891, args);
    }

};


