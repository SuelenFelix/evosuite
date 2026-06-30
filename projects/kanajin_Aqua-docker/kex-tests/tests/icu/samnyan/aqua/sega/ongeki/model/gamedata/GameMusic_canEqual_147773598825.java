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

public class GameMusic_canEqual_147773598825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16938;
     Object term17050;

    public GameMusic_canEqual_147773598825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16938 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term16938, term16938.getClass(), "id", -2177368829816872572L);
        setField(term16938, term16938.getClass(), "name", "ONcbPCQnHd");
        setField(term16938, term16938.getClass(), "sortName", "AobDaplFLl");
        setField(term16938, term16938.getClass(), "artistName", "pDkMNnAGgv");
        setField(term16938, term16938.getClass(), "genre", "PaCpFXGzdX");
        setIntField(term16938, term16938.getClass(), "bossCardId", 1398204340);
        setIntField(term16938, term16938.getClass(), "bossLevel", 229204365);
        setField(term16938, term16938.getClass(), "level0", "FftYCNbnks");
        setField(term16938, term16938.getClass(), "level1", "lJoltmsadS");
        setField(term16938, term16938.getClass(), "level2", "mvfDtZNEHr");
        setField(term16938, term16938.getClass(), "level3", "bvSgmFUDOU");
        setField(term16938, term16938.getClass(), "level4", "XMHwbfiHRl");
        term17050 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17050;
        callMethod(klass, "canEqual", argTypes, term16938, args);
    }

};


