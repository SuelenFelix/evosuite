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

public class Film_equals_169115865618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5655;
     Object term5723;

    public Film_equals_169115865618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5656 = new Integer(-1656687479);
        Integer term5688 = new Integer(-249614216);
        Integer term5705 = new Integer(1870727665);
        Object term5704 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5704, term5704.getClass(), "id", term5705);
        setField(term5704, term5704.getClass(), "name", "");
        Integer term5709 = new Integer(-519881101);
        Object term5708 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5708, term5708.getClass(), "id", term5709);
        setField(term5708, term5708.getClass(), "name", "");
        Integer term5713 = new Integer(-680920524);
        Object term5712 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5712, term5712.getClass(), "id", term5713);
        setField(term5712, term5712.getClass(), "name", "");
        Integer term5717 = new Integer(-916335264);
        Object term5716 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5716, term5716.getClass(), "id", term5717);
        setField(term5716, term5716.getClass(), "name", "");
        ArrayList term5702 = new ArrayList();
        ((ArrayList) term5702).add(term5704);
        ((ArrayList) term5702).add(term5708);
        ((ArrayList) term5702).add(term5712);
        ((ArrayList) term5702).add(term5716);
        term5655 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5687 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term5655, term5655.getClass(), "id", term5656);
        setField(term5655, term5655.getClass(), "name", "DPskuFUobI");
        setField(term5655, term5655.getClass(), "description", "wBGfLpNNiZ");
        setIntField(term5682, term5682.getClass(), "year", 2026);
        setShortField(term5682, term5682.getClass(), "month", (short) 11);
        setShortField(term5682, term5682.getClass(), "day", (short) 29);
        setField(term5655, term5655.getClass(), "releaseDate", term5682);
        setIntField(term5655, term5655.getClass(), "duration", 1072005683);
        setField(term5687, term5687.getClass(), "id", term5688);
        setField(term5687, term5687.getClass(), "name", "yUGCjlqgJE");
        setField(term5655, term5655.getClass(), "mpa", term5687);
        setField(term5655, term5655.getClass(), "genres", term5702);
        setIntField(term5655, term5655.getClass(), "rate", 1861318859);
        term5723 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5723;
        callMethod(klass, "equals", argTypes, term5655, args);
    }

};


