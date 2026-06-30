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

public class Level_hashCode_161286557014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8498;

    public Level_hashCode_161286557014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8631 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term8630 = ((Class) term8631).getDeclaredField((String) "GAME");
        ((Field) term8630).setAccessible(true);
        Object enum15 = ((Field) term8630).get((Object) null);
        HashMap term8576 = new HashMap();
        term8498 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term8500 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term8498, term8498.getClass(), "id", -5216789073301458893L);
        setIntField(term8500, term8500.getClass(), "musicId", -1831826725);
        setField(term8500, term8500.getClass(), "name", "dtGZCsKXbW");
        setField(term8500, term8500.getClass(), "sortName", "bdyhHbDAmJ");
        setField(term8500, term8500.getClass(), "copyright", "BBXiTNHqGE");
        setField(term8500, term8500.getClass(), "artistName", "IEYhJmgCVd");
        setField(term8500, term8500.getClass(), "genre", enum15);
        setField(term8500, term8500.getClass(), "releaseVersion", "KSJeYkkvpk");
        setField(term8500, term8500.getClass(), "levels", term8576);
        setField(term8498, term8498.getClass(), "music", term8500);
        setBooleanField(term8498, term8498.getClass(), "enable", true);
        setIntField(term8498, term8498.getClass(), "level", -370828664);
        setIntField(term8498, term8498.getClass(), "levelDecimal", 1168633950);
        setIntField(term8498, term8498.getClass(), "diff", 1607082164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8498, args);
    }

};


