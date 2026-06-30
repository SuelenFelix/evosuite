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

public class GameMusic_getBossCardId_10489028635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12693;

    public GameMusic_getBossCardId_10489028635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12693 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term12693, term12693.getClass(), "id", -6723783499250797216L);
        setField(term12693, term12693.getClass(), "name", "dtGZCsKXbW");
        setField(term12693, term12693.getClass(), "sortName", "bdyhHbDAmJ");
        setField(term12693, term12693.getClass(), "artistName", "BBXiTNHqGE");
        setField(term12693, term12693.getClass(), "genre", "IEYhJmgCVd");
        setIntField(term12693, term12693.getClass(), "bossCardId", 1386130016);
        setIntField(term12693, term12693.getClass(), "bossLevel", 1072005683);
        setField(term12693, term12693.getClass(), "level0", "KSJeYkkvpk");
        setField(term12693, term12693.getClass(), "level1", "qUtkFGMNUV");
        setField(term12693, term12693.getClass(), "level2", "mGRiYhnMcR");
        setField(term12693, term12693.getClass(), "level3", "NFlvfJCVPO");
        setField(term12693, term12693.getClass(), "level4", "KarbTXFmUU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBossCardId", argTypes, term12693, args);
    }

};


