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

public class Music_hashCode_189754832116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12130;

    public Music_hashCode_189754832116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12249 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term12248 = ((Class) term12249).getDeclaredField((String) "ORIGINAL");
        ((Field) term12248).setAccessible(true);
        Object enum17 = ((Field) term12248).get((Object) null);
        HashMap term12202 = new HashMap();
        term12130 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term12130, term12130.getClass(), "musicId", -781832877);
        setField(term12130, term12130.getClass(), "name", "UiWhvbypdr");
        setField(term12130, term12130.getClass(), "sortName", "CgleElJNje");
        setField(term12130, term12130.getClass(), "artistName", "ZrchvNGMtd");
        setField(term12130, term12130.getClass(), "genre", enum17);
        setField(term12130, term12130.getClass(), "releaseVersion", "WaEcyVlcIx");
        setField(term12130, term12130.getClass(), "levels", term12202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12130, args);
    }

};


