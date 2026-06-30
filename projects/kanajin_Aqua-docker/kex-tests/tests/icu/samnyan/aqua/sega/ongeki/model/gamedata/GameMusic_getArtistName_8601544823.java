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

public class GameMusic_getArtistName_8601544823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12289;

    public GameMusic_getArtistName_8601544823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12289 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term12289, term12289.getClass(), "id", -8654565919063661957L);
        setField(term12289, term12289.getClass(), "name", "hulYxtowxw");
        setField(term12289, term12289.getClass(), "sortName", "GNEmuHPNcU");
        setField(term12289, term12289.getClass(), "artistName", "IoSfuKDFRe");
        setField(term12289, term12289.getClass(), "genre", "AWYyZiNfsm");
        setIntField(term12289, term12289.getClass(), "bossCardId", -893623680);
        setIntField(term12289, term12289.getClass(), "bossLevel", -1963434938);
        setField(term12289, term12289.getClass(), "level0", "ITRRYiuDwH");
        setField(term12289, term12289.getClass(), "level1", "llRfwANcVF");
        setField(term12289, term12289.getClass(), "level2", "sUEeHQTWkA");
        setField(term12289, term12289.getClass(), "level3", "BDIRCxAWLA");
        setField(term12289, term12289.getClass(), "level4", "eOJfbiZLnb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtistName", argTypes, term12289, args);
    }

};


