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

public class Film_setReleaseDate_149277904913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5105;
     Object term5193;

    public Film_setReleaseDate_149277904913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5106 = new Integer(1959097203);
        Integer term5138 = new Integer(-209654048);
        Integer term5155 = new Integer(477625804);
        Object term5154 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5154, term5154.getClass(), "id", term5155);
        setField(term5154, term5154.getClass(), "name", "");
        Integer term5159 = new Integer(252575029);
        Object term5158 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5158, term5158.getClass(), "id", term5159);
        setField(term5158, term5158.getClass(), "name", "");
        Integer term5163 = new Integer(57189932);
        Object term5162 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5162, term5162.getClass(), "id", term5163);
        setField(term5162, term5162.getClass(), "name", "");
        Integer term5167 = new Integer(1460722225);
        Object term5166 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5166, term5166.getClass(), "id", term5167);
        setField(term5166, term5166.getClass(), "name", "");
        Integer term5171 = new Integer(1743224434);
        Object term5170 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5170, term5170.getClass(), "id", term5171);
        setField(term5170, term5170.getClass(), "name", "");
        Integer term5175 = new Integer(842904495);
        Object term5174 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5174, term5174.getClass(), "id", term5175);
        setField(term5174, term5174.getClass(), "name", "");
        Integer term5179 = new Integer(1008080511);
        Object term5178 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5178, term5178.getClass(), "id", term5179);
        setField(term5178, term5178.getClass(), "name", "");
        Integer term5183 = new Integer(1935707624);
        Object term5182 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5182, term5182.getClass(), "id", term5183);
        setField(term5182, term5182.getClass(), "name", "");
        Integer term5187 = new Integer(1507074215);
        Object term5186 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5186, term5186.getClass(), "id", term5187);
        setField(term5186, term5186.getClass(), "name", "");
        ArrayList term5152 = new ArrayList();
        ((ArrayList) term5152).add(term5154);
        ((ArrayList) term5152).add(term5158);
        ((ArrayList) term5152).add(term5162);
        ((ArrayList) term5152).add(term5166);
        ((ArrayList) term5152).add(term5170);
        ((ArrayList) term5152).add(term5174);
        ((ArrayList) term5152).add(term5178);
        ((ArrayList) term5152).add(term5182);
        ((ArrayList) term5152).add(term5186);
        term5105 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5137 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term5105, term5105.getClass(), "id", term5106);
        setField(term5105, term5105.getClass(), "name", "WZzvmIHhzZ");
        setField(term5105, term5105.getClass(), "description", "doQLHkjpNm");
        setIntField(term5132, term5132.getClass(), "year", 2014);
        setShortField(term5132, term5132.getClass(), "month", (short) 5);
        setShortField(term5132, term5132.getClass(), "day", (short) 21);
        setField(term5105, term5105.getClass(), "releaseDate", term5132);
        setIntField(term5105, term5105.getClass(), "duration", -1476117762);
        setField(term5137, term5137.getClass(), "id", term5138);
        setField(term5137, term5137.getClass(), "name", "lCyLIcSuom");
        setField(term5105, term5105.getClass(), "mpa", term5137);
        setField(term5105, term5105.getClass(), "genres", term5152);
        setIntField(term5105, term5105.getClass(), "rate", -341962980);
        term5193 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term5193, term5193.getClass(), "year", 2025);
        setShortField(term5193, term5193.getClass(), "month", (short) 3);
        setShortField(term5193, term5193.getClass(), "day", (short) 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term5193;
        callMethod(klass, "setReleaseDate", argTypes, term5105, args);
    }

};


