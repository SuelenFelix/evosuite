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
     Object term3111;
     Object term3187;

    public Film_FilmBuilder_mpa_20827505826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3112 = new Integer(890669485);
        Integer term3144 = new Integer(691577392);
        Integer term3161 = new Integer(-893623680);
        Object term3160 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3160, term3160.getClass(), "id", term3161);
        setField(term3160, term3160.getClass(), "name", "");
        Integer term3165 = new Integer(-1963434938);
        Object term3164 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3164, term3164.getClass(), "id", term3165);
        setField(term3164, term3164.getClass(), "name", "");
        Integer term3169 = new Integer(906181092);
        Object term3168 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3168, term3168.getClass(), "id", term3169);
        setField(term3168, term3168.getClass(), "name", "");
        Integer term3173 = new Integer(1045657203);
        Object term3172 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3172, term3172.getClass(), "id", term3173);
        setField(term3172, term3172.getClass(), "name", "");
        Integer term3177 = new Integer(1386130016);
        Object term3176 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3176, term3176.getClass(), "id", term3177);
        setField(term3176, term3176.getClass(), "name", "");
        Integer term3181 = new Integer(1072005683);
        Object term3180 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3180, term3180.getClass(), "id", term3181);
        setField(term3180, term3180.getClass(), "name", "");
        ArrayList term3158 = new ArrayList();
        ((ArrayList) term3158).add(term3160);
        ((ArrayList) term3158).add(term3164);
        ((ArrayList) term3158).add(term3168);
        ((ArrayList) term3158).add(term3172);
        ((ArrayList) term3158).add(term3176);
        ((ArrayList) term3158).add(term3180);
        term3111 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3143 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3111, term3111.getClass(), "id", term3112);
        setField(term3111, term3111.getClass(), "name", "AKNapTAfmD");
        setField(term3111, term3111.getClass(), "description", "xJgPlLxpgC");
        setIntField(term3138, term3138.getClass(), "year", 2017);
        setShortField(term3138, term3138.getClass(), "month", (short) 6);
        setShortField(term3138, term3138.getClass(), "day", (short) 7);
        setField(term3111, term3111.getClass(), "releaseDate", term3138);
        setIntField(term3111, term3111.getClass(), "duration", -73683645);
        setField(term3143, term3143.getClass(), "id", term3144);
        setField(term3143, term3143.getClass(), "name", "EYtfuJaxiM");
        setField(term3111, term3111.getClass(), "mpa", term3143);
        setField(term3111, term3111.getClass(), "genres", term3158);
        setIntField(term3111, term3111.getClass(), "rate", -226514366);
        Integer term3188 = new Integer(1861318859);
        term3187 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3187, term3187.getClass(), "id", term3188);
        setField(term3187, term3187.getClass(), "name", "LWyEaeIyAo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term3187;
        callMethod(klass, "mpa", argTypes, term3111, args);
    }

};


