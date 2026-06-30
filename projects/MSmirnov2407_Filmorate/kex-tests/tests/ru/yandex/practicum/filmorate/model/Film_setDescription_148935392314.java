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

public class Film_setDescription_148935392314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2993;

    public Film_setDescription_148935392314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3026 = new HashMap();
        Set<Object> term3070 =  ((Map) term3026).keySet();
        HashSet term3025 = new HashSet((Collection<? extends Object>) term3070);
        HashMap term3032 = new HashMap();
        Set<Object> term3071 =  ((Map) term3032).keySet();
        HashSet term3031 = new HashSet((Collection<? extends Object>) term3071);
        term2993 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3023 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2993, term2993.getClass(), "name", "PCipZnmBOF");
        setField(term2993, term2993.getClass(), "description", "zcorEihhLK");
        setIntField(term3018, term3018.getClass(), "year", 2010);
        setShortField(term3018, term3018.getClass(), "month", (short) 12);
        setShortField(term3018, term3018.getClass(), "day", (short) 2);
        setField(term2993, term2993.getClass(), "releaseDate", term3018);
        setLongField(term2993, term2993.getClass(), "duration", 41775768178052008L);
        setField(term3023, term3023.getClass(), "name", null);
        setIntField(term3023, term3023.getClass(), "id", 0);
        setField(term2993, term2993.getClass(), "mpa", term3023);
        setField(term2993, term2993.getClass(), "genres", term3025);
        setField(term2993, term2993.getClass(), "likedUsers", term3031);
        setIntField(term2993, term2993.getClass(), "id", 1596213415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GrqozDKFOk";
        callMethod(klass, "setDescription", argTypes, term2993, args);
    }

};


