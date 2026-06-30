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

public class GameMusic_hashCode_22488668426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17141;

    public GameMusic_hashCode_22488668426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17141 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term17141, term17141.getClass(), "id", -8463029266761149071L);
        setField(term17141, term17141.getClass(), "name", "bucTnYicnp");
        setField(term17141, term17141.getClass(), "sortName", "EkgprvqZlM");
        setField(term17141, term17141.getClass(), "artistName", "fbnKvthhOz");
        setField(term17141, term17141.getClass(), "genre", "PGfCDJTBek");
        setIntField(term17141, term17141.getClass(), "bossCardId", -461771056);
        setIntField(term17141, term17141.getClass(), "bossLevel", -243422082);
        setField(term17141, term17141.getClass(), "level0", "ZwjARhAtHC");
        setField(term17141, term17141.getClass(), "level1", "XXvscsYBWv");
        setField(term17141, term17141.getClass(), "level2", "uePedtiAfL");
        setField(term17141, term17141.getClass(), "level3", "AdSHvysxQB");
        setField(term17141, term17141.getClass(), "level4", "jlraKkBWFA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term17141, args);
    }

};


