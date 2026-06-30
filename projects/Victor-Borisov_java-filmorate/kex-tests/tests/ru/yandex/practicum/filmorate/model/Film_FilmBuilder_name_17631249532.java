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

public class Film_FilmBuilder_name_17631249532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2685;

    public Film_FilmBuilder_name_17631249532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2686 = new Integer(941650513);
        Integer term2718 = new Integer(444029505);
        Integer term2735 = new Integer(-1034506028);
        Object term2734 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2734, term2734.getClass(), "id", term2735);
        setField(term2734, term2734.getClass(), "name", "");
        Integer term2739 = new Integer(-1263114719);
        Object term2738 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2738, term2738.getClass(), "id", term2739);
        setField(term2738, term2738.getClass(), "name", "");
        Integer term2743 = new Integer(-894662986);
        Object term2742 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2742, term2742.getClass(), "id", term2743);
        setField(term2742, term2742.getClass(), "name", "");
        Integer term2747 = new Integer(304775596);
        Object term2746 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2746, term2746.getClass(), "id", term2747);
        setField(term2746, term2746.getClass(), "name", "");
        ArrayList term2732 = new ArrayList();
        ((ArrayList) term2732).add(term2734);
        ((ArrayList) term2732).add(term2738);
        ((ArrayList) term2732).add(term2742);
        ((ArrayList) term2732).add(term2746);
        term2685 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2717 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2685, term2685.getClass(), "id", term2686);
        setField(term2685, term2685.getClass(), "name", "qxSDVejjiY");
        setField(term2685, term2685.getClass(), "description", "xBsXSDjXYK");
        setIntField(term2712, term2712.getClass(), "year", 2017);
        setShortField(term2712, term2712.getClass(), "month", (short) 8);
        setShortField(term2712, term2712.getClass(), "day", (short) 7);
        setField(term2685, term2685.getClass(), "releaseDate", term2712);
        setIntField(term2685, term2685.getClass(), "duration", -117576464);
        setField(term2717, term2717.getClass(), "id", term2718);
        setField(term2717, term2717.getClass(), "name", "sEnIVFtZuQ");
        setField(term2685, term2685.getClass(), "mpa", term2717);
        setField(term2685, term2685.getClass(), "genres", term2732);
        setIntField(term2685, term2685.getClass(), "rate", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        callMethod(klass, "name", argTypes, term2685, args);
    }

};


