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

public class Film_getId_2222532105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550;

    public Film_getId_2222532105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term551 = new Long(-4443169559037975007L);
        Integer term581 = new Integer(590364439);
        Integer term584 = new Integer(865208305);
        HashMap term599 = new HashMap();
        Set<Object> term656 =  ((Map) term599).keySet();
        HashSet term598 = new HashSet((Collection<? extends Object>) term656);
        HashMap term616 = new HashMap();
        Set<Object> term657 =  ((Map) term616).keySet();
        HashSet term615 = new HashSet((Collection<? extends Object>) term657);
        Integer term624 = new Integer(-1087774327);
        term550 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term583 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term550, term550.getClass(), "id", term551);
        setField(term550, term550.getClass(), "name", "OclPbYPkcH");
        setField(term550, term550.getClass(), "description", "IoAlmYsBwc");
        setIntField(term577, term577.getClass(), "year", 2018);
        setShortField(term577, term577.getClass(), "month", (short) 1);
        setShortField(term577, term577.getClass(), "day", (short) 13);
        setField(term550, term550.getClass(), "releaseDate", term577);
        setField(term550, term550.getClass(), "duration", term581);
        setField(term583, term583.getClass(), "id", term584);
        setField(term583, term583.getClass(), "name", "TEParAifyi");
        setField(term550, term550.getClass(), "mpa", term583);
        setField(term550, term550.getClass(), "genres", term598);
        setField(term550, term550.getClass(), "likes", term615);
        setField(term550, term550.getClass(), "rate", term624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term550, args);
    }

};


