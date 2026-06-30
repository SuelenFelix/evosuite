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
import java.lang.Boolean;

public class Level_setEnable_14916913608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19716;
     Object term19810;

    public Level_setEnable_14916913608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19843 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term19842 = ((Class) term19843).getDeclaredField((String) "POPS_ANIME");
        ((Field) term19842).setAccessible(true);
        Object enum35 = ((Field) term19842).get((Object) null);
        HashMap term19796 = new HashMap();
        term19716 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term19718 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term19716, term19716.getClass(), "id", 7017605765544766728L);
        setIntField(term19718, term19718.getClass(), "musicId", -1092883950);
        setField(term19718, term19718.getClass(), "name", "pbqJjeooBM");
        setField(term19718, term19718.getClass(), "sortName", "ccnotFfPXt");
        setField(term19718, term19718.getClass(), "artistName", "plWlgdgIhn");
        setField(term19718, term19718.getClass(), "genre", enum35);
        setField(term19718, term19718.getClass(), "releaseVersion", "RZaKVKWtND");
        setField(term19718, term19718.getClass(), "levels", term19796);
        setField(term19716, term19716.getClass(), "music", term19718);
        setBooleanField(term19716, term19716.getClass(), "enable", true);
        setIntField(term19716, term19716.getClass(), "level", 1544768934);
        setIntField(term19716, term19716.getClass(), "levelDecimal", -383508597);
        setIntField(term19716, term19716.getClass(), "diff", -819372164);
        term19810 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term19810;
        callMethod(klass, "setEnable", argTypes, term19716, args);
    }

};


