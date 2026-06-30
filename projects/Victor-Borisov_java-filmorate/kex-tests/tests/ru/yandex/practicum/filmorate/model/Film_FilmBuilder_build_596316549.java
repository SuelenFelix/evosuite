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

public class Film_FilmBuilder_build_596316549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3507;

    public Film_FilmBuilder_build_596316549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3508 = new Integer(344323424);
        Integer term3540 = new Integer(9726679);
        Integer term3557 = new Integer(-25637976);
        Object term3556 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3556, term3556.getClass(), "id", term3557);
        setField(term3556, term3556.getClass(), "name", "");
        Integer term3561 = new Integer(1555897383);
        Object term3560 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3560, term3560.getClass(), "id", term3561);
        setField(term3560, term3560.getClass(), "name", "");
        Integer term3565 = new Integer(202001407);
        Object term3564 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3564, term3564.getClass(), "id", term3565);
        setField(term3564, term3564.getClass(), "name", "");
        Integer term3569 = new Integer(158873461);
        Object term3568 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3568, term3568.getClass(), "id", term3569);
        setField(term3568, term3568.getClass(), "name", "");
        Integer term3573 = new Integer(-430151637);
        Object term3572 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3572, term3572.getClass(), "id", term3573);
        setField(term3572, term3572.getClass(), "name", "");
        Integer term3577 = new Integer(-1697741339);
        Object term3576 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3576, term3576.getClass(), "id", term3577);
        setField(term3576, term3576.getClass(), "name", "");
        Integer term3581 = new Integer(98922530);
        Object term3580 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3580, term3580.getClass(), "id", term3581);
        setField(term3580, term3580.getClass(), "name", "");
        Integer term3585 = new Integer(-1388471422);
        Object term3584 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3584, term3584.getClass(), "id", term3585);
        setField(term3584, term3584.getClass(), "name", "");
        Integer term3589 = new Integer(-1498296052);
        Object term3588 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3588, term3588.getClass(), "id", term3589);
        setField(term3588, term3588.getClass(), "name", "");
        ArrayList term3554 = new ArrayList();
        ((ArrayList) term3554).add(term3556);
        ((ArrayList) term3554).add(term3560);
        ((ArrayList) term3554).add(term3564);
        ((ArrayList) term3554).add(term3568);
        ((ArrayList) term3554).add(term3572);
        ((ArrayList) term3554).add(term3576);
        ((ArrayList) term3554).add(term3580);
        ((ArrayList) term3554).add(term3584);
        ((ArrayList) term3554).add(term3588);
        term3507 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3539 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3507, term3507.getClass(), "id", term3508);
        setField(term3507, term3507.getClass(), "name", "DbiCVtPPCT");
        setField(term3507, term3507.getClass(), "description", "WzFopsaDuG");
        setIntField(term3534, term3534.getClass(), "year", 2022);
        setShortField(term3534, term3534.getClass(), "month", (short) 8);
        setShortField(term3534, term3534.getClass(), "day", (short) 8);
        setField(term3507, term3507.getClass(), "releaseDate", term3534);
        setIntField(term3507, term3507.getClass(), "duration", 679763016);
        setField(term3539, term3539.getClass(), "id", term3540);
        setField(term3539, term3539.getClass(), "name", "PapWxkhEWe");
        setField(term3507, term3507.getClass(), "mpa", term3539);
        setField(term3507, term3507.getClass(), "genres", term3554);
        setIntField(term3507, term3507.getClass(), "rate", 1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3507, args);
    }

};


