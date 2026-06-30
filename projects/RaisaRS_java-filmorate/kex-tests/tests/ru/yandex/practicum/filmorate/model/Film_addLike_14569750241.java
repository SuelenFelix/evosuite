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
import java.lang.Long;

public class Film_addLike_14569750241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4699;
     Object term4790;

    public Film_addLike_14569750241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4757 = new HashMap();
        Set<Object> term4832 =  ((Map) term4757).keySet();
        HashSet term4756 = new HashSet((Collection<? extends Object>) term4832);
        HashMap term4776 = new HashMap();
        Set<Object> term4833 =  ((Map) term4776).keySet();
        HashSet term4775 = new HashSet((Collection<? extends Object>) term4833);
        term4699 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4730 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term4699, term4699.getClass(), "id", 6682528376118987775L);
        setField(term4699, term4699.getClass(), "name", "DSNsTGYXDF");
        setField(term4699, term4699.getClass(), "description", "sQvGcVjdEx");
        setIntField(term4725, term4725.getClass(), "year", 2011);
        setShortField(term4725, term4725.getClass(), "month", (short) 7);
        setShortField(term4725, term4725.getClass(), "day", (short) 24);
        setField(term4699, term4699.getClass(), "releaseDate", term4725);
        setIntField(term4699, term4699.getClass(), "duration", 1632125673);
        setIntField(term4730, term4730.getClass(), "id", 454281060);
        setField(term4730, term4730.getClass(), "name", "rLHAoqXgPh");
        setField(term4730, term4730.getClass(), "description", "zUlRdimJtU");
        setField(term4699, term4699.getClass(), "mpa", term4730);
        setField(term4699, term4699.getClass(), "genres", term4756);
        setField(term4699, term4699.getClass(), "likes", term4775);
        term4790 = new Long(41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4790;
        callMethod(klass, "addLike", argTypes, term4699, args);
    }

};


