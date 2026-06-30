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

public class Level_getLevel_7087992793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3257;

    public Level_getLevel_7087992793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3398 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term3397 = ((Class) term3398).getDeclaredField((String) "RESERVE2");
        ((Field) term3397).setAccessible(true);
        Object enum3 = ((Field) term3397).get((Object) null);
        HashMap term3343 = new HashMap();
        term3257 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term3259 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term3257, term3257.getClass(), "id", 5907001541142728739L);
        setIntField(term3259, term3259.getClass(), "musicId", 729658803);
        setField(term3259, term3259.getClass(), "name", "MAcUBcBckh");
        setField(term3259, term3259.getClass(), "sortName", "oVgzLbrsFr");
        setField(term3259, term3259.getClass(), "copyright", "vQVyKLdtaz");
        setField(term3259, term3259.getClass(), "artistName", "OWKQODBLzb");
        setField(term3259, term3259.getClass(), "genre", enum3);
        setField(term3259, term3259.getClass(), "releaseVersion", "wGmYcqUkgE");
        setField(term3259, term3259.getClass(), "levels", term3343);
        setField(term3257, term3257.getClass(), "music", term3259);
        setBooleanField(term3257, term3257.getClass(), "enable", true);
        setIntField(term3257, term3257.getClass(), "level", -1310015129);
        setIntField(term3257, term3257.getClass(), "levelDecimal", -2104981311);
        setIntField(term3257, term3257.getClass(), "diff", -571169753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term3257, args);
    }

};


