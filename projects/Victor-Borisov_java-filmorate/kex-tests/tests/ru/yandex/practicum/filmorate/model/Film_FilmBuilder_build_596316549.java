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
     Object term4014;

    public Film_FilmBuilder_build_596316549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4015 = new Integer(197109649);
        Integer term4047 = new Integer(-1239406390);
        Integer term4064 = new Integer(1557431527);
        Object term4063 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4063, term4063.getClass(), "id", term4064);
        setField(term4063, term4063.getClass(), "name", "");
        Integer term4068 = new Integer(-1504890659);
        Object term4067 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4067, term4067.getClass(), "id", term4068);
        setField(term4067, term4067.getClass(), "name", "");
        Integer term4072 = new Integer(1358829571);
        Object term4071 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4071, term4071.getClass(), "id", term4072);
        setField(term4071, term4071.getClass(), "name", "");
        Integer term4076 = new Integer(991356662);
        Object term4075 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4075, term4075.getClass(), "id", term4076);
        setField(term4075, term4075.getClass(), "name", "");
        Integer term4080 = new Integer(-506958186);
        Object term4079 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4079, term4079.getClass(), "id", term4080);
        setField(term4079, term4079.getClass(), "name", "");
        Integer term4084 = new Integer(-507387516);
        Object term4083 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4083, term4083.getClass(), "id", term4084);
        setField(term4083, term4083.getClass(), "name", "");
        Integer term4088 = new Integer(-1970452551);
        Object term4087 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4087, term4087.getClass(), "id", term4088);
        setField(term4087, term4087.getClass(), "name", "");
        ArrayList term4061 = new ArrayList();
        ((ArrayList) term4061).add(term4063);
        ((ArrayList) term4061).add(term4067);
        ((ArrayList) term4061).add(term4071);
        ((ArrayList) term4061).add(term4075);
        ((ArrayList) term4061).add(term4079);
        ((ArrayList) term4061).add(term4083);
        ((ArrayList) term4061).add(term4087);
        term4014 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term4041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4046 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4014, term4014.getClass(), "id", term4015);
        setField(term4014, term4014.getClass(), "name", "kNqaJKIATy");
        setField(term4014, term4014.getClass(), "description", "vKQukfbJUd");
        setIntField(term4041, term4041.getClass(), "year", 2020);
        setShortField(term4041, term4041.getClass(), "month", (short) 7);
        setShortField(term4041, term4041.getClass(), "day", (short) 23);
        setField(term4014, term4014.getClass(), "releaseDate", term4041);
        setIntField(term4014, term4014.getClass(), "duration", 1876565163);
        setField(term4046, term4046.getClass(), "id", term4047);
        setField(term4046, term4046.getClass(), "name", "lFRJFUMVbx");
        setField(term4014, term4014.getClass(), "mpa", term4046);
        setField(term4014, term4014.getClass(), "genres", term4061);
        setIntField(term4014, term4014.getClass(), "rate", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4014, args);
    }

};


