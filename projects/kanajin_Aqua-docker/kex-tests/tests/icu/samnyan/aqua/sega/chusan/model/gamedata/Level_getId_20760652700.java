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

public class Level_getId_20760652700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16060;

    public Level_getId_20760652700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16180 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term16179 = ((Class) term16180).getDeclaredField((String) "GEKICHUMA");
        ((Field) term16179).setAccessible(true);
        Object enum26 = ((Field) term16179).get((Object) null);
        HashMap term16135 = new HashMap();
        term16060 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term16062 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term16060, term16060.getClass(), "id", 1253549421411622358L);
        setIntField(term16062, term16062.getClass(), "musicId", -64893740);
        setField(term16062, term16062.getClass(), "name", "ngYxiXTZrk");
        setField(term16062, term16062.getClass(), "sortName", "YTxBqWRAlo");
        setField(term16062, term16062.getClass(), "artistName", "ReruUQRXwl");
        setField(term16062, term16062.getClass(), "genre", enum26);
        setField(term16062, term16062.getClass(), "releaseVersion", "DWEsVQwuaE");
        setField(term16062, term16062.getClass(), "levels", term16135);
        setField(term16060, term16060.getClass(), "music", term16062);
        setBooleanField(term16060, term16060.getClass(), "enable", true);
        setIntField(term16060, term16060.getClass(), "level", 1409095253);
        setIntField(term16060, term16060.getClass(), "levelDecimal", 315179039);
        setIntField(term16060, term16060.getClass(), "diff", -1835923897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term16060, args);
    }

};


