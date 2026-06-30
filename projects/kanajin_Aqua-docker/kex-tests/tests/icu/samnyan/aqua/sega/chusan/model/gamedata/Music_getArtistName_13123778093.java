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

public class Music_getArtistName_13123778093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6415;

    public Music_getArtistName_13123778093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6534 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term6533 = ((Class) term6534).getDeclaredField((String) "RESERVE2");
        ((Field) term6533).setAccessible(true);
        Object enum3 = ((Field) term6533).get((Object) null);
        HashMap term6487 = new HashMap();
        term6415 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term6415, term6415.getClass(), "musicId", 389427431);
        setField(term6415, term6415.getClass(), "name", "wzsPSPcRdj");
        setField(term6415, term6415.getClass(), "sortName", "kGMQdqJYyB");
        setField(term6415, term6415.getClass(), "artistName", "XJJNClzHRf");
        setField(term6415, term6415.getClass(), "genre", enum3);
        setField(term6415, term6415.getClass(), "releaseVersion", "HDaezxQfQR");
        setField(term6415, term6415.getClass(), "levels", term6487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtistName", argTypes, term6415, args);
    }

};


