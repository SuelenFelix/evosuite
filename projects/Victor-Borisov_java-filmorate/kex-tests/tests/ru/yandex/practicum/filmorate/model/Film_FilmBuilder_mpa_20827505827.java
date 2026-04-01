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

public class Film_FilmBuilder_mpa_20827505827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116;
     Object term3192;

    public Film_FilmBuilder_mpa_20827505827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3117 = new Integer(890669485);
        Integer term3149 = new Integer(691577392);
        Integer term3166 = new Integer(-893623680);
        Object term3165 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3165, term3165.getClass(), "id", term3166);
        setField(term3165, term3165.getClass(), "name", "");
        Integer term3170 = new Integer(-1963434938);
        Object term3169 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3169, term3169.getClass(), "id", term3170);
        setField(term3169, term3169.getClass(), "name", "");
        Integer term3174 = new Integer(906181092);
        Object term3173 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3173, term3173.getClass(), "id", term3174);
        setField(term3173, term3173.getClass(), "name", "");
        Integer term3178 = new Integer(1045657203);
        Object term3177 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3177, term3177.getClass(), "id", term3178);
        setField(term3177, term3177.getClass(), "name", "");
        Integer term3182 = new Integer(1386130016);
        Object term3181 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3181, term3181.getClass(), "id", term3182);
        setField(term3181, term3181.getClass(), "name", "");
        Integer term3186 = new Integer(1072005683);
        Object term3185 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3185, term3185.getClass(), "id", term3186);
        setField(term3185, term3185.getClass(), "name", "");
        ArrayList term3163 = new ArrayList();
        ((ArrayList) term3163).add(term3165);
        ((ArrayList) term3163).add(term3169);
        ((ArrayList) term3163).add(term3173);
        ((ArrayList) term3163).add(term3177);
        ((ArrayList) term3163).add(term3181);
        ((ArrayList) term3163).add(term3185);
        term3116 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3148 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3116, term3116.getClass(), "id", term3117);
        setField(term3116, term3116.getClass(), "name", "AKNapTAfmD");
        setField(term3116, term3116.getClass(), "description", "xJgPlLxpgC");
        setIntField(term3143, term3143.getClass(), "year", 2017);
        setShortField(term3143, term3143.getClass(), "month", (short) 6);
        setShortField(term3143, term3143.getClass(), "day", (short) 7);
        setField(term3116, term3116.getClass(), "releaseDate", term3143);
        setIntField(term3116, term3116.getClass(), "duration", -73683645);
        setField(term3148, term3148.getClass(), "id", term3149);
        setField(term3148, term3148.getClass(), "name", "EYtfuJaxiM");
        setField(term3116, term3116.getClass(), "mpa", term3148);
        setField(term3116, term3116.getClass(), "genres", term3163);
        setIntField(term3116, term3116.getClass(), "rate", -226514366);
        Integer term3193 = new Integer(1861318859);
        term3192 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3192, term3192.getClass(), "id", term3193);
        setField(term3192, term3192.getClass(), "name", "LWyEaeIyAo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term3192;
        callMethod(klass, "mpa", argTypes, term3116, args);
    }

};


