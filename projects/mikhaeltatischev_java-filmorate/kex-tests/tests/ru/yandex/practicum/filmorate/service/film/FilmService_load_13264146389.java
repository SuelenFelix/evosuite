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

public class FilmService_load_13264146389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470;

    public FilmService_load_13264146389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term471 = new Long(-3842548265506930260L);
        Integer term501 = new Integer(1135664017);
        Integer term504 = new Integer(590364439);
        HashMap term519 = new HashMap();
        Set<Object> term584 =  ((Map) term519).keySet();
        HashSet term518 = new HashSet((Collection<? extends Object>) term584);
        HashMap term540 = new HashMap();
        Set<Object> term585 =  ((Map) term540).keySet();
        HashSet term539 = new HashSet((Collection<? extends Object>) term585);
        Integer term552 = new Integer(-1530420153);
        term470 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term503 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term470, term470.getClass(), "id", term471);
        setField(term470, term470.getClass(), "name", "eZFUvlxvGV");
        setField(term470, term470.getClass(), "description", "BYqFIqCKAV");
        setIntField(term497, term497.getClass(), "year", 2015);
        setShortField(term497, term497.getClass(), "month", (short) 9);
        setShortField(term497, term497.getClass(), "day", (short) 19);
        setField(term470, term470.getClass(), "releaseDate", term497);
        setField(term470, term470.getClass(), "duration", term501);
        setField(term503, term503.getClass(), "id", term504);
        setField(term503, term503.getClass(), "name", "vrQLuWIDJX");
        setField(term470, term470.getClass(), "mpa", term503);
        setField(term470, term470.getClass(), "genres", term518);
        setField(term470, term470.getClass(), "likes", term539);
        setField(term470, term470.getClass(), "rate", term552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Object[] args = new Object[1];
        args[0] = term470;
        callMethod(klass, "load", argTypes, null, args);
    }

};


