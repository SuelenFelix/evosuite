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

public class Level_getLevelDecimal_12147640564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17692;

    public Level_getLevelDecimal_12147640564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17811 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term17810 = ((Class) term17811).getDeclaredField((String) "NICONICO");
        ((Field) term17810).setAccessible(true);
        Object enum30 = ((Field) term17810).get((Object) null);
        HashMap term17766 = new HashMap();
        term17692 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term17694 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term17692, term17692.getClass(), "id", -2986201902216133814L);
        setIntField(term17694, term17694.getClass(), "musicId", 934338954);
        setField(term17694, term17694.getClass(), "name", "nnnmCgFBLw");
        setField(term17694, term17694.getClass(), "sortName", "hSSCyNEhyH");
        setField(term17694, term17694.getClass(), "artistName", "jDFNSuvZqm");
        setField(term17694, term17694.getClass(), "genre", enum30);
        setField(term17694, term17694.getClass(), "releaseVersion", "pLvkKHqNYX");
        setField(term17694, term17694.getClass(), "levels", term17766);
        setField(term17692, term17692.getClass(), "music", term17694);
        setBooleanField(term17692, term17692.getClass(), "enable", true);
        setIntField(term17692, term17692.getClass(), "level", -1485916498);
        setIntField(term17692, term17692.getClass(), "levelDecimal", 722787672);
        setIntField(term17692, term17692.getClass(), "diff", 2077491675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevelDecimal", argTypes, term17692, args);
    }

};


