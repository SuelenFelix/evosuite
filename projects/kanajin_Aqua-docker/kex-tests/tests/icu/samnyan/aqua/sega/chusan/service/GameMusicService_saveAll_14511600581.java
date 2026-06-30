package icu.samnyan.aqua.sega.chusan.service;

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
import static icu.samnyan.aqua.sega.chusan.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class GameMusicService_saveAll_14511600581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11240;

    public GameMusicService_saveAll_14511600581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11335 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term11334 = ((Class) term11335).getDeclaredField((String) "ORIGINAL");
        ((Field) term11334).setAccessible(true);
        Object enum1 = ((Field) term11334).get((Object) null);
        HashMap term11297 = new HashMap();
        Object term11243 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term11243, term11243.getClass(), "musicId", -1464364418);
        setField(term11243, term11243.getClass(), "name", "EkgprvqZlM");
        setField(term11243, term11243.getClass(), "sortName", "fbnKvthhOz");
        setField(term11243, term11243.getClass(), "artistName", "PGfCDJTBek");
        setField(term11243, term11243.getClass(), "genre", enum1);
        setField(term11243, term11243.getClass(), "releaseVersion", "ZwjARhAtHC");
        setField(term11243, term11243.getClass(), "levels", term11297);
        term11240 = new LinkedList();
        ((LinkedList) term11240).add(term11243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.service.GameMusicService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term11240;
        callMethod(klass, "saveAll", argTypes, null, args);
    }

};


