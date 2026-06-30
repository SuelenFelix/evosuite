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

public class Music_toString_208030558119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27172;

    public Music_toString_208030558119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27313 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term27312 = ((Class) term27313).getDeclaredField((String) "ORIGINAL");
        ((Field) term27312).setAccessible(true);
        Object enum50 = ((Field) term27312).get((Object) null);
        HashMap term27256 = new HashMap();
        term27172 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term27172, term27172.getClass(), "musicId", -1641507499);
        setField(term27172, term27172.getClass(), "name", "VFYvUTgYFB");
        setField(term27172, term27172.getClass(), "sortName", "BrWqhEIUUj");
        setField(term27172, term27172.getClass(), "copyright", "WfUmxdiHcU");
        setField(term27172, term27172.getClass(), "artistName", "BRrftvRvmF");
        setField(term27172, term27172.getClass(), "genre", enum50);
        setField(term27172, term27172.getClass(), "releaseVersion", "fvoyRbZTsm");
        setField(term27172, term27172.getClass(), "levels", term27256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27172, args);
    }

};


