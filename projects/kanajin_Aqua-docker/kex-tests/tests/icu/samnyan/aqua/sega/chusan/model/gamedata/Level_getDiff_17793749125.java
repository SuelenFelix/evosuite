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

public class Level_getDiff_17793749125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18096;

    public Level_getDiff_17793749125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18215 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term18214 = ((Class) term18215).getDeclaredField((String) "ORIGINAL");
        ((Field) term18214).setAccessible(true);
        Object enum31 = ((Field) term18214).get((Object) null);
        HashMap term18170 = new HashMap();
        term18096 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term18098 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term18096, term18096.getClass(), "id", -113028659747841511L);
        setIntField(term18098, term18098.getClass(), "musicId", -1728316609);
        setField(term18098, term18098.getClass(), "name", "bkSgsDrkCN");
        setField(term18098, term18098.getClass(), "sortName", "hwjlcimgJH");
        setField(term18098, term18098.getClass(), "artistName", "TLxQzxvizR");
        setField(term18098, term18098.getClass(), "genre", enum31);
        setField(term18098, term18098.getClass(), "releaseVersion", "uUgJfKAzDM");
        setField(term18098, term18098.getClass(), "levels", term18170);
        setField(term18096, term18096.getClass(), "music", term18098);
        setBooleanField(term18096, term18096.getClass(), "enable", false);
        setIntField(term18096, term18096.getClass(), "level", 1728588701);
        setIntField(term18096, term18096.getClass(), "levelDecimal", -355769268);
        setIntField(term18096, term18096.getClass(), "diff", -114460662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiff", argTypes, term18096, args);
    }

};


