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
import java.lang.Long;

public class GameMusic_setId_201059045242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17797;
     Object term17801;

    public GameMusic_setId_201059045242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17797 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term17797, term17797.getClass(), "id", 0L);
        setField(term17797, term17797.getClass(), "name", null);
        setField(term17797, term17797.getClass(), "sortName", null);
        setField(term17797, term17797.getClass(), "artistName", null);
        setField(term17797, term17797.getClass(), "genre", null);
        setIntField(term17797, term17797.getClass(), "bossCardId", 0);
        setIntField(term17797, term17797.getClass(), "bossLevel", 0);
        setField(term17797, term17797.getClass(), "level0", null);
        setField(term17797, term17797.getClass(), "level1", null);
        setField(term17797, term17797.getClass(), "level2", null);
        setField(term17797, term17797.getClass(), "level3", null);
        setField(term17797, term17797.getClass(), "level4", null);
        term17801 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term17801;
        callMethod(klass, "setId", argTypes, term17797, args);
    }

};


