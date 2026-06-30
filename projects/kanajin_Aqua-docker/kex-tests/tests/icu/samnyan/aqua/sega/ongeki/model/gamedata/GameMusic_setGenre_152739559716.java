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

public class GameMusic_setGenre_152739559716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14983;

    public GameMusic_setGenre_152739559716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14983 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term14983, term14983.getClass(), "id", 5946780097489996391L);
        setField(term14983, term14983.getClass(), "name", "fKhrQsJToZ");
        setField(term14983, term14983.getClass(), "sortName", "wsysQLGFnl");
        setField(term14983, term14983.getClass(), "artistName", "ckQLZGFjMX");
        setField(term14983, term14983.getClass(), "genre", "qphdrqUtNx");
        setIntField(term14983, term14983.getClass(), "bossCardId", -1565502840);
        setIntField(term14983, term14983.getClass(), "bossLevel", 344323424);
        setField(term14983, term14983.getClass(), "level0", "bwlLFAfNWx");
        setField(term14983, term14983.getClass(), "level1", "JWodNQzjjV");
        setField(term14983, term14983.getClass(), "level2", "CAgxWjhxNf");
        setField(term14983, term14983.getClass(), "level3", "goAoCMhKBu");
        setField(term14983, term14983.getClass(), "level4", "BWxJSgKHRT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AGXoIndFnm";
        callMethod(klass, "setGenre", argTypes, term14983, args);
    }

};


