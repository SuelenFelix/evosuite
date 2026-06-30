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

public class Music_getMusicId_17199227060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4979;

    public Music_getMusicId_17199227060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5345 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term5344 = ((Class) term5345).getDeclaredField((String) "IRODORI");
        ((Field) term5344).setAccessible(true);
        Object enum0 = ((Field) term5344).get((Object) null);
        HashMap term5056 = new HashMap();
        term4979 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term4979, term4979.getClass(), "musicId", 71190297);
        setField(term4979, term4979.getClass(), "name", "wfaXBpWAUH");
        setField(term4979, term4979.getClass(), "sortName", "VMeAzAHwZj");
        setField(term4979, term4979.getClass(), "artistName", "PznxWXsZME");
        setField(term4979, term4979.getClass(), "genre", enum0);
        setField(term4979, term4979.getClass(), "releaseVersion", "ZzIujlwVsw");
        setField(term4979, term4979.getClass(), "levels", term5056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term4979, args);
    }

};


