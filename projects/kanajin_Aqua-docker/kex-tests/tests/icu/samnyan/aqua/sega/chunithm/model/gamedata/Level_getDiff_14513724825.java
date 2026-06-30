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

public class Level_getDiff_14513724825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4129;

    public Level_getDiff_14513724825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4282 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term4281 = ((Class) term4282).getDeclaredField((String) "KOTONOHA");
        ((Field) term4281).setAccessible(true);
        Object enum5 = ((Field) term4281).get((Object) null);
        HashMap term4227 = new HashMap();
        term4129 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term4131 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term4129, term4129.getClass(), "id", -3842548265506930260L);
        setIntField(term4131, term4131.getClass(), "musicId", -1476644457);
        setField(term4131, term4131.getClass(), "name", "lHfTrWKMPk");
        setField(term4131, term4131.getClass(), "sortName", "JDaAnsVTGV");
        setField(term4131, term4131.getClass(), "copyright", "mLUZFTfjle");
        setField(term4131, term4131.getClass(), "artistName", "xIeFjkHkOe");
        setField(term4131, term4131.getClass(), "genre", enum5);
        setField(term4131, term4131.getClass(), "releaseVersion", "SdCKLMIYnX");
        setField(term4131, term4131.getClass(), "levels", term4227);
        setField(term4129, term4129.getClass(), "music", term4131);
        setBooleanField(term4129, term4129.getClass(), "enable", true);
        setIntField(term4129, term4129.getClass(), "level", 477625804);
        setIntField(term4129, term4129.getClass(), "levelDecimal", 252575029);
        setIntField(term4129, term4129.getClass(), "diff", 57189932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiff", argTypes, term4129, args);
    }

};


