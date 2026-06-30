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
import java.lang.Long;

public class Film_setId_126679154716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6635;
     Object term6730;

    public Film_setId_126679154716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6693 = new HashMap();
        Set<Object> term6772 =  ((Map) term6693).keySet();
        HashSet term6692 = new HashSet((Collection<? extends Object>) term6772);
        HashMap term6704 = new HashMap();
        Set<Object> term6773 =  ((Map) term6704).keySet();
        HashSet term6703 = new HashSet((Collection<? extends Object>) term6773);
        term6635 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term6661 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6666 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term6635, term6635.getClass(), "id", -8876856890348836498L);
        setField(term6635, term6635.getClass(), "name", "MYWYUeLGOp");
        setField(term6635, term6635.getClass(), "description", "tsTGdgQYUL");
        setIntField(term6661, term6661.getClass(), "year", 2013);
        setShortField(term6661, term6661.getClass(), "month", (short) 3);
        setShortField(term6661, term6661.getClass(), "day", (short) 8);
        setField(term6635, term6635.getClass(), "releaseDate", term6661);
        setIntField(term6635, term6635.getClass(), "duration", 1202361360);
        setIntField(term6666, term6666.getClass(), "id", -2015048153);
        setField(term6666, term6666.getClass(), "name", "TtGbVmKcnX");
        setField(term6666, term6666.getClass(), "description", "GJVkUrCVdD");
        setField(term6635, term6635.getClass(), "mpa", term6666);
        setField(term6635, term6635.getClass(), "genres", term6692);
        setField(term6635, term6635.getClass(), "likes", term6703);
        term6730 = new Long(846579494941632714L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6730;
        callMethod(klass, "setId", argTypes, term6635, args);
    }

};


