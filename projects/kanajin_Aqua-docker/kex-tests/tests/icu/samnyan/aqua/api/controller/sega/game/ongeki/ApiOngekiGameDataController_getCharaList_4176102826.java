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

public class ApiOngekiGameDataController_getCharaList_4176102826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344;

    public ApiOngekiGameDataController_getCharaList_4176102826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term347 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameChara"));
        setLongField(term347, term347.getClass(), "id", 7411271909051562686L);
        setField(term347, term347.getClass(), "name", "GzFkzHGYFt");
        setField(term347, term347.getClass(), "cv", "tShwQLRGNe");
        setIntField(term347, term347.getClass(), "modelId", 597278769);
        Object term375 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameChara"));
        setLongField(term375, term375.getClass(), "id", 4872422362414183754L);
        setField(term375, term375.getClass(), "name", "");
        setField(term375, term375.getClass(), "cv", "");
        setIntField(term375, term375.getClass(), "modelId", -1685132342);
        Object term381 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameChara"));
        setLongField(term381, term381.getClass(), "id", 6811161968424632369L);
        setField(term381, term381.getClass(), "name", null);
        setField(term381, term381.getClass(), "cv", null);
        setIntField(term381, term381.getClass(), "modelId", -1456670397);
        term344 = new LinkedList();
        ((LinkedList) term344).add(term347);
        ((LinkedList) term344).add(term375);
        ((LinkedList) term344).add(term381);
        ((LinkedList) term344).add((Object)null);
        ((LinkedList) term344).add((Object)null);
        ((LinkedList) term344).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.controller.sega.game.ongeki.ApiOngekiGameDataController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term344;
        callMethod(klass, "getCharaList", argTypes, null, args);
    }

};


