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

public class Music_setGenre_148942534211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9708;
     Object enum12;

    public Music_setGenre_148942534211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9855 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term9854 = ((Class) term9855).getDeclaredField((String) "TOUHOU");
        ((Field) term9854).setAccessible(true);
        Object enum11 = ((Field) term9854).get((Object) null);
        HashMap term9788 = new HashMap();
        term9708 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term9708, term9708.getClass(), "musicId", 844222656);
        setField(term9708, term9708.getClass(), "name", "IoSfuKDFRe");
        setField(term9708, term9708.getClass(), "sortName", "AWYyZiNfsm");
        setField(term9708, term9708.getClass(), "artistName", "ITRRYiuDwH");
        setField(term9708, term9708.getClass(), "genre", enum11);
        setField(term9708, term9708.getClass(), "releaseVersion", "llRfwANcVF");
        setField(term9708, term9708.getClass(), "levels", term9788);
        Class<? extends Object> term10135 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term10134 = ((Class) term10135).getDeclaredField((String) "VARIETY");
        ((Field) term10134).setAccessible(true);
        enum12 = ((Field) term10134).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Object[] args = new Object[1];
        args[0] = enum12;
        callMethod(klass, "setGenre", argTypes, term9708, args);
    }

};


