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

public class GameMusic_getId_531473420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11683;

    public GameMusic_getId_531473420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11683 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term11683, term11683.getClass(), "id", 414749984815662075L);
        setField(term11683, term11683.getClass(), "name", "VVNNlAePXF");
        setField(term11683, term11683.getClass(), "sortName", "jnwVnmKAFv");
        setField(term11683, term11683.getClass(), "artistName", "TXyHhqeCjR");
        setField(term11683, term11683.getClass(), "genre", "lZIgPZPgTu");
        setIntField(term11683, term11683.getClass(), "bossCardId", -341962980);
        setIntField(term11683, term11683.getClass(), "bossLevel", 1532716628);
        setField(term11683, term11683.getClass(), "level0", "iuCxnHGMoW");
        setField(term11683, term11683.getClass(), "level1", "GPSEWEDSTo");
        setField(term11683, term11683.getClass(), "level2", "RCOqfVsRHt");
        setField(term11683, term11683.getClass(), "level3", "TSyCeEZPaT");
        setField(term11683, term11683.getClass(), "level4", "JeZFtaqkzW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term11683, args);
    }

};


