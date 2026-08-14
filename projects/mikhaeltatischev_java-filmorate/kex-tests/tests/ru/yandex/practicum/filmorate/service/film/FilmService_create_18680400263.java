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

public class FilmService_create_18680400263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127;

    public FilmService_create_18680400263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term128 = new Long(-2813493605142626659L);
        Integer term158 = new Integer(1725571209);
        Integer term161 = new Integer(-522618178);
        HashMap term176 = new HashMap();
        Set<Object> term235 =  ((Map) term176).keySet();
        HashSet term175 = new HashSet((Collection<? extends Object>) term235);
        HashMap term189 = new HashMap();
        Set<Object> term236 =  ((Map) term189).keySet();
        HashSet term188 = new HashSet((Collection<? extends Object>) term236);
        Integer term203 = new Integer(597278769);
        term127 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term127, term127.getClass(), "id", term128);
        setField(term127, term127.getClass(), "name", "hRNSzYYIrc");
        setField(term127, term127.getClass(), "description", "RMFIsYGgne");
        setIntField(term154, term154.getClass(), "year", 2016);
        setShortField(term154, term154.getClass(), "month", (short) 11);
        setShortField(term154, term154.getClass(), "day", (short) 29);
        setField(term127, term127.getClass(), "releaseDate", term154);
        setField(term127, term127.getClass(), "duration", term158);
        setField(term160, term160.getClass(), "id", term161);
        setField(term160, term160.getClass(), "name", "NRdvgJlhkX");
        setField(term127, term127.getClass(), "mpa", term160);
        setField(term127, term127.getClass(), "genres", term175);
        setField(term127, term127.getClass(), "likes", term188);
        setField(term127, term127.getClass(), "rate", term203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Object[] args = new Object[1];
        args[0] = term127;
        callMethod(klass, "create", argTypes, null, args);
    }

};


