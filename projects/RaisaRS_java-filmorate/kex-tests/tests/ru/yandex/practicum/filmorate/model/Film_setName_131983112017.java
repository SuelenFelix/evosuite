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

public class Film_setName_131983112017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6774;

    public Film_setName_131983112017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6832 = new HashMap();
        Set<Object> term6945 =  ((Map) term6832).keySet();
        HashSet term6831 = new HashSet((Collection<? extends Object>) term6945);
        HashMap term6855 = new HashMap();
        Set<Object> term6946 =  ((Map) term6855).keySet();
        HashSet term6854 = new HashSet((Collection<? extends Object>) term6946);
        term6774 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term6800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6805 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term6774, term6774.getClass(), "id", 6689117472719450333L);
        setField(term6774, term6774.getClass(), "name", "urCiQnUFBM");
        setField(term6774, term6774.getClass(), "description", "EKjQdtKxAM");
        setIntField(term6800, term6800.getClass(), "year", 2028);
        setShortField(term6800, term6800.getClass(), "month", (short) 9);
        setShortField(term6800, term6800.getClass(), "day", (short) 30);
        setField(term6774, term6774.getClass(), "releaseDate", term6800);
        setIntField(term6774, term6774.getClass(), "duration", -1565502840);
        setIntField(term6805, term6805.getClass(), "id", 344323424);
        setField(term6805, term6805.getClass(), "name", "TXZAIPQJHt");
        setField(term6805, term6805.getClass(), "description", "DIbeDHICho");
        setField(term6774, term6774.getClass(), "mpa", term6805);
        setField(term6774, term6774.getClass(), "genres", term6831);
        setField(term6774, term6774.getClass(), "likes", term6854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DzHVBMqWtE";
        callMethod(klass, "setName", argTypes, term6774, args);
    }

};


