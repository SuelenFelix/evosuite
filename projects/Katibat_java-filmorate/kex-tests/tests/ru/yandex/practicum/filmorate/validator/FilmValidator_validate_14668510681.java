package ru.yandex.practicum.filmorate.validator;

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
import static ru.yandex.practicum.filmorate.validator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class FilmValidator_validate_14668510681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;

    public FilmValidator_validate_14668510681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76 = new Long(6375119433582206027L);
        Integer term106 = new Integer(568599855);
        term75 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term122 = newInstance(Class.forName("java.util.TreeSet"));
        Object term123 = newInstance(Class.forName("java.util.TreeMap"));
        Object term124 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term125 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term127 = newInstance(Class.forName("java.lang.Object"));
        Object term128 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term130 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term75, term75.getClass(), "id", term76);
        setField(term75, term75.getClass(), "name", "xxtlPwDYFs");
        setField(term75, term75.getClass(), "description", "jJCZpVmanW");
        setIntField(term102, term102.getClass(), "year", 2016);
        setShortField(term102, term102.getClass(), "month", (short) 11);
        setShortField(term102, term102.getClass(), "day", (short) 29);
        setField(term75, term75.getClass(), "releaseDate", term102);
        setField(term75, term75.getClass(), "duration", term106);
        setIntField(term108, term108.getClass(), "id", 568599855);
        setField(term108, term108.getClass(), "name", "EGtDIRbSSb");
        setField(term75, term75.getClass(), "mpa", term108);
        setField(term123, term123.getClass(), "comparator", null);
        setIntField(term125, term125.getClass(), "id", 1162663216);
        setField(term125, term125.getClass(), "name", null);
        setField(term124, term124.getClass(), "key", term125);
        setField(term124, term124.getClass(), "value", term127);
        setField(term128, term128.getClass(), "key", null);
        setField(term128, term128.getClass(), "value", term127);
        setField(term128, term128.getClass(), "left", null);
        setField(term128, term128.getClass(), "right", null);
        setField(term128, term128.getClass(), "parent", term124);
        setBooleanField(term128, term128.getClass(), "color", true);
        setField(term124, term124.getClass(), "left", term128);
        setField(term130, term130.getClass(), "key", null);
        setField(term130, term130.getClass(), "value", term127);
        setField(term130, term130.getClass(), "left", null);
        setField(term130, term130.getClass(), "right", null);
        setField(term130, term130.getClass(), "parent", term124);
        setBooleanField(term130, term130.getClass(), "color", true);
        setField(term124, term124.getClass(), "right", term130);
        setField(term124, term124.getClass(), "parent", null);
        setBooleanField(term124, term124.getClass(), "color", true);
        setField(term123, term123.getClass(), "root", term124);
        setIntField(term123, term123.getClass(), "size", 5);
        setIntField(term123, term123.getClass(), "modCount", 5);
        setField(term123, term123.getClass(), "entrySet", null);
        setField(term123, term123.getClass(), "navigableKeySet", null);
        setField(term123, term123.getClass(), "descendingMap", null);
        setField(term123, term123.getClass(), "keySet", null);
        setField(term123, term123.getClass(), "values", null);
        setField(term122, term122.getClass(), "m", term123);
        setField(term75, term75.getClass(), "genres", term122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.validator.FilmValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term75;
        callMethod(klass, "validate", argTypes, null, args);
    }

};


