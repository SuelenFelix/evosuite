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

public class Music_getName_7549015461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5627;

    public Music_getName_7549015461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5738 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term5737 = ((Class) term5738).getDeclaredField((String) "GAME");
        ((Field) term5737).setAccessible(true);
        Object enum1 = ((Field) term5737).get((Object) null);
        HashMap term5691 = new HashMap();
        term5627 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term5627, term5627.getClass(), "musicId", 1830648570);
        setField(term5627, term5627.getClass(), "name", "HHmNoYxIGj");
        setField(term5627, term5627.getClass(), "sortName", "PtirvZmsGt");
        setField(term5627, term5627.getClass(), "artistName", "HWkpTmtlrc");
        setField(term5627, term5627.getClass(), "genre", enum1);
        setField(term5627, term5627.getClass(), "releaseVersion", "hMmaoREuCK");
        setField(term5627, term5627.getClass(), "levels", term5691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5627, args);
    }

};


