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

public class Film_getGenres_5150639264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5146;

    public Film_getGenres_5150639264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5204 = new HashMap();
        Set<Object> term5279 =  ((Map) term5204).keySet();
        HashSet term5203 = new HashSet((Collection<? extends Object>) term5279);
        HashMap term5217 = new HashMap();
        Set<Object> term5280 =  ((Map) term5217).keySet();
        HashSet term5216 = new HashSet((Collection<? extends Object>) term5280);
        term5146 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5177 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term5146, term5146.getClass(), "id", 9013624480170062917L);
        setField(term5146, term5146.getClass(), "name", "OqbwYQfvAe");
        setField(term5146, term5146.getClass(), "description", "tRxZafjqIx");
        setIntField(term5172, term5172.getClass(), "year", 2014);
        setShortField(term5172, term5172.getClass(), "month", (short) 7);
        setShortField(term5172, term5172.getClass(), "day", (short) 13);
        setField(term5146, term5146.getClass(), "releaseDate", term5172);
        setIntField(term5146, term5146.getClass(), "duration", -93135961);
        setIntField(term5177, term5177.getClass(), "id", -112921587);
        setField(term5177, term5177.getClass(), "name", "DhjNLmRMCu");
        setField(term5177, term5177.getClass(), "description", "PgPzMSEjjX");
        setField(term5146, term5146.getClass(), "mpa", term5177);
        setField(term5146, term5146.getClass(), "genres", term5203);
        setField(term5146, term5146.getClass(), "likes", term5216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenres", argTypes, term5146, args);
    }

};


