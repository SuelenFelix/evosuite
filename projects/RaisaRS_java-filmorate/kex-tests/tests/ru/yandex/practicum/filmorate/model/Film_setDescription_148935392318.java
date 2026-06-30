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

public class Film_setDescription_148935392318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6957;

    public Film_setDescription_148935392318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7015 = new HashMap();
        Set<Object> term7104 =  ((Map) term7015).keySet();
        HashSet term7014 = new HashSet((Collection<? extends Object>) term7104);
        HashMap term7034 = new HashMap();
        Set<Object> term7105 =  ((Map) term7034).keySet();
        HashSet term7033 = new HashSet((Collection<? extends Object>) term7105);
        term6957 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term6983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6988 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term6957, term6957.getClass(), "id", 5836128569274066678L);
        setField(term6957, term6957.getClass(), "name", "THZSpzBRYP");
        setField(term6957, term6957.getClass(), "description", "ZfBIVGBQOE");
        setIntField(term6983, term6983.getClass(), "year", 2026);
        setShortField(term6983, term6983.getClass(), "month", (short) 11);
        setShortField(term6983, term6983.getClass(), "day", (short) 29);
        setField(term6957, term6957.getClass(), "releaseDate", term6983);
        setIntField(term6957, term6957.getClass(), "duration", -1388471422);
        setIntField(term6988, term6988.getClass(), "id", -1498296052);
        setField(term6988, term6988.getClass(), "name", "QSrDQfEsTR");
        setField(term6988, term6988.getClass(), "description", "PsqusYmejD");
        setField(term6957, term6957.getClass(), "mpa", term6988);
        setField(term6957, term6957.getClass(), "genres", term7014);
        setField(term6957, term6957.getClass(), "likes", term7033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zNFLXMifnS";
        callMethod(klass, "setDescription", argTypes, term6957, args);
    }

};


