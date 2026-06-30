package icu.samnyan.aqua.api.controller.sega.game.ongeki;

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
import static icu.samnyan.aqua.api.controller.sega.game.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class ApiOngekiGameDataController_getMusicList_21265354208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446;

    public ApiOngekiGameDataController_getMusicList_21265354208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term449 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term449, term449.getClass(), "id", -4325723315152823407L);
        setField(term449, term449.getClass(), "name", "MLqYREekMl");
        setField(term449, term449.getClass(), "sortName", "ytSBIKXogI");
        setField(term449, term449.getClass(), "artistName", "nHXjMycHlU");
        setField(term449, term449.getClass(), "genre", "ieCtQFdkii");
        setIntField(term449, term449.getClass(), "bossCardId", -6029667);
        setIntField(term449, term449.getClass(), "bossLevel", -2068769794);
        setField(term449, term449.getClass(), "level0", "dEnhdmILtU");
        setField(term449, term449.getClass(), "level1", "hoicvmsovO");
        setField(term449, term449.getClass(), "level2", "eqJfYWRaEL");
        setField(term449, term449.getClass(), "level3", "fhkbdRViHi");
        setField(term449, term449.getClass(), "level4", "uWHnvSvaPl");
        term446 = new LinkedList();
        ((LinkedList) term446).add(term449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.controller.sega.game.ongeki.ApiOngekiGameDataController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term446;
        callMethod(klass, "getMusicList", argTypes, null, args);
    }

};


