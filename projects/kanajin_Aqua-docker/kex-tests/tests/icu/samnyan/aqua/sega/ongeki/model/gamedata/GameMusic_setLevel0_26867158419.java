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

public class GameMusic_setLevel0_26867158419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15615;

    public GameMusic_setLevel0_26867158419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15615 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term15615, term15615.getClass(), "id", 4474998035090263139L);
        setField(term15615, term15615.getClass(), "name", "GLbyDfbNZI");
        setField(term15615, term15615.getClass(), "sortName", "oNLcCYDAsO");
        setField(term15615, term15615.getClass(), "artistName", "CNqMxLvtcJ");
        setField(term15615, term15615.getClass(), "genre", "ktbqerIaKW");
        setIntField(term15615, term15615.getClass(), "bossCardId", -1697741339);
        setIntField(term15615, term15615.getClass(), "bossLevel", 98922530);
        setField(term15615, term15615.getClass(), "level0", "VoghngXfsK");
        setField(term15615, term15615.getClass(), "level1", "GbahCBMvct");
        setField(term15615, term15615.getClass(), "level2", "iiHBhsNFgk");
        setField(term15615, term15615.getClass(), "level3", "HknsTajwxJ");
        setField(term15615, term15615.getClass(), "level4", "XtiurrVYKw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rsumfoDNHa";
        callMethod(klass, "setLevel0", argTypes, term15615, args);
    }

};


