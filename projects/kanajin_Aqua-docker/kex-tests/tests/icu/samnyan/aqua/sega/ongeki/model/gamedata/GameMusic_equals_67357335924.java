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

public class GameMusic_equals_67357335924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16735;
     Object term16847;

    public GameMusic_equals_67357335924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16735 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term16735, term16735.getClass(), "id", 5836128569274066678L);
        setField(term16735, term16735.getClass(), "name", "QpYltHAdyY");
        setField(term16735, term16735.getClass(), "sortName", "lbmSGBwIiV");
        setField(term16735, term16735.getClass(), "artistName", "DAxyHoTLzZ");
        setField(term16735, term16735.getClass(), "genre", "fhZgTouhCC");
        setIntField(term16735, term16735.getClass(), "bossCardId", 1283079251);
        setIntField(term16735, term16735.getClass(), "bossLevel", -523949691);
        setField(term16735, term16735.getClass(), "level0", "wrikqJwXvL");
        setField(term16735, term16735.getClass(), "level1", "UiWhvbypdr");
        setField(term16735, term16735.getClass(), "level2", "CgleElJNje");
        setField(term16735, term16735.getClass(), "level3", "ZrchvNGMtd");
        setField(term16735, term16735.getClass(), "level4", "WaEcyVlcIx");
        term16847 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16847;
        callMethod(klass, "equals", argTypes, term16735, args);
    }

};


