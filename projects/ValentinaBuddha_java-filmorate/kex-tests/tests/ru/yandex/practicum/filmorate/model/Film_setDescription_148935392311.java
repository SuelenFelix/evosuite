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

public class Film_setDescription_148935392311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3987;

    public Film_setDescription_148935392311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3988 = new Integer(-2095575670);
        Integer term4018 = new Integer(1225272962);
        LinkedHashMap term4035 = new LinkedHashMap();
        Set<Object> term4089 =  ((Map) term4035).keySet();
        LinkedHashSet term4034 = new LinkedHashSet((Collection<? extends Object>) term4089);
        term3987 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4020 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3987, term3987.getClass(), "id", term3988);
        setField(term3987, term3987.getClass(), "name", "kNqaJKIATy");
        setField(term3987, term3987.getClass(), "description", "vKQukfbJUd");
        setIntField(term4014, term4014.getClass(), "year", 2022);
        setShortField(term4014, term4014.getClass(), "month", (short) 10);
        setShortField(term4014, term4014.getClass(), "day", (short) 18);
        setField(term3987, term3987.getClass(), "releaseDate", term4014);
        setField(term3987, term3987.getClass(), "duration", term4018);
        setIntField(term4020, term4020.getClass(), "id", 1063420942);
        setField(term4020, term4020.getClass(), "name", "lFRJFUMVbx");
        setField(term3987, term3987.getClass(), "mpa", term4020);
        setField(term3987, term3987.getClass(), "genres", term4034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        callMethod(klass, "setDescription", argTypes, term3987, args);
    }

};


