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

public class GameMusic_setLevel1_26867062320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15839;

    public GameMusic_setLevel1_26867062320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15839 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term15839, term15839.getClass(), "id", 2848819812340321742L);
        setField(term15839, term15839.getClass(), "name", "ceCWHUTQUM");
        setField(term15839, term15839.getClass(), "sortName", "LrqwfrKKtS");
        setField(term15839, term15839.getClass(), "artistName", "ZUdnQXfzCI");
        setField(term15839, term15839.getClass(), "genre", "EULDrUNQvw");
        setIntField(term15839, term15839.getClass(), "bossCardId", -1388471422);
        setIntField(term15839, term15839.getClass(), "bossLevel", -1498296052);
        setField(term15839, term15839.getClass(), "level0", "BtvAvsJSei");
        setField(term15839, term15839.getClass(), "level1", "vqnBkkxoIa");
        setField(term15839, term15839.getClass(), "level2", "bycpZjxXFn");
        setField(term15839, term15839.getClass(), "level3", "jQWttOAiwL");
        setField(term15839, term15839.getClass(), "level4", "DzKFxEuEEC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CAMnvfDLJL";
        callMethod(klass, "setLevel1", argTypes, term15839, args);
    }

};


