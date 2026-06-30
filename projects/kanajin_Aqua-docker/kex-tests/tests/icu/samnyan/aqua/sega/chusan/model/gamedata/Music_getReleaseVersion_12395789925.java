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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class Music_getReleaseVersion_12395789925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7223;

    public Music_getReleaseVersion_12395789925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7354 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term7353 = ((Class) term7354).getDeclaredField((String) "KOTONOHA");
        ((Field) term7353).setAccessible(true);
        Object enum5 = ((Field) term7353).get((Object) null);
        HashMap term7307 = new HashMap();
        term7223 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term7223, term7223.getClass(), "musicId", -1254072822);
        setField(term7223, term7223.getClass(), "name", "MHGKyEnwKc");
        setField(term7223, term7223.getClass(), "sortName", "ShIELyuULw");
        setField(term7223, term7223.getClass(), "artistName", "IpQuOGMgmj");
        setField(term7223, term7223.getClass(), "genre", enum5);
        setField(term7223, term7223.getClass(), "releaseVersion", "pJbnHTYrxn");
        setField(term7223, term7223.getClass(), "levels", term7307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseVersion", argTypes, term7223, args);
    }

};


