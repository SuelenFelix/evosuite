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

public class Music_setGenre_83342048213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24168;
     Object enum44;

    public Music_setGenre_83342048213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24329 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term24328 = ((Class) term24329).getDeclaredField((String) "GAME");
        ((Field) term24328).setAccessible(true);
        Object enum43 = ((Field) term24328).get((Object) null);
        HashMap term24244 = new HashMap();
        term24168 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term24168, term24168.getClass(), "musicId", -1398142433);
        setField(term24168, term24168.getClass(), "name", "vQJUCtuYpK");
        setField(term24168, term24168.getClass(), "sortName", "GHtOeztAdz");
        setField(term24168, term24168.getClass(), "copyright", "gSAtqakaLY");
        setField(term24168, term24168.getClass(), "artistName", "taPBiMFNEZ");
        setField(term24168, term24168.getClass(), "genre", enum43);
        setField(term24168, term24168.getClass(), "releaseVersion", "NoAFAfGyYL");
        setField(term24168, term24168.getClass(), "levels", term24244);
        Class<? extends Object> term24613 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term24612 = ((Class) term24613).getDeclaredField((String) "POPS_ANIME");
        ((Field) term24612).setAccessible(true);
        enum44 = ((Field) term24612).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Object[] args = new Object[1];
        args[0] = enum44;
        callMethod(klass, "setGenre", argTypes, term24168, args);
    }

};


