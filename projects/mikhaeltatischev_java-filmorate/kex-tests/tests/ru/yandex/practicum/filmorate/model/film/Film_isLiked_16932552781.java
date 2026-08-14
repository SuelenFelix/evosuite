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

public class Film_isLiked_16932552781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term158;

    public Film_isLiked_16932552781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term79 = new Long(6375119433582206027L);
        Integer term109 = new Integer(1484323161);
        Integer term112 = new Integer(391863371);
        HashMap term127 = new HashMap();
        Set<Object> term190 =  ((Map) term127).keySet();
        HashSet term126 = new HashSet((Collection<? extends Object>) term190);
        HashMap term142 = new HashMap();
        Set<Object> term191 =  ((Map) term142).keySet();
        HashSet term141 = new HashSet((Collection<? extends Object>) term191);
        Integer term156 = new Integer(-1339778481);
        term78 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term78, term78.getClass(), "id", term79);
        setField(term78, term78.getClass(), "name", "xxtlPwDYFs");
        setField(term78, term78.getClass(), "description", "jJCZpVmanW");
        setIntField(term105, term105.getClass(), "year", 2016);
        setShortField(term105, term105.getClass(), "month", (short) 11);
        setShortField(term105, term105.getClass(), "day", (short) 29);
        setField(term78, term78.getClass(), "releaseDate", term105);
        setField(term78, term78.getClass(), "duration", term109);
        setField(term111, term111.getClass(), "id", term112);
        setField(term111, term111.getClass(), "name", "EGtDIRbSSb");
        setField(term78, term78.getClass(), "mpa", term111);
        setField(term78, term78.getClass(), "genres", term126);
        setField(term78, term78.getClass(), "likes", term141);
        setField(term78, term78.getClass(), "rate", term156);
        term158 = new Long(-2813493605142626659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term158;
        callMethod(klass, "isLiked", argTypes, term78, args);
    }

};


