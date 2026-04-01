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

public class Film_hashCode_124247198120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5873;

    public Film_hashCode_124247198120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5874 = new Integer(1768204942);
        Integer term5906 = new Integer(1252951645);
        Integer term5923 = new Integer(574481092);
        Object term5922 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5922, term5922.getClass(), "id", term5923);
        setField(term5922, term5922.getClass(), "name", "");
        Integer term5927 = new Integer(-310528004);
        Object term5926 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5926, term5926.getClass(), "id", term5927);
        setField(term5926, term5926.getClass(), "name", "");
        Integer term5931 = new Integer(-634976996);
        Object term5930 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5930, term5930.getClass(), "id", term5931);
        setField(term5930, term5930.getClass(), "name", "");
        Integer term5935 = new Integer(-1015274146);
        Object term5934 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5934, term5934.getClass(), "id", term5935);
        setField(term5934, term5934.getClass(), "name", "");
        ArrayList term5920 = new ArrayList();
        ((ArrayList) term5920).add(term5922);
        ((ArrayList) term5920).add(term5926);
        ((ArrayList) term5920).add(term5930);
        ((ArrayList) term5920).add(term5934);
        term5873 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5905 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term5873, term5873.getClass(), "id", term5874);
        setField(term5873, term5873.getClass(), "name", "zNFLXMifnS");
        setField(term5873, term5873.getClass(), "description", "HHQcYMSBVc");
        setIntField(term5900, term5900.getClass(), "year", 2028);
        setShortField(term5900, term5900.getClass(), "month", (short) 5);
        setShortField(term5900, term5900.getClass(), "day", (short) 29);
        setField(term5873, term5873.getClass(), "releaseDate", term5900);
        setIntField(term5873, term5873.getClass(), "duration", 53410913);
        setField(term5905, term5905.getClass(), "id", term5906);
        setField(term5905, term5905.getClass(), "name", "wdoqITnaAP");
        setField(term5873, term5873.getClass(), "mpa", term5905);
        setField(term5873, term5873.getClass(), "genres", term5920);
        setIntField(term5873, term5873.getClass(), "rate", -375014958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5873, args);
    }

};


