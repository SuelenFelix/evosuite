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

public class Film_getId_9644379559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5691;

    public Film_getId_9644379559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5749 = new HashMap();
        Set<Object> term5818 =  ((Map) term5749).keySet();
        HashSet term5748 = new HashSet((Collection<? extends Object>) term5818);
        HashMap term5768 = new HashMap();
        Set<Object> term5819 =  ((Map) term5768).keySet();
        HashSet term5767 = new HashSet((Collection<? extends Object>) term5819);
        term5691 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5722 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term5691, term5691.getClass(), "id", 6005241913654469005L);
        setField(term5691, term5691.getClass(), "name", "GZdcJyZntS");
        setField(term5691, term5691.getClass(), "description", "OIHoJeysUi");
        setIntField(term5717, term5717.getClass(), "year", 2015);
        setShortField(term5717, term5717.getClass(), "month", (short) 3);
        setShortField(term5717, term5717.getClass(), "day", (short) 10);
        setField(term5691, term5691.getClass(), "releaseDate", term5717);
        setIntField(term5691, term5691.getClass(), "duration", 1442160736);
        setIntField(term5722, term5722.getClass(), "id", 1114000454);
        setField(term5722, term5722.getClass(), "name", "WXMWFDGcLB");
        setField(term5722, term5722.getClass(), "description", "wKWbJssZuG");
        setField(term5691, term5691.getClass(), "mpa", term5722);
        setField(term5691, term5691.getClass(), "genres", term5748);
        setField(term5691, term5691.getClass(), "likes", term5767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5691, args);
    }

};


