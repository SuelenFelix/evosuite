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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FilmServiceImpl_update_3961026634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;
     Object term89;

    public FilmServiceImpl_update_3961026634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.film.FilmServiceImpl"));
        setField(term88, term88.getClass(), "filmStorageDao", null);
        setField(term88, term88.getClass(), "dataStorageDao", null);
        HashMap term134 = new HashMap();
        Set<Object> term170 =  ((Map) term134).keySet();
        HashSet term133 = new HashSet((Collection<? extends Object>) term170);
        term89 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term89, term89.getClass(), "name", "xxtlPwDYFs");
        setField(term89, term89.getClass(), "description", "jJCZpVmanW");
        setIntField(term114, term114.getClass(), "year", 2016);
        setShortField(term114, term114.getClass(), "month", (short) 11);
        setShortField(term114, term114.getClass(), "day", (short) 29);
        setField(term89, term89.getClass(), "releaseDate", term114);
        setLongField(term89, term89.getClass(), "duration", 5270370404989704783L);
        setField(term119, term119.getClass(), "name", "EGtDIRbSSb");
        setLongField(term119, term119.getClass(), "id", 7411271909051562686L);
        setField(term89, term89.getClass(), "mpa", term119);
        setField(term89, term89.getClass(), "genres", term133);
        setLongField(term89, term89.getClass(), "id", 4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.film.FilmServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term89;
        callMethod(klass, "update", argTypes, term88, args);
    }

};


