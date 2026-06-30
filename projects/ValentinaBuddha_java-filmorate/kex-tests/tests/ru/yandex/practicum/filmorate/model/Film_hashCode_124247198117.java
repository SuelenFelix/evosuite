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
import java.lang.Integer;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Film_hashCode_124247198117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4627;

    public Film_hashCode_124247198117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4628 = new Integer(-2027534003);
        Integer term4658 = new Integer(1063420942);
        LinkedHashMap term4675 = new LinkedHashMap();
        Set<Object> term4717 =  ((Map) term4675).keySet();
        LinkedHashSet term4674 = new LinkedHashSet((Collection<? extends Object>) term4717);
        term4627 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4660 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4627, term4627.getClass(), "id", term4628);
        setField(term4627, term4627.getClass(), "name", "aSkmSwTnEw");
        setField(term4627, term4627.getClass(), "description", "xvkbvaEGYd");
        setIntField(term4654, term4654.getClass(), "year", 2023);
        setShortField(term4654, term4654.getClass(), "month", (short) 9);
        setShortField(term4654, term4654.getClass(), "day", (short) 22);
        setField(term4627, term4627.getClass(), "releaseDate", term4654);
        setField(term4627, term4627.getClass(), "duration", term4658);
        setIntField(term4660, term4660.getClass(), "id", -663691365);
        setField(term4660, term4660.getClass(), "name", "HBGNxdNURv");
        setField(term4627, term4627.getClass(), "mpa", term4660);
        setField(term4627, term4627.getClass(), "genres", term4674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4627, args);
    }

};


