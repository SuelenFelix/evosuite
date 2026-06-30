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

public class Music_getGenre_8614009384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6819;

    public Music_getGenre_8614009384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6938 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term6937 = ((Class) term6938).getDeclaredField((String) "RESERVE2");
        ((Field) term6937).setAccessible(true);
        Object enum4 = ((Field) term6937).get((Object) null);
        HashMap term6891 = new HashMap();
        term6819 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term6819, term6819.getClass(), "musicId", -916584829);
        setField(term6819, term6819.getClass(), "name", "zcorEihhLK");
        setField(term6819, term6819.getClass(), "sortName", "GrqozDKFOk");
        setField(term6819, term6819.getClass(), "artistName", "CFyoseFGLF");
        setField(term6819, term6819.getClass(), "genre", enum4);
        setField(term6819, term6819.getClass(), "releaseVersion", "SFqCrhEWLm");
        setField(term6819, term6819.getClass(), "levels", term6891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenre", argTypes, term6819, args);
    }

};


