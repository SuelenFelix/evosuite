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
import java.lang.Long;

public class GameMusic_setId_201059045212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14107;
     Object term14219;

    public GameMusic_setId_201059045212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14107 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term14107, term14107.getClass(), "id", 7862575738391801707L);
        setField(term14107, term14107.getClass(), "name", "XjDhvToxJy");
        setField(term14107, term14107.getClass(), "sortName", "nxSTJflLQy");
        setField(term14107, term14107.getClass(), "artistName", "FlHzxEfFzI");
        setField(term14107, term14107.getClass(), "genre", "aSATgQUpoe");
        setIntField(term14107, term14107.getClass(), "bossCardId", 107945604);
        setIntField(term14107, term14107.getClass(), "bossLevel", -1963464809);
        setField(term14107, term14107.getClass(), "level0", "VkPSXewZfB");
        setField(term14107, term14107.getClass(), "level1", "ubodzJoMGW");
        setField(term14107, term14107.getClass(), "level2", "weddIktxOA");
        setField(term14107, term14107.getClass(), "level3", "uSlMeISsDD");
        setField(term14107, term14107.getClass(), "level4", "WdCiTDUKqn");
        term14219 = new Long(50358265865610362L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term14219;
        callMethod(klass, "setId", argTypes, term14107, args);
    }

};


