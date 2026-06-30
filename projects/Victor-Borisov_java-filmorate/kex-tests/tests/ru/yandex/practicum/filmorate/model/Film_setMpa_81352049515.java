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

public class Film_setMpa_81352049515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5323;
     Object term5395;

    public Film_setMpa_81352049515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5324 = new Integer(49950830);
        Integer term5356 = new Integer(-525257914);
        Integer term5373 = new Integer(147209682);
        Object term5372 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5372, term5372.getClass(), "id", term5373);
        setField(term5372, term5372.getClass(), "name", "");
        Integer term5377 = new Integer(34470066);
        Object term5376 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5376, term5376.getClass(), "id", term5377);
        setField(term5376, term5376.getClass(), "name", "");
        Integer term5381 = new Integer(2058711405);
        Object term5380 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5380, term5380.getClass(), "id", term5381);
        setField(term5380, term5380.getClass(), "name", "");
        Integer term5385 = new Integer(1743683601);
        Object term5384 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5384, term5384.getClass(), "id", term5385);
        setField(term5384, term5384.getClass(), "name", "");
        Integer term5389 = new Integer(-945116798);
        Object term5388 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5388, term5388.getClass(), "id", term5389);
        setField(term5388, term5388.getClass(), "name", "");
        ArrayList term5370 = new ArrayList();
        ((ArrayList) term5370).add(term5372);
        ((ArrayList) term5370).add(term5376);
        ((ArrayList) term5370).add(term5380);
        ((ArrayList) term5370).add(term5384);
        ((ArrayList) term5370).add(term5388);
        term5323 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5350 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5355 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term5323, term5323.getClass(), "id", term5324);
        setField(term5323, term5323.getClass(), "name", "GBOEuByOfr");
        setField(term5323, term5323.getClass(), "description", "NHbOFFjyVK");
        setIntField(term5350, term5350.getClass(), "year", 2023);
        setShortField(term5350, term5350.getClass(), "month", (short) 9);
        setShortField(term5350, term5350.getClass(), "day", (short) 22);
        setField(term5323, term5323.getClass(), "releaseDate", term5350);
        setIntField(term5323, term5323.getClass(), "duration", 890669485);
        setField(term5355, term5355.getClass(), "id", term5356);
        setField(term5355, term5355.getClass(), "name", "zaloBqlrSo");
        setField(term5323, term5323.getClass(), "mpa", term5355);
        setField(term5323, term5323.getClass(), "genres", term5370);
        setIntField(term5323, term5323.getClass(), "rate", 691577392);
        Integer term5396 = new Integer(1593461795);
        term5395 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term5395, term5395.getClass(), "id", term5396);
        setField(term5395, term5395.getClass(), "name", "NBrvVzvQHe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term5395;
        callMethod(klass, "setMpa", argTypes, term5323, args);
    }

};


