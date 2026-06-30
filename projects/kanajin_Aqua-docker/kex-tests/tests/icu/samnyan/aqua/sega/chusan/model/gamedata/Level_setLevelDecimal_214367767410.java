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
import java.lang.Integer;

public class Level_setLevelDecimal_214367767410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20540;
     Object term20628;

    public Level_setLevelDecimal_214367767410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20661 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term20660 = ((Class) term20661).getDeclaredField((String) "NICONICO");
        ((Field) term20660).setAccessible(true);
        Object enum37 = ((Field) term20660).get((Object) null);
        HashMap term20614 = new HashMap();
        term20540 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term20542 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term20540, term20540.getClass(), "id", -1481367303699139651L);
        setIntField(term20542, term20542.getClass(), "musicId", -890538258);
        setField(term20542, term20542.getClass(), "name", "GHtOeztAdz");
        setField(term20542, term20542.getClass(), "sortName", "gSAtqakaLY");
        setField(term20542, term20542.getClass(), "artistName", "taPBiMFNEZ");
        setField(term20542, term20542.getClass(), "genre", enum37);
        setField(term20542, term20542.getClass(), "releaseVersion", "NoAFAfGyYL");
        setField(term20542, term20542.getClass(), "levels", term20614);
        setField(term20540, term20540.getClass(), "music", term20542);
        setBooleanField(term20540, term20540.getClass(), "enable", false);
        setIntField(term20540, term20540.getClass(), "level", -1142164411);
        setIntField(term20540, term20540.getClass(), "levelDecimal", -1619435313);
        setIntField(term20540, term20540.getClass(), "diff", 1013801066);
        term20628 = new Integer(1512541853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20628;
        callMethod(klass, "setLevelDecimal", argTypes, term20540, args);
    }

};


