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
import java.util.LinkedList;

public class Film_setGenres_83201650816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5450;
     Object term5526;

    public Film_setGenres_83201650816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5451 = new Integer(515182546);
        Integer term5483 = new Integer(-936895502);
        Integer term5500 = new Integer(-129547140);
        Object term5499 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5499, term5499.getClass(), "id", term5500);
        setField(term5499, term5499.getClass(), "name", "");
        Integer term5504 = new Integer(199287428);
        Object term5503 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5503, term5503.getClass(), "id", term5504);
        setField(term5503, term5503.getClass(), "name", "");
        Integer term5508 = new Integer(-1195339592);
        Object term5507 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5507, term5507.getClass(), "id", term5508);
        setField(term5507, term5507.getClass(), "name", "");
        Integer term5512 = new Integer(-376422566);
        Object term5511 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5511, term5511.getClass(), "id", term5512);
        setField(term5511, term5511.getClass(), "name", "");
        Integer term5516 = new Integer(306847454);
        Object term5515 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5515, term5515.getClass(), "id", term5516);
        setField(term5515, term5515.getClass(), "name", "");
        Integer term5520 = new Integer(1745276158);
        Object term5519 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5519, term5519.getClass(), "id", term5520);
        setField(term5519, term5519.getClass(), "name", "");
        ArrayList term5497 = new ArrayList();
        ((ArrayList) term5497).add(term5499);
        ((ArrayList) term5497).add(term5503);
        ((ArrayList) term5497).add(term5507);
        ((ArrayList) term5497).add(term5511);
        ((ArrayList) term5497).add(term5515);
        ((ArrayList) term5497).add(term5519);
        term5450 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5482 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term5450, term5450.getClass(), "id", term5451);
        setField(term5450, term5450.getClass(), "name", "FjOiNAfBOc");
        setField(term5450, term5450.getClass(), "description", "iCCsaLHohG");
        setIntField(term5477, term5477.getClass(), "year", 2013);
        setShortField(term5477, term5477.getClass(), "month", (short) 3);
        setShortField(term5477, term5477.getClass(), "day", (short) 8);
        setField(term5450, term5450.getClass(), "releaseDate", term5477);
        setIntField(term5450, term5450.getClass(), "duration", -893623680);
        setField(term5482, term5482.getClass(), "id", term5483);
        setField(term5482, term5482.getClass(), "name", "NJhGgctbdj");
        setField(term5450, term5450.getClass(), "mpa", term5482);
        setField(term5450, term5450.getClass(), "genres", term5497);
        setIntField(term5450, term5450.getClass(), "rate", -1963434938);
        term5526 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5526;
        callMethod(klass, "setGenres", argTypes, term5450, args);
    }

};


