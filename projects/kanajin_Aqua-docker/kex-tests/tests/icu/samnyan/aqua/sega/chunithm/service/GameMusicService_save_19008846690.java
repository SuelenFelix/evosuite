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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class GameMusicService_save_19008846690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8722;

    public GameMusicService_save_19008846690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9110 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term9109 = ((Class) term9110).getDeclaredField((String) "IRODORI");
        ((Field) term9109).setAccessible(true);
        Object enum0 = ((Field) term9109).get((Object) null);
        HashMap term8811 = new HashMap();
        term8722 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term8722, term8722.getClass(), "musicId", -1933419449);
        setField(term8722, term8722.getClass(), "name", "DSFGlcaXUb");
        setField(term8722, term8722.getClass(), "sortName", "sHMXNUzNeM");
        setField(term8722, term8722.getClass(), "copyright", "gPzGDOEPPw");
        setField(term8722, term8722.getClass(), "artistName", "rwKoAngzCu");
        setField(term8722, term8722.getClass(), "genre", enum0);
        setField(term8722, term8722.getClass(), "releaseVersion", "VUkRVwROTl");
        setField(term8722, term8722.getClass(), "levels", term8811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.GameMusicService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Object[] args = new Object[1];
        args[0] = term8722;
        callMethod(klass, "save", argTypes, null, args);
    }

};


