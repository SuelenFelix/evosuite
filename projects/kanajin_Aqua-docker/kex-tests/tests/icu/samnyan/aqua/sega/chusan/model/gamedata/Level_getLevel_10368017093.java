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

public class Level_getLevel_10368017093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17276;

    public Level_getLevel_10368017093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17401 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term17400 = ((Class) term17401).getDeclaredField((String) "POPS_ANIME");
        ((Field) term17400).setAccessible(true);
        Object enum29 = ((Field) term17400).get((Object) null);
        HashMap term17356 = new HashMap();
        term17276 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term17278 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term17276, term17276.getClass(), "id", 4069264186851023313L);
        setIntField(term17278, term17278.getClass(), "musicId", -1693535639);
        setField(term17278, term17278.getClass(), "name", "yQUDyOroXU");
        setField(term17278, term17278.getClass(), "sortName", "xweqkPdyJH");
        setField(term17278, term17278.getClass(), "artistName", "kwteHWzwcc");
        setField(term17278, term17278.getClass(), "genre", enum29);
        setField(term17278, term17278.getClass(), "releaseVersion", "uMsWXqNhln");
        setField(term17278, term17278.getClass(), "levels", term17356);
        setField(term17276, term17276.getClass(), "music", term17278);
        setBooleanField(term17276, term17276.getClass(), "enable", false);
        setIntField(term17276, term17276.getClass(), "level", -2009613557);
        setIntField(term17276, term17276.getClass(), "levelDecimal", 654195547);
        setIntField(term17276, term17276.getClass(), "diff", 1622857008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term17276, args);
    }

};


