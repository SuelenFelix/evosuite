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

public class FilmService_compare_12844698257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;
     Object term325;

    public FilmService_compare_12844698257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term248 = new Long(-4365849114644724155L);
        Integer term278 = new Integer(-1685132342);
        Integer term281 = new Integer(-1456670397);
        HashMap term296 = new HashMap();
        Set<Object> term433 =  ((Map) term296).keySet();
        HashSet term295 = new HashSet((Collection<? extends Object>) term433);
        HashMap term305 = new HashMap();
        Set<Object> term434 =  ((Map) term305).keySet();
        HashSet term304 = new HashSet((Collection<? extends Object>) term434);
        Integer term323 = new Integer(1048535127);
        term247 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term247, term247.getClass(), "id", term248);
        setField(term247, term247.getClass(), "name", "oVcInYnLWB");
        setField(term247, term247.getClass(), "description", "aJlieCFVtF");
        setIntField(term274, term274.getClass(), "year", 2021);
        setShortField(term274, term274.getClass(), "month", (short) 1);
        setShortField(term274, term274.getClass(), "day", (short) 18);
        setField(term247, term247.getClass(), "releaseDate", term274);
        setField(term247, term247.getClass(), "duration", term278);
        setField(term280, term280.getClass(), "id", term281);
        setField(term280, term280.getClass(), "name", "ZiaGIbnzTs");
        setField(term247, term247.getClass(), "mpa", term280);
        setField(term247, term247.getClass(), "genres", term295);
        setField(term247, term247.getClass(), "likes", term304);
        setField(term247, term247.getClass(), "rate", term323);
        Long term326 = new Long(6617340557564669657L);
        Integer term356 = new Integer(-655067527);
        Integer term359 = new Integer(-6029667);
        HashMap term374 = new HashMap();
        Set<Object> term465 =  ((Map) term374).keySet();
        HashSet term373 = new HashSet((Collection<? extends Object>) term465);
        HashMap term385 = new HashMap();
        Set<Object> term466 =  ((Map) term385).keySet();
        HashSet term384 = new HashSet((Collection<? extends Object>) term466);
        Integer term401 = new Integer(-1007160944);
        term325 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term358 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term325, term325.getClass(), "id", term326);
        setField(term325, term325.getClass(), "name", "HyxfbSQYBe");
        setField(term325, term325.getClass(), "description", "pCTimMblYc");
        setIntField(term352, term352.getClass(), "year", 2020);
        setShortField(term352, term352.getClass(), "month", (short) 11);
        setShortField(term352, term352.getClass(), "day", (short) 22);
        setField(term325, term325.getClass(), "releaseDate", term352);
        setField(term325, term325.getClass(), "duration", term356);
        setField(term358, term358.getClass(), "id", term359);
        setField(term358, term358.getClass(), "name", "hNxWaHcfhY");
        setField(term325, term325.getClass(), "mpa", term358);
        setField(term325, term325.getClass(), "genres", term373);
        setField(term325, term325.getClass(), "likes", term384);
        setField(term325, term325.getClass(), "rate", term401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        argTypes[1] = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Object[] args = new Object[2];
        args[0] = term247;
        args[1] = term325;
        callMethod(klass, "compare", argTypes, null, args);
    }

};


