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

public class Music_getLevels_10496413396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7639;

    public Music_getLevels_10496413396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7750 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term7749 = ((Class) term7750).getDeclaredField((String) "GAME");
        ((Field) term7749).setAccessible(true);
        Object enum6 = ((Field) term7749).get((Object) null);
        HashMap term7703 = new HashMap();
        term7639 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term7639, term7639.getClass(), "musicId", -420030135);
        setField(term7639, term7639.getClass(), "name", "lCyLIcSuom");
        setField(term7639, term7639.getClass(), "sortName", "CGOpQSZZwI");
        setField(term7639, term7639.getClass(), "artistName", "ypEdrstygY");
        setField(term7639, term7639.getClass(), "genre", enum6);
        setField(term7639, term7639.getClass(), "releaseVersion", "sNQFlATEeQ");
        setField(term7639, term7639.getClass(), "levels", term7703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevels", argTypes, term7639, args);
    }

};


