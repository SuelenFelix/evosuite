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

public class Film_setName_131983112013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2904;

    public Film_setName_131983112013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2937 = new HashMap();
        Set<Object> term2981 =  ((Map) term2937).keySet();
        HashSet term2936 = new HashSet((Collection<? extends Object>) term2981);
        HashMap term2943 = new HashMap();
        Set<Object> term2982 =  ((Map) term2943).keySet();
        HashSet term2942 = new HashSet((Collection<? extends Object>) term2982);
        term2904 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2934 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2904, term2904.getClass(), "name", "izPpKDErnQ");
        setField(term2904, term2904.getClass(), "description", "NnpwZBUTvx");
        setIntField(term2929, term2929.getClass(), "year", 2020);
        setShortField(term2929, term2929.getClass(), "month", (short) 5);
        setShortField(term2929, term2929.getClass(), "day", (short) 17);
        setField(term2904, term2904.getClass(), "releaseDate", term2929);
        setLongField(term2904, term2904.getClass(), "duration", -6723783499250797216L);
        setField(term2934, term2934.getClass(), "name", null);
        setIntField(term2934, term2934.getClass(), "id", 0);
        setField(term2904, term2904.getClass(), "mpa", term2934);
        setField(term2904, term2904.getClass(), "genres", term2936);
        setField(term2904, term2904.getClass(), "likedUsers", term2942);
        setIntField(term2904, term2904.getClass(), "id", 683666002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tlQSNgTkQX";
        callMethod(klass, "setName", argTypes, term2904, args);
    }

};


