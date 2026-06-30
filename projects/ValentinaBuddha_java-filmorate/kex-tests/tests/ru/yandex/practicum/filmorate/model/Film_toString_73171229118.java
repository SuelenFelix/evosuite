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

public class Film_toString_73171229118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4718;

    public Film_toString_73171229118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4719 = new Integer(1375330971);
        Integer term4749 = new Integer(-478195677);
        LinkedHashMap term4766 = new LinkedHashMap();
        Set<Object> term4802 =  ((Map) term4766).keySet();
        LinkedHashSet term4765 = new LinkedHashSet((Collection<? extends Object>) term4802);
        term4718 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4751 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4718, term4718.getClass(), "id", term4719);
        setField(term4718, term4718.getClass(), "name", "OcJCIDNIXA");
        setField(term4718, term4718.getClass(), "description", "XfRABIFVEp");
        setIntField(term4745, term4745.getClass(), "year", 2013);
        setShortField(term4745, term4745.getClass(), "month", (short) 3);
        setShortField(term4745, term4745.getClass(), "day", (short) 8);
        setField(term4718, term4718.getClass(), "releaseDate", term4745);
        setField(term4718, term4718.getClass(), "duration", term4749);
        setIntField(term4751, term4751.getClass(), "id", -615654495);
        setField(term4751, term4751.getClass(), "name", "MHGKyEnwKc");
        setField(term4718, term4718.getClass(), "mpa", term4751);
        setField(term4718, term4718.getClass(), "genres", term4765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4718, args);
    }

};


