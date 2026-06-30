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

public class Film_toString_73171229120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3493;

    public Film_toString_73171229120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3526 = new HashMap();
        Set<Object> term3558 =  ((Map) term3526).keySet();
        HashSet term3525 = new HashSet((Collection<? extends Object>) term3558);
        HashMap term3532 = new HashMap();
        Set<Object> term3559 =  ((Map) term3532).keySet();
        HashSet term3531 = new HashSet((Collection<? extends Object>) term3559);
        term3493 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3523 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term3493, term3493.getClass(), "name", "IpQuOGMgmj");
        setField(term3493, term3493.getClass(), "description", "pJbnHTYrxn");
        setIntField(term3518, term3518.getClass(), "year", 2012);
        setShortField(term3518, term3518.getClass(), "month", (short) 4);
        setShortField(term3518, term3518.getClass(), "day", (short) 25);
        setField(term3493, term3493.getClass(), "releaseDate", term3518);
        setLongField(term3493, term3493.getClass(), "duration", 50358265865610362L);
        setField(term3523, term3523.getClass(), "name", null);
        setIntField(term3523, term3523.getClass(), "id", 0);
        setField(term3493, term3493.getClass(), "mpa", term3523);
        setField(term3493, term3493.getClass(), "genres", term3525);
        setField(term3493, term3493.getClass(), "likedUsers", term3531);
        setIntField(term3493, term3493.getClass(), "id", 1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3493, args);
    }

};


