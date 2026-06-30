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

public class Music_getSortName_7320970502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19265;

    public Music_getSortName_7320970502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19398 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term19397 = ((Class) term19398).getDeclaredField((String) "GAME");
        ((Field) term19397).setAccessible(true);
        Object enum32 = ((Field) term19397).get((Object) null);
        HashMap term19341 = new HashMap();
        term19265 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term19265, term19265.getClass(), "musicId", -1224443634);
        setField(term19265, term19265.getClass(), "name", "hPpFNeDBIb");
        setField(term19265, term19265.getClass(), "sortName", "DNOtiLPAIY");
        setField(term19265, term19265.getClass(), "copyright", "FnEkAHBfyV");
        setField(term19265, term19265.getClass(), "artistName", "VfmNFpEuax");
        setField(term19265, term19265.getClass(), "genre", enum32);
        setField(term19265, term19265.getClass(), "releaseVersion", "ANHjlWPmZG");
        setField(term19265, term19265.getClass(), "levels", term19341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortName", argTypes, term19265, args);
    }

};


