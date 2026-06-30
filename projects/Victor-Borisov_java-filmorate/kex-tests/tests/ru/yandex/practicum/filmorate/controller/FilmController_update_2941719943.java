package ru.yandex.practicum.filmorate.controller;

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
import static ru.yandex.practicum.filmorate.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;

public class FilmController_update_2941719943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392;
     Object term394;

    public FilmController_update_2941719943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term393 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService"));
        setField(term393, term393.getClass(), "filmStorage", null);
        setField(term393, term393.getClass(), "filmLikeStorage", null);
        setField(term393, term393.getClass(), "genreStorage", null);
        setField(term392, term392.getClass(), "filmService", term393);
        Integer term395 = new Integer(-6029667);
        Integer term427 = new Integer(-2068769794);
        Integer term444 = new Integer(-117576464);
        Object term443 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term443, term443.getClass(), "id", term444);
        setField(term443, term443.getClass(), "name", "");
        Integer term448 = new Integer(-1007160944);
        Object term447 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term447, term447.getClass(), "id", term448);
        setField(term447, term447.getClass(), "name", "");
        Integer term452 = new Integer(1135664017);
        Object term451 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term451, term451.getClass(), "id", term452);
        setField(term451, term451.getClass(), "name", "");
        Integer term456 = new Integer(590364439);
        Object term455 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term455, term455.getClass(), "id", term456);
        setField(term455, term455.getClass(), "name", "");
        ArrayList term441 = new ArrayList();
        ((ArrayList) term441).add(term443);
        ((ArrayList) term441).add(term447);
        ((ArrayList) term441).add(term451);
        ((ArrayList) term441).add(term455);
        term394 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term426 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term394, term394.getClass(), "id", term395);
        setField(term394, term394.getClass(), "name", "tbcdzjIfER");
        setField(term394, term394.getClass(), "description", "HyxfbSQYBe");
        setIntField(term421, term421.getClass(), "year", 2015);
        setShortField(term421, term421.getClass(), "month", (short) 9);
        setShortField(term421, term421.getClass(), "day", (short) 19);
        setField(term394, term394.getClass(), "releaseDate", term421);
        setIntField(term394, term394.getClass(), "duration", 1484323161);
        setField(term426, term426.getClass(), "id", term427);
        setField(term426, term426.getClass(), "name", "pCTimMblYc");
        setField(term394, term394.getClass(), "mpa", term426);
        setField(term394, term394.getClass(), "genres", term441);
        setIntField(term394, term394.getClass(), "rate", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term394;
        callMethod(klass, "update", argTypes, term392, args);
    }

};


