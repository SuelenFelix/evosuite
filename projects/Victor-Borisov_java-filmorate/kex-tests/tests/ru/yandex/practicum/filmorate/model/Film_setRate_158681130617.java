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

public class Film_setRate_158681130617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5559;
     Object term5623;

    public Film_setRate_158681130617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5560 = new Integer(2009020256);
        Integer term5592 = new Integer(2049577015);
        Integer term5609 = new Integer(1236004505);
        Object term5608 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5608, term5608.getClass(), "id", term5609);
        setField(term5608, term5608.getClass(), "name", "");
        Integer term5613 = new Integer(1050765721);
        Object term5612 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5612, term5612.getClass(), "id", term5613);
        setField(term5612, term5612.getClass(), "name", "");
        Integer term5617 = new Integer(474518942);
        Object term5616 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5616, term5616.getClass(), "id", term5617);
        setField(term5616, term5616.getClass(), "name", "");
        ArrayList term5606 = new ArrayList();
        ((ArrayList) term5606).add(term5608);
        ((ArrayList) term5606).add(term5612);
        ((ArrayList) term5606).add(term5616);
        term5559 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5591 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term5559, term5559.getClass(), "id", term5560);
        setField(term5559, term5559.getClass(), "name", "vKitydDVnM");
        setField(term5559, term5559.getClass(), "description", "urCiQnUFBM");
        setIntField(term5586, term5586.getClass(), "year", 2028);
        setShortField(term5586, term5586.getClass(), "month", (short) 9);
        setShortField(term5586, term5586.getClass(), "day", (short) 30);
        setField(term5559, term5559.getClass(), "releaseDate", term5586);
        setIntField(term5559, term5559.getClass(), "duration", 906181092);
        setField(term5591, term5591.getClass(), "id", term5592);
        setField(term5591, term5591.getClass(), "name", "EKjQdtKxAM");
        setField(term5559, term5559.getClass(), "mpa", term5591);
        setField(term5559, term5559.getClass(), "genres", term5606);
        setIntField(term5559, term5559.getClass(), "rate", 1045657203);
        term5623 = new Integer(1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5623;
        callMethod(klass, "setRate", argTypes, term5559, args);
    }

};


