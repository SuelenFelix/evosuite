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

public class Film_setId_137833375510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4777;
     Object term4853;

    public Film_setId_137833375510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4778 = new Integer(1684998508);
        Integer term4810 = new Integer(-1476644457);
        Integer term4827 = new Integer(1270666529);
        Object term4826 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4826, term4826.getClass(), "id", term4827);
        setField(term4826, term4826.getClass(), "name", "");
        Integer term4831 = new Integer(-1146679443);
        Object term4830 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4830, term4830.getClass(), "id", term4831);
        setField(term4830, term4830.getClass(), "name", "");
        Integer term4835 = new Integer(-860131894);
        Object term4834 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4834, term4834.getClass(), "id", term4835);
        setField(term4834, term4834.getClass(), "name", "");
        Integer term4839 = new Integer(-1022990421);
        Object term4838 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4838, term4838.getClass(), "id", term4839);
        setField(term4838, term4838.getClass(), "name", "");
        Integer term4843 = new Integer(1045547089);
        Object term4842 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4842, term4842.getClass(), "id", term4843);
        setField(term4842, term4842.getClass(), "name", "");
        Integer term4847 = new Integer(-1122880881);
        Object term4846 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4846, term4846.getClass(), "id", term4847);
        setField(term4846, term4846.getClass(), "name", "");
        ArrayList term4824 = new ArrayList();
        ((ArrayList) term4824).add(term4826);
        ((ArrayList) term4824).add(term4830);
        ((ArrayList) term4824).add(term4834);
        ((ArrayList) term4824).add(term4838);
        ((ArrayList) term4824).add(term4842);
        ((ArrayList) term4824).add(term4846);
        term4777 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4809 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4777, term4777.getClass(), "id", term4778);
        setField(term4777, term4777.getClass(), "name", "OcJCIDNIXA");
        setField(term4777, term4777.getClass(), "description", "XfRABIFVEp");
        setIntField(term4804, term4804.getClass(), "year", 2015);
        setShortField(term4804, term4804.getClass(), "month", (short) 3);
        setShortField(term4804, term4804.getClass(), "day", (short) 10);
        setField(term4777, term4777.getClass(), "releaseDate", term4804);
        setIntField(term4777, term4777.getClass(), "duration", 1596213415);
        setField(term4809, term4809.getClass(), "id", term4810);
        setField(term4809, term4809.getClass(), "name", "MHGKyEnwKc");
        setField(term4777, term4777.getClass(), "mpa", term4809);
        setField(term4777, term4777.getClass(), "genres", term4824);
        setIntField(term4777, term4777.getClass(), "rate", -268815336);
        term4853 = new Integer(-542712742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4853;
        callMethod(klass, "setId", argTypes, term4777, args);
    }

};


