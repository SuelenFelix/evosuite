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

public class Music_getReleaseVersion_15675814226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20988;

    public Music_getReleaseVersion_15675814226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21130 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term21129 = ((Class) term21130).getDeclaredField((String) "GEKICHUMA");
        ((Field) term21129).setAccessible(true);
        Object enum36 = ((Field) term21129).get((Object) null);
        HashMap term21073 = new HashMap();
        term20988 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term20988, term20988.getClass(), "musicId", 109078154);
        setField(term20988, term20988.getClass(), "name", "QTefjRuiez");
        setField(term20988, term20988.getClass(), "sortName", "SQZVNkAVBB");
        setField(term20988, term20988.getClass(), "copyright", "mrSAYJlddZ");
        setField(term20988, term20988.getClass(), "artistName", "KbwxawvYsw");
        setField(term20988, term20988.getClass(), "genre", enum36);
        setField(term20988, term20988.getClass(), "releaseVersion", "gvjdfHNzOa");
        setField(term20988, term20988.getClass(), "levels", term21073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseVersion", argTypes, term20988, args);
    }

};


