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

public class Music_getGenre_4625838945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20548;

    public Music_getGenre_4625838945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20690 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term20689 = ((Class) term20690).getDeclaredField((String) "GEKICHUMA");
        ((Field) term20689).setAccessible(true);
        Object enum35 = ((Field) term20689).get((Object) null);
        HashMap term20633 = new HashMap();
        term20548 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term20548, term20548.getClass(), "musicId", -1385748168);
        setField(term20548, term20548.getClass(), "name", "LLegSTfqJt");
        setField(term20548, term20548.getClass(), "sortName", "XQfmqLbqHS");
        setField(term20548, term20548.getClass(), "copyright", "jLVLqQSjqg");
        setField(term20548, term20548.getClass(), "artistName", "JKGueoHesL");
        setField(term20548, term20548.getClass(), "genre", enum35);
        setField(term20548, term20548.getClass(), "releaseVersion", "CRAUqtVBkU");
        setField(term20548, term20548.getClass(), "levels", term20633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenre", argTypes, term20548, args);
    }

};


