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
import java.util.ArrayList;

public class Film_FilmBuilder_id_20903154101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2581;
     Object term2653;

    public Film_FilmBuilder_id_20903154101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2582 = new Integer(-1547384488);
        Integer term2614 = new Integer(1442160736);
        Integer term2631 = new Integer(1114000454);
        Object term2630 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2630, term2630.getClass(), "id", term2631);
        setField(term2630, term2630.getClass(), "name", "");
        Integer term2635 = new Integer(-556405712);
        Object term2634 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2634, term2634.getClass(), "id", term2635);
        setField(term2634, term2634.getClass(), "name", "");
        Integer term2639 = new Integer(-1772434990);
        Object term2638 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2638, term2638.getClass(), "id", term2639);
        setField(term2638, term2638.getClass(), "name", "");
        Integer term2643 = new Integer(-1845499264);
        Object term2642 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2642, term2642.getClass(), "id", term2643);
        setField(term2642, term2642.getClass(), "name", "");
        Integer term2647 = new Integer(-505439934);
        Object term2646 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2646, term2646.getClass(), "id", term2647);
        setField(term2646, term2646.getClass(), "name", "");
        ArrayList term2628 = new ArrayList();
        ((ArrayList) term2628).add(term2630);
        ((ArrayList) term2628).add(term2634);
        ((ArrayList) term2628).add(term2638);
        ((ArrayList) term2628).add(term2642);
        ((ArrayList) term2628).add(term2646);
        term2581 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2608 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2613 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2581, term2581.getClass(), "id", term2582);
        setField(term2581, term2581.getClass(), "name", "JiVRgTZvKc");
        setField(term2581, term2581.getClass(), "description", "XPKmummaqg");
        setIntField(term2608, term2608.getClass(), "year", 2012);
        setShortField(term2608, term2608.getClass(), "month", (short) 9);
        setShortField(term2608, term2608.getClass(), "day", (short) 11);
        setField(term2581, term2581.getClass(), "releaseDate", term2608);
        setIntField(term2581, term2581.getClass(), "duration", -6029667);
        setField(term2613, term2613.getClass(), "id", term2614);
        setField(term2613, term2613.getClass(), "name", "BKLfkLiZTH");
        setField(term2581, term2581.getClass(), "mpa", term2613);
        setField(term2581, term2581.getClass(), "genres", term2628);
        setIntField(term2581, term2581.getClass(), "rate", -2068769794);
        term2653 = new Integer(-344842608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2653;
        callMethod(klass, "id", argTypes, term2581, args);
    }

};


