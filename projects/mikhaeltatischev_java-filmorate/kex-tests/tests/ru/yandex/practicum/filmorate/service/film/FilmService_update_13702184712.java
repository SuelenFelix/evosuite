package ru.yandex.practicum.filmorate.service.film;

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
import static ru.yandex.practicum.filmorate.service.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FilmService_update_13702184712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;

    public FilmService_update_13702184712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16 = new Long(6375119433582206027L);
        Integer term46 = new Integer(1484323161);
        Integer term49 = new Integer(391863371);
        HashMap term64 = new HashMap();
        Set<Object> term125 =  ((Map) term64).keySet();
        HashSet term63 = new HashSet((Collection<? extends Object>) term125);
        HashMap term79 = new HashMap();
        Set<Object> term126 =  ((Map) term79).keySet();
        HashSet term78 = new HashSet((Collection<? extends Object>) term126);
        Integer term93 = new Integer(-1339778481);
        term15 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term42 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term15, term15.getClass(), "id", term16);
        setField(term15, term15.getClass(), "name", "PAEBtnZtTD");
        setField(term15, term15.getClass(), "description", "sjlJAEtRrb");
        setIntField(term42, term42.getClass(), "year", 2012);
        setShortField(term42, term42.getClass(), "month", (short) 8);
        setShortField(term42, term42.getClass(), "day", (short) 25);
        setField(term15, term15.getClass(), "releaseDate", term42);
        setField(term15, term15.getClass(), "duration", term46);
        setField(term48, term48.getClass(), "id", term49);
        setField(term48, term48.getClass(), "name", "MuLcgQHgqz");
        setField(term15, term15.getClass(), "mpa", term48);
        setField(term15, term15.getClass(), "genres", term63);
        setField(term15, term15.getClass(), "likes", term78);
        setField(term15, term15.getClass(), "rate", term93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Object[] args = new Object[1];
        args[0] = term15;
        callMethod(klass, "update", argTypes, null, args);
    }

};


