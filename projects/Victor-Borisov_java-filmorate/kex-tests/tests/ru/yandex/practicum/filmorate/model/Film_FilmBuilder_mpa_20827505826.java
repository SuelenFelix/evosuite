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

public class Film_FilmBuilder_mpa_20827505826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3612;
     Object term3688;

    public Film_FilmBuilder_mpa_20827505826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3613 = new Integer(202001407);
        Integer term3645 = new Integer(158873461);
        Integer term3662 = new Integer(-430151637);
        Object term3661 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3661, term3661.getClass(), "id", term3662);
        setField(term3661, term3661.getClass(), "name", "");
        Integer term3666 = new Integer(-1697741339);
        Object term3665 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3665, term3665.getClass(), "id", term3666);
        setField(term3665, term3665.getClass(), "name", "");
        Integer term3670 = new Integer(98922530);
        Object term3669 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3669, term3669.getClass(), "id", term3670);
        setField(term3669, term3669.getClass(), "name", "");
        Integer term3674 = new Integer(-1388471422);
        Object term3673 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3673, term3673.getClass(), "id", term3674);
        setField(term3673, term3673.getClass(), "name", "");
        Integer term3678 = new Integer(-1498296052);
        Object term3677 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3677, term3677.getClass(), "id", term3678);
        setField(term3677, term3677.getClass(), "name", "");
        Integer term3682 = new Integer(2098647989);
        Object term3681 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3681, term3681.getClass(), "id", term3682);
        setField(term3681, term3681.getClass(), "name", "");
        ArrayList term3659 = new ArrayList();
        ((ArrayList) term3659).add(term3661);
        ((ArrayList) term3659).add(term3665);
        ((ArrayList) term3659).add(term3669);
        ((ArrayList) term3659).add(term3673);
        ((ArrayList) term3659).add(term3677);
        ((ArrayList) term3659).add(term3681);
        term3612 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3644 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3612, term3612.getClass(), "id", term3613);
        setField(term3612, term3612.getClass(), "name", "XkIoWJRNwN");
        setField(term3612, term3612.getClass(), "description", "aNWLJdrZMq");
        setIntField(term3639, term3639.getClass(), "year", 2011);
        setShortField(term3639, term3639.getClass(), "month", (short) 5);
        setShortField(term3639, term3639.getClass(), "day", (short) 4);
        setField(term3612, term3612.getClass(), "releaseDate", term3639);
        setIntField(term3612, term3612.getClass(), "duration", -469968304);
        setField(term3644, term3644.getClass(), "id", term3645);
        setField(term3644, term3644.getClass(), "name", "HHmNoYxIGj");
        setField(term3612, term3612.getClass(), "mpa", term3644);
        setField(term3612, term3612.getClass(), "genres", term3659);
        setIntField(term3612, term3612.getClass(), "rate", -1145578966);
        Integer term3689 = new Integer(1598895173);
        term3688 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3688, term3688.getClass(), "id", term3689);
        setField(term3688, term3688.getClass(), "name", "DbiCVtPPCT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term3688;
        callMethod(klass, "mpa", argTypes, term3612, args);
    }

};


