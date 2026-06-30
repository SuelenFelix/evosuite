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

public class Music_setName_18201891828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8429;

    public Music_setName_18201891828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8561 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term8560 = ((Class) term8561).getDeclaredField((String) "GEKICHUMA");
        ((Field) term8560).setAccessible(true);
        Object enum8 = ((Field) term8560).get((Object) null);
        HashMap term8502 = new HashMap();
        term8429 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term8429, term8429.getClass(), "musicId", 1768204942);
        setField(term8429, term8429.getClass(), "name", "DPskuFUobI");
        setField(term8429, term8429.getClass(), "sortName", "wBGfLpNNiZ");
        setField(term8429, term8429.getClass(), "artistName", "yUGCjlqgJE");
        setField(term8429, term8429.getClass(), "genre", enum8);
        setField(term8429, term8429.getClass(), "releaseVersion", "PXdVZyoJyC");
        setField(term8429, term8429.getClass(), "levels", term8502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HHQcYMSBVc";
        callMethod(klass, "setName", argTypes, term8429, args);
    }

};


