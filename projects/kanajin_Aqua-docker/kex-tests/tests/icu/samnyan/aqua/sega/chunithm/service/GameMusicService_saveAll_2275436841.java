package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class GameMusicService_saveAll_2275436841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9402;

    public GameMusicService_saveAll_2275436841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9519 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term9518 = ((Class) term9519).getDeclaredField((String) "ORIGINAL");
        ((Field) term9518).setAccessible(true);
        Object enum1 = ((Field) term9518).get((Object) null);
        HashMap term9471 = new HashMap();
        Object term9405 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term9405, term9405.getClass(), "musicId", 1460702778);
        setField(term9405, term9405.getClass(), "name", "fKhrQsJToZ");
        setField(term9405, term9405.getClass(), "sortName", "wsysQLGFnl");
        setField(term9405, term9405.getClass(), "copyright", "ckQLZGFjMX");
        setField(term9405, term9405.getClass(), "artistName", "qphdrqUtNx");
        setField(term9405, term9405.getClass(), "genre", enum1);
        setField(term9405, term9405.getClass(), "releaseVersion", "bwlLFAfNWx");
        setField(term9405, term9405.getClass(), "levels", term9471);
        term9402 = new LinkedList();
        ((LinkedList) term9402).add(term9405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.GameMusicService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9402;
        callMethod(klass, "saveAll", argTypes, null, args);
    }

};


