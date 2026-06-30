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

public class Level_equals_149218132512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21352;
     Object term21446;

    public Level_equals_149218132512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21478 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term21477 = ((Class) term21478).getDeclaredField((String) "POPS_ANIME");
        ((Field) term21477).setAccessible(true);
        Object enum39 = ((Field) term21477).get((Object) null);
        HashMap term21432 = new HashMap();
        term21352 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term21354 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term21352, term21352.getClass(), "id", -3718250311794019732L);
        setIntField(term21354, term21354.getClass(), "musicId", 1343432022);
        setField(term21354, term21354.getClass(), "name", "NPUSTXlEKx");
        setField(term21354, term21354.getClass(), "sortName", "KKFprGoNpl");
        setField(term21354, term21354.getClass(), "artistName", "tWVISJlxKZ");
        setField(term21354, term21354.getClass(), "genre", enum39);
        setField(term21354, term21354.getClass(), "releaseVersion", "rOZkUKEoaf");
        setField(term21354, term21354.getClass(), "levels", term21432);
        setField(term21352, term21352.getClass(), "music", term21354);
        setBooleanField(term21352, term21352.getClass(), "enable", true);
        setIntField(term21352, term21352.getClass(), "level", 1054887169);
        setIntField(term21352, term21352.getClass(), "levelDecimal", 692873905);
        setIntField(term21352, term21352.getClass(), "diff", 1734759369);
        term21446 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21446;
        callMethod(klass, "equals", argTypes, term21352, args);
    }

};


