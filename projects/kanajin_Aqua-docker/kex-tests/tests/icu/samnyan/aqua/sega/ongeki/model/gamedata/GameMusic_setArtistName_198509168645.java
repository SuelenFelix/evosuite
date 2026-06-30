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

public class GameMusic_setArtistName_198509168645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17811;

    public GameMusic_setArtistName_198509168645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17811 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term17811, term17811.getClass(), "id", 0L);
        setField(term17811, term17811.getClass(), "name", null);
        setField(term17811, term17811.getClass(), "sortName", null);
        setField(term17811, term17811.getClass(), "artistName", null);
        setField(term17811, term17811.getClass(), "genre", null);
        setIntField(term17811, term17811.getClass(), "bossCardId", 0);
        setIntField(term17811, term17811.getClass(), "bossLevel", 0);
        setField(term17811, term17811.getClass(), "level0", null);
        setField(term17811, term17811.getClass(), "level1", null);
        setField(term17811, term17811.getClass(), "level2", null);
        setField(term17811, term17811.getClass(), "level3", null);
        setField(term17811, term17811.getClass(), "level4", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setArtistName", argTypes, term17811, args);
    }

};


