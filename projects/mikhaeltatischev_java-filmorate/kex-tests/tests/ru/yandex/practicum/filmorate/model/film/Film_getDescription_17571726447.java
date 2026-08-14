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

public class Film_getDescription_17571726447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770;

    public Film_getDescription_17571726447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term771 = new Long(2443640364875054177L);
        Integer term801 = new Integer(-817164822);
        Integer term804 = new Integer(-1016503459);
        HashMap term819 = new HashMap();
        Set<Object> term874 =  ((Map) term819).keySet();
        HashSet term818 = new HashSet((Collection<? extends Object>) term874);
        HashMap term832 = new HashMap();
        Set<Object> term875 =  ((Map) term832).keySet();
        HashSet term831 = new HashSet((Collection<? extends Object>) term875);
        Integer term842 = new Integer(-1786399638);
        term770 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term803 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term770, term770.getClass(), "id", term771);
        setField(term770, term770.getClass(), "name", "tShwQLRGNe");
        setField(term770, term770.getClass(), "description", "LvtrsXUliU");
        setIntField(term797, term797.getClass(), "year", 2017);
        setShortField(term797, term797.getClass(), "month", (short) 5);
        setShortField(term797, term797.getClass(), "day", (short) 21);
        setField(term770, term770.getClass(), "releaseDate", term797);
        setField(term770, term770.getClass(), "duration", term801);
        setField(term803, term803.getClass(), "id", term804);
        setField(term803, term803.getClass(), "name", "xLbjWUgOIL");
        setField(term770, term770.getClass(), "mpa", term803);
        setField(term770, term770.getClass(), "genres", term818);
        setField(term770, term770.getClass(), "likes", term831);
        setField(term770, term770.getClass(), "rate", term842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term770, args);
    }

};


