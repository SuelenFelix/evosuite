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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Music_setLevels_192643233513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10835;
     Object term10923;

    public Music_setLevels_192643233513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11033 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term11032 = ((Class) term11033).getDeclaredField((String) "RESERVE2");
        ((Field) term11032).setAccessible(true);
        Object enum14 = ((Field) term11032).get((Object) null);
        HashMap term10907 = new HashMap();
        term10835 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term10835, term10835.getClass(), "musicId", 301401782);
        setField(term10835, term10835.getClass(), "name", "zjZYTddemL");
        setField(term10835, term10835.getClass(), "sortName", "QtrylgCLiF");
        setField(term10835, term10835.getClass(), "artistName", "orEuhCStGM");
        setField(term10835, term10835.getClass(), "genre", enum14);
        setField(term10835, term10835.getClass(), "releaseVersion", "HhEaSXWvrY");
        setField(term10835, term10835.getClass(), "levels", term10907);
        term10923 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term10923;
        callMethod(klass, "setLevels", argTypes, term10835, args);
    }

};


