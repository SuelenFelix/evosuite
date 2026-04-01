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

public class Film_FilmBuilder_rate_149614476710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3395;
     Object term3483;

    public Film_FilmBuilder_rate_149614476710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3396 = new Integer(96566506);
        Integer term3428 = new Integer(-343325701);
        Integer term3445 = new Integer(107945604);
        Object term3444 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3444, term3444.getClass(), "id", term3445);
        setField(term3444, term3444.getClass(), "name", "");
        Integer term3449 = new Integer(-1963464809);
        Object term3448 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3448, term3448.getClass(), "id", term3449);
        setField(term3448, term3448.getClass(), "name", "");
        Integer term3453 = new Integer(71190297);
        Object term3452 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3452, term3452.getClass(), "id", term3453);
        setField(term3452, term3452.getClass(), "name", "");
        Integer term3457 = new Integer(1202361360);
        Object term3456 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3456, term3456.getClass(), "id", term3457);
        setField(term3456, term3456.getClass(), "name", "");
        Integer term3461 = new Integer(-2015048153);
        Object term3460 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3460, term3460.getClass(), "id", term3461);
        setField(term3460, term3460.getClass(), "name", "");
        Integer term3465 = new Integer(-2063457669);
        Object term3464 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3464, term3464.getClass(), "id", term3465);
        setField(term3464, term3464.getClass(), "name", "");
        Integer term3469 = new Integer(-1222006000);
        Object term3468 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3468, term3468.getClass(), "id", term3469);
        setField(term3468, term3468.getClass(), "name", "");
        Integer term3473 = new Integer(2095798786);
        Object term3472 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3472, term3472.getClass(), "id", term3473);
        setField(term3472, term3472.getClass(), "name", "");
        Integer term3477 = new Integer(-1565502840);
        Object term3476 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3476, term3476.getClass(), "id", term3477);
        setField(term3476, term3476.getClass(), "name", "");
        ArrayList term3442 = new ArrayList();
        ((ArrayList) term3442).add(term3444);
        ((ArrayList) term3442).add(term3448);
        ((ArrayList) term3442).add(term3452);
        ((ArrayList) term3442).add(term3456);
        ((ArrayList) term3442).add(term3460);
        ((ArrayList) term3442).add(term3464);
        ((ArrayList) term3442).add(term3468);
        ((ArrayList) term3442).add(term3472);
        ((ArrayList) term3442).add(term3476);
        term3395 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3427 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3395, term3395.getClass(), "id", term3396);
        setField(term3395, term3395.getClass(), "name", "ZfdXfCCFDf");
        setField(term3395, term3395.getClass(), "description", "MwwjNtdOFT");
        setIntField(term3422, term3422.getClass(), "year", 2015);
        setShortField(term3422, term3422.getClass(), "month", (short) 9);
        setShortField(term3422, term3422.getClass(), "day", (short) 15);
        setField(term3395, term3395.getClass(), "releaseDate", term3422);
        setIntField(term3395, term3395.getClass(), "duration", -1530420153);
        setField(term3427, term3427.getClass(), "id", term3428);
        setField(term3427, term3427.getClass(), "name", "VYkqXKVlAJ");
        setField(term3395, term3395.getClass(), "mpa", term3427);
        setField(term3395, term3395.getClass(), "genres", term3442);
        setIntField(term3395, term3395.getClass(), "rate", -469968304);
        term3483 = new Integer(-1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3483;
        callMethod(klass, "rate", argTypes, term3395, args);
    }

};


