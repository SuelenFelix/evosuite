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

public class GameMusic_hashCode_22488668456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17859;

    public GameMusic_hashCode_22488668456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17859 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term17859, term17859.getClass(), "id", 0L);
        setField(term17859, term17859.getClass(), "name", null);
        setField(term17859, term17859.getClass(), "sortName", null);
        setField(term17859, term17859.getClass(), "artistName", null);
        setField(term17859, term17859.getClass(), "genre", null);
        setIntField(term17859, term17859.getClass(), "bossCardId", 0);
        setIntField(term17859, term17859.getClass(), "bossLevel", 0);
        setField(term17859, term17859.getClass(), "level0", null);
        setField(term17859, term17859.getClass(), "level1", null);
        setField(term17859, term17859.getClass(), "level2", null);
        setField(term17859, term17859.getClass(), "level3", null);
        setField(term17859, term17859.getClass(), "level4", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term17859, args);
    }

};


