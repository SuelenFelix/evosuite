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

public class Film_canEqual_179964601116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4529;
     Object term4595;

    public Film_canEqual_179964601116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4530 = new Integer(335112684);
        Integer term4560 = new Integer(1551099402);
        LinkedHashMap term4577 = new LinkedHashMap();
        Set<Object> term4626 =  ((Map) term4577).keySet();
        LinkedHashSet term4576 = new LinkedHashSet((Collection<? extends Object>) term4626);
        term4529 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4562 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4529, term4529.getClass(), "id", term4530);
        setField(term4529, term4529.getClass(), "name", "NzBMMhkhpT");
        setField(term4529, term4529.getClass(), "description", "qCpEbQDHdF");
        setIntField(term4556, term4556.getClass(), "year", 2025);
        setShortField(term4556, term4556.getClass(), "month", (short) 11);
        setShortField(term4556, term4556.getClass(), "day", (short) 1);
        setField(term4529, term4529.getClass(), "releaseDate", term4556);
        setField(term4529, term4529.getClass(), "duration", term4560);
        setIntField(term4562, term4562.getClass(), "id", 683666002);
        setField(term4562, term4562.getClass(), "name", "AHbZyFOmlo");
        setField(term4529, term4529.getClass(), "mpa", term4562);
        setField(term4529, term4529.getClass(), "genres", term4576);
        term4595 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4595;
        callMethod(klass, "canEqual", argTypes, term4529, args);
    }

};


