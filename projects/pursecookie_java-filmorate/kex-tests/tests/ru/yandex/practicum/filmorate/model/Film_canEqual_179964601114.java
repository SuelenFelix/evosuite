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

public class Film_canEqual_179964601114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2989;
     Object term3040;

    public Film_canEqual_179964601114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3034 = new HashMap();
        Set<Object> term3071 =  ((Map) term3034).keySet();
        HashSet term3033 = new HashSet((Collection<? extends Object>) term3071);
        term2989 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3019 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2989, term2989.getClass(), "name", "XylxrMBraH");
        setField(term2989, term2989.getClass(), "description", "pORebkoRdD");
        setIntField(term3014, term3014.getClass(), "year", 2025);
        setShortField(term3014, term3014.getClass(), "month", (short) 2);
        setShortField(term3014, term3014.getClass(), "day", (short) 13);
        setField(term2989, term2989.getClass(), "releaseDate", term3014);
        setLongField(term2989, term2989.getClass(), "duration", -7115418542247301000L);
        setField(term3019, term3019.getClass(), "name", "mXGCWJDOqA");
        setLongField(term3019, term3019.getClass(), "id", 8034714140377562739L);
        setField(term2989, term2989.getClass(), "mpa", term3019);
        setField(term2989, term2989.getClass(), "genres", term3033);
        setLongField(term2989, term2989.getClass(), "id", -2924531382671518368L);
        term3040 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3040;
        callMethod(klass, "canEqual", argTypes, term2989, args);
    }

};


