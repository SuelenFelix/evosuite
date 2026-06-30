package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Level_getMusic_19783949611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16468;

    public Level_getMusic_19783949611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16587 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term16586 = ((Class) term16587).getDeclaredField((String) "RESERVE2");
        ((Field) term16586).setAccessible(true);
        Object enum27 = ((Field) term16586).get((Object) null);
        HashMap term16542 = new HashMap();
        term16468 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term16470 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term16468, term16468.getClass(), "id", -7456852906235966771L);
        setIntField(term16470, term16470.getClass(), "musicId", -341287775);
        setField(term16470, term16470.getClass(), "name", "DddqUYfomL");
        setField(term16470, term16470.getClass(), "sortName", "YQwoogpPyi");
        setField(term16470, term16470.getClass(), "artistName", "rnPhHoorxj");
        setField(term16470, term16470.getClass(), "genre", enum27);
        setField(term16470, term16470.getClass(), "releaseVersion", "GuwJLKquuI");
        setField(term16470, term16470.getClass(), "levels", term16542);
        setField(term16468, term16468.getClass(), "music", term16470);
        setBooleanField(term16468, term16468.getClass(), "enable", false);
        setIntField(term16468, term16468.getClass(), "level", -1804322375);
        setIntField(term16468, term16468.getClass(), "levelDecimal", 1595814906);
        setIntField(term16468, term16468.getClass(), "diff", -834193529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusic", argTypes, term16468, args);
    }

};


