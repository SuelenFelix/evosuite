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

public class Film_getLikes_93986528615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6490;

    public Film_getLikes_93986528615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6548 = new HashMap();
        Set<Object> term6633 =  ((Map) term6548).keySet();
        HashSet term6547 = new HashSet((Collection<? extends Object>) term6633);
        HashMap term6559 = new HashMap();
        Set<Object> term6634 =  ((Map) term6559).keySet();
        HashSet term6558 = new HashSet((Collection<? extends Object>) term6634);
        term6490 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term6516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6521 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term6490, term6490.getClass(), "id", 2848819812340321742L);
        setField(term6490, term6490.getClass(), "name", "uPuCVuZYOI");
        setField(term6490, term6490.getClass(), "description", "TweMFhxNdj");
        setIntField(term6516, term6516.getClass(), "year", 2023);
        setShortField(term6516, term6516.getClass(), "month", (short) 9);
        setShortField(term6516, term6516.getClass(), "day", (short) 22);
        setField(term6490, term6490.getClass(), "releaseDate", term6516);
        setIntField(term6490, term6490.getClass(), "duration", -343325701);
        setIntField(term6521, term6521.getClass(), "id", 107945604);
        setField(term6521, term6521.getClass(), "name", "NBrvVzvQHe");
        setField(term6521, term6521.getClass(), "description", "FjOiNAfBOc");
        setField(term6490, term6490.getClass(), "mpa", term6521);
        setField(term6490, term6490.getClass(), "genres", term6547);
        setField(term6490, term6490.getClass(), "likes", term6558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikes", argTypes, term6490, args);
    }

};


