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

public class Film_setReleaseDate_149277904919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7116;
     Object term7201;

    public Film_setReleaseDate_149277904919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7174 = new HashMap();
        Set<Object> term7245 =  ((Map) term7174).keySet();
        HashSet term7173 = new HashSet((Collection<? extends Object>) term7245);
        HashMap term7187 = new HashMap();
        Set<Object> term7246 =  ((Map) term7187).keySet();
        HashSet term7186 = new HashSet((Collection<? extends Object>) term7246);
        term7116 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term7142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7147 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term7116, term7116.getClass(), "id", -2177368829816872572L);
        setField(term7116, term7116.getClass(), "name", "HHQcYMSBVc");
        setField(term7116, term7116.getClass(), "description", "wdoqITnaAP");
        setIntField(term7142, term7142.getClass(), "year", 2027);
        setShortField(term7142, term7142.getClass(), "month", (short) 2);
        setShortField(term7142, term7142.getClass(), "day", (short) 18);
        setField(term7116, term7116.getClass(), "releaseDate", term7142);
        setIntField(term7116, term7116.getClass(), "duration", -523949691);
        setIntField(term7147, term7147.getClass(), "id", 1398204340);
        setField(term7147, term7147.getClass(), "name", "rIPMBcrNqB");
        setField(term7147, term7147.getClass(), "description", "UDaboHZHhz");
        setField(term7116, term7116.getClass(), "mpa", term7147);
        setField(term7116, term7116.getClass(), "genres", term7173);
        setField(term7116, term7116.getClass(), "likes", term7186);
        term7201 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term7201, term7201.getClass(), "year", 2028);
        setShortField(term7201, term7201.getClass(), "month", (short) 5);
        setShortField(term7201, term7201.getClass(), "day", (short) 29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term7201;
        callMethod(klass, "setReleaseDate", argTypes, term7116, args);
    }

};


