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

public class Film_toString_73171229121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5971;

    public Film_toString_73171229121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5972 = new Integer(-49052672);
        Integer term6004 = new Integer(339372704);
        Integer term6021 = new Integer(-851097944);
        Object term6020 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term6020, term6020.getClass(), "id", term6021);
        setField(term6020, term6020.getClass(), "name", "");
        Integer term6025 = new Integer(803925431);
        Object term6024 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term6024, term6024.getClass(), "id", term6025);
        setField(term6024, term6024.getClass(), "name", "");
        Integer term6029 = new Integer(76929641);
        Object term6028 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term6028, term6028.getClass(), "id", term6029);
        setField(term6028, term6028.getClass(), "name", "");
        Integer term6033 = new Integer(-2003192918);
        Object term6032 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term6032, term6032.getClass(), "id", term6033);
        setField(term6032, term6032.getClass(), "name", "");
        Integer term6037 = new Integer(-1362856620);
        Object term6036 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term6036, term6036.getClass(), "id", term6037);
        setField(term6036, term6036.getClass(), "name", "");
        Integer term6041 = new Integer(-1835839814);
        Object term6040 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term6040, term6040.getClass(), "id", term6041);
        setField(term6040, term6040.getClass(), "name", "");
        Integer term6045 = new Integer(-1404350380);
        Object term6044 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term6044, term6044.getClass(), "id", term6045);
        setField(term6044, term6044.getClass(), "name", "");
        ArrayList term6018 = new ArrayList();
        ((ArrayList) term6018).add(term6020);
        ((ArrayList) term6018).add(term6024);
        ((ArrayList) term6018).add(term6028);
        ((ArrayList) term6018).add(term6032);
        ((ArrayList) term6018).add(term6036);
        ((ArrayList) term6018).add(term6040);
        ((ArrayList) term6018).add(term6044);
        term5971 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6003 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term5971, term5971.getClass(), "id", term5972);
        setField(term5971, term5971.getClass(), "name", "riMtzCoxNj");
        setField(term5971, term5971.getClass(), "description", "YAXkVjQZcV");
        setIntField(term5998, term5998.getClass(), "year", 2021);
        setShortField(term5998, term5998.getClass(), "month", (short) 8);
        setShortField(term5998, term5998.getClass(), "day", (short) 11);
        setField(term5971, term5971.getClass(), "releaseDate", term5998);
        setIntField(term5971, term5971.getClass(), "duration", 1107176718);
        setField(term6003, term6003.getClass(), "id", term6004);
        setField(term6003, term6003.getClass(), "name", "pumvwBWvpy");
        setField(term5971, term5971.getClass(), "mpa", term6003);
        setField(term5971, term5971.getClass(), "genres", term6018);
        setIntField(term5971, term5971.getClass(), "rate", 480137250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5971, args);
    }

};


