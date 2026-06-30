package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Music_setLevels_204053253115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25362;
     Object term25462;

    public Music_setLevels_204053253115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25560 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term25559 = ((Class) term25560).getDeclaredField((String) "ORIGINAL");
        ((Field) term25559).setAccessible(true);
        Object enum46 = ((Field) term25559).get((Object) null);
        HashMap term25446 = new HashMap();
        term25362 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term25362, term25362.getClass(), "musicId", -1485916498);
        setField(term25362, term25362.getClass(), "name", "muefchpJiZ");
        setField(term25362, term25362.getClass(), "sortName", "tuYaAqvYrh");
        setField(term25362, term25362.getClass(), "copyright", "CIbhheukbR");
        setField(term25362, term25362.getClass(), "artistName", "VOHPpErtan");
        setField(term25362, term25362.getClass(), "genre", enum46);
        setField(term25362, term25362.getClass(), "releaseVersion", "GDMUlolTNs");
        setField(term25362, term25362.getClass(), "levels", term25446);
        term25462 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term25462;
        callMethod(klass, "setLevels", argTypes, term25362, args);
    }

};


