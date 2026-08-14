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

public class Film_hashCode_29708206826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3006;

    public Film_hashCode_29708206826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3007 = new Long(6906379511067694917L);
        Integer term3037 = new Integer(-507387516);
        Integer term3040 = new Integer(-1970452551);
        HashMap term3055 = new HashMap();
        Set<Object> term3112 =  ((Map) term3055).keySet();
        HashSet term3054 = new HashSet((Collection<? extends Object>) term3112);
        HashMap term3070 = new HashMap();
        Set<Object> term3113 =  ((Map) term3070).keySet();
        HashSet term3069 = new HashSet((Collection<? extends Object>) term3113);
        Integer term3080 = new Integer(584893196);
        term3006 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term3033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3039 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term3006, term3006.getClass(), "id", term3007);
        setField(term3006, term3006.getClass(), "name", "JppkknKVOw");
        setField(term3006, term3006.getClass(), "description", "iljANwuEjk");
        setIntField(term3033, term3033.getClass(), "year", 2025);
        setShortField(term3033, term3033.getClass(), "month", (short) 2);
        setShortField(term3033, term3033.getClass(), "day", (short) 13);
        setField(term3006, term3006.getClass(), "releaseDate", term3033);
        setField(term3006, term3006.getClass(), "duration", term3037);
        setField(term3039, term3039.getClass(), "id", term3040);
        setField(term3039, term3039.getClass(), "name", "kNqaJKIATy");
        setField(term3006, term3006.getClass(), "mpa", term3039);
        setField(term3006, term3006.getClass(), "genres", term3054);
        setField(term3006, term3006.getClass(), "likes", term3069);
        setField(term3006, term3006.getClass(), "rate", term3080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3006, args);
    }

};


