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

public class Music_equals_144886164614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11318;
     Object term11406;

    public Music_equals_144886164614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11438 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term11437 = ((Class) term11438).getDeclaredField((String) "RESERVE2");
        ((Field) term11437).setAccessible(true);
        Object enum15 = ((Field) term11437).get((Object) null);
        HashMap term11390 = new HashMap();
        term11318 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term11318, term11318.getClass(), "musicId", 330043745);
        setField(term11318, term11318.getClass(), "name", "vqnBkkxoIa");
        setField(term11318, term11318.getClass(), "sortName", "bycpZjxXFn");
        setField(term11318, term11318.getClass(), "artistName", "jQWttOAiwL");
        setField(term11318, term11318.getClass(), "genre", enum15);
        setField(term11318, term11318.getClass(), "releaseVersion", "DzKFxEuEEC");
        setField(term11318, term11318.getClass(), "levels", term11390);
        term11406 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11406;
        callMethod(klass, "equals", argTypes, term11318, args);
    }

};


