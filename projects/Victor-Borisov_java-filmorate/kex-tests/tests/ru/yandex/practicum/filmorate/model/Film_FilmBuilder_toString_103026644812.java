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

public class Film_FilmBuilder_toString_103026644812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3633;

    public Film_FilmBuilder_toString_103026644812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3634 = new Integer(2098647989);
        Integer term3666 = new Integer(1598895173);
        Integer term3683 = new Integer(1830648570);
        Object term3682 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3682, term3682.getClass(), "id", term3683);
        setField(term3682, term3682.getClass(), "name", "");
        Integer term3687 = new Integer(-227365013);
        Object term3686 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3686, term3686.getClass(), "id", term3687);
        setField(term3686, term3686.getClass(), "name", "");
        Integer term3691 = new Integer(11724947);
        Object term3690 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3690, term3690.getClass(), "id", term3691);
        setField(term3690, term3690.getClass(), "name", "");
        ArrayList term3680 = new ArrayList();
        ((ArrayList) term3680).add(term3682);
        ((ArrayList) term3680).add(term3686);
        ((ArrayList) term3680).add(term3690);
        term3633 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3665 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3633, term3633.getClass(), "id", term3634);
        setField(term3633, term3633.getClass(), "name", "cudZvLMQon");
        setField(term3633, term3633.getClass(), "description", "lihXWlGDxk");
        setIntField(term3660, term3660.getClass(), "year", 2029);
        setShortField(term3660, term3660.getClass(), "month", (short) 6);
        setShortField(term3660, term3660.getClass(), "day", (short) 22);
        setField(term3633, term3633.getClass(), "releaseDate", term3660);
        setIntField(term3633, term3633.getClass(), "duration", 767834723);
        setField(term3665, term3665.getClass(), "id", term3666);
        setField(term3665, term3665.getClass(), "name", "JmcmxoGhIK");
        setField(term3633, term3633.getClass(), "mpa", term3665);
        setField(term3633, term3633.getClass(), "genres", term3680);
        setIntField(term3633, term3633.getClass(), "rate", -602026508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3633, args);
    }

};


