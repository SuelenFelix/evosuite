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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Long;

public class Level_setId_1728381986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4577;
     Object term4669;

    public Level_setId_1728381986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4712 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term4711 = ((Class) term4712).getDeclaredField((String) "GAME");
        ((Field) term4711).setAccessible(true);
        Object enum6 = ((Field) term4711).get((Object) null);
        HashMap term4655 = new HashMap();
        term4577 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term4579 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term4577, term4577.getClass(), "id", -2644215923136513282L);
        setIntField(term4579, term4579.getClass(), "musicId", 1460722225);
        setField(term4579, term4579.getClass(), "name", "jwsfVjMoJT");
        setField(term4579, term4579.getClass(), "sortName", "ZfdXfCCFDf");
        setField(term4579, term4579.getClass(), "copyright", "MwwjNtdOFT");
        setField(term4579, term4579.getClass(), "artistName", "VYkqXKVlAJ");
        setField(term4579, term4579.getClass(), "genre", enum6);
        setField(term4579, term4579.getClass(), "releaseVersion", "XkIoWJRNwN");
        setField(term4579, term4579.getClass(), "levels", term4655);
        setField(term4577, term4577.getClass(), "music", term4579);
        setBooleanField(term4577, term4577.getClass(), "enable", false);
        setIntField(term4577, term4577.getClass(), "level", -945116798);
        setIntField(term4577, term4577.getClass(), "levelDecimal", 1593461795);
        setIntField(term4577, term4577.getClass(), "diff", 515182546);
        term4669 = new Long(3892018155439224435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4669;
        callMethod(klass, "setId", argTypes, term4577, args);
    }

};


