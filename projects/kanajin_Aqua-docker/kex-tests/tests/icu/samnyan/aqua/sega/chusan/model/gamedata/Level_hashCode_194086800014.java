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

public class Level_hashCode_194086800014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22186;

    public Level_hashCode_194086800014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22306 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term22305 = ((Class) term22306).getDeclaredField((String) "GEKICHUMA");
        ((Field) term22305).setAccessible(true);
        Object enum41 = ((Field) term22305).get((Object) null);
        HashMap term22261 = new HashMap();
        term22186 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term22188 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term22186, term22186.getClass(), "id", 3086974592680165932L);
        setIntField(term22188, term22188.getClass(), "musicId", -1808638031);
        setField(term22188, term22188.getClass(), "name", "CPVnQYACKw");
        setField(term22188, term22188.getClass(), "sortName", "sbdLhVCRsw");
        setField(term22188, term22188.getClass(), "artistName", "soJHvZwbtF");
        setField(term22188, term22188.getClass(), "genre", enum41);
        setField(term22188, term22188.getClass(), "releaseVersion", "dTGwgkfDVj");
        setField(term22188, term22188.getClass(), "levels", term22261);
        setField(term22186, term22186.getClass(), "music", term22188);
        setBooleanField(term22186, term22186.getClass(), "enable", true);
        setIntField(term22186, term22186.getClass(), "level", -963198667);
        setIntField(term22186, term22186.getClass(), "levelDecimal", -1007935918);
        setIntField(term22186, term22186.getClass(), "diff", 1485731037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term22186, args);
    }

};


