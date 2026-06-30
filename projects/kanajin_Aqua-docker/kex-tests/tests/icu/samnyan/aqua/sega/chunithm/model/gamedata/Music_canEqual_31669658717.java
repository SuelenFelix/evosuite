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

public class Music_canEqual_31669658717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26287;
     Object term26387;

    public Music_canEqual_31669658717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26429 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term26428 = ((Class) term26429).getDeclaredField((String) "RESERVE2");
        ((Field) term26428).setAccessible(true);
        Object enum48 = ((Field) term26428).get((Object) null);
        HashMap term26371 = new HashMap();
        term26287 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term26287, term26287.getClass(), "musicId", 613256157);
        setField(term26287, term26287.getClass(), "name", "sAgGDoUNlf");
        setField(term26287, term26287.getClass(), "sortName", "TSTZcXdFFi");
        setField(term26287, term26287.getClass(), "copyright", "RyaaOzWfYO");
        setField(term26287, term26287.getClass(), "artistName", "HAkxFBZZzz");
        setField(term26287, term26287.getClass(), "genre", enum48);
        setField(term26287, term26287.getClass(), "releaseVersion", "yejonZnVuy");
        setField(term26287, term26287.getClass(), "levels", term26371);
        term26387 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26387;
        callMethod(klass, "canEqual", argTypes, term26287, args);
    }

};


