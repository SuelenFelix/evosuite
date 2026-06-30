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
import java.lang.Integer;

public class GameMusic_setBossLevel_15849159648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17825;
     Object term17829;

    public GameMusic_setBossLevel_15849159648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17825 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term17825, term17825.getClass(), "id", 0L);
        setField(term17825, term17825.getClass(), "name", null);
        setField(term17825, term17825.getClass(), "sortName", null);
        setField(term17825, term17825.getClass(), "artistName", null);
        setField(term17825, term17825.getClass(), "genre", null);
        setIntField(term17825, term17825.getClass(), "bossCardId", 0);
        setIntField(term17825, term17825.getClass(), "bossLevel", 0);
        setField(term17825, term17825.getClass(), "level0", null);
        setField(term17825, term17825.getClass(), "level1", null);
        setField(term17825, term17825.getClass(), "level2", null);
        setField(term17825, term17825.getClass(), "level3", null);
        setField(term17825, term17825.getClass(), "level4", null);
        term17829 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17829;
        callMethod(klass, "setBossLevel", argTypes, term17825, args);
    }

};


