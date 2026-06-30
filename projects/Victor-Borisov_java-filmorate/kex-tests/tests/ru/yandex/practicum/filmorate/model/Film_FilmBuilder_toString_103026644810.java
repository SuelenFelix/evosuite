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

public class Film_FilmBuilder_toString_103026644810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3625;

    public Film_FilmBuilder_toString_103026644810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3626 = new Integer(2098647989);
        Integer term3658 = new Integer(1598895173);
        Integer term3675 = new Integer(1830648570);
        Object term3674 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3674, term3674.getClass(), "id", term3675);
        setField(term3674, term3674.getClass(), "name", "");
        Integer term3679 = new Integer(-227365013);
        Object term3678 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3678, term3678.getClass(), "id", term3679);
        setField(term3678, term3678.getClass(), "name", "");
        Integer term3683 = new Integer(11724947);
        Object term3682 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3682, term3682.getClass(), "id", term3683);
        setField(term3682, term3682.getClass(), "name", "");
        ArrayList term3672 = new ArrayList();
        ((ArrayList) term3672).add(term3674);
        ((ArrayList) term3672).add(term3678);
        ((ArrayList) term3672).add(term3682);
        term3625 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3657 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3625, term3625.getClass(), "id", term3626);
        setField(term3625, term3625.getClass(), "name", "cudZvLMQon");
        setField(term3625, term3625.getClass(), "description", "lihXWlGDxk");
        setIntField(term3652, term3652.getClass(), "year", 2029);
        setShortField(term3652, term3652.getClass(), "month", (short) 6);
        setShortField(term3652, term3652.getClass(), "day", (short) 22);
        setField(term3625, term3625.getClass(), "releaseDate", term3652);
        setIntField(term3625, term3625.getClass(), "duration", 767834723);
        setField(term3657, term3657.getClass(), "id", term3658);
        setField(term3657, term3657.getClass(), "name", "JmcmxoGhIK");
        setField(term3625, term3625.getClass(), "mpa", term3657);
        setField(term3625, term3625.getClass(), "genres", term3672);
        setIntField(term3625, term3625.getClass(), "rate", -602026508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3625, args);
    }

};


