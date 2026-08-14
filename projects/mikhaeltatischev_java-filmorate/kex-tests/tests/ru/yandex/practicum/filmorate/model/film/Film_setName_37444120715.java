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

public class Film_setName_37444120715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1645;

    public Film_setName_37444120715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1646 = new Long(-7268507582722666254L);
        Integer term1676 = new Integer(-663691365);
        Integer term1679 = new Integer(339854490);
        HashMap term1694 = new HashMap();
        Set<Object> term1767 =  ((Map) term1694).keySet();
        HashSet term1693 = new HashSet((Collection<? extends Object>) term1767);
        HashMap term1713 = new HashMap();
        Set<Object> term1768 =  ((Map) term1713).keySet();
        HashSet term1712 = new HashSet((Collection<? extends Object>) term1768);
        Integer term1723 = new Integer(691577392);
        term1645 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term1672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1678 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term1645, term1645.getClass(), "id", term1646);
        setField(term1645, term1645.getClass(), "name", "sEnIVFtZuQ");
        setField(term1645, term1645.getClass(), "description", "ZVecLZMLHF");
        setIntField(term1672, term1672.getClass(), "year", 2029);
        setShortField(term1672, term1672.getClass(), "month", (short) 1);
        setShortField(term1672, term1672.getClass(), "day", (short) 20);
        setField(term1645, term1645.getClass(), "releaseDate", term1672);
        setField(term1645, term1645.getClass(), "duration", term1676);
        setField(term1678, term1678.getClass(), "id", term1679);
        setField(term1678, term1678.getClass(), "name", "fztQhjqwdP");
        setField(term1645, term1645.getClass(), "mpa", term1678);
        setField(term1645, term1645.getClass(), "genres", term1693);
        setField(term1645, term1645.getClass(), "likes", term1712);
        setField(term1645, term1645.getClass(), "rate", term1723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XylxrMBraH";
        callMethod(klass, "setName", argTypes, term1645, args);
    }

};


