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

public class Level_getMusic_9925875031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2405;

    public Level_getMusic_9925875031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2538 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term2537 = ((Class) term2538).getDeclaredField((String) "GAME");
        ((Field) term2537).setAccessible(true);
        Object enum1 = ((Field) term2537).get((Object) null);
        HashMap term2483 = new HashMap();
        term2405 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term2407 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term2405, term2405.getClass(), "id", 2120084523938730454L);
        setIntField(term2407, term2407.getClass(), "musicId", 158873461);
        setField(term2407, term2407.getClass(), "name", "vrQLuWIDJX");
        setField(term2407, term2407.getClass(), "sortName", "flxyYxBRtu");
        setField(term2407, term2407.getClass(), "copyright", "OclPbYPkcH");
        setField(term2407, term2407.getClass(), "artistName", "IoAlmYsBwc");
        setField(term2407, term2407.getClass(), "genre", enum1);
        setField(term2407, term2407.getClass(), "releaseVersion", "TEParAifyi");
        setField(term2407, term2407.getClass(), "levels", term2483);
        setField(term2405, term2405.getClass(), "music", term2407);
        setBooleanField(term2405, term2405.getClass(), "enable", false);
        setIntField(term2405, term2405.getClass(), "level", -243422082);
        setIntField(term2405, term2405.getClass(), "levelDecimal", 1384592638);
        setIntField(term2405, term2405.getClass(), "diff", -1002370457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusic", argTypes, term2405, args);
    }

};


