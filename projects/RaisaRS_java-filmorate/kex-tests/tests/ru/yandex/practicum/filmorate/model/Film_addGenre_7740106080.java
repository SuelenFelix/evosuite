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

public class Film_addGenre_7740106080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4534;
     Object term4633;

    public Film_addGenre_7740106080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4592 = new HashMap();
        Set<Object> term4687 =  ((Map) term4592).keySet();
        HashSet term4591 = new HashSet((Collection<? extends Object>) term4687);
        HashMap term4603 = new HashMap();
        Set<Object> term4688 =  ((Map) term4603).keySet();
        HashSet term4602 = new HashSet((Collection<? extends Object>) term4688);
        term4534 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4565 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term4534, term4534.getClass(), "id", 41775768178052008L);
        setField(term4534, term4534.getClass(), "name", "BRIVNtfUWU");
        setField(term4534, term4534.getClass(), "description", "DbiCVtPPCT");
        setIntField(term4560, term4560.getClass(), "year", 2017);
        setShortField(term4560, term4560.getClass(), "month", (short) 3);
        setShortField(term4560, term4560.getClass(), "day", (short) 5);
        setField(term4534, term4534.getClass(), "releaseDate", term4560);
        setIntField(term4534, term4534.getClass(), "duration", -817164822);
        setIntField(term4565, term4565.getClass(), "id", -1016503459);
        setField(term4565, term4565.getClass(), "name", "WzFopsaDuG");
        setField(term4565, term4565.getClass(), "description", "PapWxkhEWe");
        setField(term4534, term4534.getClass(), "mpa", term4565);
        setField(term4534, term4534.getClass(), "genres", term4591);
        setField(term4534, term4534.getClass(), "likes", term4602);
        term4633 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setIntField(term4633, term4633.getClass(), "id", -14890619);
        setField(term4633, term4633.getClass(), "name", "OYbzXylRWW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Genre");
        Object[] args = new Object[1];
        args[0] = term4633;
        callMethod(klass, "addGenre", argTypes, term4534, args);
    }

};


