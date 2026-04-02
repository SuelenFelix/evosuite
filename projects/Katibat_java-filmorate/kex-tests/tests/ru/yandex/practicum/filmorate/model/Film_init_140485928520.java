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
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class Film_init_140485928520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5032;
     Object term5058;
     Object term5062;
     Object term5064;
     Object term5078;

    public Film_init_140485928520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5032 = new Long(6682528376118987775L);
        term5058 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term5058, term5058.getClass(), "year", 2027);
        setShortField(term5058, term5058.getClass(), "month", (short) 2);
        setShortField(term5058, term5058.getClass(), "day", (short) 18);
        term5062 = new Integer(-203030934);
        term5064 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setIntField(term5064, term5064.getClass(), "id", 1398204340);
        setField(term5064, term5064.getClass(), "name", "DPskuFUobI");
        term5078 = newInstance(Class.forName("java.util.TreeSet"));
        Object term5079 = newInstance(Class.forName("java.util.TreeMap"));
        Object term5080 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5081 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term5084 = newInstance(Class.forName("java.lang.Object"));
        Object term5085 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5086 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term5088 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5090 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5093 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5094 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term5096 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5098 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term5079, term5079.getClass(), "comparator", null);
        setIntField(term5081, term5081.getClass(), "id", -243422082);
        setField(term5081, term5081.getClass(), "name", "");
        setField(term5080, term5080.getClass(), "key", term5081);
        setField(term5080, term5080.getClass(), "value", term5084);
        setIntField(term5086, term5086.getClass(), "id", -1002370457);
        setField(term5086, term5086.getClass(), "name", null);
        setField(term5085, term5085.getClass(), "key", term5086);
        setField(term5085, term5085.getClass(), "value", term5084);
        setField(term5088, term5088.getClass(), "key", null);
        setField(term5088, term5088.getClass(), "value", term5084);
        setField(term5088, term5088.getClass(), "left", null);
        setField(term5088, term5088.getClass(), "right", null);
        setField(term5088, term5088.getClass(), "parent", term5085);
        setBooleanField(term5088, term5088.getClass(), "color", false);
        setField(term5085, term5085.getClass(), "left", term5088);
        setField(term5090, term5090.getClass(), "key", null);
        setField(term5090, term5090.getClass(), "value", term5084);
        setField(term5090, term5090.getClass(), "left", null);
        setField(term5090, term5090.getClass(), "right", null);
        setField(term5090, term5090.getClass(), "parent", term5085);
        setBooleanField(term5090, term5090.getClass(), "color", false);
        setField(term5085, term5085.getClass(), "right", term5090);
        setField(term5085, term5085.getClass(), "parent", term5080);
        setBooleanField(term5085, term5085.getClass(), "color", true);
        setField(term5080, term5080.getClass(), "left", term5085);
        setIntField(term5094, term5094.getClass(), "id", 1296895584);
        setField(term5094, term5094.getClass(), "name", null);
        setField(term5093, term5093.getClass(), "key", term5094);
        setField(term5093, term5093.getClass(), "value", term5084);
        setField(term5096, term5096.getClass(), "key", null);
        setField(term5096, term5096.getClass(), "value", term5084);
        setField(term5096, term5096.getClass(), "left", null);
        setField(term5096, term5096.getClass(), "right", null);
        setField(term5096, term5096.getClass(), "parent", term5093);
        setBooleanField(term5096, term5096.getClass(), "color", false);
        setField(term5093, term5093.getClass(), "left", term5096);
        setField(term5098, term5098.getClass(), "key", null);
        setField(term5098, term5098.getClass(), "value", term5084);
        setField(term5098, term5098.getClass(), "left", null);
        setField(term5098, term5098.getClass(), "right", null);
        setField(term5098, term5098.getClass(), "parent", term5093);
        setBooleanField(term5098, term5098.getClass(), "color", false);
        setField(term5093, term5093.getClass(), "right", term5098);
        setField(term5093, term5093.getClass(), "parent", term5080);
        setBooleanField(term5093, term5093.getClass(), "color", true);
        setField(term5080, term5080.getClass(), "right", term5093);
        setField(term5080, term5080.getClass(), "parent", null);
        setBooleanField(term5080, term5080.getClass(), "color", true);
        setField(term5079, term5079.getClass(), "root", term5080);
        setIntField(term5079, term5079.getClass(), "size", 7);
        setIntField(term5079, term5079.getClass(), "modCount", 7);
        setField(term5079, term5079.getClass(), "entrySet", null);
        setField(term5079, term5079.getClass(), "navigableKeySet", null);
        setField(term5079, term5079.getClass(), "descendingMap", null);
        setField(term5079, term5079.getClass(), "keySet", null);
        setField(term5079, term5079.getClass(), "values", null);
        setField(term5078, term5078.getClass(), "m", term5079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDate");
        argTypes[4] = Class.forName("java.lang.Integer");
        argTypes[5] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        argTypes[6] = Class.forName("java.util.TreeSet");
        Object[] args = new Object[7];
        args[0] = term5032;
        args[1] = "DIbeDHICho";
        args[2] = "dJGPlmSRnz";
        args[3] = term5058;
        args[4] = term5062;
        args[5] = term5064;
        args[6] = term5078;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


