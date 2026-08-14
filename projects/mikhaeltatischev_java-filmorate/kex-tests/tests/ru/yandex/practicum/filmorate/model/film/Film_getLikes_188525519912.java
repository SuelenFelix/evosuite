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

public class Film_getLikes_188525519912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1301;

    public Film_getLikes_188525519912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1302 = new Long(5836128569274066678L);
        Integer term1332 = new Integer(1375330971);
        Integer term1335 = new Integer(-478195677);
        HashMap term1350 = new HashMap();
        Set<Object> term1415 =  ((Map) term1350).keySet();
        HashSet term1349 = new HashSet((Collection<? extends Object>) term1415);
        HashMap term1371 = new HashMap();
        Set<Object> term1416 =  ((Map) term1371).keySet();
        HashSet term1370 = new HashSet((Collection<? extends Object>) term1416);
        Integer term1383 = new Integer(-556405712);
        term1301 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term1328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1334 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term1301, term1301.getClass(), "id", term1302);
        setField(term1301, term1301.getClass(), "name", "wGmYcqUkgE");
        setField(term1301, term1301.getClass(), "description", "idgaQsnJpQ");
        setIntField(term1328, term1328.getClass(), "year", 2025);
        setShortField(term1328, term1328.getClass(), "month", (short) 4);
        setShortField(term1328, term1328.getClass(), "day", (short) 23);
        setField(term1301, term1301.getClass(), "releaseDate", term1328);
        setField(term1301, term1301.getClass(), "duration", term1332);
        setField(term1334, term1334.getClass(), "id", term1335);
        setField(term1334, term1334.getClass(), "name", "VgZnGoIFwQ");
        setField(term1301, term1301.getClass(), "mpa", term1334);
        setField(term1301, term1301.getClass(), "genres", term1349);
        setField(term1301, term1301.getClass(), "likes", term1370);
        setField(term1301, term1301.getClass(), "rate", term1383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikes", argTypes, term1301, args);
    }

};


