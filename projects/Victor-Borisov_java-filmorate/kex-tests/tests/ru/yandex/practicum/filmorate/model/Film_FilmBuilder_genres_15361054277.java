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
import java.util.LinkedList;

public class Film_FilmBuilder_genres_15361054277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3743;
     Object term3823;

    public Film_FilmBuilder_genres_15361054277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3744 = new Integer(1830648570);
        Integer term3776 = new Integer(-227365013);
        Integer term3793 = new Integer(11724947);
        Object term3792 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3792, term3792.getClass(), "id", term3793);
        setField(term3792, term3792.getClass(), "name", "");
        Integer term3797 = new Integer(1953277050);
        Object term3796 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3796, term3796.getClass(), "id", term3797);
        setField(term3796, term3796.getClass(), "name", "");
        Integer term3801 = new Integer(1283079251);
        Object term3800 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3800, term3800.getClass(), "id", term3801);
        setField(term3800, term3800.getClass(), "name", "");
        Integer term3805 = new Integer(-523949691);
        Object term3804 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3804, term3804.getClass(), "id", term3805);
        setField(term3804, term3804.getClass(), "name", "");
        Integer term3809 = new Integer(1398204340);
        Object term3808 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3808, term3808.getClass(), "id", term3809);
        setField(term3808, term3808.getClass(), "name", "");
        Integer term3813 = new Integer(229204365);
        Object term3812 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3812, term3812.getClass(), "id", term3813);
        setField(term3812, term3812.getClass(), "name", "");
        Integer term3817 = new Integer(-461771056);
        Object term3816 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3816, term3816.getClass(), "id", term3817);
        setField(term3816, term3816.getClass(), "name", "");
        ArrayList term3790 = new ArrayList();
        ((ArrayList) term3790).add(term3792);
        ((ArrayList) term3790).add(term3796);
        ((ArrayList) term3790).add(term3800);
        ((ArrayList) term3790).add(term3804);
        ((ArrayList) term3790).add(term3808);
        ((ArrayList) term3790).add(term3812);
        ((ArrayList) term3790).add(term3816);
        term3743 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3770 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3775 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3743, term3743.getClass(), "id", term3744);
        setField(term3743, term3743.getClass(), "name", "WzFopsaDuG");
        setField(term3743, term3743.getClass(), "description", "PapWxkhEWe");
        setIntField(term3770, term3770.getClass(), "year", 2017);
        setShortField(term3770, term3770.getClass(), "month", (short) 3);
        setShortField(term3770, term3770.getClass(), "day", (short) 5);
        setField(term3743, term3743.getClass(), "releaseDate", term3770);
        setIntField(term3743, term3743.getClass(), "duration", 679763016);
        setField(term3775, term3775.getClass(), "id", term3776);
        setField(term3775, term3775.getClass(), "name", "smnHEqRFRx");
        setField(term3743, term3743.getClass(), "mpa", term3775);
        setField(term3743, term3743.getClass(), "genres", term3790);
        setIntField(term3743, term3743.getClass(), "rate", 1962444399);
        Integer term3827 = new Integer(-243422082);
        Object term3826 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3826, term3826.getClass(), "id", term3827);
        setField(term3826, term3826.getClass(), "name", "xtftXXMbem");
        Integer term3843 = new Integer(1384592638);
        Object term3842 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3842, term3842.getClass(), "id", term3843);
        setField(term3842, term3842.getClass(), "name", "");
        Integer term3848 = new Integer(-1002370457);
        Object term3847 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3847, term3847.getClass(), "id", term3848);
        setField(term3847, term3847.getClass(), "name", null);
        term3823 = new LinkedList();
        ((LinkedList) term3823).add(term3826);
        ((LinkedList) term3823).add(term3842);
        ((LinkedList) term3823).add(term3847);
        ((LinkedList) term3823).add((Object)null);
        ((LinkedList) term3823).add((Object)null);
        ((LinkedList) term3823).add((Object)null);
        ((LinkedList) term3823).add((Object)null);
        ((LinkedList) term3823).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3823;
        callMethod(klass, "genres", argTypes, term3743, args);
    }

};


