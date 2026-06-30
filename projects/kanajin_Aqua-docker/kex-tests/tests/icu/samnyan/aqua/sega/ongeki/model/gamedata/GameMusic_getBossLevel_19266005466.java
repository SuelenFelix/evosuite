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

public class GameMusic_getBossLevel_19266005466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12895;

    public GameMusic_getBossLevel_19266005466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12895 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term12895, term12895.getClass(), "id", 41775768178052008L);
        setField(term12895, term12895.getClass(), "name", "jiUSjqwSIQ");
        setField(term12895, term12895.getClass(), "sortName", "MgLCedQfoj");
        setField(term12895, term12895.getClass(), "artistName", "zgKiINdgNu");
        setField(term12895, term12895.getClass(), "genre", "zLMTXDQHYH");
        setIntField(term12895, term12895.getClass(), "bossCardId", 1861318859);
        setIntField(term12895, term12895.getClass(), "bossLevel", 1474524152);
        setField(term12895, term12895.getClass(), "level0", "PqywFWJlpE");
        setField(term12895, term12895.getClass(), "level1", "OzXRsFGTIp");
        setField(term12895, term12895.getClass(), "level2", "TjWpyghUWN");
        setField(term12895, term12895.getClass(), "level3", "dkZFDZxcde");
        setField(term12895, term12895.getClass(), "level4", "WXcZEtUKlI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBossLevel", argTypes, term12895, args);
    }

};


