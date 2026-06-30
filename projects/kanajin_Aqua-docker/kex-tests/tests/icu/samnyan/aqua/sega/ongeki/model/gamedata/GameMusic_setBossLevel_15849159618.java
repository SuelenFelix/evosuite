package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameMusic_setBossLevel_15849159618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15411;
     Object term15523;

    public GameMusic_setBossLevel_15849159618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15411 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term15411, term15411.getClass(), "id", 2701184207686293431L);
        setField(term15411, term15411.getClass(), "name", "GeddnXjHGy");
        setField(term15411, term15411.getClass(), "sortName", "vLTbaoAxBm");
        setField(term15411, term15411.getClass(), "artistName", "BXTjEyEZxD");
        setField(term15411, term15411.getClass(), "genre", "oKhVzOKUFW");
        setIntField(term15411, term15411.getClass(), "bossCardId", 202001407);
        setIntField(term15411, term15411.getClass(), "bossLevel", 158873461);
        setField(term15411, term15411.getClass(), "level0", "mNHyqmOAFy");
        setField(term15411, term15411.getClass(), "level1", "UxgSdhxPCH");
        setField(term15411, term15411.getClass(), "level2", "DAujxZPHJC");
        setField(term15411, term15411.getClass(), "level3", "IlBhdrCvHq");
        setField(term15411, term15411.getClass(), "level4", "OirVUQhauU");
        term15523 = new Integer(-430151637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15523;
        callMethod(klass, "setBossLevel", argTypes, term15411, args);
    }

};


