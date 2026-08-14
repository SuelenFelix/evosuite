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

public class Film_getDuration_4208488139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term980;

    public Film_getDuration_4208488139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term981 = new Long(-5248475803419977214L);
        Integer term1011 = new Integer(1328271830);
        Integer term1014 = new Integer(1596070772);
        HashMap term1029 = new HashMap();
        Set<Object> term1075 =  ((Map) term1029).keySet();
        HashSet term1028 = new HashSet((Collection<? extends Object>) term1075);
        HashMap term1035 = new HashMap();
        Set<Object> term1076 =  ((Map) term1035).keySet();
        HashSet term1034 = new HashSet((Collection<? extends Object>) term1076);
        Integer term1043 = new Integer(97029295);
        term980 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term1007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1013 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term980, term980.getClass(), "id", term981);
        setField(term980, term980.getClass(), "name", "ieCtQFdkii");
        setField(term980, term980.getClass(), "description", "dEnhdmILtU");
        setIntField(term1007, term1007.getClass(), "year", 2017);
        setShortField(term1007, term1007.getClass(), "month", (short) 7);
        setShortField(term1007, term1007.getClass(), "day", (short) 22);
        setField(term980, term980.getClass(), "releaseDate", term1007);
        setField(term980, term980.getClass(), "duration", term1011);
        setField(term1013, term1013.getClass(), "id", term1014);
        setField(term1013, term1013.getClass(), "name", "hoicvmsovO");
        setField(term980, term980.getClass(), "mpa", term1013);
        setField(term980, term980.getClass(), "genres", term1028);
        setField(term980, term980.getClass(), "likes", term1034);
        setField(term980, term980.getClass(), "rate", term1043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term980, args);
    }

};


