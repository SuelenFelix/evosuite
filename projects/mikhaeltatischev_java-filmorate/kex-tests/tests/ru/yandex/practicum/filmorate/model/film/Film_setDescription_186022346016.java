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

public class Film_setDescription_186022346016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1779;

    public Film_setDescription_186022346016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1780 = new Long(6273754186658578034L);
        Integer term1810 = new Integer(-893623680);
        Integer term1813 = new Integer(-1963434938);
        HashMap term1828 = new HashMap();
        Set<Object> term1907 =  ((Map) term1828).keySet();
        HashSet term1827 = new HashSet((Collection<? extends Object>) term1907);
        HashMap term1847 = new HashMap();
        Set<Object> term1908 =  ((Map) term1847).keySet();
        HashSet term1846 = new HashSet((Collection<? extends Object>) term1908);
        Integer term1863 = new Integer(568954359);
        term1779 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term1806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1812 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term1779, term1779.getClass(), "id", term1780);
        setField(term1779, term1779.getClass(), "name", "pORebkoRdD");
        setField(term1779, term1779.getClass(), "description", "mXGCWJDOqA");
        setIntField(term1806, term1806.getClass(), "year", 2029);
        setShortField(term1806, term1806.getClass(), "month", (short) 8);
        setShortField(term1806, term1806.getClass(), "day", (short) 28);
        setField(term1779, term1779.getClass(), "releaseDate", term1806);
        setField(term1779, term1779.getClass(), "duration", term1810);
        setField(term1812, term1812.getClass(), "id", term1813);
        setField(term1812, term1812.getClass(), "name", "dpNsDgfPso");
        setField(term1779, term1779.getClass(), "mpa", term1812);
        setField(term1779, term1779.getClass(), "genres", term1827);
        setField(term1779, term1779.getClass(), "likes", term1846);
        setField(term1779, term1779.getClass(), "rate", term1863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mLUZFTfjle";
        callMethod(klass, "setDescription", argTypes, term1779, args);
    }

};


