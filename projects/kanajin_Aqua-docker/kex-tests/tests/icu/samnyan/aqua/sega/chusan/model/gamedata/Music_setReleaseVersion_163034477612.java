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

public class Music_setReleaseVersion_163034477612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10407;

    public Music_setReleaseVersion_163034477612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10543 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term10542 = ((Class) term10543).getDeclaredField((String) "IRODORI");
        ((Field) term10542).setAccessible(true);
        Object enum13 = ((Field) term10542).get((Object) null);
        HashMap term10484 = new HashMap();
        term10407 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term10407, term10407.getClass(), "musicId", -1629418973);
        setField(term10407, term10407.getClass(), "name", "KSJeYkkvpk");
        setField(term10407, term10407.getClass(), "sortName", "qUtkFGMNUV");
        setField(term10407, term10407.getClass(), "artistName", "mGRiYhnMcR");
        setField(term10407, term10407.getClass(), "genre", enum13);
        setField(term10407, term10407.getClass(), "releaseVersion", "NFlvfJCVPO");
        setField(term10407, term10407.getClass(), "levels", term10484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oKwCDqywym";
        callMethod(klass, "setReleaseVersion", argTypes, term10407, args);
    }

};


