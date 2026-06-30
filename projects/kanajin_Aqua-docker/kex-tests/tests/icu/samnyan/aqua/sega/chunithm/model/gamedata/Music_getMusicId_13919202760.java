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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class Music_getMusicId_13919202760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18401;

    public Music_getMusicId_13919202760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18534 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term18533 = ((Class) term18534).getDeclaredField((String) "GAME");
        ((Field) term18533).setAccessible(true);
        Object enum30 = ((Field) term18533).get((Object) null);
        HashMap term18477 = new HashMap();
        term18401 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term18401, term18401.getClass(), "musicId", 1862841859);
        setField(term18401, term18401.getClass(), "name", "njvnWFTMxN");
        setField(term18401, term18401.getClass(), "sortName", "fLRqcTSfzF");
        setField(term18401, term18401.getClass(), "copyright", "EBYHwsuWAU");
        setField(term18401, term18401.getClass(), "artistName", "PtIjKpiSix");
        setField(term18401, term18401.getClass(), "genre", enum30);
        setField(term18401, term18401.getClass(), "releaseVersion", "NZdTuwSCIM");
        setField(term18401, term18401.getClass(), "levels", term18477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term18401, args);
    }

};


