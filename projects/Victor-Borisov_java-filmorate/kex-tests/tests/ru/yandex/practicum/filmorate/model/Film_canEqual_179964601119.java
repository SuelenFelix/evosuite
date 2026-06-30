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

public class Film_canEqual_179964601119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5754;
     Object term5842;

    public Film_canEqual_179964601119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5755 = new Integer(-919416536);
        Integer term5787 = new Integer(-43417861);
        Integer term5804 = new Integer(-1533843432);
        Object term5803 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5803, term5803.getClass(), "id", term5804);
        setField(term5803, term5803.getClass(), "name", "");
        Integer term5808 = new Integer(-123338791);
        Object term5807 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5807, term5807.getClass(), "id", term5808);
        setField(term5807, term5807.getClass(), "name", "");
        Integer term5812 = new Integer(-1467089634);
        Object term5811 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5811, term5811.getClass(), "id", term5812);
        setField(term5811, term5811.getClass(), "name", "");
        Integer term5816 = new Integer(413548937);
        Object term5815 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5815, term5815.getClass(), "id", term5816);
        setField(term5815, term5815.getClass(), "name", "");
        Integer term5820 = new Integer(1901317214);
        Object term5819 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5819, term5819.getClass(), "id", term5820);
        setField(term5819, term5819.getClass(), "name", "");
        Integer term5824 = new Integer(1166710220);
        Object term5823 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5823, term5823.getClass(), "id", term5824);
        setField(term5823, term5823.getClass(), "name", "");
        Integer term5828 = new Integer(-1070592289);
        Object term5827 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5827, term5827.getClass(), "id", term5828);
        setField(term5827, term5827.getClass(), "name", "");
        Integer term5832 = new Integer(-1464172784);
        Object term5831 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5831, term5831.getClass(), "id", term5832);
        setField(term5831, term5831.getClass(), "name", "");
        Integer term5836 = new Integer(32185364);
        Object term5835 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5835, term5835.getClass(), "id", term5836);
        setField(term5835, term5835.getClass(), "name", "");
        ArrayList term5801 = new ArrayList();
        ((ArrayList) term5801).add(term5803);
        ((ArrayList) term5801).add(term5807);
        ((ArrayList) term5801).add(term5811);
        ((ArrayList) term5801).add(term5815);
        ((ArrayList) term5801).add(term5819);
        ((ArrayList) term5801).add(term5823);
        ((ArrayList) term5801).add(term5827);
        ((ArrayList) term5801).add(term5831);
        ((ArrayList) term5801).add(term5835);
        term5754 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5781 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5786 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term5754, term5754.getClass(), "id", term5755);
        setField(term5754, term5754.getClass(), "name", "DzHVBMqWtE");
        setField(term5754, term5754.getClass(), "description", "THZSpzBRYP");
        setIntField(term5781, term5781.getClass(), "year", 2027);
        setShortField(term5781, term5781.getClass(), "month", (short) 2);
        setShortField(term5781, term5781.getClass(), "day", (short) 18);
        setField(term5754, term5754.getClass(), "releaseDate", term5781);
        setIntField(term5754, term5754.getClass(), "duration", 1474524152);
        setField(term5786, term5786.getClass(), "id", term5787);
        setField(term5786, term5786.getClass(), "name", "ZfBIVGBQOE");
        setField(term5754, term5754.getClass(), "mpa", term5786);
        setField(term5754, term5754.getClass(), "genres", term5801);
        setIntField(term5754, term5754.getClass(), "rate", 568954359);
        term5842 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5842;
        callMethod(klass, "canEqual", argTypes, term5754, args);
    }

};


